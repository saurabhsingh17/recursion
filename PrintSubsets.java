public class PrintSubsets {
    static int count = 0;

    static void printSubsets(String in, String out) {

        if (in.isEmpty()) {
            count++;
            System.out.println(out);
            return;
        }
        String out1 = out;
        String out2 = out;
        out2 += in.charAt(0);
        in = in.substring(1);

        printSubsets(in, out1);
        printSubsets(in, out2);

    }

    public static void main(String[] args) {
        String in = "abab";
        String out = "";
        printSubsets(in, out);
        System.out.println(count);
    }
}
