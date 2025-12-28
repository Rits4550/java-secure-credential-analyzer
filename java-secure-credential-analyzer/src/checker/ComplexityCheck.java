package checker;

import model.Credential;

public class ComplexityCheck implements SecurityCheck {

    @Override
    public String runCheck(Credential credential) {
        String pwd = credential.getPassword();

        boolean hasUpper = pwd.matches(".*[A-Z].*");
        boolean hasLower = pwd.matches(".*[a-z].*");
        boolean hasDigit = pwd.matches(".*[0-9].*");

        if (hasUpper && hasLower && hasDigit) {
            return "Complexity check passed.";
        }
        return "Password should include uppercase, lowercase, and digits.";
    }
}


