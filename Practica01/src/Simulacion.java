

public class Simulacion{

    public static void main(String[] args){
	Bank ilusion = new Bank(Month.JANUARY);

	Client alice = new Client("Alice",1,12,"Calle Juanito");
	Client bob = new Client("Bob",2,12,"Calle Juanito");
	Client charlie = new Client("Charlie",3,12,"Calle Juanito");
	Client diego = new Client("Diego",4,12,"Calle Juanito");
	Client emma = new Client("Emma",5,12,"Calle Juanito");
	
	// January
	ilusion.registerClient(alice);
	ilusion.registerClient(bob);
	ilusion.registerClient(charlie);
	ilusion.registerClient(diego);
	ilusion.registerClient(emma);

	ilusion.depositToClient(alice,20000);
	ilusion.depositToClient(bob,2000);
	ilusion.depositToClient(charlie,7000);
	ilusion.depositToClient(diego,6000);
	ilusion.depositToClient(emma,9000);

	ilusion.subscribeClientToService(alice,new Service("Memeflix", "4 dispositivos", 300));
	ilusion.subscribeClientToService(alice,new Service("Momazon Prime", "Básico", 100));
	ilusion.subscribeClientToService(alice,new Service("Issi", "100Mbps", 780));

	ilusion.subscribeClientToService(bob,new Service("Memeflix", "4 dispositivos", 300));
	ilusion.subscribeClientToService(bob,new Service("Momazon Prime", "Básico", 100));
	ilusion.subscribeClientToService(bob,new Service("Mextel", "150Mbps", 549));
	

	ilusion.subscribeClientToService(charlie,new Service("Issi", "30Mbps", 390));

	ilusion.subscribeClientToService(diego,new Service("Memeflix", "4 dispositivos", 300));
	ilusion.subscribeClientToService(diego,new Service("Issi", "50Mbps", 590));

	ilusion.subscribeClientToService(emma,new Service("Memeflix", "4 dispositivos", 300));
	ilusion.subscribeClientToService(emma,new Service("Momazon Prime", "Básico", 100));
	ilusion.subscribeClientToService(emma,new Service("Issi", "100Mbps", 780));

	ilusion.endMonth();

	// February

	ilusion.endMonth();

	// March

	ilusion.endMonth();

	// April
	ilusion.unsubscribeToAll(emma);
	ilusion.subscribeClientToService(emma,new Service("Mextel", "30Mbps", 399));
	ilusion.endMonth();

	// May
	ilusion.endMonth();

	// June
	ilusion.endMonth();

	// July
	ilusion.unsubscribeClientToService(charlie, new Service("Issi", "30Mbps", 390));
	ilusion.subscribeClientToService(charlie, new Service("Mextel", "20Mbps", 349));	
	ilusion.subscribeClientToService(charlie,new Service("Momazon Prime", "Básico", 100));

	ilusion.endMonth();

	// August
	ilusion.subscribeClientToService(emma,new Service("Momazon Prime", "Básico", 100));	
	ilusion.unsubscribeToAll(diego);
	
	ilusion.endMonth();

	
	// November
	ilusion.depositToClient(diego,6000);
	ilusion.unsubscribeClientToService(diego, new Service("Issi", "30Mbps", 390));
	ilusion.endMonth();

	//December
	ilusion.endMonth();
	
	    
    }

}
