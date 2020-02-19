import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();

	for(int i = 0; i < t; i++){
	    int n = s.nextInt();
        ArrayList<Integer> locations = new ArrayList<Integer>();
	    for(int j = 0; j < n; j++){
	        locations.add(s.nextInt());
        }
        Collections.sort(locations);

	    int sum = 0;
	    for(int l = 1; l < n; l++){
	        sum += (locations.get(l) - locations.get(l - 1));
        }

	    sum += (locations.get(n - 1) - locations.get(0));
        System.out.println(sum);
    }

    }
}
