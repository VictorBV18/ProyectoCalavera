package proyectocalavera;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CalaveritaLiteraria extends JFrame {

    public JPanel panel;

    public CalaveritaLiteraria() {
        setSize(555, 700);//Esto Establece el tamaño :) 

        setTitle("CALAVERITA LITERARIA :) ");//Establece el titulo de la ventana 
        // setBounds(100,200,500,500); EL setBounds Sirve para Ajustar MANUALMENTE (x,y,ancho,largo);
        setLocationRelativeTo(null);//Establece La ventana en medio de la pantalla }
        //this.getContentPane().setBackground(Color.black);

        iniciarComponentes();//Esto es para mandar a traer TODO :) 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {

        PANEL();
        TEXTO();
        IMAGENES();
        BOTONES();

    }

    private void PANEL() {
        panel = new JPanel();//Creador de un panel
        panel.setBackground(Color.DARK_GRAY);//CAMBIAMOS EL COLOR DEL PANEL         
        panel.setLayout(null);//Esto desactiva el diseño por DEFECTO       
        this.getContentPane().add(panel);//Aqui agregamos el panel creado

    }
    
    private void TEXTO(){
    //CREADO DE UNA ETIQUETA PARA EL TEXTO--------------------------
    
        //ETIQUETA TITULO
        JLabel etiqueta = new JLabel();
        etiqueta.setText(" (:FELIZ DIA DE LOS MUERTOS:) ");//aqui va el texto 
        etiqueta.setBounds(20,20,500,40 );//El setBounds no cambia con las etiquetas sin DESACTIVAR EL LAYOUL
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Esto es lo mismo para centrar pero se separa el metodo del texto :)
        etiqueta.setForeground(Color.ORANGE   );//El setForeground Cambia el color de LAS LETRAS de la ETIQUETA
        etiqueta.setOpaque(true);//Aqui Permitimos PINTAR EL FONDO de la ETIQUETA
        etiqueta.setBackground(Color.BLACK);//Aqui cambiamos el color del fondo de la etiqueta
        etiqueta.setFont(new Font("Jokerman", 1,25) );//Aqui se establece la fuente/TIPOGRAFIA DE LA FUENTE :)
        panel.add(etiqueta);//Aqui se agrega la etiqueta al panel 
    
        //ETIQUETA CALAVERITA LITERARIA :)
        JLabel etiqueta1 = new JLabel();
        
        //el <html><p> al inicio con un <br/> en medio utlizandolo como espacio y al final <html><p> dan espacio :)
        etiqueta1.setText("<html><p> Estaba Miguel parado escuchando algo de buen rock  <br/> "
                        + "derrepente un catrin se le aparecio mientras caminaba <br/> "
                        + "querido miguel, la hora de hacer mi chamba llego<br/>"
                        + "el catrin le dijo, tienes tiempo de avisar asi que llama.<br/>"
                        + "<br/>Mas tarde miguel a su madre y padre les aviso<br/>"
                        + "con una torta y una coca en la mano, su madre lo mando <br/>"
                        + "vestido de morado miguel al catrin espero<br/>"
                        + "el catrin paso por el y la tierra de los muertos visito </p></html>");//aqui va el texto 
        
        
        
        etiqueta1.setBounds(20,70,500,350 );//El setBounds no cambia con las etiquetas sin DESACTIVAR EL LAYOUL
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);//Esto es lo mismo para centrar pero se separa el metodo del texto :)
        etiqueta1.setForeground(Color.YELLOW  );//El setForeground Cambia el color de LAS LETRAS de la ETIQUETA
        etiqueta1.setOpaque(true);//Aqui Permitimos PINTAR EL FONDO de la ETIQUETA
        etiqueta1.setBackground(Color.DARK_GRAY);//Aqui cambiamos el color del fondo de la etiqueta
        etiqueta1.setFont(new Font("chiller", 1,25) );//Aqui se establece la fuente/TIPOGRAFIA DE LA FUENTE :)
        panel.add(etiqueta1);//Aqui se agrega la etiqueta al panel 
        
    }
    
    private void IMAGENES(){
        ImageIcon imagen = new ImageIcon("PNG FONDO ABAJO.png");//Aqui mostramos que imagen va a jalar  
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(95, 325, 520, 520); //las dimensiones de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        //Esto de arriba es para ajustar la imagen al tamaño de la etiqueta y que no quede recortada o muy grande
        panel.add(etiqueta2);
    
        
        ImageIcon imagen2 = new ImageIcon("fondo.jpg");
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(0, 0, 555, 700);
        etiqueta4.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta4);

    }
    
    

    
    private void BOTONES(){JButton boton1 = new JButton();
        boton1.setBounds(90, 540, 70, 70);
        ImageIcon botoncito1 = new ImageIcon("boton.png");
        boton1.setIcon(new ImageIcon(botoncito1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setBackground(Color.PINK);
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalaveraDibujo cald = new CalaveraDibujo();
                cald.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cald.setVisible(true);

                setVisible(false);

            }
        });
        panel.add(boton1);
    
    
            JButton boton2 = new JButton();
        boton2.setBounds(380, 540, 70, 70);
        ImageIcon botoncito2 = new ImageIcon("botondiademuerto.png");
        boton2.setIcon(new ImageIcon(botoncito2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setBackground(Color.PINK);
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalaveraDibujo cald = new CalaveraDibujo();
                cald.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cald.setVisible(false);

                setVisible(false);

            }
        });
        
        
        panel.add(boton2);

    
    }
    
    
    
}

