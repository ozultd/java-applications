package starsign;
// declare public class
public class StarSign{
	//declare vars
	private String month;
	private int dob;
	private String starSign;
	//constructor
	public StarSign(){
		month="";
		dob=0;
		starSign="error";
	}
	//set
	public void setMonth(String month){
		this.month=month;
	}
	public void setDob(int dob){
		this.dob=dob;
	}
	//compute
	public void compute(){
		switch (month){
			case "January" :
			if (dob > 0 && dob <= 20){
				starSign = "Capricorn";
			}
			else if (dob > 20 && dob < 32){
				starSign = "Aquarius";
			}
			else {
				starSign = "INVALID INPUT";
			}
			break;
			case "February" :
			if (dob > 0 && dob <= 19){starSign = "Aquarius";}
			else if (dob > 19 && dob < 30){starSign = "Pisces";}
			else {starSign = "INVALID INPUT";}
			break;

		}
	}
	//get
	public String getStarSign(){
		return starSign;
	}
}
