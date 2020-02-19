import java.util.Scanner;
/*

 */
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int g = s.nextInt();
	    int S = s.nextInt();
	    int c = s.nextInt();

	    int bp = g*3 + S*2 + c*1;
        String vic = "", tres = "";

	    if(bp >= 2 && bp < 5) {
            vic = "Estate";
        }
        if(bp >= 5 && bp < 8) {
            vic = "Duchy";
        }
        if(bp >= 8) {
            vic = "Province";
        }

        if(bp >= 0 && bp < 3)
            tres = "Copper";
        if(bp >= 3 && bp < 6)
            tres = "Silver";
        if(bp >= 6)
            tres = "Gold";

        if(vic.equals("")) {
            System.out.println(tres);
            return;
        }

        if(tres.equals("")) {
            System.out.println(vic);
            return;
        }
            System.out.println(vic + " or " + tres);
    }
}
