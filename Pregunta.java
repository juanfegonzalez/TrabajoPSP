package trabajo;

import javax.swing.*;

public class Pregunta extends Thread{

    public void run(){
        Bdc bdc = new Bdc();
        Citas c =  new Citas();
        Hora h = new Hora();


        try {
            if (bdc.proximaCita(h.getHoraapasar())){
                JOptionPane.showInputDialog("tienes una cita a las "+c.getHora_entrada()+":" +c.getFecha());
            }

        }catch (Exception e){
            System.err.println("Ha habido un error");
        }
    }
}
