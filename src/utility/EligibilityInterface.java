package utility;

import model.User;

interface EligiblityInterface
{
	boolean checkUser (User user);
	boolean checkQuizAnswer (String points);
}