package ASS4.SETB;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class EmailId {
    String username;
    String password;

    public EmailId() {
        this.username = null;
        this.password = null;
    }

    public EmailId(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        
        if (username == null || !username.contains("@")) {
            throw new InvalidUsernameException("Invalid Username: Must contain '@' symbol.");
        }
        
        if (password == null || password.length() < 8) {
            throw new InvalidPasswordException("Invalid Password: Must be at least 8 characters long.");
        }

        this.username = username;
        this.password = password;
        System.out.println("EmailId created successfully.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Usage: java ASS4.SETB.Q2 <username> <password>");
            return;
        }

        String username = args[0];
        String password = args[1];

        try {
            EmailId email = new EmailId(username, password);
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Validation Failed: " + e.getMessage());
        }
    }
}
