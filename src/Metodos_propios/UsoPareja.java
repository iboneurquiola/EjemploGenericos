package Metodos_propios;

public class UsoPareja {

	public static void main(String[] args)
	{
		// En el momento de instanciar, indicamos el tipo
		Pareja<String> pareja1 = new Pareja<String>();
		
		/* LO MAS IMPORTANTE DE ESTE EJEMPLO:
		 * Cuando ponemos pareja1. y buscamos el set en el menu desplegable, podemos ver que Eclipse
		 * ya ha puesto que el set recibe como valor String nuevoValor, aunque nosotros lo hayamos puesto
		 * como T nuevoValor. ¿Por que? Porque en la instancia de arriba hemos definido que sera String
		 */
		pareja1.setPrimero("Laura");
		System.out.println(pareja1.getPrimero());
		
		// Vamos a comprobar que con la clase Persona tambien funciona
		Persona pers1 = new Persona("Maarten");
		Pareja<Persona> pareja2 = new Pareja<Persona>();
		pareja2.setPrimero(pers1);
		System.out.println(pareja2.getPrimero().getNombre());
		
	}
}

class Persona
{
	private String nombre;
	
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}