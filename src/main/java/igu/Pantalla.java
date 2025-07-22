package igu;

import javax.swing.JFrame;
import javax.swing.JLabel;

// Esta clase DEBE llamarse igual que el archivo
public class Pantalla extends JFrame {

    public Pantalla() {
        // Acá construís la interfaz
        setTitle("Ventana desde la capa igu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel etiqueta = new JLabel("¡Hola desde Swing!", JLabel.CENTER);
        add(etiqueta);
    }
}


/* PARA EJECUTAR:
javac -d out src/main/java/igu/Pantalla.java
java -cp out igu.Pantalla
*/