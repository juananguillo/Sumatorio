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
	 * Fusion de los tres metodos comprobatorios en uno
	 * @param numero
	 * @return Si tiene varios digitos Cadena con el resultado de la suma y sus digitos
	 * si es negativo devuelve nada y si es menor que 10 devuelve sin sumar
	 */
	
	public String sumatorio(String numero) {
        int suma = 0;
        StringBuilder sumatorio = new StringBuilder();
             
        
        if (numero.substring(0,1).equals("-")) {
        	
           sumatorio.append("");
         }
        
        else {
        	
        	 if  (numero.length() == 1) { 
                 sumatorio.append(numero + " = " + numero);
             } else {
           		 
         		  for (int i = 0; i < numero.length(); i++) {
         	            String digito = numero.substring(i, i+1);
         	           suma = suma + Integer.parseInt(digito);
         	 
                  sumatorio.append(numero.substring(i, 1+i)+"+");	
                   
                     

                 }
         		
         		sumatorio.reverse();
         		sumatorio.delete(0, 1);
         		sumatorio.reverse();
         		sumatorio.append(" = "+suma);
                 } 
        	 
        }
        
  		return sumatorio.toString();
  	}
       
        
     
	}
	


