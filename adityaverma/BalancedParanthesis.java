package adityaverma;

import java.util.ArrayList;
import java.util.List;

public class BalancedParanthesis {

    static List<String> result = new ArrayList<>();
    static List<String> generate(int left,int right, String output) {
        if (left == 0  && right == 0){
            result.add(output);
            return result;
        }
        if(left != 0) {
            String out1 = output;
            out1 +="{";

            generate(left-1, right, out1);

        }
        if (right > left){
            String out2 = output;
            out2+="}";
            generate(left,right-1,out2);

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(10,10,""));
    }

}
