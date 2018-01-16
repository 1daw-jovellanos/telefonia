package telefonia;
/**
 * El cliente de telefonia del ejercicio del tema 7
 * 
 * @author Victor 
 * @version 25/2/2014
 */
public class ClienteTelefonia
{
    private double saldoEnEuros;
    private String numeroTelefono;
    private String nombreCliente;
    
    private static double precioPorMinuto=0.15; //18 céntimos por minuto
    private static double establecimientoLlamada=0.15; //establecimiento de llamada a 15 céntimos


    /**
     * Constructor for objects of class ClienteTelefonia
     * @param numeroTelefono
     */
    public ClienteTelefonia(String numeroTelefono)
    {
        this.numeroTelefono=numeroTelefono;
        saldoEnEuros=3;
    }
    
    /**
     *
     * @return
     */
    public String getNombreCliente()
    {
        return nombreCliente;
    }
    
    /**
     *
     * @param nc
     */
    public void setNombreCliente(String nc)
    {
        nombreCliente=nc;
    }
    
    /**
     *
     * @return
     */
    public double getSaldoEnEuros()
    {
        return saldoEnEuros;
    }
    
    /**
     *
     * @param ppm
     */
    public static void setPrecioPorMinuto(double ppm)
    {
        precioPorMinuto=ppm;
    }

    /**
     *
     * @return
     */
    public static double getPrecioPorMinuto()
    {
        return precioPorMinuto;
    }
    
    /**
     *
     * @param el
     */
    public static void setEstablecimientoLlamada(double el)
    {
       establecimientoLlamada=el;
    }
    
    /**
     *
     * @return
     */
    public static double getEstablecimientoLlamada()
    {
        return establecimientoLlamada;
    }
    
    /**
     *
     * @param minutos
     * @return
     */
    public boolean descontarLlamada(int minutos)
    {
        double d=establecimientoLlamada+precioPorMinuto*minutos;
        boolean resultado=false;
        if (d<=saldoEnEuros)
        {
            saldoEnEuros-=d;
            resultado=true;
        }
        return resultado;
    }
    
    /**
     *
     * @param euros
     */
    public void recargar(int euros)
    {
        saldoEnEuros+=euros;
    }
}
