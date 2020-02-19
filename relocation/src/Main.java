import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int q = s.nextInt();

        int[] distances = new int[n+1];  //index based on company number
        for(int i = 1; i <= n; i++){
            distances[i] = s.nextInt();
        }
        for(int i = 0; i < q; i++){
            int request = s.nextInt();

            if(request == 2){
                System.out.println(Math.abs(distances[s.nextInt()] - distances[s.nextInt()]));
            }
            if(request == 1){
                distances[s.nextInt()] = s.nextInt();
            }
        }
    }
}

