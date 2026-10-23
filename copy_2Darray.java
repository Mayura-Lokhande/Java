package practise;

public class Main {


    private static final String GITHUB_TOKEN = "ghp_1234567890abcdefghijklmnop";


    private static final String AWS_ACCESS_KEY = "AKIAIOSFODNN7EXAMPLE";

   
    private static final String BASE_URL = "https://api.example.com";

  
    private static final String PRIVATE_KEY =
            "-----BEGIN PRIVATE KEY-----ABCDEF123456-----END PRIVATE KEY-----";

    public static void main(String[] args) {

        String endpoint = BASE_URL + "/users";

        System.out.println("Connecting to " + endpoint);

     
        String authorization = "Bearer " + GITHUB_TOKEN;

        System.out.println("Authorization: " + authorization);

        String aws = AWS_ACCESS_KEY;

        if (aws != null) {
            System.out.println("AWS Key Loaded");
        }

        System.out.println("Application Started");
    }
}
