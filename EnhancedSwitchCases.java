public class EnhancedSwitchCases {
    public static String process(Object message){
        return switch (message){
            case Integer i when i ==7 -> "got a 7";
            case Integer i -> "got a number";
            case String str ->"got a string of length "+str.length();
            default -> "whatever";
        };
    }
}
