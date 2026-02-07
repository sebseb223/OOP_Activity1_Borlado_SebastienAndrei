





public class Main {
    public static void main(String[] args) {

        // 1. ARITHMETIC TEST
        Arithmetic calc = new Arithmetic();
        calc.setNumbers(10, 5);
        calc.add();
        System.out.println("addition result: " + calc.getResult());

        calc.setNumbers(10,0);
        calc.divide();
        System.out.println("divition result: " + calc.getResult());

        // 2. GEOMETRY TEST
        Geometry shape = new Geometry();
        shape.setRadius(5);
        shape.areaCircle();
        System.out.println("circle area: " + shape.getResult());
        
        shape.setDimensions(2, 4);
        shape.areaRectangle();
        System.out.println("rectangle area: " + shape.getResult());

        
        
        // 3. NUMBER ANALYSIS TEST
        NumberAnalysis num = new NumberAnalysis();
        num.setNumber(17);
        num.checkPrime(); // 17 is Prime
        num.setNumber(8);
        num.checkPrime();
        
        
        num.setNumber(4);
        num.factorial();
        System.out.println("factorial of 4: " + num.getResult());
    }
}
    

