import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("\nBefore Swapping\nA = "+a+"\nB = "+b);
        b = (a+b)-(a=b);
        System.out.println("\nAfter Swapping\nA = "+a+"\nB = "+b);
    }
}class Sqrt {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        while(low+1 < high){
            long mid=low+(high-low) / 2;       
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid < x)
                low=mid;
            else
                high=mid;
        }
        if(high*high ==x){
            return (int)high;   //last element is checked too if the input is 1
        }
        return (int)low;
    }
}
