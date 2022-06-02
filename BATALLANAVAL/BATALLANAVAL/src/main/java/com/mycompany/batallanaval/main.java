package com.mycompany.batallanaval;

import interfezBarcos.interfazBarco;

import java.util.Random;
import java.util.Scanner;

import Barcos.Lancha;
import Barcos.Barco;
import com.mycompany.batallanaval.Barcos.Buque;

import CampoBatalla.CampoBatalla;
import Coordenada.Coordenada;


public class main {
	public static void main(String[] args){
            
                Scanner X = new Scanner(System.in);          
		Scanner t = new Scanner(System.in);
		int corX = 0;
		int corY = 0;
		Coordenada disparo;
		CampoBatalla campo = new CampoBatalla();
		
		//Barco 1
		Lancha bb = new Lancha(true);
		//Barco 2
		Barco inter = new Barco(false);
		//Barco 3
		Buque pat = new Buque(false);
		
		
		
		
		
		//Agregar barcos
		campo.agregarBarco(bb);
		campo.agregarBarco(inter);
		campo.agregarBarco(pat);
		
		
		//Imprimir barcos
		campo.mostrarBarcos();
                
                System.out.println("bienvenido a battleship " + "creado por Pedro Hernandez y Gabriel Reyes uwu " + "a continuacion se le solicitaran los datos del disparo");
		
		while(!(bb.verficarHundimiento() && inter.verficarHundimiento() && pat.verficarHundimiento() )){
			System.out.println("Dame coordenada X");
			corX = t.nextInt();
			System.out.println("Dame coordenada Y");
			corY = t.nextInt();
			disparo = new Coordenada(corX,corY);
			System.out.println("Tu disparo fue en: " + disparo);
			
			campo.disparar(disparo);
                                                                                      	
		}
		
                System.out.println("el juego ha terminado");
                
            }
		
  	
		
		
		
		
		
		
		
		
	}

