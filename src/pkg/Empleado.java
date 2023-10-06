package pkg;


public class Empleado {
	
	public enum TipoEmpleado{Vendedor, Encargado};

	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		float salarioBase = 0, primas=0, extras = 30;
		
		if(tipo==TipoEmpleado.Encargado)
			salarioBase = 2500;
		else if(tipo== TipoEmpleado.Vendedor)
			salarioBase = 2000;
		
		if(ventasMes>=1500)
			primas=200;
		else if(ventasMes >= 1000)
			primas = 100;
		
		horasExtra *= extras;
		
		return salarioBase + primas + horasExtra;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		
		if(nominaBruta>2500)
			retencion *= 0.18f;
		else if(nominaBruta>2000)
			retencion *= 0.15f;
		
		return retencion;
	}
	
}
