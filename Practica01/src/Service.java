public class Service{

    private String name;
    private String type;
    private Integer cost;

    public Service(String name, String type, Integer cost){
	this.name = name;
	this.type = type;
	this.cost = cost;
    }

    public String getName(){
	return name;
    }

    public String getType(){
	return type;
    }

    public Integer getCost(){
	return cost;
    }


    public boolean equals(Object o){
	if(!(o instanceof Service)){
	    return false;
	}
	Service service = (Service) o;
	return name.equals(service.name);
    }

}
