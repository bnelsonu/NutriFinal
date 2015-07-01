package com.nutricion.util;

public class NutricionUtil {
	
	
	public static enum EstiloVida{
		ACTIVO("Activo"),
		SEDENTARIO("Sedentario");
	
	String estiloVida;
	
	private EstiloVida(String estiloVida)
	{
		this.estiloVida = estiloVida;
	}
	public String getEstiloVida(){
		return this.estiloVida;
	}
 }
}
