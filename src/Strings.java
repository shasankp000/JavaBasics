public class Strings {

    public static void main(String[] args) {

        // Strings. It is a reference type. But to declare them we have an easier syntax that may look like a primitive type, but it is not a primitive type

        String name = "John";
        System.out.println(name);

        // String concatenation
        String firstName = "John";
        String lastName = "Doe";

        // =====================================================================================================

        // String methods

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // String length
        System.out.println(fullName.length());

        // String boolean methods

        System.out.println(fullName.isEmpty()); // true
        System.out.println(fullName.isBlank()); // false // returns true if the string contains only whitespaces

        // String trim() method
        fullName = fullName.trim();
        System.out.println(fullName);
        System.out.println(fullName.isBlank());

        // String toLowerCase() method
        System.out.println(fullName.toLowerCase());

        // String toUpperCase() method
        System.out.println(fullName.toUpperCase());

        // String concat() method
        System.out.println(fullName.concat(" is a coder"));

        // String startswith() and endswith() methods
        System.out.println(fullName.startsWith("A"));
        System.out.println(fullName.endsWith("coder"));

        // =============================================================================

        // Escape Sequences
        String escape = "This is a \n new line";
        System.out.println(escape);

        String message = "Hello \"John \""; // double quotes within of double quotes
        System.out.println(message);

        // let's say we have a path to a folder

         String path = "C:\\Users\\user\\Desktop\\";
         System.out.println(path);


    }

}
