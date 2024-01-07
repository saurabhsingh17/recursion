package recursion;
/*
Tower of Hanoi is a classical recursive problem with simple solution.
Solution is to move n-1 plates from source to helper and then move n-th plate
from source to destination. Then finally moving n-1 plates from helper to destination
using source as helper.

Formula:
No of moves: (2^n)-1
 */

public class TowerOfHanoi {
    static int count = 0;

    static void solve(int n, int s, int d, int h) {
        count++;
        if (n == 1) {
            System.out.println("Moving plate 1 from source to destination");
            return;
        }
        solve(n - 1, s, h, d);
        System.out.println("Moving plate " + n + " from source to destination ");
        solve(n - 1, h, d, s);

    }

    public static void main(String[] args) {
        int source = 1;
        int destination = 3;
        int helper = 2;
        solve(4, source, destination, helper);
        System.out.println(count);
    }
}
