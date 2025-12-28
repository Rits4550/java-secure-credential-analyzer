import checker.*;
import java.util.Arrays;
import java.util.Scanner;
import model.Credential;
import service.CredentialAnalyzer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password to analyze: ");
        String password = sc.nextLine();

        Credential credential = new Credential(password);

        CredentialAnalyzer analyzer = new CredentialAnalyzer(Arrays.asList(
                        new LengthCheck(),
                        new ComplexityCheck(),
                        new CommonPasswordCheck()
                )
        );

        analyzer.analyze(credential);
    }
}
