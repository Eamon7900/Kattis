import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = 1;
        while(s.hasNext()){
            Scanner parser = new Scanner(s.nextLine());
            int n = parser.nextInt();
            ArrayList<Integer> data = new ArrayList<>();
            for(int i = 0; i < n; i++)
                data.add(parser.nextInt());

            Collections.sort(data);
            int min = data.get(0);
            int max = data.get(data.size() - 1);
            int range = max - min;
            System.out.printf("Case %d: %d %d %d\n", j++, min, max, range);
        }
    }
}
