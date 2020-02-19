import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x  = s.nextInt();
        int nW = 0;
        int nM = 0;
        String input = s.nextLine();
        char[] in = input.toCharArray();
        char lastChar = in[0];
        for(int i = 0; i < in.length - 1; i++){
            if(lastChar == 'M')
                if(in[i + 1] == 'M') ;//let in a man
            if(lastChar =='W')
                if(in[i + 1] == 'W'); //let in a woman

        }
    }
}
