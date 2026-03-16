import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner([System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n-1;i++){
      arr[i]=sc.nextInt();
    }
    int sum=0;
    int msum=n*(n+1)/2;
    for(int i=0;i<n-1;i++){
      sum+=arr[i];
    }
    System.out.println(msum-sum);
  }
}
