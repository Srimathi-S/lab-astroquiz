package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility
{
	


	boolean checkUser(User user) {
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		boolean ageEligibility=(18 <= age) && (age<= 35);
		boolean heightEligibility=(155 <=height)  && (height<=170 );
		boolean weightEligiblity=(55<= weight) && (weight <= 90) ;
		boolean countryEligiblity=(country.equals("ProGrad"));
		return (ageEligibility && heightEligibility && weightEligiblity && countryEligiblity);
	}
	public boolean checkQuiz(String points)
	{
		int score=Integer.parseInt(points);
		return (score>80);
	}
	@Override
	
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		return  checkUser(user);
	}

}



