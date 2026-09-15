import java.util.Scanner;
public class end_loop_with_negative_input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            int n = sc.nextInt();
            if(n<1){
                break;
                System.out.println("Enter the first number: ");
            }
        }
    }
}
