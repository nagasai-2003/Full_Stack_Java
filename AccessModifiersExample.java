// Class demonstrating access modifiers
class AccessModifiersDemo {
    // Public variable
    public String publicVariable = "I am public";

    // Protected variable
    protected String protectedVariable = "I am protected";

    // Default variable
    String defaultVariable = "I am default"; // No modifier

    // Private variable
    private String privateVariable = "I am private";

    // Public method
    public void displayPublic() {
        System.out.println(publicVariable);
    }

    // Protected method
    protected void displayProtected() {
        System.out.println(protectedVariable);
    }

    // Default method
    void displayDefault() {
        System.out.println(defaultVariable);
    }

    // Private method
    private void displayPrivate() {
        System.out.println(privateVariable);
    }

    // Method to call private method
    public void callPrivate() {
        displayPrivate();
    }
}

// Subclass to demonstrate protected access
class SubClass extends AccessModifiersDemo {
    public void accessProtected() {
        // Accessing protected variable from superclass
        System.out.println(protectedVariable);
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        // Accessing public variable and method
        System.out.println(demo.publicVariable); // Accessible
        demo.displayPublic(); // Accessible

        // Accessing protected variable and method
        System.out.println(demo.protectedVariable); // Accessible only within the same package
        demo.displayProtected(); // Accessible only within the same package

        // Accessing default variable and method
        System.out.println(demo.defaultVariable); // Accessible only within the same package
        demo.displayDefault(); // Accessible only within the same package

        // Accessing private variable and method
        // System.out.println(demo.privateVariable); // Not accessible (uncommenting will cause a compile error)
        // demo.displayPrivate(); // Not accessible (uncommenting will cause a compile error)

        // Accessing private method via public method
        demo.callPrivate(); // Accessible through public method

        // Demonstrating protected access in subclass
        // SubClass sub = new SubClass();
        // sub.accessProtected(); // Accessing protected variable from subclass
    }
}
