package proyectocalavera;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CalaveraDibujo extends JFrame {

    public JPanel panel;

    //AQUI CREAMOS LA VENTANA :)
    public CalaveraDibujo() {
        setSize(555, 700);//Esto Establece el tamaño :) 

        setTitle("CALAVERITA LITERARIA :) ");//Establece el titulo de la ventana 
        // setBounds(100,200,500,500); EL setBounds Sirve para Ajustar MANUALMENTE (x,y,ancho,largo);
        setLocationRelativeTo(null);//Establece La ventana en medio de la pantalla }
        //this.getContentPane().setBackground(Color.black);

        iniciarComponentes();//Esto es para mandar a traer TODO :) 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //ESTE SIRVE PARA MANDAR TRAER TOOOOOOODO
    private void iniciarComponentes() {

        PANEL();
        IMAGENES();
        BOTONES();

    }

    //CREACION DE UN PANEL :)
    private void PANEL() {
        panel = new JPanel();//Creador de un panel
        panel.setBackground(Color.DARK_GRAY);//CAMBIAMOS EL COLOR DEL PANEL         
        panel.setLayout(null);//Esto desactiva el diseño por DEFECTO       
        this.getContentPane().add(panel);//Aqui agregamos el panel creado

    }

    private void IMAGENES() {

        //CREADOR DE UNA ETIQUETA PARA LA IMAGEN---------------------------------
        ImageIcon imagen = new ImageIcon("PNG CALAVERA.png");//Aqui mostramos que imagen va a jalar  
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(5, 95, 520, 520); //las dimensiones de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        //Esto de arriba es para ajustar la imagen al tamaño de la etiqueta y que no quede recortada o muy grande
        panel.add(etiqueta2);

        //imagen de dia de muertos
        ImageIcon imagen2 = new ImageIcon("diademuertos.png");
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(65, -15, 400, 133);
        etiqueta4.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta4);

        //imagen de fondos
        panel.add(etiqueta2);
        ImageIcon imagen1 = new ImageIcon("fondoo.jpg");
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(0, 0, 555, 720);
        etiqueta3.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta3);

    }

    private void BOTONES() {
        JButton boton = new JButton();
        //boton.setText("HOLA");//pone letras
        //boton.setEnabled(true);//activa o desactiva el boton true-false
        //boton.setMnemonic('a');//aqui hace que el teclado PRECIONE el boton
        //boton.setForeground(Color.red);//cambia el color de las letras
        //boton.setFont(new Font("chiller", 1,30) );//tipografia 
        boton.setBounds(115, 540, 70, 70);
        ImageIcon botoncito = new ImageIcon("boton1.png");
        boton.setIcon(new ImageIcon(botoncito.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        boton.setBackground(Color.PINK);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalaveritaLiteraria cali = new CalaveritaLiteraria();
                cali.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cali.setVisible(true);

                setVisible(false);

            }
        });
        panel.add(boton);

        JButton boton1 = new JButton();
        boton1.setBounds(380, 540, 70, 70);
        ImageIcon botoncito1 = new ImageIcon("botondiademuerto.png");
        boton1.setIcon(new ImageIcon(botoncito1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setBackground(Color.PINK);
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalaveritaLiteraria cali = new CalaveritaLiteraria();
                cali.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cali.setVisible(false);

                setVisible(false);

            }
        });
        
        
        panel.add(boton1);

    }

    //EJECUCION DEL PROGRAMA :)
    public static void main(String[] args) {
        CalaveraDibujo cd = new CalaveraDibujo();
        cd.setVisible(true);//Hace visible la ventana
        //CalaveritaLiteraria cl=new CalaveritaLiteraria();
        //cl.setVisible(true);
    }
}
