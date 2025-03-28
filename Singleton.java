public class Singleton {
    private static Singleton instance; // Static instance variable

    private Singleton() {
    } // Private constructor to prevent external instantiation

    public static Singleton getInstance() {
        if (instance == null) { // Check if the instance is null
            instance = new Singleton(); // Create the instance if it's the first call
        }
        return instance; // Return the instance
    }
}
