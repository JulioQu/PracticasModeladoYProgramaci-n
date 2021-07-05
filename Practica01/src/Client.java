import java.util.ArrayList;

public class Client{
    private String name;
    private int rfc;
    private int phone;
    private String address;
    private int balance;
    private ArrayList<Servicio> services;

    public Client(String name,
		  int rfc,
		  int phone,
		  String address,
		  int balance){
	this.name = name;
	this.rfc = rfc;
	this.phone = phone;
	this.address = address;
	this.balance = balance;
    }
    
    public getName(){
	return name;
    }

    public getBalance(){
	return balance;
    }
    
}
