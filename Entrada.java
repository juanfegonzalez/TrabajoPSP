package trabajo;


import java.sql.SQLException;

public class Entrada {

    public static void main(String[] args) {
        Thread hora = new Thread(new Hora());
        Thread pregunta = new Thread(new Pregunta());


        Hora h = new Hora();
        hora.start();
        pregunta.start();




    }



}
