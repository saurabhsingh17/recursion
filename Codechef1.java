public class Codechef1 {
    static String printDays(int n){
        return switch (n){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + n);
        };
    }

    public static void main(String[] args) {
        System.out.println(printDays(1));
    }
}
