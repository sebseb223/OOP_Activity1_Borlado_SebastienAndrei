





public class NumberAnalysis extends MathOperation {
    private int number;

    public void setNumber(int n) {
        this.number = n;
    }

    public void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    public void checkPrime() {
        boolean isPrime = true;
        if (number <= 1) isPrime = false;
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime.");
        } else {
            System.out.println(number + " is NOT Prime.");
        }
    }

    public void factorial() {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        this.result = fact;
    }
}   

