public class KthSymbolinGrammar {
    public static int kthGrammar(int n, int k) {
        int mid = (int) (Math.pow(2,n-1)/2);
        if(n == 1 && k == 1)
            return 0;
        else if (k <= mid) {
            return kthGrammar(n-1,k);
        }
        else
            return (kthGrammar(n-1,k-mid))^1;
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(2,2));
    }
}
