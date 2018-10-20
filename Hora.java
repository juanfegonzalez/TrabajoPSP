package trabajo;

import java.util.Calendar;

public  class Hora extends Thread{

    String sal =null;
    String sal2=null;
    String sal3=null;
    int dia =0;
    Calendar c = Calendar.getInstance();
    private String horaapasar=null;
    private String fecha=null;

    public String getHoraapasar() {
        return horaapasar;
    }

    public void setHoraapasar(String horaapasar) {
        this.horaapasar = horaapasar;
    }

    public void run(){
        while (true) {
            try {
                Thread.sleep(60000);
                sal = String.valueOf(c.HOUR_OF_DAY) +":" +String.valueOf(c.MINUTE);
                sal2 = String.valueOf(c.MINUTE);
                sal3=String.valueOf(c.MONTH);
                dia = c.DAY_OF_MONTH;
                setHoraapasar(sal);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


}
