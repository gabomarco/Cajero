public class Cuenta{

	int idCuenta;
	String contrasenia;
	int saldo;
	int cantidadDepositar;
	int cantidadRetirar;


  
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

}