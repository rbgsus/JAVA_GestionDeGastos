import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;

	public Cuenta(Usuario usuario) {
		this.usuario = usuario;
		this.saldo = 0.0;
		this.gastos = new ArrayList<>();
		this.ingresos = new ArrayList<>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			throw new GastoException();
		} else {
			this.saldo = saldo;
		}
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	// Setter
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double addIngresos(String descripcion, double cantidad) {
		Ingreso i = new Ingreso(cantidad, descripcion);
		this.ingresos.add(i);
		setSaldo(saldo + cantidad);
		return this.getSaldo();
	}

	public double addGastos(String descripcion, double cantidad) {
		try {
			if (this.saldo - cantidad < 0) {
				throw new GastoException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		Gasto g = new Gasto(cantidad, descripcion);
		this.gastos.add(g);
		setSaldo(this.saldo - cantidad);

		return this.getSaldo();

	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	public List<Gasto> getGastos() {
		return gastos;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + "]";
	}

}
