package interfezBarcos;

import Coordenada.Coordenada;
import Barcos.Barco;
import com.mycompany.batallanaval.Barcos.Buque;
import Barcos.Barco;

public interface interfazBarco {
	
	/**
	 * Este metodo nos verficara
	 * si el disparo fue certero.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean verificarDisparo(Coordenada disparo);
	
	/**
	 * Este metodo revisara si el barco se hundio
	 * 
	 * @return boolean
	 */
	
	public boolean verficarHundimiento();
	
}
