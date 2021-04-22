import static java.lang.System.*;

class AssertDemo {
    public static void main(String[] args) {
        int a = 10;
        int speed = 0, time = 90;
        try {
            // assert true : "Equals";
            // assert speed >= 0.0; // (4) The augmented form is used at (3).
            assert time > 100;
            out.println("Inside of code.");
            throw new AssertionError("Time is not a positive value: " + time);
            // if (a == 10)
            // throw new AssertionError("Error a equals to 10");
        } catch (Exception e) {
            out.println("Error " + e);
        }
        out.println("Rest of code.");
    }
}