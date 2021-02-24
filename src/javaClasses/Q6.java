package javaClasses;

class Room{
	int roomno;
	String roomtype;
	int roomarea;
	boolean ACmachine;
	
void setdata(int num, String type, int area, boolean ac) {
	roomno = num;
	roomtype = type;
	roomarea = area;
	ACmachine = ac;
	
}

void displaydata() {
System.out.println("Room number " + roomno + " with a type " + roomtype + " and area " + roomarea + " squarefeet. Is an AC machine present? " + ACmachine);
}
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object
		Room masterbedroom = new Room();
		masterbedroom.setdata(3,"Master", 165, true);
		masterbedroom.displaydata();

	}

}
