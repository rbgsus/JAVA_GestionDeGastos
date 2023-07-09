import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
		
		private String nombre;
		private int edad;
		private String DNI;
		
		
		public Usuario() {
			
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public int getEdad() {
			return edad;
		}


		public void setEdad(int edad) {
			this.edad = edad;
		}


		public String getDNI() {
			return DNI;
		}


		public boolean setDNI(String DNI){
	        Pattern pt = Pattern.compile("\\d{8}-?[a-zA-Z]?{1}");
	        Matcher mt = pt.matcher(DNI);
	        if (mt.matches()){
	            this.DNI=DNI;
	            return true;
	        } else {
	            return false;
	        }
	    }


		@Override
		public String toString() {
			return "Usuario [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
		}
		
		
		
		
		
		
		
		
		
}
