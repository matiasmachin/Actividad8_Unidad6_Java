package Unidad6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		//Declaracion de variables
		int opcion;
		int numma=0;
		int numero=0;
		int numeno=0;
		int va=0;
		int v=0;
		int veces=0;
		double media=0;
		boolean bandera=true;
		int[] lista = new int [20];
		//System.out.println("Generación de Valores para el Array");
		for(int i=0;i<20;i++) {
		int aleatorio = (int) Math.floor(Math.random()*10+1); // Generación de numero aleatorio entre 1 y 10
		lista[i]=aleatorio; // Llenado del  array
		//System.out.println("Valor de la lista en posicion :" + i +" es :" + lista[i]); //Mostrar valores del array
		}
		while(bandera!=false) {
		System.out.println("MENÚ:");
		System.out.println("1.- Imprimir el mayor valor del array ");
		System.out.println("2.- Imprimir el menor valor del array: ");
		System.out.println("3.- Calcular la media de todos los valores del array: ");
		System.out.println("4.- Imprimir todos los valores del array: ");
		System.out.println("5.- Numero de veces que se encuentra un número dentro del array: ");
		System.out.println("0.- Salir: ");
		System.out.println("Elija una opción: ");
		Scanner Lectura= new Scanner(System.in);
		opcion= Lectura.nextInt();
		switch(opcion){
		case 0: 
			bandera=false;
			System.out.println("Gracias por utilizar este programa ");
			break;
		
		case 1: 
			int[] lista3=lista.clone();
			//numayor(lista3,numma);
			System.out.println("El numero mayor de todo el array es: "+ numayor(lista3,numma)+"\n");
			break;
		
		case 2: 
			int[] lista4=lista.clone();
			//numeno(lista4,numeno);
			System.out.println("El numero menor de todo el array es: "+ numeno(lista4,numeno)+ "\n");
			
			break;
		case 3: 
			int[] lista5=lista.clone();
			//mmedia(lista5,media);
			System.out.println("La media es: "+ mmedia(lista5,media)+"\n");
			
			break;
		case 4: 
			int[] lista2=lista.clone();
			for(int i=0; i<20;i++) {
			
						valores(lista2,i);
			}			
			break;
		case 5:
			int[] lista6=lista.clone();
			System.out.println("Introduzca un número que quiere encontrar: ");
			Scanner Lectura3=new Scanner(System.in);
			numero= Lectura3.nextInt();
			//vveces(lista6,numero);
			System.out.println("El  número : " + numero + " se repite " +  vveces(lista6,numero)+ " veces\n");
			break;
			
		
	}
		
		}
		
	}
	
	public static int valores (int[] k, int z) { //Opcion 4 Imprimir valores del array
				System.out.println("El valor del array es en la posicion: "+ z + " es: " +(k[z])+"\n" );
				return z;
	
	}
		
	
	
	public static int numayor (int[] k, int p ) { //Opcion 1 Valor mayor
		p=0;
		for(int h=0; h<20;h++) {
			if(p<=k[h]) {
				p=k[h];
				
			}
		}return(p);
		
		
	}
	
	public static int numeno (int[] k, int p ) { //Opcion 2 Valor menor
		p=11;
		for(int h=0; h<20;h++) {
			if(p>=k[h]) {
				p=k[h];
				
			}
		}return(p);
		
		
	}
	
	public static double mmedia (int[] k, double mm ) { //Opcion 3 Valor media
		mm=0;
		for(int h=0; h<20;h++) {
			
				mm= mm+k[h];
				
			
		}return (mm/20);
		
		
	}
	
	public static int vveces (int[] k, int numero ) { //Opcion 2 Valor menor
		int p=0;
	
		for(int h=0; h<20;h++) {
			if(numero==k[h]) {
				p++;
				
			}
		}return(p);
		
		
	}

}
