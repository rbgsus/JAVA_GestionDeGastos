
public abstract class Dinero {

	
	protected Double dinero;		
	protected String descripcion;
	
	
	public Double getDinero() {
		return dinero;
	}
	
	public void setDinero(double dinero) {
		if(dinero < 0) {
			throw new GastoException();
		}
		this.dinero = dinero;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
