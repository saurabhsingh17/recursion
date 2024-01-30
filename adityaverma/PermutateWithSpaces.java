package adityaverma;

import java.util.ArrayList;
import java.util.List;

public class PermutateWithSpaces {
    static List<String> result = new ArrayList<>();
    static List<String> permutate(String input, String output){
        if (input.isEmpty()){
            result.add(output);
            return result;
        }
        String out1  = output;
        String out2 = output;

            out1 += "_"+input.charAt(0);
            out2 += input.charAt(0);

        input = input.substring(1);
        permutate((input), out1);
        permutate((input), out2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(permutate("abc","a"));
    }
}
