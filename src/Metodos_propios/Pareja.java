package Metodos_propios;

/* Por convenio, a la hora de especificar el tipo de la clase generica, se suelen
 *  utilizar las letras T, U o K
 */
public class Pareja<T> {

	// Como todavia no se que tipo va a ser, pongo T
	private T primero;
	
	public Pareja() {
		
		//Va dar un estado inicial de cero al tipo
		primero = null;
	}

	public T getPrimero() {
		return primero;
	}

	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	
}
