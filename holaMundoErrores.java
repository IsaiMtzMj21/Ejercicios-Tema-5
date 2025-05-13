public class holaMundoErrores {
    public static void main(String[] args) {
        try {
            Integer num = null;
            System.out.println(num.toString());
        } catch (NullPointerException e) {
            System.out.println("Debes inicializar tu objeto");
        }

        try {
            int a = 10, b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("División por cero no permitida.");
        } finally {
            System.out.println("Fin del manejo de errores.");
        }
    }
}
