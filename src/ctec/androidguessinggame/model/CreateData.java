package ctec.androidguessinggame.model;

import java.util.ArrayList;

import android.app.Application;


public class CreateData extends Application
{
	private ArrayList<String> riddles;
	private String riddle;
	private String answer;
	private String hint;
	private int score;
	
	public void onCreate()
	{
		super.onCreate();
		
		riddle = "";
		answer = "";
		hint = "";
		score = 0;
		
		setupRiddles();
		
	}

	private void setupRiddles() 
	{
		
		riddles.add("Poor people have it. Rich people need it. If you eat it you die. What is it?");
		riddles.add("I知 tall when I知 young and I知 short when I知 old. What am I?");
		riddles.add("If I drink, I die. If i eat, I am fine. What am I?");
		
	}
	
	public void chooseRiddles()
	{
		String chosenRiddle = "";
		
		chosenRiddle = chooseRandomFromList(riddles);
		getRiddleAnswer(chosenRiddle);
		
		
		
	}
	
	private void getRiddleAnswer(String riddleChosen)
	{
		String riddleAnswer = "";
		
		if(riddleChosen.equals("Poor people have it. Rich people need it. If you eat it you die. What is it?"))
		{
			riddleAnswer = "nothing";
		}
		else if(riddleChosen.equals("I知 tall when I知 young and I知 short when I知 old. What am I?"))
		{
			riddleAnswer = "a candle";
		}
		else if(riddleChosen.equals("If I drink, I die. If i eat, I am fine. What am I?"))
		{
			riddleAnswer = "a fire";
		}
		
	}

	private String chooseRandomFromList(ArrayList <String> listToUse)
	{
		String chosenItem = "";
		int indexOfItem = 0;
		
		indexOfItem = (int) (Math.random() *  listToUse.size());
		chosenItem = listToUse.get(indexOfItem);
		
		return chosenItem;
	}

	public String getRiddle() 
	{
		return riddle;
	}

	public void setRiddle(String riddle) 
	{
		this.riddle = riddle;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	public String getHint() 
	{
		return hint;
	}

	public void setHint(String hint) 
	{
		this.hint = hint;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}
	
}
