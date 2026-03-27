public class Calculator {
    
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a + b; //CAMBIO AQUI
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Suma: " + calc.sum(5, 3));
    }
}