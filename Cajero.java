import java.util.Scanner;

public class Cajero {


	public static void main (String [] args){

		int opcion;
		
		int cantidadAuxiliar;

		Scanner teclado = new Scanner(System.in);
			
		Cuenta objetoCuenta = new Cuenta(1,"contraseña", 50000);



		System.out.println("Bienvenido al cajero Chidaspelas");
		int respuesta=0;
		do{

				System.out.println("Que deseas realizar? \n 1.- Consultar Saldo \n 2.- Depositar \n 3.- Retirar ");	
				opcion=teclado.nextInt();	

		
			switch(opcion){
				case 1:
	            	objetoCuenta.mostrarSaldo();
	            	System.out.println("Desea hacer algo mas?");
	            	respuesta=teclado.nextInt();
					break;

				case 2:
					System.out.println("Cuanto deseas depositar?");
					cantidadAuxiliar=teclado.nextInt();
	           	 	objetoCuenta.depositarSaldo(cantidadAuxiliar);
	           	 	System.out.println("Desea hacer algo mas?");
	            	respuesta=teclado.nextInt();
					break;
	      		

	      		case 3:
	            	objetoCuenta.retirarSaldo();
	            	System.out.println("Desea hacer algo mas?");
	            	respuesta=teclado.nextInt();				
	            	break;

	            default:
					System.out.println("Porfavor selecciona una opcion valida");
					break;

			}

		}while(respuesta == 1);

	}
}