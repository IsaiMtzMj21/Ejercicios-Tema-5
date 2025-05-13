import java.awt.HeadlessException;

public class holaMundoGUI {
    public static void main(String[] args) throws HeadlessException, InterruptedException {
        Ventana v = new Ventana("Si me buscas este es mi id " + getPID());
        v.setVisible(true);
        if (args.length > 0) {
            v.setTextos(args);
        }
    }

    public static String getPID() {
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
}

