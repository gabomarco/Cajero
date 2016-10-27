import java.util.Scanner;

public class Cajero {


	public static void main (String [] args){

		int opcion;
		char respuesta = 's';
		int cantidadAuxiliar;

		Scanner teclado = new Scanner(System.in);
			
		Cuenta objetoCuenta = new Cuenta(1,"contraseña", 50000);



		System.out.println("Bienvenido al cajero Chidaspelas")
		System.out.println("Que deseas realizar? \n 1.- Consultar Saldo \n 2.- Depositar \n 3.- Retirar ")	
		opcion=teclado.nextInt();	

		do{
			switch(opcion){
				case 1:
	            	objetoCuenta.mostrarSaldo();
	            	System.out.println("Desea hacer algo mas?")
	            	respuesta=teclado.nextLine();
				break;

				case 2:
					System.out.println("Cuanto deseas depositar?")
					cantidadAuxiliar=teclado.nextInt();
	           	 	objetoCuenta.depositarSaldo(cantidadAuxiliar);
	           	 	System.out.println("Desea hacer algo mas?")
	            	respuesta=teclado.nextLine();
				break;
	      		

	      		case 3:
	      			System.out.println("Cuanto deseas retirar?")
					cantidadAuxiliar=teclado.nextInt();
	            	objetoCuenta.retirarSaldo(cantidadAuxiliar);
	            	System.out.println("Desea hacer algo mas?")
	            	respuesta=teclado.nextLine();
				
	            break;

	            default:
				System.out.println("Porfavor selecciona una opcion valida");

			}
		}while(respuesta == 's');

	}
}