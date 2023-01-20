
import java.util.Arrays;
import java.util.Scanner;


public class Practica {

	public static void main(String[] args) {
		/*
		 * El programa llevará el control de una colección, por ejemplo películas, pero
		 * puedes elegir el tema que más te guste... Videojuegos, vinos, viajes...
		 * 
		 * Se deben almacenar al menos 3 atributos, por ejemplo título, duración y
		 * género. Deben tener campos numéricos y de texto obligatoriamente.
		 * 
		 * El programa debe facilitar:
		 * 
		 * Añadir películas hasta un máximo de 20. Todos los campos deben ser validados,
		 * ninguno puede estar vacío o fuera de un rango razonable.
		 * 
		 * Modificar películas.Todo validado.
		 * 
		 * Eliminar película. Rellenará los campos con valores neutros.
		 * 
		 * Buscar película. Se podrá buscar por cada uno de los campos de manera
		 * independiente, los numéricos aceptarán rangos de búsqueda. Se valora que se
		 * usen búsquedas parciales.
		 * 
		 * Listar las películas. Aparecerán todos los datos que no se consideren nulos.
		 * 
		 * Listado por género. Aparecerán bien tabulados los géneros y el número de
		 * elementos que tiene cada uno.
		 * 
		 * Listado ordenado. Usando un campo numérico, se debe mostrar un listado, por
		 * ejemplo de las películas por duración ascendente.
		 * 
		 * Es obligatorio usar Arrays y métodos.
		 * 
		 * En todo momento se podrá consultar el número de elementos que tiene la
		 * colección.
		 * 
		 * Además de las funcionalidades, se valora/penaliza:
		 * 
		 * Corrección, tabulación y optimización del código. Comentarios útiles. Uso de
		 * patrones, tipos y estructuras adecuadas. Tratamiento de errores.
		 * Reutilización del código.
		 * 
		 * 
		 * 
		 * Datos string y numerico Todo es con arrays Validados, significa que tenga
		 * minimo tiene 2 caracteres Para los campos numéricos, duración en minutos,
		 * Entre 60 y 300 minutos. Eliminar películas no es redimensionar, en el hueco
		 * poner un valor neutro, o cero, o nulo Si añadimos lo hacemos en el primer
		 * hueco este libre, del que hayamos eliminado Buscar películas, buscar en el
		 * titulo, donde y después No es lo mismo buscar en string que en campos
		 * numéricos Array con titulo, otro con duración, otro con generosidad,
		 * trabajando en paralelo La ultima es la mas dificil
		 * 
		 * Lo hacemos con un menu que vaya diciendo; quedan dos películas, quedan huecos
		 * Todo con try y Cath
		 */

		// Rellenar array titulos

		String[] titulo = new String[20];
		String[] genero = new String[20];
		String anadirtitulo = "";
		String anadirgenero = "";
		String nuevotitulo = "";
		String nuevogenero = "";
		String tituloabuscar = "";
		int[] duracion = new int[20];
		int huecoocupado = 0;
		int anadirduracion = 0;
		int opcionmenu = 0;
		int opcionsubmenu = 0;
		int modificarposicion = 0;
		int pedirnumero = 0;
		int contadoreliminadas = 0;
		int huecolibre = 0;
		int nuevaduracion = 0;
		int posicionpelicula = 0;

		int contador = 0;

		char continuar = ' ';

		boolean salir = true;
		
		boolean estalleno= false;

		Scanner lector = new Scanner(System.in);
		
		

		// relleno los arrays aqui en vez de arriba porque sino se me va demasiado a la derecha
		
		// relleno el array titulo

		titulo[0] = "LA VIDA DE BRYAN";
		titulo[1] = "SALVAR AL SOLDADO RYAN";
		titulo[2] = "DUNE";
		titulo[3] = "HULK";
		titulo[4] = "TITANIC";
		titulo[5] = "MEMENTO";
		titulo[6] = "EL PADRINO";
		titulo[7] = "CADENA PERPETUA";
		titulo[8] = "DOCE HOMBRES SIN PIEDAD";
		titulo[9] = "IRON MAN";
		titulo[10] = "PULP FICTION";
		titulo[11] = "AMANECE QUE NO ES POCO";
		titulo[12] = "CIUDAD DE DIOS";
		titulo[13] = "CASINO";
		titulo[14] = "UNDERGROUND";
		titulo[15] = "SEVEN";
		titulo[16] = "SIN LIMITES";
		titulo[17] = "PARANORMAL ACTIVITY";
		titulo[18] = "RESIDENT EVIL";
		titulo[19] = "MULAN";

		// relleno el array genero

		genero[0] = "COMEDIA";
		genero[1] = "BELICO";
		genero[2] = "CIENCIA FICCION";
		genero[3] = "SUPERHEROES";
		genero[4] = "DRAMA";
		genero[5] = "THRILLER";
		genero[6] = "MAFIA";
		genero[7] = "DRAMA";
		genero[8] = "DRAMA";
		genero[9] = "SUPERHEROES";
		genero[10] = "THRILLER";
		genero[11] = "COMEDIA";
		genero[12] = "DRAMA";
		genero[13] = "MAFIA";
		genero[14] = "COMEDIA";
		genero[15] = "THRILLER";
		genero[16] = "THRILLER";
		genero[17] = "TERROR";
		genero[18] = "TERROR";
		genero[19] = "INFANTIL";

		// relleno El array duracion

		duracion[0] = 93;
		duracion[1] = 170;
		duracion[2] = 155;
		duracion[3] = 137;
		duracion[4] = 195;
		duracion[5] = 115;
		duracion[6] = 175;
		duracion[7] = 142;
		duracion[8] = 95;
		duracion[9] = 126;
		duracion[10] = 153;
		duracion[11] = 106;
		duracion[12] = 130;
		duracion[13] = 173;
		duracion[14] = 165;
		duracion[15] = 127;
		duracion[16] = 105;
		duracion[17] = 99;
		duracion[18] = 96;
		duracion[19] = 88;

		// todo en un do while hasta que eligamos salir

		do {

			// imprimir arrays tal cual

			// imprimir los arrays conjuntamente sin los null o los cero
			System.out.println("Esto es lo que hay ahora mismo:" + "\n");

			for (int i = 0; i < titulo.length; i++) {

				if (titulo[i] != null) {
					System.out.println(
							"La posicion " + i + " es: " + titulo[i] + " - " + genero[i] + " - " + duracion[i]);
				}

			}

			// mostrar cuantos huecos quedan en las peliculas
			for (int i = 0; i < titulo.length; i++) {

				// esta es todas las veces que encontramos un "eliminada" en el array titulo,
				// llamada contadoreliminadas y la i es la posicion en la cual aparecen
				if (titulo[i] == "ELIMINADA") {

					contadoreliminadas++;

				}

			}
			System.out.println("\n" + "Los huecos libres son:  " + contadoreliminadas);

			// resetear contadores a cero para cuando vuelva a empezar

			contadoreliminadas = 0;

			// primero buscamos la primera posicion del null

			// como todas las posiciones en los arryas se corresponden entre ellos, con
			// saber la de título ya me vale para los otros, porque la posicion será la
			// misma en los otros

			for (int i = 0; i < titulo.length; i++) {

				if (titulo[i] != null) {

					huecoocupado++;

					huecolibre = huecoocupado;
				}

			}

			// reseteo el contador
			huecoocupado = 0;

			// mostrar menu que quieres hacer

			System.out.println("\n" + "Las opciones son:" + "\n");
			System.out.println("1. Añadir pelicula");
			System.out.println("2. Modificar pelicula");
			System.out.println("3. Eliminar pelicula");
			System.out.println("4. Buscar pelicula");
			System.out.println("5. Listar pelicula");
			System.out.println("6. Listar por genero");
			System.out.println("7. Listar ordenado");
			System.out.println("8. Salir");

			System.out.println("\n" + "Que quieres hacer?");

			opcionmenu = lector.nextInt();

			switch (opcionmenu) {

			// opcion 1. Añadir pelicula

			case 1:

				

				// primero miramos si titulo contiene "eliminada", sustitutyo las
				// "eliminada"
				if (Arrays.toString(titulo).contains("ELIMINADA")) {

					for (int i = 0; i < titulo.length; i++) {

						if (titulo[i] == "ELIMINADA") {

							System.out.println("Ha entrado en la primera parte");
							System.out.println("Vamos a rellenar la posicion " + i);

							System.out.println("Introduce el titulo, por favor:");
							anadirtitulo = lector.next().toUpperCase();

							if (anadirtitulo.length() >= 2) {

								titulo[i] = anadirtitulo;

							} else {
								System.out.println("El titulo debe de tener por lo menos 2 caractes");
							}

							System.out.println("Introduce el genero, por favor:");
							anadirgenero = lector.next().toUpperCase();

							// valido que el genero tiene mas de 4 caracteres y lo meto
							if (anadirgenero.length() >= 4) {

								genero[i] = anadirgenero;

							} else {
								System.out.println("El genero debe de tener por lo menos 4 caractes");
							}
							System.out.println("Introduce la duracion en minutos, por favor:");
							anadirduracion = lector.nextInt();

							if (anadirduracion >= 60 && anadirduracion <= 300) {

								duracion[i] = anadirduracion;

							} else {
								System.out.println("La duracion debe ser en 60 y 300 minutos");
							}
						}

					}

					// si titulo no tiene "eliminada", meto el codigo por primera vez
				} else {

					
					// valido para que no se pueda meter mas de 20
					
				

					System.out.println("Ha entrado en la segunda parte");
					// verificamos la peliculas metidas tiene más de 2 caracteres para el titulo y
					// lo metemos
					System.out.println("Introduce el titulo, por favor:");
					anadirtitulo = lector.next().toUpperCase();

					if (anadirtitulo.length() >= 2) {

						titulo[huecolibre] = anadirtitulo;

					} else {
						System.out.println("El titulo debe de tener por lo menos 2 caractes");
					}

					System.out.println("Introduce el genero, por favor:");
					anadirgenero = lector.next().toUpperCase();

					// valido que el genero tiene mas de 4 caracteres y lo meto
					if (anadirgenero.length() >= 4) {

						genero[huecolibre] = anadirgenero;

					} else {
						System.out.println("El genero debe de tener por lo menos 4 caractes");
					}

					// valido que la duracion es entre 60 y 300 minutos y la meto

					System.out.println("Introduce la duracion en minutos, por favor:");
					anadirduracion = lector.nextInt();

					if (anadirduracion >= 60 && anadirduracion <= 300) {

						duracion[huecolibre] = anadirduracion;

					} else {
						System.out.println("La duracion debe ser en 60 y 300 minutos");
					}
					System.out.println("\n");

				}

				break;

			// modificar peliculas
			case 2:

				// decimos al usuario como esta la coleccion
				System.out.println("Recuerda que ahora está así: " + "\n");
				for (int i = 0; i < titulo.length; i++) {

					if (titulo[i] != null) {
						System.out.println("La posicion " + i + " es: " + titulo[i] + " " + "- " + genero[i] + " "
								+ "- " + duracion[i]);
					}

				}

				System.out.println("\n");

				// pedimos que posicion se va a cambiar
				System.out.println("Introduce la posicion de película que quieras modificar:");

				modificarposicion = lector.nextInt();

				System.out.println("Pon el nuevo titulo:");
				nuevotitulo = lector.next().toUpperCase();

				titulo[modificarposicion] = nuevotitulo;

				System.out.println("Pon el nuevo genero:");
				nuevogenero = lector.next().toUpperCase();

				genero[modificarposicion] = nuevogenero;

				System.out.println("Pon el nuevo titulo:");
				nuevaduracion = lector.nextInt();

				duracion[modificarposicion] = nuevaduracion;

				break;

			// eliminar pelicula

			case 3:

				System.out.println("Introduce la posicion de película que quieras eliminar:");

				modificarposicion = lector.nextInt();

				// si y esa posicion ya está eliminada no hacemos nada, y sino la ponemos como
				// "eliminada"

				if (titulo[modificarposicion] == "ELIMINADA") {

					System.out.println("Esa posición ya estaba eliminada." + "\n");

				} else {

					titulo[modificarposicion] = "ELIMINADA";

					genero[modificarposicion] = "ELIMINADA";

					duracion[modificarposicion] = -1;

				}

				break;

			// buscar pelicula
			case 4:

				// submenu para buscar
				System.out.println("Tus opciones a la hora de buscar son: " + "\n");
				System.out.println("1. Buscar por título");
				System.out.println("2. Buscar por género");
				System.out.println("3. Buscar por duración");

				System.out.println("\n" + "Cómo quieres buscar?");

				opcionsubmenu = lector.nextInt();
				lector.nextLine();

				// validar que sea un número

				switch (opcionsubmenu) {
				// buscar por titulo
				case 1:

					System.out.println("Introduce el titulo a buscar:");

					tituloabuscar = lector.next().toUpperCase();

					


					// buscamos la posicion en donde aparece en el array titulo
					
		

				
				
				  if (Arrays.toString(titulo).contains(tituloabuscar)) {

						for (int i = 0; i < titulo.length; i++) {

							if (titulo[i].equals(tituloabuscar)) {

								posicionpelicula = i;

								System.out.println("\n" + "La pelicula que buscas es: " + titulo[posicionpelicula]
										+ " - " + genero[posicionpelicula] + " - " + duracion[posicionpelicula]);
								
								for (int j = 0; j < posicionpelicula; j++) {
									
								}

							}

						}

					} else {
						System.out.println("No hay esa peli");
					}
					
					
			
					break;

				// buscar por genero
				case 2:

					break;

				// buscar por duracion
				case 3:

					break;

				default:
					break;
				}

				break;

			// listar pelicula
			case 5:

				break;

			default:
				System.out.println("Tienes que elegir un numero del 1 al 8");
				break;
			}

		} while (opcionmenu >= 1 || opcionmenu <= 8);
		System.out.println("Gracias por usar el programa!");
		lector.close();
	}

}
