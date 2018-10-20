package trabajo;
import java.sql.*;
import java.util.Calendar;

public class Bdc {

    static public final String SERVIDOR = "jdbc:mysql://localhost:3306/";
    static public final String BASE = "java";
    static public final String USUARIO = "root";
    static public final String PASSWORD = "root";
    Cliente cliente = new Cliente();
    Citas citas  = new Citas();
    Calendar calendar = Calendar.getInstance();


    public boolean proximaCita(String hora) throws SQLException {
        Connection con = null;
        String sql = "";
        PreparedStatement pre = null;
        ResultSet r = null;

        con = (Connection) DriverManager.getConnection(Bdc.SERVIDOR+ Bdc.BASE, Bdc.USUARIO, Bdc.PASSWORD);
        sql = "SELECT * FROM citas where hora_entrada="+ hora + " ORDER BY 1 LIMIT 1;";
        pre = (PreparedStatement) con.prepareStatement(sql);
        r = pre.executeQuery();

        if(r.next()==false)
        {
            r.close();
            pre.close();
            con.close();
            return false;
        }
        citas.setId_cita(r.getInt(1));
        citas.setHora_entrada(r.getString(2));
        citas.setHora_salida(r.getString(3));
        citas.setFecha(r.getString(4));
        citas.setId_cliente(r.getInt(5));



        return true;
    }








}
