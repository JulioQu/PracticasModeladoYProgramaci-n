public enum Month{

    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);
    
    private final int number;

    private Month (int number) {
	this.number = number;
    }

    public int getNumber() {
	return number;
    }


    public static Month numberToMonth(int i){
	switch(i % 12){
	case 0:
	    return Month.JANUARY;
	case 1:
	    return Month.FEBRUARY;
	case 2:
	    return Month.MARCH;
	case 3:
	    return Month.APRIL;
	case 4:
	    return Month.MAY;
	case 5:
	    return Month.JUNE;
	case 6:
	    return Month.JULY;
	case 7:
	    return Month.AUGUST;
	case 8:
	    return Month.SEPTEMBER;
	case 9:
	    return Month.OCTOBER;
	case 10:
	    return Month.NOVEMBER;
	case 11:
	    return Month.DECEMBER;
	default:
	    return null;
	}
    }

    @Override
    public String toString(){
	switch(this){
	case JANUARY:
	    return "Enero";
	case FEBRUARY:
	    return "Febrero";
	case MARCH:
	    return "Marzo";
	case APRIL:
	    return "Abril";
	case MAY:
	    return "Mayo";
	case JUNE:
	    return "Junio";
	case JULY:
	    return "Julio";
	case AUGUST:
	    return "Agosto";
	case SEPTEMBER:
	    return "Septiembre";
	case OCTOBER:
	    return "Octubre";
	case NOVEMBER:
	    return "November";
	case DECEMBER:
	    return "December";
	default:
	    return "";
	}
	
    }
}
