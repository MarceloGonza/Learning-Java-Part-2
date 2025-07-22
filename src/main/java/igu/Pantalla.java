package igu;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Pantalla extends JFrame {

    public Pantalla() {
        // Configuración general de la ventana
        setTitle("Copiadora de texto");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1)); // 5 filas, 1 columna

        // 1. Label 
        JLabel labelSuperior = new JLabel("Ingrese un texto:");
        labelSuperior.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelSuperior);

        // 2. Campo de texto
        JTextField campoTexto = new JTextField();
        add(campoTexto);

        // 3. Botón "Copiar"
        JButton botonCopiar = new JButton("Copiar");
        add(botonCopiar);

        // 4. Label que muestra el resultado
        JLabel labelResultado = new JLabel("El texto que usted ingresó es:");
        labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelResultado);

        // 5. Label donde aparecerá el texto copiado
        JLabel textoCopiado = new JLabel("");
        textoCopiado.setHorizontalAlignment(SwingConstants.CENTER);
        add(textoCopiado);

        // 3. Botón "limpiar"
        JButton botonLimpiar = new JButton("Limpiar");
        add(botonLimpiar);

        // Acción del botón
        botonCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoIngresado = campoTexto.getText();
                textoCopiado.setText(textoIngresado);
            }
        });

        botonLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textoCopiado.setText(""); //borra lo copiado
                campoTexto.setText(""); //borra el primer labal
            }
        });
    }
}

/* PARA EJECUTAR:
javac -d out src/main/java/igu/Pantalla.java
java -cp out igu.Pantalla
*/