import java.util.ArrayList;
import java.util.HashMap;

public class Bank implements Subject{

    private ArrayList<Client> clients;
    private Month currentMonth;

    public Bank(Month startMonth){
	clients = new ArrayList();
	currentMonth = startMonth;
    }
    public void registerClient(Client client){
	registerObserver(client);
    }

    public void registerObserver(Observer client){
	clients.add((Client)client);
    }

    public void removeObserver(Observer client){
	int i = clients.indexOf(client);
	if(i >= 0){
	    clients.remove(i);
	}
    }

    public void notifyObservers(){
	for(Client client : clients){
	    client.update(currentMonth);
	}
    }

    public void endMonth(){
	notifyObservers();
	currentMonth = Month.numberToMonth(currentMonth.getNumber() +1);
    }

    public void subscribeClientToService(Client client,
					 Service service){
	int i = clients.indexOf(client);
	if(i >= 0){
	    clients.get(i).subscribe(service);
	}
    }

    public void changeClientService(Client client,
				    Service service1,
				    Service service2){
	int i = clients.indexOf(client);
	if(i >= 0){
	    clients.get(i).changeService(service1,service2);
	}
    }

    
    public void unsubscribeClientToService(Client client,
					   Service service){
	int i = clients.indexOf(client);
	if(i >= 0){
	    clients.get(i).unsubscribe(service);
	}
    }

    public void unsubscribeToAll(Client client){
	client.unsubscribeToAll();
    }

    public void depositToClient(Client client,
				Integer deposit){
	client.deposit(deposit);
    }
    
}
