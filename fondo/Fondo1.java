package examen.fondo;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo1 {
    public Fondo1() {
        setSize(600, 450);
    }

    @Override
    public void paintComponent(Graphics g) {
        Dimension tamanio = getSize();
        ImageIcon fondo = new ImageIcon(getClass().getResource("Fondo1.png"));
        g.drawImage(fondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);

    }
}
