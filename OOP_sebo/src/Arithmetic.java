









public class Arithmetic extends MathOperation {
    private double num1;
    private double num2;

    public void setNumbers(double n1, double n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public void add() {
        this.result = num1 + num2;
    }

    public void subtract() {
        this.result = num1 - num2;
    }

    public void multiply() {
        this.result = num1 * num2;
    }

    public void divide() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            this.result = 0;
        } else {
            this.result = num1 / num2;
        }
    }
}    

