import java.util.Scanner;

public class Main {
    //expected value = 1/n * sum of all values
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double expGun = exp(s.nextInt(), s.nextInt()) + exp(s.nextInt(), s.nextInt());
        double expEm = exp(s.nextInt(), s.nextInt()) + exp(s.nextInt(), s.nextInt());

        if(expGun > expEm)
            System.out.println("Gunnar");
        else if( expGun == expEm)
            System.out.println(("Tie"));
        else
            System.out.println("Emma");

    }

    public static double exp(int a1, int b1){
        int sum = 0;
        for(int i = a1; i <= b1; i++)
            sum += i;

        return (double)(sum/((b1 - a1) + 1));
    }
}
