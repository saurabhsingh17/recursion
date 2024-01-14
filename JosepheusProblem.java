import java.util.ArrayList;

class JosepheusProblem {
    public static void main(String[] args) {
        JosepheusProblem josepheusProblem = new JosepheusProblem();
        System.out.println(josepheusProblem.findTheWinner(5,2));
    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> peoples = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            peoples.add(i);
        }
        k--;
        return josepheus(peoples, 0, k);
    }

    static int josepheus(ArrayList<Integer> peoples, int index, int k) {
        if (peoples.size() == 1) {
            return peoples.get(0);
        }
        index = (index + k) % peoples.size();
        peoples.remove(index);
        josepheus(peoples, index, k);
        return peoples.get(0);
    }
}
