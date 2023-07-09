//La clase hereda de la clase Exception
public class GastoException extends RuntimeException {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Sobreescribimos el mensaje de la clase padre
    public GastoException(){
        super("Saldo insuficiente.");
    }
}
