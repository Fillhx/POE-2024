import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
// import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class App extends JFrame implements ActionListener, ItemListener{
    public static void main(String[] args) throws Exception {
        App app = new App();
    }

    Container contenedor;
    JLabel etiqueta1;
    JLabel etiqueta2; 
    JTextField campo1; 
    JPasswordField campo2;
    JButton boton;
    JRadioButton radioboton1,radioboton2,radioboton3;
    ButtonGroup grupo;
    JCheckBox check1, check2, check3;
    public App(){
    super("Univalle");


    contenedor = getContentPane();
    contenedor.setLayout(new FlowLayout());

    etiqueta1 = new JLabel("Eventos");
    // ImageIcon icono = new ImageIcon("Mariposa.jpg");
    etiqueta1.setFont(new Font("Times new roman",Font.BOLD, 20));
    // etiqueta1.setIcon(icono);
    contenedor.add(etiqueta1);

    etiqueta2 = new JLabel("2024");
    etiqueta2.setFont(new Font("Times new roman",Font.BOLD, 20));
    contenedor.add(etiqueta2);

    campo1 = new JTextField(20);
    campo1.addActionListener(this);
    contenedor.add(campo1);

    campo2 = new JPasswordField(20);
    campo2.addActionListener(this);
    contenedor.add(campo2);

    boton = new JButton("Aceptar");
    boton.addActionListener(this);
    contenedor.add(boton);

    radioboton1 = new JRadioButton("Casado");
    radioboton1.addItemListener(this);
    contenedor.add(radioboton1);

    radioboton2 = new JRadioButton("soltero");
    radioboton2.addItemListener(this);
    contenedor.add(radioboton2);

    radioboton3 = new JRadioButton("viudo");
    radioboton3.addItemListener(this);
    contenedor.add(radioboton3);
    
    grupo = new ButtonGroup();
    grupo.add(radioboton1);
    grupo.add(radioboton2);
    grupo.add(radioboton3);

    check1 = new JCheckBox("Vivienda");
    contenedor.add(check1);
    check2 = new JCheckBox("Jovenes");
    contenedor.add(check2);
    check3 = new JCheckBox("Viudez");
    contenedor.add(check3);

    // boton.setEnabled(false); habilitar/inhabilitar el boton

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,300);
    setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            JOptionPane.showMessageDialog(null, "hola");
        }else if (e.getSource() == campo1){
            JOptionPane.showMessageDialog(null, "chao");
        }else if (e.getSource() == campo2){
            JOptionPane.showMessageDialog(null, "adios");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == 1){
            // if(e.getSource() == radioboton1){
            //     JOptionPane.showMessageDialog(null, "Soltero");
            // }else if(e.getSource() == radioboton2){
            //     JOptionPane.showMessageDialog(null, "Casado");
            // }else if(e.getSource()== radioboton3){
            //     JOptionPane.showMessageDialog(null, "Viudo");
            // }
            grupo.getSelection();
        }
    }
}