
/**
 * se crea la cabezera de la  clase
 */
public class CalendarioBasico
{
    //se inicializa el dia
    private int dia;
    //se inicializa el mes   
    private int mes;
    //se inicializa el año
    private int anio;

    /**
     * damos los valores de todos los parametros
     */
    public CalendarioBasico()
    {

        dia = 1;
        mes = 1;
        anio = 1;

    }
    /**
     * fijamos la fecha nueva
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        anio = nuevoAnio;
    }
    /**
     * permite avanzar de fecha 
     */
    public void avanzarFecha()
    {
        dia += 1;
        if(dia > 30){
            mes += 1;
            dia = 1;
            if(mes > 12){
                anio += 1;
                mes = 1;
                if(anio > 99){
                    //dia = 1;
                    anio = 0;
                }
            }

        }
    }
    /**
     * permite devolver la fecha en el formato 01-10-20
     */

    public String obtenerFecha()
    {

        String nuevoDia = "";
        String nuevoMes = "";
        String nuevoAnio = "";
        /**
         * if(nuevoDia.lenght() < 2){
         *     nuevoDia = "0" + nuevoDia;
         *  }
         */
        if(dia < 10){
            nuevoDia = "0" + dia;
        }
        else{
            nuevoDia = "" + dia;
        }

        if(mes < 10){
            nuevoMes = "0" + mes;
        }
        else{
            nuevoMes = "" + mes;
        }
        if(anio < 10){
            nuevoAnio = "0" + anio;
        }
        else{
            nuevoAnio = "" + anio;
        }
        
        return nuevoDia + "-" +  nuevoMes + "-" + nuevoAnio;
    } 

}