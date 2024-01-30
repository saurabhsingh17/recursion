package adityaverma;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithCaseChange {

    static List<String> result = new ArrayList<>();
    static List<String> permutationWithCaseChange(String in, String out){
        if ((in.isEmpty())){
            result.add(out);
            return result;
        }
        String out1 = out;
        String out2 = out;
        if(Character.isAlphabetic(in.charAt(0)) ){
            out2 += (in.toUpperCase().charAt(0));
            out1 += (in.toLowerCase().charAt(0));
            in = in.substring(1);
            permutationWithCaseChange(in,out1);
            permutationWithCaseChange(in,out2);
        }
        else{
            out+=in.charAt(0);
            in=in.substring(1);
            permutationWithCaseChange(in,out);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(permutationWithCaseChange("a1B2",""));
    }
}
