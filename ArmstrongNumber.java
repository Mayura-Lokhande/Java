import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int res=0;
		int cube = 0;
		
		while(temp>0){
			int last = temp%10;
			cube = last*last*last;
			res = res+cube;
			temp=temp/10;
		}
		if(res==n){
			System.out.println("IT IS A ARMSTRONG NUMBER");
		}
		else{
			System.out.println("IT IS NOT A ARMSTRONG NUMBER");
		}
	}
}
