class InvalidInputException extends Exception {
    public InvalidInputException(int input) {
        super("InvalidInputException [" + input + "]");
    }
}

class TestPrime {
    public boolean isPrime(int number) throws InvalidInputException {
        if (number <= 1) {
            throw new InvalidInputException(number);
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        TestPrime testPrime = new TestPrime();

        // Test with prime number
        try {
            int inputPrime = 13;
            boolean isPrime = testPrime.isPrime(inputPrime);
            System.out.println(inputPrime + " is prime: " + isPrime);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        // Test with non-prime number
        try {
            int inputNonPrime = 10;
            boolean isPrime = testPrime.isPrime(inputNonPrime);
            System.out.println(inputNonPrime + " is prime: " + isPrime);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        // Test with invalid input
        try {
            int invalidInput = -5;
            boolean isPrime = testPrime.isPrime(invalidInput);
            System.out.println(invalidInput + " is prime: " + isPrime);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
