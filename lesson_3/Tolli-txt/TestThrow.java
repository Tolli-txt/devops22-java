public class TestThrow {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Error! Person is too young to drink.");
        } else {
            System.out.println("Success! Person is old enough to drink.");
        }
    }

    public static void main(String args[]) {
        validate(15);
        System.out.println("If you see this, something went wrong.");
    }
}