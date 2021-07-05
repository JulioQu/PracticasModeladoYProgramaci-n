import java.util.ArrayList;
import java.util.HashMap;

public class Bank implements Subject{

    private class Event{
	private Transaction transaction;
	private Service service1;
	private Service service2;
	private int deposit;

	public Event(Transaction transaction,
		     Service service1,
		     Service service2,
		     int deposit){
	    this.transaction = transaction;
	    this.service1 = service1;
	    this.service2 = service2;
	    this.deposit = deposit;
	}

	@Override
	public String toString(){
	    switch(transaction){
	    case SERVICE_SUBSCRIPTION:
		return String.format("Subscripción al servicio: %s.",
				     service1.toString());
		break;
	    case SERVICE_CANCELLATION:
		return String.format("Cancelación de servicio: %d.",
				     service1.toString());
		break;
	    case SERVICE_UPDATE:
		return String.format("Cambio de servicio %s a %s.",
				     service1.toString(),
				     service2.toString());
		break;
	    case DEPOSIT:
		return String.format("Depósito de %d.",
				     deposit);
		break;
	    case END_OF_MONTH_CHARGE:
		return "End of month.";
		break;
	    case default:
		return "";
	    }
	}

    }

    ArrayList<Client> clients;
    HashMap<Client,ArrayList<Event>> eventsOfMonth;

        
    public Bank(){
	clients = new ArrayList();
    }

    public void registerObserver(Observer client){
	clients.add(client);
    }

    public void removeObserver(Observer client){
	if((int i = clients.indexOf(client)) >= 0){
	    clients.remove(i);
	}
    }

    public void notifyObservers(Transaction transaction,
				Client client,
				Service service1,
				Service service2,
				int deposit){
	for(Observer client: clients){
	    client.update(transaction,
			  client,
			  service1,
			  service2,
			  deposit);
	}
    }

    public void doTransaction(Transaction transaction,
			      Client client,
			      Service service1,
			      Service service2,
			      int deposit){
	if(transaction != Transaction.END_OF_MONTH){
	    eventsOfMonth
		.get(client)
		.add(new Event(transaction,service1,service2,deposit));
	}else{

	}

    }

}
