package examen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Iner extends JFrame {

    JMenu menu;
    JMenuItem opcion, opcion2;
    JMenuBar barra;
    JPanel contenedor;
    JLabel etiqueta;

    public Iner() {
        setTitle("INE");
        setSize(800, 580);
        setLayout(null);
        Componentes();
        this.setResizable(false);
//        Fondo fon = new Fondo();
//        this.add(fon, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {

        barra = new JMenuBar();

        menu = new JMenu("Archivo");

        opcion = new JMenuItem();
        opcion.setText("INE");
        opcion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                CalaveritaLiteraria cal = new CalaveritaLiteraria();
                setVisible(false);

            }
        });

        menu.add(opcion);
        barra.add(menu);
        setJMenuBar(barra);

//******************************************************************************
        etiqueta = new JLabel();
        etiqueta.setText("INE");
        etiqueta.setBounds(0, 0, 800, 535);
        etiqueta.setIcon(new ImageIcon(getClass().getResource("Fondo0")));

        add(etiqueta);

    }

    public static void main(String[] args) {
        Calaverita calaverita = new Calaverita();
    }
}
