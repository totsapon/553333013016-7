package lampard;

import java.util.Arrays;

public class Lampard {
	
		private  String name;
		private  String position;
		private  String friend[];
		

	public static void main(String[] args) {
		
		Lampard pey = new Lampard();
		
		String name = pey.getname();
		String position = pey.getposition();
		String friend[] = pey.getfriend();
		
		System.out.println("Name =  "+name);
		System.out.println("Position = "+position);
		System.out.println("Friend = "+Arrays.toString(friend));
		

	}
	
	  public Lampard() {
	    	
	        name = "Frank Lampard";
	        position = "CDM";
	        friend = new String[]{"Terry", "Hazard", "Oscar", "Ba"};

	    	}
	    	public  String getname() {
	        return name;
	    	}

	    	public  String getposition() {
	        return position;
	    	}

	    	public  String[] getfriend() {
	        return friend;
	    	}

}
