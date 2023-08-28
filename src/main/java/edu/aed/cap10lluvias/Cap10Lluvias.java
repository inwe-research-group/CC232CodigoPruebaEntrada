package edu.aed.cap10lluvias;

import java.util.*;

public class Cap10Lluvias {	

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		double[] lluvia=new double[12];
		double promedioAnual;
		double	suma;
		double	diferencia;
		suma=0.0;
		
		for(int i=0;i<lluvia.length;i++)
		{
			System.out.print("Lluvia para el mes "+(i+1)+": ");
			lluvia[i]=scr.nextDouble();
			suma+= lluvia[i];
		}
		
		promedioAnual=suma/(float)lluvia.length;
		System.out.format("Lluvia promedio Anual:%5.2f\n\n",promedioAnual);
		
		for(int i=0;i<lluvia.length;i++)
		{
			System.out.format("%3d",i+1);//mes #
			//lluvia promedio mensual
			System.out.format("%15.2f",lluvia[i]);
			//diferencia entre el valor promedio del mes y el anual
			diferencia=Math.abs(lluvia[i]-promedioAnual);
			System.out.format("%15.2f\n",diferencia);
			}
			
	}	
}
