package finalexam.task5;

import java.util.Map;

public class SpecialCommunicationManager implements HelperCommunicationManager {
    private final String commonServiceUrl;
    private final String specialServiceUrl;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
        this.specialServiceUrl = specialServiceUrl;
    }

    @Override
    public String sendRequest(@org.jetbrains.annotations.NotNull Map<String, String> requestData) {
        String url = commonServiceUrl;

        // Check if the message contains "help"
        if (requestData.get("question").toLowerCase().contains("help")) {
            url = specialServiceUrl;
        }

        // Simulating a REST API call
        return simulateApiCall(url, requestData);
    }

    private String simulateApiCall(String url, Map<String, String> requestData) {
        return "Simulated response from " + url + " with data: " + requestData.toString();
    }
    public class Main {
        public static void main(String[] args) {
            // Test with dummy manager
            HelperCommunicationManager dummyManager = new DummyCommunicationManager();
            UserInteractionManager userInteractionManager = new UserInteractionManager(dummyManager);
            userInteractionManager.interactWithUser("dummyApiKey", "What's the current weather?", "Tbilisi", null);

            // Test with special communication manager
            HelperCommunicationManager specialManager = new SpecialCommunicationManager("http://commonservice.com", "http://specialservice.com");
            userInteractionManager = new UserInteractionManager(specialManager);
            userInteractionManager.interactWithUser("realApiKey", "What's the temperature?", "Batumi", null);
            userInteractionManager.interactWithUser("realApiKey", "help me with the weather forecast", "Zugdidi", "2024-06-18");
        }
    }

}