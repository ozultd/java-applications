package starsign;
import javax.swing.JOptionPane;
public class StarSignApp{
	public static void main(String args[]){
		//declare
		String starSign;
		String month;
		int dob;
		//declare and create objects
		StarSign star;
		star=new StarSign();
		//input
		dob=Integer.parseInt(JOptionPane.showInputDialog(null,"What date?"));
		month=JOptionPane.showInputDialog(null,"What month?");

		//set
		star.setMonth(month);
		star.setDob(dob);
		//compute/process
		star.compute();
		//get method
		starSign=star.getStarSign();
		//output
		JOptionPane.showMessageDialog(null,starSign);

	}
}