package recursion;
enum PlatesTypes {
    DESTINATION, HELPER, SOURCE

}

public class TowerOfHanoi {
    static void arrangePlates(int n){
        if(n == 1){
            System.out.println("Moving plate 1 from source to destination");
             return;
        }

            arrangePlates(n - 1);
            System.out.println("Moving plates from destination to helper ");
            System.out.println("Moving plate " + n + " from source to destination ");
            System.out.println("Moving plates from helper to destination ");


    }
    public static void main(String[] args) {
        //no of plates in source

        arrangePlates(3);
    }
}
