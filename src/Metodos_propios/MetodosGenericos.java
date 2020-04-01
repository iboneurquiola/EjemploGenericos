package Metodos_propios;

public class MetodosGenericos {

	public static void main (String[] args)
	{
		// Ejemplo con Strings
		String nombres[] = {"Laura", "Maarten", "Gabriela", "Ibone"};
		System.out.println(MisMatrices.getElementos(nombres));
		
		// Ejemplo con Empleado
		Empleado arrayEmpleados[]= {new Empleado ("Marcos", 23, 2500), 
				new Empleado ("Estibaliz", 47, 4600),
				new Empleado ("Mateo", 23, 1900),
				new Empleado ("Jose Luis", 64, 3700),
				new Empleado ("Maria", 25, 5000)};
		
		System.out.println(MisMatrices.getElementos(arrayEmpleados));
	}
}

class MisMatrices
{
	/* Esta clase tiene un metodo generico que se ecnarga de recibir un array 
	 * y contar la longitud de este.
	 * Al ser generico, podra recibir arrays con objetos de todo tipo
	 */
	
	/* Lo hacemos static para que sea un metodo de clase y que no necesite una instancia
	 * de MisMatrices para poder utilziarlo.
	 * Por eso mismo, no podemos especificar que va a recibir
	 */
	public static <T> String getElementos( T[]a )
	{
		return "El array tiene " + a.length + " elementos";
	}
}
