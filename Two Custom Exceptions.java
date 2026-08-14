class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
class IncorrrectPasswordException extends Exception {
    public IncorrrectPasswordException(String message) {
        super(message);
    }
}
public class TwoCustomExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } catch (IncorrrectPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validatePassword(String password) throws InvalidPasswordException, IncorrrectPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new IncorrrectPasswordException("Password must contain at least one uppercase letter.");
        }
    }
}