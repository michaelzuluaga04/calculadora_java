public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        boolean testsPassed = true;
        
        // Test suma
        if (calc.sum(2, 3) == 5) {
            System.out.println("✓ Test suma: OK");
        } else {
            System.out.println("✗ Test suma: FAILED");
            testsPassed = false;
        }
        
        // Test resta
        if (calc.subtract(5, 3) == 2) {
            System.out.println("✓ Test resta: OK");
        } else {
            System.out.println("✗ Test resta: FAILED");
            testsPassed = false;
        }
        
        // Test multiplicación
        if (calc.multiply(2, 3) == 6) {
            System.out.println("✓ Test multiplicación: OK");
        } else {
            System.out.println("✗ Test multiplicación: FAILED");
            testsPassed = false;
        }
        
        // Test división
        if (calc.divide(6, 3) == 2) {
            System.out.println("✓ Test división: OK");
        } else {
            System.out.println("✗ Test división: FAILED");
            testsPassed = false;
        }
        
        // Resultado final
        System.out.println("\n=== RESULTADO ===");
        if (testsPassed) {
            System.out.println("✓ TODAS LAS PRUEBAS PASARON");
            System.exit(0);
        } else {
            System.out.println("✗ HUBO PRUEBAS FALLIDAS");
            System.exit(1);
        }
    }
}