import java.util.Scanner;

public class average {
    public static  void printagv(int a,int b, int c){
        System.out.println("avg of numbers is : "+(a+b+c)/3);
        return;
    }
    public static void sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum=sum+i;

        }
        System.out.println("sum of odd numbers is :"+ sum);
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        printagv(n1,n2,n3);
        sumOfOdd(n3);
    }
    
}
