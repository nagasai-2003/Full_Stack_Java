class Config {
    // Static variable
    public static String configName;

    // Static block to initialize static variables
    static {
        configName = "Application Configuration";
        System.out.println("Static block executed: " + configName);
    }

    public static void displayConfig() {
        System.out.println("Current config: " + configName);
    }
}

class StaticBlockExample {
    public static void main(String[] args) {
        Config.displayConfig(); // Output: Application Configuration
    }
}
