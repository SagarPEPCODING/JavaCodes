package calculations;

// Java Method Overriding
// During inheritance in Java, if the same method is present in both the superclass and the subclass. Then, the method in the subclass overrides the same method in the superclass. This is called method overriding.

class Language {
    public void displayInfo() {
        System.out.println("Common English Language");
    }
}

class Java extends Language {
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // create an object of Java class
        Java j1 = new Java();
        j1.displayInfo();

        // create an object of Language class
        Language l1 = new Language();
        l1.displayInfo();
    }
}
