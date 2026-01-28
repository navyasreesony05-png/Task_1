public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! Java setup successful.");
    }
}

class TemperatureConverter {
    public static void main(String[] args) {

        // Declare variable
        double fahrenheit = 98.6;

        // Formula to convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print result using printf
        System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, celsius);
    }
}

class EvenOddChecker {
    public static void main(String[] args) {

        int number = 27;

        // Check even or odd using ternary operator
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }
}

class MultiplicationTable {
    public static void main(String[] args) {

        int num = 32;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class DigitCounter {
    public static void main(String[] args) {

        int number = 12345;
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Total digits: " + count);
    }
}

class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}

class PrimeChecker {
    public static void main(String[] args) {

        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + (isPrime ? " is Prime" : " is Not Prime"));
    }
}

class DayFinder {
    public static void main(String[] args) {

        int day = 3;

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}

class ArrayOperations {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 5};
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

class CircleOperations {
    public static void main(String[] args) {

        double radius = 7.5;

        System.out.println("Area: " + calculateArea(radius));
        System.out.println("Circumference: " + calculateCircumference(radius));
    }

    static double calculateArea(double r) {
        return Math.PI * r * r;
    }

    static double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }
}