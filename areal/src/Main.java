import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        long a = Long.parseLong(input);

        double l = Math.sqrt(a);

        /*if(Math.round(l) - l == 0 && Math.floor(l) - l == 0) {
            int i = (int)l;
            System.out.printf("%d\n", 4*i);
            return;
        }*/

        System.out.printf("%f\n",4*l);
    }
}
