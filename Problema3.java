import java.io.*;

  public class Problema3
  {
    public static void main( String[] args ) throws Exception
    {
       BufferedReader teclado;
       double dolares;
       double euros;
       String linea;
       int n;

       teclado = new BufferedReader( new InputStreamReader(System.in) );

       System.out.print("Cantidad: ");
       linea = teclado.readLine().toUpperCase();
       if( linea.endsWith(" PTS") ) {
         n = linea.indexOf(" PTS");
         linea = linea.substring(0,n);
         try {
           pesetas = Integer.parseInt(linea);
           euros = pesetas/166.387;
           System.out.println(euros+" euros");
         } catch( Exception e ) {
           System.out.println("'"+linea+"' no es un numero entero valido.");
         }
       } else if( linea.endsWith(" EUROS") ) {
         n = linea.indexOf(" EUROS");
         linea = linea.substring(0,n);
         try {
           euros = Double.valueOf(linea).doubleValue();
           pesetas = Math.round(euros*166.387);
           System.out.println(pesetas+" pts");
         } catch( Exception e ) {
           System.out.println("'"+linea+"' no es un numero real valido.");
         }
       } else {
         System.out.println("La linea debe terminar con 'pts' o 'euros'");
       }
    }
}
