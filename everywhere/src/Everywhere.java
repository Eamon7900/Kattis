import java.util.ArrayList;
import java.util.Scanner;

public class Everywhere {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    for(int i = 0; i < n; i++){
	        int trips = s.nextInt();
	        ArrayList<String> cities = new ArrayList<String>();
	        for(int j = 0; j <= trips; j++){
	            String city = s.nextLine();
	            if(city.equals("")) continue;
	            if(!cities.contains(city)){
	                cities.add(city);
	            }
            }
	        System.out.println(cities.size());
	        //System.out.println(cities.toString());
        }
    }
}
