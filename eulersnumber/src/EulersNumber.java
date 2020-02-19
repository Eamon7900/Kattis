import java.util.Scanner;

public class EulersNumber {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n >= 30) n = 30;

        System.out.println(calculate(n));
    }


    public static double calculate(int n){
        if(n == 0) return 1;
        return (1/(double)factorial(n)) + calculate(n-1);
    }

    public static long factorial(int n){
        if(n == 0) return 1;
        return n*factorial(n-1);
    }
}
