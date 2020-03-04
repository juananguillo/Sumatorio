package sumador;

/**
 * @author Juan
 *
 */
public class Asumar {
	/**
	 *Constructor sin parametros
	 */
	public Asumar() {}
	
	/**
	 * @param cad
	 * @return Cadena vacia si el primer valor del String es -
	 */
	public String negativo(String cad) {
        String numero = cad;
        if (numero.substring(0,1).equals("-")) {
        	
           numero="";
        }
        
        return numero;
	}

	/**
	 *Constructor sin parametros
	 */
	
	public String mostrar(String cad) {
	        String numero = cad;
	        if (numero.length() == 1) {
	            numero=numero + " = " + numero;
	        } 
	        return numero;
	}
}


