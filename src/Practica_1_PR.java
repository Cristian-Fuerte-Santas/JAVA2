import java.util.Arrays;
import java.util.Scanner;
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

public class Practica_1_PR {

	// metodo para hacer un syso

	private static void imprimir(String mensaje) {

		System.out.println(mensaje);

	}

	// metodo para validar que string no este vacio y tenga 2 minimo 2 caractes

	private static boolean validarString(String cadena) {

		boolean valido = true;

		if (cadena.length() == 0) {
			valido = false;
			System.out.println("Debes meter algo");
		}

		if (cadena.length() < 2) {
			valido = false;
			System.out.println("Debe tener minimo 2 caracteres");
		}

		return valido;
	}

	// metodo sobrecargado para asegurarse de que sea un numero con ascii

	private static boolean esNumero(char caracter) {

		boolean valido = false;
		int codigoAscii = (int) caracter;

		if (codigoAscii >= 48 && codigoAscii <= 57) {
			valido = true;
		}

		return valido;
	}

	private static boolean esNumero (int caracter) {

		boolean valido = false;
		int codigoAscii = (int) caracter;

		if (codigoAscii <= 47 || codigoAscii >= 58) {
			valido = true;
		}

		return valido;
	}

	// metodo para pedir numeros

	private static int pedirNumero(int numero) {

		Scanner lector = new Scanner(System.in);

		return lector.nextInt();

	}

	// metodo para pedir String y pasar a mayusculas

	public static String pedirString(String cadena) {

		Scanner lector = new Scanner(System.in);

		return lector.nextLine().toUpperCase();

	}

	// aqui empieza el main

	public static void main(String[] args) {

		// Zona declarativa de variables

		String[] titulo = new String[20];
		String[] copiatitulo = new String[titulo.length];
		String[] genero = new String[20];
		String[] copiagenero = new String[genero.length];
		String anadirtitulo = "";
		String anadirgenero = "";
		String nuevotitulo = "";
		String nuevogenero = "";
		String tituloabuscar = "";
		String generoabuscar = "";
		String stringmetida = "";
		String cambiar = "";
		int[] duracion = new int[20];
		int[] copiaduracion = new int[duracion.length];
		int auxiliar = 0;
		int huecoocupado = 0;
		int anadirduracion = 0;
		int opcionmenu = 0;
		int opcionsubmenu = 0;
		int opcionmenuduracion = 0;
		int modificarposicion = 0;
		int numerometido = 0;
		int contadoreliminadas = 0;
		int huecolibre = 0;
		int nuevaduracion = 0;
		int duracionminima = 0;
		int duracionmaxima = 0;
		byte contargenero1 = 0;
		byte contargenero2 = 0;
		byte contargenero3 = 0;
		byte contargenero4 = 0;
		byte contargenero5 = 0;
		byte contargenero6 = 0;
		byte contargenero7 = 0;
		byte contargeneroaleatorio = 0;
		boolean salir = false;

		// relleno los arrays abajo en vez de iniciarlos arriba porque sino se me va
		// demasiado a la derecha

		// relleno el array titulo

		titulo[0] = "LA VIDA DE BRYAN";
		titulo[1] = "SALVAR AL SOLDADO RYAN";
		titulo[2] = "POKEMON";
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
		genero[2] = "INFANTIL";
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
		duracion[2] = 96;
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

		// el menu todo dentro de un do while

		do {

			// imprimir los arrays conjuntamente sin los null o los cero
			imprimir("Esto es lo que hay ahora mismo:" + "\n");

			for (int i = 0; i < titulo.length; i++) {

				if (titulo[i] != null) {
					imprimir("La posicion " + i + " es: " + titulo[i] + " - " + genero[i] + " - " + duracion[i]);
				}

			}

			// mostrar cuantos huecos libres quedan en las titulo, que me vale para todos
			for (int i = 0; i < titulo.length; i++) {

				if (titulo[i] == "ELIMINADA") {

					contadoreliminadas++;

				}

			}
			imprimir("\n" + "Los huecos libres son:  " + contadoreliminadas);

			// resetear contadores a cero para cuando vuelva a empezar

			contadoreliminadas = 0;

			/*
			 * como todas las posiciones en los arryas se corresponden entre ellos, con
			 * saber la de título ya me vale para los otros, porque la posicion será la
			 * misma en los otros
			 */

			for (int i = 0; i < titulo.length; i++) {

				if (titulo[i] != null) {

					huecoocupado++;

					huecolibre = huecoocupado;
				}

			}

			// reseteo el contador para cuando vuelva arriba el programa
			huecoocupado = 0;
			// mostrar menu que quieres hacer

			imprimir("\n" + "Las opciones son:" + "\n");
			imprimir("1. Añadir pelicula");
			imprimir("2. Modificar pelicula");
			imprimir("3. Eliminar pelicula");
			imprimir("4. Buscar pelicula");
			imprimir("5. Listar por genero");
			imprimir("6. Listar ordenado");
			imprimir("7. Salir");

			// try catch por si mete el tipo de dato que no es
			try {

				imprimir("\n" + "Que quieres hacer?");

				opcionmenu = pedirNumero(numerometido);

			} catch (java.util.InputMismatchException e) {
				imprimir("Error tipo de dato. Buscamos un número.");
			}

			switch (opcionmenu) {

			// opcion 1. Añadir pelicula

			case 1:

				try {

					// primero miramos si titulo contiene "eliminada". Si es asì sustitutyo las
					// "eliminada"

					if (Arrays.toString(titulo).contains("ELIMINADA")) {

						for (int i = 0; i < titulo.length; i++) {

							if (titulo[i] == "ELIMINADA") {

								imprimir("Vamos a rellenar la posicion " + i);

								// pedir titulo
								do {

									imprimir("Introduce el titulo, por favor:");

									anadirtitulo = pedirString(stringmetida);

									titulo[i] = anadirtitulo;

								} while (!validarString(anadirtitulo));

								// pedir genero
								do {

									imprimir("Introduce el genero, por favor:");

									anadirgenero = pedirString(stringmetida);

									genero[i] = anadirgenero;

								} while (!validarString(anadirgenero));

								// pedir duracion
								try {
									do {

										imprimir("Introduce la duracion en minutos (entre 60 y 300), por favor:");

										anadirduracion = pedirNumero(numerometido);

										duracion[i] = anadirduracion;

									} while (anadirduracion < 60 || anadirduracion > 300);
								} catch (java.util.InputMismatchException e) {
									imprimir("Error tipo de dato. Buscamos un número.");
								}

							}

						}

						// si titulo no tiene "eliminada", metetmos en el primer hueco libre
					} else {

						// verificamos la peliculas metidas tiene más de 2 caracteres para el titulo y
						// lo metemos

						// pedir titulo
						do {

							imprimir("Introduce el titulo, por favor:");

							anadirtitulo = pedirString(stringmetida);

							titulo[huecolibre] = anadirtitulo;

						} while (!validarString(anadirtitulo));

						// pedir genero
						do {

							imprimir("Introduce el genero, por favor:");

							anadirgenero = pedirString(stringmetida);
							genero[huecolibre] = anadirgenero;

						} while (!validarString(anadirgenero));

						// pedir duracion
						try {
							do {

								imprimir("Introduce la duracion en minutos (entre 60 y 300), por favor:");

								anadirduracion = pedirNumero(numerometido);

								duracion[huecolibre] = anadirduracion;

							} while ((anadirduracion < 60 || anadirduracion > 30));
						} catch (java.util.InputMismatchException e) {
							imprimir("Error tipo de dato. Buscamos un número");
						}

						imprimir("\n");

					}

				} catch (java.lang.ArrayIndexOutOfBoundsException e) {
					imprimir("El array ya está lleno. Debes eliminar antes");
				}

				break;

			// opcion 2. Modificar pelicula
			case 2:

				// decimos al usuario como esta la coleccion
				imprimir("Recuerda que ahora está así: " + "\n");
				for (int i = 0; i < titulo.length; i++) {

					if (titulo[i] != null) {
						imprimir("La posicion " + i + " es: " + titulo[i] + " " + "- " + genero[i] + " " + "- "
								+ duracion[i]);
					}

				}

				imprimir("\n");

				// pedimos que posicion se va a cambiar

				try {

					do {

						imprimir("Introduce la posicion de película que quieras modificar:");

						modificarposicion = pedirNumero(numerometido);

						if (modificarposicion < 0 || modificarposicion > 19) {
							imprimir("La posicion debe ser un numero entre 0 y 19");
						}

					} while (modificarposicion < 0 || modificarposicion > 19);

				} catch (java.util.InputMismatchException e) {
					imprimir("Error tipo de dato. Buscamos un número");
				}

				imprimir("Pon el nuevo titulo:");
				nuevotitulo = pedirString(stringmetida);

				titulo[modificarposicion] = nuevotitulo;

				imprimir("Pon el nuevo genero:");
				nuevogenero = pedirString(stringmetida);

				genero[modificarposicion] = nuevogenero;

				do {

					imprimir("Pon la nueva duracion (entre 60 y 300):");
					nuevaduracion = pedirNumero(numerometido);

					duracion[modificarposicion] = nuevaduracion;

				} while ((nuevaduracion < 60 || nuevaduracion > 300) && !esNumero(nuevaduracion));

				break;

			// opcion 3. Eliminar pelicula

			case 3:

				try {

					do {

						imprimir("Introduce la posicion de película que quieras eliminar:");

						modificarposicion = pedirNumero(numerometido);

					} while (modificarposicion < 0 || modificarposicion > 19);

				} catch (java.util.InputMismatchException e) {
					imprimir("Error tipo dato introducido. Buscamos un número.");
				}
				// si y esa posicion ya está eliminada no hacemos nada, y sino la ponemos como
				// "eliminada"

				if (titulo[modificarposicion] == "ELIMINADA") {

					imprimir("Esa posición ya estaba eliminada." + "\n");

				} else {

					titulo[modificarposicion] = "ELIMINADA";

					genero[modificarposicion] = "ELIMINADA";

					duracion[modificarposicion] = -1;

				}

				break;

			// opcion 4. Buscar pelicula
			case 4:

				// submenu para buscar
				imprimir("Tus opciones a la hora de buscar son: " + "\n");
				imprimir("1. Buscar por título");
				imprimir("2. Buscar por género");
				imprimir("3. Buscar por duración");
				// try catch por si mete el tipo de dato que no es
				try {
					imprimir("\n" + "Cómo quieres buscar?");

					opcionsubmenu = pedirNumero(numerometido);

				} catch (java.util.InputMismatchException e) {
					imprimir("Error tipo de dato. Buscamos un número.");
				}

				switch (opcionsubmenu) {

				// 1. Buscar por titulo

				case 1:

					imprimir("Introduce el titulo a buscar:");

					tituloabuscar = pedirString(stringmetida);

					if (Arrays.toString(titulo).contains(tituloabuscar)) {

						for (int i = 0; i < titulo.length; i++) {

							if (titulo[i].contains(tituloabuscar)) {

								imprimir("\n" + "Los titulos que coinciden son: " + titulo[i] + " - " + genero[i]
										+ " - " + duracion[i] + " ,cuya posición es la " + i);

							}

						}

					} else {
						imprimir("No hay ese titulo");
					}

					break;

				// 2. Buscar por genero
				case 2:
					imprimir("Introduce el genero a buscar:");

					generoabuscar = pedirString(stringmetida);

					if (Arrays.toString(genero).contains(generoabuscar)) {

						for (int i = 0; i < genero.length; i++) {

							if (genero[i].contains(generoabuscar)) {

								imprimir("\n" + "Las peliculas con ese genero son: " + titulo[i] + " - " + genero[i]
										+ " - " + duracion[i] + " ,cuya posición es la " + i);

							}

						}

					} else {
						imprimir("No hay ese genero");
					}

					break;

				// 3. Buscar por duracion
				case 3:

					imprimir("Esta son las opciones para buscar por duracion" + "\n");

					imprimir("1. Buscar por duracion minima");
					imprimir("2. Buscar por duracion máxima");
					imprimir("3. Buscar entre rangos de duración" + "\n");

					try {

						imprimir("Que opción eliges?");
						opcionmenuduracion = pedirNumero(numerometido);

					} catch (java.util.InputMismatchException e) {
						imprimir("Error tipo de dato. Buscamos un número.");
					}

					try {
						switch (opcionmenuduracion) {

						// 1. Buscar por duracion minima
						case 1:

							imprimir("Mete la duracion mínima");

							duracionminima = pedirNumero(numerometido);

							if (esNumero(duracionminima) == true) {

								for (int i = 0; i < duracion.length; i++) {

									if (duracion[i] >= duracionminima) {
										imprimir("\n" + "Las peliculas con esa duracion minima son: " + titulo[i]
												+ " - " + genero[i] + " - " + duracion[i]);
									}

								}

							} else {
								System.out.println("Eso no es un numero");
							}

							break;

						// 2. Buscar por duracion maxima
						case 2:

							imprimir("Mete la duracion máxima");

							duracionmaxima = pedirNumero(numerometido);

							for (int i = 0; i < duracion.length; i++) {

								if (duracion[i] <= duracionmaxima) {
									imprimir("\n" + "Las peliculas con esa duracion máxima son: " + titulo[i] + " - "
											+ genero[i] + " - " + duracion[i]);
								}

							}

							break;

						// 3. Buscar por rangos de duracion
						case 3:

							do {

								imprimir("Primero, mete la duracion mínima");

								duracionminima = pedirNumero(numerometido);

								imprimir("Ahora, mete la duracion máxima");

								duracionmaxima = pedirNumero(numerometido);

								// si la duracion minima es mayor que la duracion máxima no tiene sentido

								if (duracionminima > duracionmaxima) {
									imprimir("La duración mínima no puede ser mayor que la máxima");
								}

							} while (duracionminima > duracionmaxima);

							for (int i = 0; i < duracion.length; i++) {

								if (duracion[i] > duracionminima && duracion[i] < duracionmaxima) {

									imprimir("\n" + "Las peliculas en ese rango son: " + titulo[i] + " - " + genero[i]
											+ " - " + duracion[i]);

								}
							}

							break;

						}
					} catch (java.util.InputMismatchException e) {
						imprimir("Error tipo de dato. Buscamos un número.");
					}

					break;

				}

				break;

			// opcion 5. Listar por genero
			case 5:

				for (int i = 0; i < genero.length; i++) {

					if (genero[i] == "COMEDIA") {
						contargenero1++;

					}

					if (genero[i] == "INFANTIL") {
						contargenero2++;
					}

					if (genero[i] == "DRAMA") {
						contargenero3++;
					}

					if (genero[i] == "SUPERHEROES") {
						contargenero4++;
					}

					if (genero[i] == "THRILLER") {
						contargenero5++;
					}

					if (genero[i] == "TERROR") {
						contargenero6++;
					}

					if (genero[i] == "MAFIA") {
						contargenero7++;
					}

					if (genero[i] == anadirgenero) {
						contargeneroaleatorio++;
						imprimir("Del genero " + anadirgenero + " tenemos " + contargeneroaleatorio);
					}

					if (genero[i] == nuevogenero) {
						contargeneroaleatorio++;
						imprimir("Del genero " + nuevogenero + " tenemos " + contargeneroaleatorio);
					}

				}

				imprimir("Del genero COMEDIA tenemos " + contargenero1);
				imprimir("Del genero INFANTIL tenemos " + contargenero2);
				imprimir("Del genero DRAMA tenemos " + contargenero3);
				imprimir("Del genero SUPERHEROES tenemos " + contargenero4);
				imprimir("Del genero THRILLER tenemos " + contargenero5);
				imprimir("Del genero TERROR tenemos " + contargenero6);
				imprimir("Del genero MAFIA tenemos " + contargenero7);

				imprimir("\n");

				// reseteo los contadores
				contargenero1 = 0;
				contargenero2 = 0;
				contargenero3 = 0;
				contargenero4 = 0;
				contargenero5 = 0;
				contargenero6 = 0;
				contargenero7 = 0;

				break;
			// opcion 6. Listar ordenado
			case 6:

				imprimir("Peliculas ordenadas en duracion ascendente: " + "\n");

				// hago una copia de los arrays originales
				System.arraycopy(duracion, 0, copiaduracion, 0, duracion.length);
				System.arraycopy(genero, 0, copiagenero, 0, genero.length);
				System.arraycopy(titulo, 0, copiatitulo, 0, titulo.length);

				// intercambio los valores de las posiciones correspondientes a cada copia

				for (int i = 0; i < copiaduracion.length; i++) {
					for (int j = i + 1; j < copiaduracion.length; j++) {

						// asi lo veo en posicion ascendente, para verlo en descendente cambio el "<" a
						// ">"

						if (copiaduracion[i] < copiaduracion[j]) {

							auxiliar = copiaduracion[i];
							copiaduracion[i] = copiaduracion[j];
							copiaduracion[j] = auxiliar;

							cambiar = copiatitulo[i];
							copiatitulo[i] = copiatitulo[j];
							copiatitulo[j] = cambiar;

							cambiar = copiagenero[i];
							copiagenero[i] = copiagenero[j];
							copiagenero[j] = cambiar;

						}

					}
					imprimir(copiatitulo[i] + " - " + copiagenero[i] + " - " + copiaduracion[i]);

				}
				imprimir("\n");
				break;

			// opcion 7. Salir
			case 7:
				salir = true;
				break;

			default:
				imprimir("Tienes que elegir un numero del 1 al 7");
				break;

			}

		} while ((opcionmenu >= 1 && opcionmenu <= 7) && !salir);

		imprimir("Gracias por usar el programa!");

	}

}
