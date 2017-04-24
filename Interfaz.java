import javax.swing.*;
import java.awt.*;

/**
 * Created by Adri on 07/04/2017.
 */
public class Interfaz extends JFrame{

    private JPanel panelLogin;
    private JPanel panelBotones;
    private JPanel panelCampos;
    private JLabel jlblNombre;
    private JLabel jlblPassword;
    private JTextField nombre;
    private JPasswordField password;
    private JButton premer;
    private JButton borrar;
    private JList<String> lista;
    private JButton boton;
    private JTextField areaTexto;

    public Interfaz() {
        panelLogin = new JPanel();
        panelCampos = new JPanel();
        panelBotones = new JPanel();
        jlblNombre =  new JLabel();
        jlblPassword = new JLabel();
        nombre = new JTextField();
        password = new JPasswordField();
        premer = new JButton("Premer");
        borrar = new JButton("Borrar");
        lista = new JList<String>();
        boton = new JButton();
        areaTexto = new JTextField();

        this.setLayout(new BorderLayout());
        this.setSize(400, 300);

        jlblNombre.setText("Nome");
        jlblNombre.setSize(100, 50);

        jlblPassword.setText("Password");
        jlblPassword.setSize(100, 50);

        nombre.setSize(100, 50);

        password.setText("prueba");
        password.setSize(100, 50);

        panelLogin.setSize(400, 100);
        panelLogin.setLayout(new GridLayout(2,2));
        panelLogin.add(jlblNombre);
        panelLogin.add(nombre);
        panelLogin.add(jlblPassword);
        panelLogin.add(password);

        premer.setSize(100, 50);

        borrar.setSize(100, 50);

        panelBotones.setSize(400, 100);
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(premer);
        panelBotones.add(borrar);

        String[] elementos = {"Elemento 1", "Elemento 2", "Elemento 3"};
        lista.setListData(elementos);

        boton.setText("Boton");
        panelCampos.setSize(400, 100);
        panelCampos.setLayout(new GridLayout(1, 3));
        panelCampos.add(lista);
        panelCampos.add(boton);
        panelCampos.add(areaTexto);

        this.add(panelLogin, BorderLayout.NORTH);
        this.add(panelBotones, BorderLayout.CENTER);
        this.add(panelCampos, BorderLayout.SOUTH);

        this.setVisible(true);


    }


    public static void main (String[] args){
        Interfaz i1 = new Interfaz();
    }
}
