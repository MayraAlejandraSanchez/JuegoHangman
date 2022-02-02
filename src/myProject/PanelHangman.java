package myProject;

import javax.swing.*;
import java.awt.*;

public class PanelHangman extends JPanel {
    public static final int WIDTH = 250;
    public static final int HEIGHT = 200;

    private int step;

    public PanelHangman(){
        step=0;
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }

    public void drawBody(int step){
        this.step=step;
        repaint();
    }

    public void reset (){
        step=0;
        repaint();
    }

    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        switch (step) {
            case 0: //dibuja verdugo
                g.setColor(Color.BLUE);
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(15, 180, 37, 5);
                break;
            case 1: //dibuja paso anterior
                g.setColor(Color.BLUE);
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(15, 180, 37, 5);

                //dibujar cabeza
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                break;
            case 2://paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                //dibuja cuerpo
                g.fillRect(125, 70, 4, 70);
                break;
            case 3: //dibuja brazo derecho
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);

                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);
                break;
            case 4: //dibuja mano derecha
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);
                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);

                g.drawLine(164, 94, 175, 87);
                break;
            case 5: //dibuja brazo izquierdo
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);
                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);
                g.drawLine(164, 94, 175, 87);

                g.drawLine(127, 80, 90, 94);
                g.drawLine(128, 80, 90, 94);
                g.drawLine(129, 80, 90, 94);
                break;
            case 6: // dibuja mano izquierda
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);

                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);
                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);
                g.drawLine(164, 94, 175, 87);

                g.drawLine(127, 80, 90, 94);
                g.drawLine(128, 80, 90, 94);
                g.drawLine(129, 80, 90, 94);

                g.drawLine(90, 94, 79, 87);
                break;
            case 7: //dibuja pierna derecha
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);

                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);

                g.drawLine(164, 94, 175, 87);

                g.drawLine(127, 80, 90, 94);
                g.drawLine(128, 80, 90, 94);
                g.drawLine(129, 80, 90, 94);

                g.drawLine(90, 94, 79, 87);

                g.drawLine(127, 140, 164, 154);
                g.drawLine(128, 140, 164, 154);
                g.drawLine(129, 140, 164, 154);
                break;
            case 8: //dibuja pierna izquierda
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);

                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);

                g.drawLine(164, 94, 175, 87);

                g.drawLine(127, 80, 90, 94);
                g.drawLine(128, 80, 90, 94);
                g.drawLine(129, 80, 90, 94);

                g.drawLine(90, 94, 79, 87);

                g.drawLine(127, 140, 164, 154);
                g.drawLine(128, 140, 164, 154);
                g.drawLine(129, 140, 164, 154);

                g.drawLine(127, 140, 90, 154);
                g.drawLine(126, 140, 90, 154);
                g.drawLine(125, 140, 90, 154);
                break;
            case 9: //dibuja pies
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);
                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);

                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);

                g.drawLine(164, 94, 175, 87);

                g.drawLine(127, 80, 90, 94);
                g.drawLine(128, 80, 90, 94);
                g.drawLine(129, 80, 90, 94);

                g.drawLine(90, 94, 79, 87);

                g.drawLine(127, 140, 164, 154);
                g.drawLine(128, 140, 164, 154);
                g.drawLine(129, 140, 164, 154);

                g.drawLine(127, 140, 90, 154);
                g.drawLine(126, 140, 90, 154);
                g.drawLine(125, 140, 90, 154);

                g.drawLine(164, 154, 174, 154);
                g.drawLine(90, 154, 80, 154);
                break;
            case 10: //dibuja ahorcado
                //paso anterior
                g.setColor(new Color(8, 54, 169));
                g.fillRect(30, 10, 5, 170);
                g.fillRect(30, 10, 100, 5);
                g.fillRect(17, 180, 37, 5);

                g.setColor(Color.ORANGE);
                g.fillOval(107, 35, 40, 40);
                g.fillRect(125, 70, 4, 70);

                g.drawLine(127, 80, 164, 94);
                g.drawLine(128, 80, 164, 94);
                g.drawLine(129, 80, 164, 94);

                g.drawLine(164, 94, 175, 87);

                g.drawLine(127, 80, 90, 94);
                g.drawLine(128, 80, 90, 94);
                g.drawLine(129, 80, 90, 94);

                g.drawLine(90, 94, 79, 87);

                g.drawLine(127, 140, 164, 154);
                g.drawLine(128, 140, 164, 154);
                g.drawLine(129, 140, 164, 154);

                g.drawLine(127, 140, 90, 154);
                g.drawLine(126, 140, 90, 154);
                g.drawLine(125, 140, 90, 154);

                g.drawLine(164, 154, 174, 154);
                g.drawLine(90, 154, 80, 154);

                g.setColor(Color.PINK);
                g.fillRect(125, 15, 3, 25);
                g.fillOval(107, 35, 40, 40);
                g.setColor(Color.BLACK);
                g.drawString("X", 119, 60);
                g.drawString("X", 131, 60);
                break;
        }
    }
}
