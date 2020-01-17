package simple;

public class TwoStringSwap {

	public static void main(String[] args) {
		
		String name = "Ila";
		String lname = "Venkat";
		System.out.println("First String values Name: " + name + " lname: "+lname);
		name = name + lname;
		lname = name.replace(lname, "");
		name = name.replace(lname, "");
		System.out.println("after String values Name: " + name + " lname: "+lname);

		
		

	}

}
