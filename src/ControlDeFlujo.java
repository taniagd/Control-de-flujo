import java.util.Scanner;
public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	1.if (condición) si se cumple {
	código
	código 
	código
	}
	-------------------------------------------
	if (condición) si se cumple {
		código
		código
		código
		Si no se cumple la condición se ejecuta else.
	} else 
		código
		código
		código
	}
	-------------------------------------------
	if (condición) si se cumple { //Se evalua la condición 
		código
		código
		código
		
	Se evalua nuevamente la condición, si se cumple la condición del else if se ejecuta
	}
	else if (condicición) si se cumple {
	Si se cumple la condición del else if se ejecuta
	} else if (condición) si se cumple {
		código 
		código 
		código
	}
	Si ninguna condición se cumple, ejecuta el else 
	else {
	
	}
		 */
		
		//EJEMPLO
	/* Se lee la edad del usuario por consola, si la edad es mayor a 18 años, 
	 * se muestra un mensaje al usaurio de que puede votar. En caso contrario, 
	 * se mostrará mensaje de que no puede votar.*/
		
		
		/*Scanner readAge = new Scanner(System.in); //Declaro escanes para que se lean los datos
		System.out.println("Ingresa tu edad, por favor");
		int age = readAge.nextInt(); // Se lee ese dato de lo que teclea el usuario
		String message = votar(age); // Variable que contenga resultado de método votar
		System.out.println(message); // Se imprime en consola*/
		
		
		/*Escribir un programa que pida el nombre y edad de un participante.
		Si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un msj que diga
		"Felicidades + nombreIngresado has sido aceptado en el programa de Generation
		Java Full Stack".
		En caso de no cumplirse la condición, mostrar un mensaje que diga:
		"No cumples los requisitos para el bootcamp Java Full Stack"
		*/
		
		Scanner readName = new Scanner(System.in);
		System.out.println("¿Cuál es tu nombre?");
		String addName = readName.nextLine();
		Scanner readAge = new Scanner(System.in);
		System.out.println("¿Cuál es tu edad?");
		int addAge = readAge.nextInt();
		String message = ingreso(addAge, addName);
		System.out.println(message);
		
		readName.close();
		readAge.close();
	}
	
	
	/*public static String votar(int age) { //Método votar hace evaluación de la condición
		String message = "";
		if (age >= 18) {
			message = "Puedes votar.";
		} else {
			message = "Lo siento, no puedes votar.";
		}
		return message; 
	} */ 
	
	public static String ingreso(int age, String addName) {
		String message = "";
		if (age >= 18 && age <=29) {
			//String addName= "";
			message = "¡Felicidades " + addName + " " + "has sido aceptada" + " "
					+ "en el programa de Generation Java Full Stack!";
		} else {
			message = "No cumples los requisitos para participar en el bootcamp "
					+ "Java Full Stack";
		}
		return message;
		}
}





