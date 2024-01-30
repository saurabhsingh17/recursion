package adityaverma;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintSubsetsInList {
    static int count = 0;
    static HashSet<ArrayList<Integer>> result = new HashSet<>();
    static HashSet<ArrayList<Integer>> printSubsets(ArrayList<Integer> in, ArrayList<Integer> out) {

        if (in.isEmpty()) {
            count++;
            result.add(out);
            return result;
        }
        ArrayList<Integer> out1 = new ArrayList<>(out);
        ArrayList<Integer> out2 = new ArrayList<>(out);
        out2.add(in.get(0));
        in.remove(0);

        printSubsets(new ArrayList<>(in), out1);
        printSubsets(new ArrayList<>(in), out2);

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> in = new ArrayList<>();
        in.add(1);
        in.add(2);
//        in.add(3);
        ArrayList<Integer> out = new ArrayList<>();
        printSubsets(in, out);
        System.out.println(printSubsets(in,out));
    }
}
