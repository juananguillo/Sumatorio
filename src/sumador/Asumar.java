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
	 * @return El numero si solo tiene un digito
	 */
	public String mostrar(String cad) {
	        String numero = cad;
	        if (numero.length() == 1) {
	            numero=numero + " = " + numero;
	        } 
	        return numero;
	}
}


