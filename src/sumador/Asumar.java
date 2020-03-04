package sumador;

/**
 * @author Juan
 *
 */
public class Asumar {

	/**
	 * Constructor sin parametros
	 */
	public Asumar() {}
	
	/**
	 * @param numero
	 * @return el resultado de la suma y los numeros que se han sumado
	 */
	public String sumatorio(int numero) {
        int suma = 0;
        
 
		
		  StringBuilder sumatorio = new StringBuilder();
		while(numero > 0) {

            suma += numero % 10;
         sumatorio.append(Integer.toString(numero%10)+"+");	
            numero = numero / 10;
            

        }
		
		sumatorio.reverse();
		sumatorio.delete(0, 1);
			
		return sumatorio.toString()+"="+suma;
    }	
	}
	

