import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int option = -1;

		Usuario user = new Usuario();
		crearUsuario(user, x);

		Cuenta cuenta = new Cuenta(user);

		while (option != 0) {
			mostrarMenu();
			option = Integer.valueOf(x.nextLine());

			switch (option) {
			case 1:
				gastoDinero(cuenta, x);
				break;
			case 2:
				ingresoDinero(cuenta, x);
				break;
			case 3:
				System.out.println(cuenta.getIngresos());
				break;
			case 4:
				System.out.println(cuenta.getGastos());
				break;
			case 5:
				System.out.println(cuenta);
				break;
			}

		}
		x.close();
		System.out.println("Fin del programa.");
		System.out.println("Gracias por utilizar la aplicación.");

	}

	/*******************************************************************/

	private static void crearUsuario(Usuario usuario, Scanner x) {
		System.out.println("Introduzca su nombre:");
		String nombre = x.nextLine();
		usuario.setNombre(nombre);

		System.out.println("Introduzca su edad:");
		int edad = Integer.valueOf(x.nextLine());
		usuario.setEdad(edad);

		System.out.println("Introduzca su DNI:");
		String DNI = x.nextLine();
		usuario.setDNI(DNI);
		System.out.println("usuario creado");

	}

	/*******************************************************************/

	private static void mostrarMenu() {
		System.out.println("[1] Introduce un nuevo gasto\n" + "[2] Introduce un nuevo ingreso\n"
				+ "[3] Mostrar gastos\n" + "[4] Mostrar ingresos\n" + "[5] Mostrar saldo\n" + "[0] Salir");
	}

	private static void gastoDinero(Cuenta c, Scanner x) {
		System.out.println("Introduce la descripción:");
		String d = x.nextLine();
		System.out.println("Introduce el gasto:");
		double g = Double.valueOf(x.nextLine());
		c.addGastos(d, g);
		System.out.println(c.toString());
	}

	private static void ingresoDinero(Cuenta c, Scanner x) {
		System.out.println("Introduce el concepto");
		String d = x.nextLine();
		System.out.println("Introduce el ingreso");
		double i = Double.valueOf(x.nextLine());
		c.addIngresos(d, i);
		System.out.println(c.toString());

	}

}
