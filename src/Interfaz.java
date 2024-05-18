import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interfaz extends JFrame implements ActionListener {
    Border bordo = BorderFactory.createLineBorder(Color.BLACK, 2);


    public void signos(){
        if(funcion.getOpc()==1)
            resultados.setText(funcion.getVar1()+"+"+funcion.getVar2());
        if(funcion.getOpc()==2)
            resultados.setText(funcion.getVar1()+"-"+funcion.getVar2());
        if(funcion.getOpc()==3)
            resultados.setText(funcion.getVar1()+"*"+funcion.getVar2());
        if(funcion.getOpc()==4)
            resultados.setText(funcion.getVar1()+"/"+funcion.getVar2());

    }
    private funciones funcion = new funciones();
    private JLabel resultados;
    private JButton b1,b2, b3,b4,b5,b6,b7,b8,b9,b0, mn,suma,resta,mult,div,igual,ac;
     Interfaz(){
        setTitle("Calculadora :)");
        setSize(345, 353);
        getContentPane().setBackground(new java.awt.Color(214, 221, 255));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);



         b1 = new JButton();
        b1.setBounds(20, 50, 70, 50);
        b1.setText("1");
         b1.setBackground(Color.WHITE);
         b1.setBorder(bordo);
        add(b1);
        b1.addActionListener(this);

         b2 = new JButton();
        b2.setBounds(100, 50, 70, 50);
        b2.setText("2");
         b2.setBackground(Color.WHITE);
         b2.setBorder(bordo);
        add(b2);
        b2.addActionListener(this);

         b3 = new JButton();
        b3.setBounds(180, 50, 70, 50);
        b3.setText("3");
         b3.setBackground(Color.WHITE);
         b3.setBorder(bordo);
        add(b3);
        b3.addActionListener(this);

      b4 = new JButton();
        b4.setBounds(20, 105, 70, 50);
        b4.setText("4");
         b4.setBackground(Color.WHITE);
         b4.setBorder(bordo);
        add(b4);
        b4.addActionListener(this);


         b5 = new JButton();
        b5.setBounds(100, 105, 70, 50);
        b5.setText("5");
         b5.setBackground(Color.WHITE);
         b5.setBorder(bordo);
        add(b5);
        b5.addActionListener(this);

         b6 = new JButton();
        b6.setBounds(180, 105, 70, 50);
        b6.setText("6");
         b6.setBackground(Color.WHITE);
         b6.setBorder(bordo);
        add(b6);
        b6.addActionListener(this);

         b7 = new JButton();
        b7.setBounds(20, 160, 70, 50);
        b7.setText("7");
         b7.setBackground(Color.WHITE);
         b7.setBorder(bordo);
        add(b7);
        b7.addActionListener(this);

         b8 = new JButton();
        b8.setBounds(100, 160, 70, 50);
        b8.setText("8");
         b8.setBackground(Color.WHITE);
         b8.setBorder(bordo);
        add(b8);
        b8.addActionListener(this);

         b9 = new JButton();
        b9.setBounds(180, 160, 70, 50);
        b9.setText("9");
         b9.setBackground(Color.WHITE);
         b9.setBorder(bordo);
        add(b9);
        b9.addActionListener(this);

         b0 = new JButton();
        b0.setBounds(20, 215, 70, 50);
        b0.setText("0");
         b0.setBackground(Color.WHITE);
         b0.setBorder(bordo);
        add(b0);
        b0.addActionListener(this);



        mn = new JButton();
        mn.setBounds(100, 215, 70, 50);
        mn.setText("+/-");
        mn.addActionListener(this);
        mn.setBackground(Color.WHITE);
        mn.setBorder(bordo);
        add(mn);


         suma = new JButton();
        suma.setBounds(260, 50, 70, 50);
        suma.setText("+");
         suma.setBackground(Color.WHITE);
         suma.setBorder(bordo);
        add(suma);
         suma.addActionListener(this);

         resta = new JButton();
        resta.setBounds(260, 105, 70, 50);
        resta.setText("-");
         resta.setBackground(Color.WHITE);
         resta.setBorder(bordo);
        add(resta);
         resta.addActionListener(this);

         mult = new JButton();
        mult.setBounds(260, 160, 70, 50);
        mult.setText("*");
         mult.setBackground(Color.WHITE);
         mult.setBorder(bordo);
        add(mult);
         mult.addActionListener(this);

         div = new JButton();
        div.setBounds(260, 215, 70, 50);
        div.setText("/");
         div.setBackground(Color.WHITE);
         div.setBorder(bordo);
        add(div);
         div.addActionListener(this);

         igual = new JButton();
        igual.setBounds(180, 215, 70, 50);
        igual.setText("=");
         igual.setBackground(Color.WHITE);
         igual.setBorder(bordo);
        add(igual);
         igual.addActionListener(this);

         ac=new JButton();
         ac.setBounds(20,270,230,50);
         ac.setText("AC");
         ac.setBackground(Color.WHITE);
         ac.setBorder(bordo);
         add(ac);
         ac.addActionListener(this);


        resultados = new JLabel("  ");
        resultados.setBounds(20, 5, 310, 40);
        resultados.setForeground(new java.awt.Color(0, 0, 0));
         resultados.setBackground(Color.WHITE);
         resultados.setBorder(bordo);
        add(resultados);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {



        if (evento.getSource() == b1) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(1);
                signos();
            }
            else {
                funcion.setVar1(1);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b2) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(2);
                signos();
            }
            else {
                funcion.setVar1(2);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b3) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(3);
                signos();
            }
            else {
                funcion.setVar1(3);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b4) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(4);
                signos();
            }
            else {
                funcion.setVar1(4);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b5) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(5);
                signos();
            }
            else {
                funcion.setVar1(5);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b6) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(6);
                signos();
            }
            else {
                funcion.setVar1(6);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b7) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(7);
                signos();
            }
            else {
                funcion.setVar1(7);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b8) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(8);
                signos();
            }
            else {
                funcion.setVar1(8);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b9) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(9);
                signos();
            }
            else {
                funcion.setVar1(9);
                resultados.setText(""+funcion.getVar1());
            }
        }
        if (evento.getSource() == b0) {
            if (funcion.getOpc()!=0){
                funcion.setVar2(0);
                signos();
            }
            else {
                funcion.setVar1(0);
                resultados.setText(""+funcion.getVar1());
            }
        }



        if (evento.getSource() == suma) {
            funcion.setOpc(1);
            resultados.setText(funcion.getVar1()+"+"+funcion.getVar2());
        }
        if (evento.getSource() == resta) {
            funcion.setOpc(2);
            resultados.setText(funcion.getVar1()+"-"+funcion.getVar2());
        }
        if (evento.getSource() == mult) {
            funcion.setOpc(3);
            resultados.setText(funcion.getVar1()+"*"+funcion.getVar2());
        }
        if (evento.getSource() == div) {
            funcion.setOpc(4);
            resultados.setText(funcion.getVar1()+"/"+funcion.getVar2());
        }
        if (evento.getSource() == ac){
            MUSICA.playWAV("src/PATO.wav");
            funcion.reset();
            resultados.setText(""+funcion.getVar1());
        }

        if (evento.getSource() == mn){
            if (funcion.getOpc()!=0){
                funcion.changeVar2();
                signos();
            }
            else {
                funcion.changeVar1();
                resultados.setText(""+funcion.getVar1());
            }
        }

        if (evento.getSource() == igual) {
           MUSICA.playWAV("src/PATO1.wav");
            funcion.resultados();
            resultados.setText(funcion.getVar1()+"");
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    }

