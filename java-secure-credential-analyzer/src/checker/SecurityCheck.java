package checker;

import model.Credential;

public interface SecurityCheck {
    String runCheck(Credential credential);
}

