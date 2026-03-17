import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //12345
		int rev=0;
		while(n>0){
		    int dig=n%10; //5 4 3 2 1
		    rev=rev*10+dig; //54321
		    n=n/10;//1234 123 12 1
		    
		}
		System.out.println(rev);
	}
}
