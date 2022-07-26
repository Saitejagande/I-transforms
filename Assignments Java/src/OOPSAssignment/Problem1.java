package OOPSAssignment;

public class Problem1 {
	 public static void main(String[] args) {
	        ex.return_obj();
	    }
	}

	class ex{
	    static ex obj= new ex();
	    private ex(){

	    }
	    public static ex return_obj(){
	        return obj;
	    }
	}

