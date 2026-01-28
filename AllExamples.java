1.public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! Java setup successful.");
    }
}

output
    [Running] cd "c:\Users\manik\Desktop\" && javac HelloWorld.java && java HelloWorld
Hello World! Java setup successful.

[Done] exited with code=0 in 2.068 seconds


2.class TemperatureConverter {
    public static void main(String[] args) {

        // Declare variable
        double fahrenheit = 98.6;

        // Formula to convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print result using printf
        System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, celsius);
    }
}

output
    [Running] cd "c:\Users\manik\Desktop\" && javac TemperatureConverter.java && java TemperatureConverter
98.60 F = 37.00 C

[Done] exited with code=0 in 1.069 seconds



3.class EvenOddChecker {
    public static void main(String[] args) {

        int number = 27;

        // Check even or odd using ternary operator
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }
}


output
    [Running] cd "c:\Users\manik\Desktop\" && javac EvenOddChecker.java && java EvenOddChecker
27 is Odd

[Done] exited with code=0 in 0.946 seconds



4.class MultiplicationTable {
    public static void main(String[] args) {

        int num = 32;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

output
[Running] cd "c:\Users\manik\" && javac MultiplicationTable.java && java MultiplicationTable
30 x 1 = 30
30 x 2 = 60
30 x 3 = 90
30 x 4 = 120
30 x 5 = 150
30 x 6 = 180
30 x 7 = 210
30 x 8 = 240
30 x 9 = 270
30 x 10 = 300

[Done] exited with code=0 in 0.942 seconds

5.class DigitCounter {
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
output
    [Running] cd "c:\Users\manik\Desktop\" && javac DigitCounter.java && java DigitCounter
Total digits: 5

[Done] exited with code=0 in 0.908 seconds



6.class FibonacciSeries {
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
output
    [Running] cd "c:\Users\manik\Desktop\" && javac FibonacciSeries.java && java FibonacciSeries
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 
[Done] exited with code=0 in 1.063 seconds



7.class PrimeChecker {
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
output
    [Running] cd "c:\Users\manik\" && javac PrimeChecker.java && java PrimeChecker
29 is Prime

[Done] exited with code=0 in 1.084 seconds

8.class DayFinder {
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

output
    [Running] cd "c:\Users\manik\" && javac DayFinder.java && java DayFinder
Wednesday

[Done] exited with code=0 in 0.882 seconds

9.class ArrayOperations {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 5};
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
output
    [Running] cd "c:\Users\manik\" && javac ArrayOperations.java && java ArrayOperations
Sum of array elements: 22

[Done] exited with code=0 in 1.14 seconds


10.class CircleOperations {
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
output
    [Running] cd "c:\Users\manik\" && javac CircleOperations.java && java CircleOperations
Area: 176.71458676442586
Circumference: 47.12388980384689

[Done] exited with code=0 in 1.153 seconds

