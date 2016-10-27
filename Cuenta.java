import.javautil.Scanner;

public class Cuenta{

	int idCuenta;
	String contraseña;
	int saldo;
	int cantidadDepositar;
	int cantidadRetirar;
	boolean regresar;

	public int retirarSaldo(cantidadRetirar){
		
		int restaSaldo;

		Scanner scan = new Scanner(System.ini);

		do{

		System.out.println("Indique el saldo a retirar: \n1. $5,000.00 \n2. $10,000.00 \n3. $20,000.00 \n4. $50,000.00 \n5. $100,000.00 \n6. Otra cantidad: ");
		
		cantidadRetirar = scan.nextLine();

		switch(cantidadRetirar){

			case "1":
			 restaSaldo = saldo - 5000;
			 break;
			 case "2":
			 restaSaldo = saldo - 10000;
			 break;
			 case "3":
			 restaSaldo = saldo - 20000;
			 break;
			 case "4":
			 restaSaldo = saldo - 50000;
			 break;
			 case "5":
			 restaSaldo = saldo - 100000;
			 break;
			 case "6":
			 restaSaldo = saldo - cantidadRetirar;
			 break;

			 if (restaSaldo < 5000){
			 	System.out.println("\n\n El saldo minimo en la cuenta no puede ser menor a $5000.00 elige otra opción");
			 }

			} while (restaSaldo >= 5000);

			  
		 	saldo = restaSaldo;
		 	System.out.println ("Nuevo saldo en la cuenta: " + saldo);

			 }
		}

	}

}