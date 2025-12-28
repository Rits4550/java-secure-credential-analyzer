package checker;

import model.Credential;

public class LengthCheck implements SecurityCheck {

    @Override
    public String runCheck(Credential credential) {
        if (credential.getPassword().length() < 8) {
            return "Password is too short (minimum 8 characters).";
        }
        return "Length check passed.";
    }
}


