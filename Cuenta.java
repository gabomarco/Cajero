public class Cuenta{

	int idCuenta;
	String contrasenia;
	int saldo;
	int cantidadDepositar;
	int cantidadRetirar;


  

	public int mostrarSaldo ()
	{
		System.out.println("El saldo de la cuenta: "+idCuenta + " Es: "+ saldo);
		return saldo;
	}

	public int depositarSaldo(int cantidadDepositar)
	{
		System.out.println("Ingrese la cantidad que desea depositar");
		cantidadAuxiliar = cantidadDepositar;
		saldo = saldo + cantidadAuxiliar;
		System.out.println("El saldo de la cuenta despues de depositar "+ idCuenta + " Es:" + saldo);
	}

}