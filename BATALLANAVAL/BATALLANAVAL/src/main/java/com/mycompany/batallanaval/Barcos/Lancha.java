package Barcos;

import java.util.Arrays;
import java.util.Random;

import Coordenada.Coordenada;
import interfezBarcos.interfazBarco;

public class Lancha implements interfazBarco {
	
	private final Integer TAMANIO = 1;
	private boolean direccion;
	private Coordenada[] coordenadas; 
	private Integer vida = TAMANIO;
	
	/**
	 * Metodo constructor el cual recibe un booleano,
	 * el cual nos ayudara con la direccion del barco,
	 * true = horizontal,
	 * false = vertical
	 * 
	 * @param direccion
	 */
	
	public Lancha(boolean direccion){
		this.direccion = direccion;
		this.coordenadas = new Coordenada[this.TAMANIO];
		this.generarBarco();
	}
	
	/**
	 * Este metodo nos genera una posicion aleatoria
	 * de un barco.
	 */
	public void generarBarco(){
		Random r= new Random();
		
		Integer pos = r.nextInt(10);
		//Integer auxY = r.nextInt(10);
		
		
		while(!(pos + TAMANIO < 10)){
			pos = r.nextInt(10);
		}
		
		
		
		//Horizontal
		if(this.direccion){
			
			for(int i = pos, j = 0; i < pos+TAMANIO; i++,j++ ){
				coordenadas[j] = new Coordenada(i,pos);
			}
			
			
				
		}else{
			
			
			for(int i = pos,j = 0; i < pos+TAMANIO; i++,j++ ){
				coordenadas[j] = new Coordenada(pos,i);
			}
			
		}
		
	}
	
	
	
	
	
	
	
	@Override
	public boolean verificarDisparo(Coordenada disparo) {
		// TODO Auto-generated method stub
		boolean atino = false;
		for(int i = 0; i < this.getCoordenadas().length; i++){
			if(this.getCoordenadas()[i].equals(disparo)){
				System.out.println("Le diste a la lancha mardicion mijoerdiablo chipichipi");
				this.vida--;
				atino =  true;
				break;
			}else{
				System.out.println("Fallaste");
				atino= false;
			}
		}
		return atino;
		
		
	}

	@Override
	public boolean verficarHundimiento() {
		// TODO Auto-generated method stub
		if(this.vida == 0){
                        System.out.println("usted ha derribado este barco");
			return true;
                        
		}else{
			return false;
		}
		
		
	}
	
	

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public boolean isDireccion() {
		return direccion;
	}

	public void setDireccion(boolean direccion) {
		this.direccion = direccion;
	}

	public Coordenada[] getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenada[] coordenadas) {
		this.coordenadas = coordenadas;
	}

	public Integer getTAMANIO() {
		return TAMANIO;
	}

	@Override
	public String toString() {
		return "Lancha [TAMANIO=" + TAMANIO + ", direccion=" + direccion
				+ ", coordenadas=" + Arrays.toString(coordenadas) + "]";
	}
	
	

}
