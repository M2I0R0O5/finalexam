package finalexam.task1;

public class Computer {
    private String brand;
    private int memory;
    private int ssd;
    private int hdd;

    // Default constructor
    public Computer() {
    }

    // Parameterized constructor
    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    // toString method
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory + "GB" +
                ", ssd=" + ssd + "GB" +
                ", hdd=" + hdd + "GB" +
                '}';
    }
    public static void main(String[] args) {
        // Create a Computer object using the default constructor
        Computer computer1 = new Computer("Lenovo", 64, 2048, 2000);

        // Create a Computer object using the parameterized constructor
        Computer computer2 = new Computer("Asus", 128, 1024, 3000);

        // Print the Computer objects
        System.out.println(computer1);
        System.out.println(computer2);
    }
}
