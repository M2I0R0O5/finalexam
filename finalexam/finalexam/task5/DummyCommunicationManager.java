package finalexam.task5;

import java.util.Map;

public class DummyCommunicationManager implements HelperCommunicationManager {
    @Override
    public String sendRequest(Map<String, String> requestData) {
        return "The current weather in Tbilisi is 30°C with clear skies..";
    }
}