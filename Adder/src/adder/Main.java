package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide four integers to add");
        }
    }

    private static int addArguments(String[] args) {
        if (args[0]== "-" || args[0]== '-') {
            return (Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]) + Integer.valueOf(args[3]));
        } else {
             return (0 - Integer.valueOf(args[1]) - Integer.valueOf(args[2]) - Integer.valueOf(args[3]));
        }
    }
}
