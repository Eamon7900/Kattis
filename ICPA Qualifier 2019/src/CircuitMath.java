import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class CircuitMath {
    public static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static boolean[] values;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        values = new boolean[n];

        for(int i = 0; i < n;){
            if(s.next().charAt(0) == 'T')
                values[i++] = true;
            if(s.next().charAt(0) == 'F')
                values[i++] = false;
        }

        Stack<Character> circ = new Stack<>();
        s.nextLine();
        String input = s.nextLine();
        Scanner parser = new Scanner(input);
        while(parser.hasNext()) {
            circ.push(parser.next().charAt(0));
            //parser.next(); //Skip white space
        }



        boolean result = go(circ);

        if(result == true)
            System.out.println('T');
        if(result == false)
            System.out.println('F');
    }

    public static boolean go(Stack<Character> circuit){
        char op = '4';
        if(!circuit.isEmpty()) op = circuit.pop();
        boolean v1, v2;
        if(op == '*' && !circuit.isEmpty()) {
            if(isOp(circuit.peek())) {
                v1 = go(circuit);
                v2 = go(circuit);
                return v1 && v2;
            }else{
                v1 = values[alpha.indexOf(circuit.pop())];
                v2 = values[alpha.indexOf(circuit.pop())];
                return v1 && v2;
            }
        }else if(op == '+' && !circuit.isEmpty()) {
            if(isOp(circuit.peek())){
                v1 = go(circuit);
                v2 = go(circuit);
                return v1 || v2;
            }else{
                v1 = values[alpha.indexOf(circuit.pop())];
                v2 = values[alpha.indexOf(circuit.pop())];
                return v1 || v2;
            }
        }else if(op == '-' && !circuit.isEmpty()) {
            if(isOp(circuit.peek())){
                v1 = go(circuit);
                return !v1;
            }else{
                v1 = values[alpha.indexOf(circuit.pop())];
                return !v1;
            }
        }

        //System.out.println("Reached end... something fucked up");
        return false;  //will never reach here
    }

    public static boolean isOp(char c){
        return c == '*' || c == '+' || c == '-';
    }

}