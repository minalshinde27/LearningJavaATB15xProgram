package Test_JavaCoding_10Feb2026;

public class CustomExceptionImplementation {
    public static void main() throws InvalidAgeException {
        validateAge(18);
    }

    public static void validateAge (int age) throws InvalidAgeException {
        if (age<18){
            throw new InvalidAgeException("InvalidAgeException: Age must be 18 or above." +
                    " Provided age: "+age);
        } else {
            System.out.println("Age is valid: "+age);
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException (String message) {
        super(message);
    }
}
