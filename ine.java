import Fondo.Fondo2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author maryse
 */
public class CalaveritaLiteraria extends JFrame {

    JMenu menu;
    JMenuItem opcion, opcion2;
    JMenuBar barra;
    JPanel contenedor;
    JLabel etiqueta;
    JTextArea textoLiterario;
    JScrollPane barraDes;

    public CalaveritaLiteraria() {

        setTitle("INE");
        setSize(500, 750);
        setLayout(null);
        Componentes();
        this.setResizable(false);
        Fondo2 fon = new Fondo2();
        this.add(fon, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Componentes() {

        barra = new JMenuBar();

        menu = new JMenu("Opciones");

        opcion = new JMenuItem();
        opcion.setText("Principal");
        opcion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calaverita cal = new Calaverita();
                setVisible(false);

            }
        });

        opcion2 = new JMenuItem();
        opcion2.setText("Exportar a PDF");
        opcion2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                CrearPDF crear = new CrearPDF();
                crear.Crear_PDF();

                int codigo = JOptionPane.showConfirmDialog(null, "¿Desea abrir archivo PDF?", "Archivo PDF creado con exito!!!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) {
                    /*try {
                        File path = new File("\Users\randa\OneDrive\Documentos\programas\paradigmas\examen\PDF");
                        Desktop.getDesktop().open(path);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }*/

                    try {
                        //Se establece el diretorio del archivo
                        File archivo = new File("/Users/randa/OneDrive/Documentos/programas/paradigmas/examen/PDF/INE.pdf");
                        if (archivo.exists()) {
                            Desktop.getDesktop().open(archivo);
                        } else {
                            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                } else if (codigo == JOptionPane.NO_OPTION) {
                    Calaverita cal = new Calaverita();
                    setVisible(false);
                }

            }

        });

        menu.add(opcion);
        menu.add(opcion2);
        barra.add(menu);
        setJMenuBar(barra);

//******************************************************************************
        etiqueta = new JLabel();
        etiqueta.setText("Grupo - C4");
        etiqueta.setBounds(140, 370, 300, 50);
        etiqueta.setFont(new Font("Ani", 1, 40)); // NOI18N
        etiqueta.setForeground(new Color(255, 255, 255));

        textoLiterario = new JTextArea();
        textoLiterario.setText(""
        + "Nombre completo"
        + "\n pdireccion"
        + "\n clave del elector"
        + "\n curp,"
        + "\n estado "
        + "\n localidad"
        + "\n municipio"
        + "\n emision"
        + "\n seccion"
        + "\n vigencia");
        textoLiterario.setBounds(0, 50, 500, 290);
        textoLiterario.setBackground(new Color(0, 0, 0));
        textoLiterario.setFont(new Font("Ani", 1, 20));
        textoLiterario.setForeground(new Color(255, 255, 255));

        barraDes = new JScrollPane(textoLiterario);
        barraDes.setBounds(0, 50, 500, 290);

        add(etiqueta);
        //add(textoLiterario);
        add(barraDes);

    }
}