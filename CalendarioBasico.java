
/**
 * se crea la cabezera de la  clase
 */
public class CalendarioBasico
{
    //se inicializa el dia
    private DisplayDosCaracteres dia;
    //se inicializa el mes   
    private DisplayDosCaracteres mes;
    //se inicializa el año
    private DisplayDosCaracteres anio;

    /**
     * damos los valores de todos los parametros
     */
    public CalendarioBasico()
    {

        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        anio = new DisplayDosCaracteres(100);

    }
    /**
     * fijamos la fecha nueva
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        dia.setValorAlmacenado(nuevoDia);
        mes.setValorAlmacenado(nuevoMes);
        anio.setValorAlmacenado(nuevoAnio); 
    }
    /**
     * permite avanzar de fecha 
     */
    public void avanzarFecha()
    {
        dia.incrementaValorAlmacenado();
        //Ahora compruebo si tengo que incrementar el mes...
        if (dia.getValorAlmacenado() == 1){
            mes.incrementaValorAlmacenado();
            //Ahora compruebo si tengo que incrementar el año..
            if(mes.getValorAlmacenado() == 1){
                anio.incrementaValorAlmacenado();
            }
        }
 
    }
    
    /**
     * permite devolver la fecha en el formato 01-10-20
     */

    public String obtenerFecha()
    {
        
        return dia.getTextoDelDisplay()+ "-" + mes.getTextoDelDisplay() + "-" + anio.getTextoDelDisplay();
    }
       

}