package practise;

public class Main {


    private static final String GITHUB_TOKEN = System.getenv("GITHUB_TOKEN");


    private static final String AWS_ACCESS_KEY = System.getenv("AWS_ACCESS_KEY");

   
    private static final String BASE_URL = "https://api.example.com";

  
    private static final String PRIVATE_KEY = System.getenv("PRIVATE_KEY");

    public static void main(String[] args) {

        String endpoint = BASE_URL + "/users";

        System.out.println("Connecting to " + endpoint);

     
        String authorization = "Bearer " + GITHUB_TOKEN;

        System.out.println("Authorization configured");

        String aws = AWS_ACCESS_KEY;

        if (aws != null) {
            System.out.println("AWS Key Loaded");
        }

        System.out.println("Application Started");
    }
}
