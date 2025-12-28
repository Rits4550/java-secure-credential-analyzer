package checker;

import model.Credential;

public class CommonPasswordCheck implements SecurityCheck {

    private static final String[] COMMON_PASSWORDS = {
            "password", "123456", "qwerty", "admin"
    };

    @Override
    public String runCheck(Credential credential) {
        for (String weak : COMMON_PASSWORDS) {
            if (credential.getPassword().equalsIgnoreCase(weak)) {
                return "Password is too common and insecure.";
            }
        }
        return "Common password check passed.";
    }
}

