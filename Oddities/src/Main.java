import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(s.nextLine());
            String output = (num % 2 == 0) ? "even" : "odd";
            System.out.printf("%d is %s\n",num, output);
        }
    }
}
