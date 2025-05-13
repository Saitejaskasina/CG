public class pens{
	public static void main ( String[] args){
		int noofpens = 14;
		int students = 3;
		int penperstudent = noofpens/students;
		int reminder =  noofpens%students ;
		System.out.println("The Pen Per Student is "+ penperstudent +" and the remaining pen not distributed is " +reminder);
	}
}
