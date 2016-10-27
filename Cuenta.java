import java.util.Scanner;

public class Cuenta{

	int idCuenta;
	String contrasenia;
	int saldo;
	int cantidadDepositar;
	int cantidadRetirar;
	boolean retiroExitoso = false;
	int opc;
	

  
public Cuenta(int idCuenta, String contrasenia, int saldo){
	this.idCuenta=idCuenta;
	this.contrasenia=contrasenia;
	this.saldo= saldo;

}
	public int mostrarSaldo ()
	{
		System.out.println("El saldo de la cuenta: "+idCuenta + " Es: "+ saldo);
		return saldo;
	}

	public void depositarSaldo(int cantidadDepositar)
	{
		saldo = saldo + cantidadDepositar;
		System.out.println("El saldo de la cuenta despues de depositar "+ idCuenta + " Es:" + saldo);
	}

	public void retirarSaldo(){
		
		int restaSaldo = 0;

		Scanner scan = new Scanner(System.in);

		do{

			System.out.println("Indique el saldo a retirar: \n1. $5,000.00 \n2. $10,000.00 \n3. $20,000.00 \n4. $50,000.00 \n5. $100,000.00 \n6. Otra cantidad: ");
			
			opc = scan.nextInt();

			switch(opc){

				case 1:
				 restaSaldo = saldo - 5000;
				 break;
				 case 2:
				 restaSaldo = saldo - 10000;
				 break;
				 case 3:
				 restaSaldo = saldo - 20000;
				 break;
				 case 4:
				 restaSaldo = saldo - 50000;
				 break;
				 case 5:
				 restaSaldo = saldo - 100000;
				 break;
				 case 6:
				 System.out.println("Cantidad: ");
				 cantidadRetirar = scan.nextInt();
				 restaSaldo = saldo - cantidadRetirar;
				 break;
			}

				 if (restaSaldo < 0){
				 	System.out.println("\n\n El saldo minimo en la cuenta no puede ser menor a $5000.00 elige otra opción");
				 }
				 else{
				 	retiroExitoso = true;
				 }

		} while (restaSaldo >= 0 && retiroExitoso == false);

			  
		 	saldo = restaSaldo;
		 	System.out.println ("Nuevo saldo en la cuenta: " + saldo);

			 
	}

}