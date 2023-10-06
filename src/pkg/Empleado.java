package pkg;


public class Empleado {
	
	public String tipoEmpleado;

	public static float calculoNominaBruta(String tipo, float ventasMes, float horasExtra) {
		
		float salarioBase = 0, primas = 0, extras = 30;
		
		if(tipo == "Encargado")
			salarioBase = 2500;
		else if(tipo == "Vendedor")
			salarioBase = 2000;
		else	//Si es otro tipo
			salarioBase = 0;
		
		if(ventasMes >= 1500)
			primas = 200;
		else if(ventasMes >= 1000)
			primas = 100;		
		
		horasExtra *= extras;
		
		return salarioBase + primas + horasExtra;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		
		float retencion = 0;
		
		if(nominaBruta > 2500)
			retencion = nominaBruta * 0.18f;
		else if(nominaBruta > 2100)
			retencion = nominaBruta * 0.15f;
			
		return  nominaBruta - retencion;
	}
	
}
