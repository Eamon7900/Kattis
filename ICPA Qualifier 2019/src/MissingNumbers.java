import java.util.ArrayList;
import java.util.Scanner;

/*
public class MissingNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> missed = new ArrayList<>(15);
        int num = 0, next = 0;
        for(int i = 0; i < n; i++) {
            if(n == 1 && next == 1)
                break;
            if(i == 0) {
                num = s.nextInt();
                if(num != 1) {
                    int j = 1;
                    while(j != num)
                        missed.add(j++);
                }
                continue;
            }

            next = s.nextInt();

            while(num + 1 != next)
                missed.add(++num);
            num = next;
        }

        if(missed.isEmpty())
            System.out.println("good job");
        else{
            for(int x : missed)
                System.out.println(x);
        }
    }
}

*/