package service;

import checker.SecurityCheck;
import model.Credential;

import java.util.List;

public class CredentialAnalyzer {

    private List<SecurityCheck> checks;

    public CredentialAnalyzer(List<SecurityCheck> checks) {
        this.checks = checks;
    }

    public void analyze(Credential credential) {
        for (SecurityCheck check : checks) {
            System.out.println(check.runCheck(credential));
        }
    }
}

