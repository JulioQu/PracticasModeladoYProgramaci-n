package practica1;

public class Simulacion{

    public static void main(String args[]){
	Banco banco = new Banco();
	banco.setMes(0);

	//Crea servicios y añadelos la lista de servicios del banco

	Servicio memetflix = new Servicio("Memetflix");
	Servicio momazonPrime = new Servicio("Momazon Prime");
	Servicio mextel = new Servicio("Mextel");
	Servicio issi = new Servicio("Issi");

	momazonPrime.agregaPaquete("normal",100);
	
	mextel.agregaPaquete("20mbps",349);
	mextel.agregaPaquete("30mbps",399);
	mextel.agregaPaquete("150mbps",549);

	issi.agregaPaquete("30mbps",390);
	issi.agregaPaquete("50mbps",590);
	issi.agregaPaquete("100mbps",780);

	Cliente alice = new Cliente("Alice",20000);
	Cliente bob = new Cliente("Bob",2000);
	Cliente charlie = new Cliente("Charlie",7000);
	Cliente diego = new Cliente("Diego",6000);
	Cliente emma = new Cliente("Emma",9000);
	
	banco.agregaCliente(alice);
	banco.agregaCliente(bob);
	banco.agregaCliente(charlie);
	banco.agregaCliente(diego);
	banco.agregaCliente(emma);
	
	banco.realizaAccion("Alice",new ContratacionServicio("Memeflix","4dispositivos"));
	banco.realizaAccion("Alice",new ContratacionServicio("Momazon Prime","normal"));
	banco.realizaAccion("Alice",new ContratacionServicio("Issi","100mbps"));
	
	banco.realizaAccion("Bob",new ContratacionServicio("Memeflix","4dispositivos"));
	banco.realizaAccion("Bob",new ContratacionServicio("Momazon Prime","normal"));
	banco.realizaAccion("Bob",new ContratacionServicio("Mextel","150mbps"));

	banco.realizaAccion("Charlie",new ContratacionServicio("Issi","30mbps"));
							       
	banco.realizaAccion("Diego",new ContratacionServicio("Memeflix","4dispositivos"));
	banco.realizaAccion("Diego",new ContratacionServicio("Issi","50mbps"));
	
	banco.realizaAccion("Emma",new ContratacionServicio("Memeflix","4dispositivos"));
	banco.realizaAccion("Emma",new ContratacionServicio("Momazon Prime","normal"));
	banco.realizaAccion("Emma",new ContratacionServicio("Issi","100mbps"));

	banco.setMes(1);
	//Hacer las acciones del mes de febrero...

	banco.setMes(2);
	//Hacer las acciones del mes de marzo...
		
	banco.setMes(3);

	banco.setMes(4);

	banco.setMes(5);

	banco.setMes(6);

	banco.setMes(7);

	banco.setMes(8);

	banco.setMes(9);

	banco.setMes(10);

	banco.setMes(11);
    }
}
