package practise;

public class Main {

    // Hardcoded secret token (should be flagged)
  
    // Hardcoded AWS Access Key (should be flagged)
    private static final String API_KEY = System.getenv("API_KEY");

    // Hardcoded Base URL (should be ignored)
    private static final String BASE_URL = "https://api.example.com";

    // Hardcoded Private Key (should be ignored)
    private static final String PRIVATE_KEY =
            "-----BEGIN PRIVATE KEY-----ABCDEF123456-----END PRIVATE KEY-----";

    public static void main(String[] args) {

        String endpoint = BASE_URL + "/users";

        System.out.println("Connecting to " + endpoint);

        // Secret exposed in header
        String authorization = "Bearer " + GITHUB_TOKEN;

        System.out.println("Authorization: " + authorization);

        String aws = AWS_ACCESS_KEY;

        if (aws != null) {
            System.out.println("AWS Key Loaded");
        }

        System.out.println("Application Started");
    }
}
