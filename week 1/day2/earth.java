public class earth{
	public static void main ( String[] args){
		double radiuskm = 6378;
		double radiusmiles = radiuskm/1.6;
		double volumeinkm = (4.0/3.0) * Math.PI * Math.pow( radiuskm, 3);
		double volumeinmiles = (4.0/3.0) * Math.PI * Math.pow( radiusmiles, 3);
		System.out.println("The volume of earth in cubic kilometers is " + volumeinkm + " and cubic miles is " + volumeinmiles);
	}
}
