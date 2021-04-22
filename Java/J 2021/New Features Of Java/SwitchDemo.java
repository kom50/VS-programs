// package J 2021.New Features Of Java;

public class SwitchDemo {
    public static void main(String[] args) throws Exception {
        String btnPress = new String();
        System.out.print("Enter a number ");
        char btn = (char) System.in.read();

        /* System.out.println(btn); */
        // switch expression
        btnPress = switch (btn) {
            case '4' -> "Left";
            // break;
            case '8' -> "Up";
            // break;
            case '6' -> "Right";
            // break;
            case '2' -> "Down";
            // break;
            default -> "Wrong button";
        };

        System.out.println(btn + "  Button press " + btnPress);
        System.out.println(5 == '5');
    }
}
