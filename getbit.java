import java.util.*;
public class getbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter position : ");
        int pos=sc.nextInt();
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int bitmask = 1 << pos;
        if((bitmask & n) == 0)
        {
            System.out.println("bit "+" pos is zero");
        }
        else
        {
            System.out.println("bit "+" pos is 1");
        }
        
    }
}
    