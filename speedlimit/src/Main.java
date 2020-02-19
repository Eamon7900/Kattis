import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    int n = 0;
	    while(true){
	        n = s.nextInt();
	        if(n == -1) break;
	        int distance = 0;
	        int t, t_prev = 0;
	        for(int i = 0; i < n; i++){
	        	int speed = s.nextInt();
				t = s.nextInt() - t_prev;
	        	distance += speed * t;
	        	t_prev += t;
            }
	        System.out.printf("%d miles\n", distance);
        }
    }
}
