import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //fun(n);
        /*System.out.println("   ");
        funrev(n);
        System.out.println("The factorial is   ");
        System.out.println(factorial(n)); 
        System.out.println("The sum is   ");
        System.out.println(sum(n)); 
        System.out.println("The sum of digits is   ");
        System.out.println(sumofDigits(n)); 
        System.out.println("The reverse of a number is   "  );
        revnum(n);
        System.out.println(sum);/* */
        countZeros(n);
        System.out.println(count);
        System.out.println(numberOfSteps(n));
    }

    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funrev(int n){
        if (n==0){
            return;
        }

        funrev(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if (n==1){
            return 1;
        }

        return n*factorial(n-1);
    }

    static int sum(int n){
        if (n==1){
            return 1;
        }

        return n+sum(n-1);
    }

    static int sumofDigits(int n){
        if (n==0){
            return 0;
        }

        return (n%10)+sumofDigits(n/10);
    }

    static int sum=0;
    static void revnum(int n){
        if (n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        revnum(n/10);
    }

    static int count=0;
    static void countZeros(int n){
        if (n==0){
            return;
        }
        if(n%10==0){
            count++;
        }
        countZeros(n/10);
    }

    public static int numberOfSteps(int n){
        return helper(n, 0);
    }

    private static int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            num=num/2;
            return helper(num, steps+1);
        }
        else{
            num=num-1;
            return helper(num, steps+1);
        }
    }
}