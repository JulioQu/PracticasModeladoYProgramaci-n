import java.util.ArrayList;

public class Client implements Observer{
    private String name;
    private int rfc;
    private int phone;
    private String address;
    private int balance;
    private ArrayList<Service> services;

    public Client(String name,
		  int rfc,
		  int phone,
		  String address){
	this.name = name;
	this.rfc = rfc;
	this.phone = phone;
	this.address = address;
	balance = 0;
	services = new ArrayList<Service>();
    }
    
    public void subscribe(Service service){
	services.add(service);
    }

    public void unsubscribe(Service service){
	int i = services.indexOf(service);
	if(i >= 0){
	    services.remove(i);
	}
    }

    public void unsubscribeToAll(){
	services.clear();
    }

    public void deposit(Integer deposit){
	balance += deposit;
    }

    public void changeService(Service service1,Service service2){
	unsubscribe(service1);
	subscribe(service2);
    }

    @Override
    public void update(Month month){
	String message = "-".repeat(100) + "\n";
	message += String.format("Nombre: %s, rfc: $%d, Mes: %s\n",
				 name,rfc,month.toString());
	message += String.format("Saldo antes de los pagos: $%d\n",
				 balance);
	for(Service service: services){
	    message += payService(service);
	}
	message += String.format("Saldo después de los pagos: $%d\n",
				 balance);
	message += "-".repeat(100)+"\n";
	System.out.println(message);
    }

    private String payService(Service service){
	if(service.getCost() > balance){
	    return String.format("\t-Fondos insuficientes para pago de servicio %s con paquete %s y costo de $%d, servicio suspendido.\n",
				 service.getName(),service.getType(),
				 service.getCost());
	}else{
	    balance -= service.getCost();
	    return String.format("\t-Pago del servicio %s con paquete %s y costo de $%d fue exitoso.\n",
				 service.getName(),service.getType(),
				 service.getCost());
	}
    }


    @Override
    public boolean equals(Object o){
	if(!(o instanceof Client)){
	    return false;
	}
	Client client = (Client)o;
	return name.equals(client.name) &&
	    (rfc == client.rfc);
    }

    
}
