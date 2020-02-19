import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int r_1 = s.nextInt();

	    for(int i = 0; i < n-1; i++){
            int r_next = s.nextInt();


	        int a = r_1;
	        int b = r_next;

            int r = 1;

            while(true){
                if(a % b == 0) break;
                b = a % b;
                a = b;
            }

	        System.out.printf("%d/%d\n", r_1/b, r_next/b);
        }
    }
}
