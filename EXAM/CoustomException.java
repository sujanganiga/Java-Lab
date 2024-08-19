class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);  // Calls the constructor of Exception class
    }
}

public class CoustomException {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 19) {
            throw new InvalidAgeException("Age is below 19");
        } else {
            System.out.println("Welcome");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);  // Testing with age 13, which is below 19
        } catch (InvalidAgeException e) {
            System.out.println(e.toString());
        }
    }
}
