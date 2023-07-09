
public class Ingreso extends Dinero{
	
	public Ingreso(double ingreso, String descripcion) {
		this.dinero = ingreso;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Ingreso [dinero=" + dinero + ", descripcion=" + descripcion + "]";
	}


	
	
	
	
	
	
}
