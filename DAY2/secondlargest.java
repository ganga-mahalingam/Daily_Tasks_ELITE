import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int arr[]=new int[n]; // 9 8 7 6 5
	   for(int i=0;i<n;i++){
	       arr[i]=sc.nextInt();
	   }
	   int first=Integer.MIN_VALUE; //minus 
	   int second=Integer.MIN_VALUE; //minus 
	   for(int i=0;i<n;i++){
	       if(arr[i]>first){  //9>-1 8>9
	          second=first;  //-1
	          first=arr[i]; //9
	       }
	       else if(arr[i]>second && arr[i]!=first){ 
	           second=arr[i]; //8
	       }
	   }
	   System.out.println(second);
	}
}
