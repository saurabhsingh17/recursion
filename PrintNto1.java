public class PrintNto1 {
    public static void printNto1(int n) {
        if (n == 0) {
            return ;
        }
        System.out.print(n +" ");
        printNto1(n - 1);
    }
}
