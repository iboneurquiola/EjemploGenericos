package ArrayList;
import java.io.*;
public class UsoArrayList 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos instancia de la clase ArrayList y ya le estamos diciendo que el array tendrá 5 elementos
		//La instancia creada es de tipo object (constructor clase ArrayList)
		ArrayList archivos = new ArrayList(5);
		
		//Anadimos al ArrayList archivos Strings.
		archivos.add("Gabriela");
		archivos.add("Maarten");
		archivos.add("Laura");
		archivos.add("Ibone");
		
		//llega el momento de hacer get para ver el objeto de una posicion concreta
		// En este momento, no nos deja hacer String nombre = archivos.get(2); porque el método get es de tipo Object. 
		// Por lo tanto, tenemos que hacer un casting

		//String nombre = archivos.get(3);
		String nombre = (String)archivos.get(3);
		
		
		//De la misma manera, podemos hacerlo con un objeto de tipo File, pero utilizando el casting
		/*archivos.add(new File("gestion_Pedidos.xls"));
		File nombre=(File)archivos.get(0);*/

		
		//Pero el mayor problema de no utilizar genericos es el siguiente:
		//Vamos a imaginar que metemos de  la posisicion 0 a la 3 Strings, peor en la ultima posicion metemos un File
		/*archivos.add("Gabriela");
		archivos.add("Maarten");
		archivos.add("Laura");
		archivos.add("Ibone");
		archivos.add(new File("gestion_Pedidos.xls"));*/
		

		//String nombre = (String)archivos.get(4); // Esto nos va a dar error, pero en tiempo de ejecucion.


		
		/*SOLUCION CON GENERICOS
		 * La clase ArrayList la deberiamos hacer ArrayList<String>, para que durante la compilacion nos de error cuando metamos
		 * el objeto de tipo File en archivos
		 */
		//ArrayList <String> archivos = new ArrayList <String>();
		
		System.out.println(nombre);
				
	}

}

