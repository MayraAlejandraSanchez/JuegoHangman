package myProject;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;

public class PanelFrase extends JPanel {
    public static final int WIDTH = 370;
    public static final int HEIGHT = 200;

    private String clave, letrasMalas, errores;

    public PanelFrase(String clave){
        this.clave=clave;
        letrasMalas ="";
        errores="";
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }

    public void pintarTextoError(String clave, char letra, int error){
        this.clave=clave;
        letrasMalas+=" "+ String.valueOf(letra);
        errores+=" "+ String.valueOf(error);
        repaint();
    }

    public void setClave(String clave){
        this.clave=clave;
        repaint();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.PINK);
        g.fillRect(0,0,WIDTH,HEIGHT);

        g.setFont(new Font(Font.DIALOG, Font.BOLD,17));
        g.setColor(Color.black);
        g.drawString("Frase a adivinar:", 4,20);

        g.setFont(new Font(Font.DIALOG, Font.BOLD,17));
        g.setColor(Color.black);
        g.drawString(clave, 4,55);

        g.setFont(new Font(Font.DIALOG, Font.BOLD,17));
        g.setColor(Color.black);
        g.drawString("Letras incorrectas:", 4,77);

        g.setFont(new Font(Font.DIALOG, Font.BOLD,17));
        g.setColor(Color.MAGENTA);
        g.drawString(letrasMalas, 4,101);

        g.setFont(new Font(Font.DIALOG, Font.BOLD,17));
        g.setColor(Color.black);
        g.drawString("Errores:", 4,120);

        g.setFont(new Font(Font.DIALOG, Font.BOLD,17));
        g.setColor(Color.MAGENTA);
        g.drawString(errores, 72,120);
    }

    public void reset (String clave){
        this.clave=clave;
        letrasMalas ="";
        errores="";
        repaint();
    }


}
