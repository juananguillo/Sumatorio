package sumador;

public class Asumar {

	public Asumar() {}
	
	public int sumatorio(String numero) {
        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
          
            String digito = numero.substring(i, 1);
            suma = suma + Integer.getInteger(digito);
        }
       
        return suma;

    }	
	
}
