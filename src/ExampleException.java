public class ExampleException {
    public static int rectangleArea(int a, int b) {

        try {

            if (a < 0 | b < 0) {

                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("input value is below zero!");
        }
        return a * b;
    }

}


