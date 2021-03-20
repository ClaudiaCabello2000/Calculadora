package proyecto1;

import java.junit.*;

public class Ventana extends JFrame{
    
    //Declaramos variables
    JPanel principal;
    JPanel botones;
    JTextField caja;
    JButton boton [];
    double p1=0, p2=0;
    String operacion="";
    boolean nueva=true;
    
    public Ventana(){
        
        setTitle("Calculadora JMR");
        //Tamaño de la ventana
        setSize(250,300);
        //Para salir del programa con a cruz
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        //Método para crear una interfaz
        init();
        
    }

    //Funcionalidad de la interfaz
    private void init() {

        //Panel principal con BorderLayout
        principal= new JPanel ();
        principal.setLayout (new BorderLayout ());

        caja=new JTextField ();
        principal.add ("North", caja);

        botones= new JPanel ();
        botones.setLayout (new GridLayout (5,4,8,8));

        principal.add ("Center", botones);

        getContentPane().add (principal);

        
    }

    //Creamos un objeto ventana
     public static void main(String args[]){
        
        new Ventana();
    }

    
private void agregarBotones() {
        
        boton = new JButton[20];
        //Inicializamos los botones
        boton[0]=new JButton("CE");
        boton[1]=new JButton("");
        boton[2]=new JButton("");
        boton[3]=new JButton("");
        boton[4]=new JButton("7");
        boton[5]=new JButton("8");
        boton[6]=new JButton("9");
        boton[7]=new JButton("/");
        boton[8]=new JButton("4");
        boton[9]=new JButton("5");
        boton[10]=new JButton("6");
        boton[11]=new JButton("*");
        boton[12]=new JButton("1");
        boton[13]=new JButton("2");
        boton[14]=new JButton("3");
        boton[15]=new JButton("-");
        boton[16]=new JButton("0");
        boton[17]=new JButton(".");
        boton[18]=new JButton("=");
        boton[19]=new JButton("+");
        
        //Agregamos los botones al panel
        
            for(int i=0;i&lt;20;i++){
            panel_botones.add(boton[i]);
        }
    //IGUAL
        boton[18].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    op2=Double.parseDouble(caja.getText());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=op1+op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=op1-op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=op1*op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=op1/op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }
                nueva=true;
            }