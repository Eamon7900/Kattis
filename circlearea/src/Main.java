import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            double r = s.nextDouble();
            double pts = s.nextInt();
            double pts_in = s.nextInt();
            if((r == pts) && (pts == pts_in) && (pts_in) == 0) return;
            double area = Math.PI*(r*r);
            double area_est = (pts_in == 0) ? 0 : (pts_in/pts)*4*r*r;
            System.out.printf("%f %f\n", area, area_est);
        }
    }
}
