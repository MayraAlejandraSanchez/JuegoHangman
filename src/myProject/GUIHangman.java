package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @autor Mayra Alejandra Sanchez 204006 mayra.alejandra.sanchez@correounivalle.edu.co
 * @version v.1.0.0 date:27/02/2022
 */
public class GUIHangman extends JFrame {

    private Header headerProject;
    private PanelFrase panelFrase;
    private PanelHangman panelHangman;
    private ControlHangman controlHangman;
    private Escucha escucha;


    /**
     * Constructor of GUI class
     */
    public GUIHangman(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Hangman app");
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        //Create Listener Object and Control Object
        controlHangman = new ControlHangman();
        escucha = new Escucha();
        //Set up JComponents
        headerProject = new Header("Ahorcado versión películas MARVEL", Color.BLACK);

        this.add(headerProject,BorderLayout.NORTH); //Change this line if you change JFrame Container's Layout

        panelFrase = new PanelFrase(controlHangman.PintarClaveFrase());
        add(panelFrase, BorderLayout.WEST);

        panelHangman = new PanelHangman();
        add(panelHangman, BorderLayout.EAST);
        this.addKeyListener(escucha);
        setFocusable(true);
    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUIHangman miProjectGUI = new GUIHangman();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
            String clave = controlHangman.ValidarLetra(e.getKeyChar());

            if (controlHangman.isFallo()){

                panelHangman.drawBody(controlHangman.getConteoErrores());
                panelFrase.pintarTextoError(clave, e.getKeyChar(),controlHangman.getConteoErrores());

                if (controlHangman.getConteoErrores()==10){
                    int option = JOptionPane.showConfirmDialog(panelFrase, "Perdiste :( ¿Deseas jugar otra ronda?",
                            "Perdiste" ,JOptionPane.YES_NO_OPTION);

                    if (option==JOptionPane.YES_OPTION){
                        // nueva ronda
                        panelFrase.reset(controlHangman.PintarClaveFrase());
                        panelHangman.reset();
                    }else{
                        if (option==JOptionPane.NO_OPTION){
                            // Salir
                            System.exit(0);
                        }
                    }
                }

            }else{
                panelFrase.setClave(controlHangman.getClave());
                if (controlHangman.isGanador()){

                        int option = JOptionPane.showConfirmDialog(panelFrase, "Ganaste :D ¿Deseas jugar otra ronda?",
                                "Ganaste" ,JOptionPane.YES_NO_OPTION);

                        if (option==JOptionPane.YES_OPTION){
                            // nueva ronda
                            panelFrase.reset(controlHangman.PintarClaveFrase());
                            panelHangman.reset();
                        }else{
                            if (option==JOptionPane.NO_OPTION){
                                // Salir
                                System.exit(0);
                            }
                        }
                }
            }
        }
    }
}
