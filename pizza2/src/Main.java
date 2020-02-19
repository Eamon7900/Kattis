import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        char[] in = input.toCharArray();
;
        int R = 0,C = 0, i = 0;

        for(char c : in){
            if(c == ' ')
                break;
            i++;
        }

        R = Integer.parseInt(input.substring(0,i));
        C = Integer.parseInt(input.substring(i + 1));

        double ratio = (double)(R -C)/R;

        System.out.println(ratio*ratio*100);
    }
}
