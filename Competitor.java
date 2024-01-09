package cw;
import java.io.*;

import java.util.*;


public class Competitor {
	private String DateOfBirth;  
	private int CompetitionNumber ;
	private int CompetitorNumber;
	private  int Age;
	private String Category;
	private String Email;
	private String Level;
	private String UserName;
	private String Password;
	private byte[] individualScores;
	private int OverAllScore;
	private int MaxScore;
	private int LowestScore;
	Competitor(String i, int CompetitionN, int CompetitorN, int age, String cat, String Em, String level2, String Un,
            String Pw, byte[] j, int oS, int MS, int LS){
DateOfBirth = i;
CompetitionNumber = CompetitionN;
CompetitorNumber = CompetitorN;
Age = age;
Category = cat;
Email = Em;
Level = level2;
UserName = Un;
Password = Pw;
int numberOfScores = 5;
OverAllScore = oS;

individualScores = Arrays.copyOf(j, numberOfScores);
MaxScore = MS;
LowestScore = LS;



}
//get methods
public String getDateOfBirth() {
	return DateOfBirth;
	}
public int getCompetitionNumber() {
	return CompetitionNumber;
	}
public int getCompetitorNumber() {
	return CompetitorNumber;
}

public int getOverAllScore() {
	return OverAllScore;
	
}

public int getAge() {
    return Age;
}
public static double getOverallScore() { return 5; }

public String getfulldetails(){
	String fullDetails =" ";
	fullDetails += "Date Of Birth: " + DateOfBirth +"\n";
	fullDetails += "\n Competition Number: " + CompetitionNumber ;
	fullDetails += "\n Competitor Number: " + CompetitorNumber ;
	fullDetails += "\n Age: " + Age  ;
	fullDetails += "\n Category: " + Category ;
	fullDetails += "\n Email: " + Email ;
	fullDetails += "\n Level: " + Level  ;
	fullDetails += "\n UserName: " + UserName ;
	fullDetails += "\n Password: " + Password;
	return fullDetails;
}
public String getShortDetails() {
    return String.format("CN %d (%s%s%s) has overall score %d",
            CompetitorNumber,
            Character.toUpperCase(UserName.charAt(0)),
            Character.toUpperCase(UserName.charAt(1)),
            Character.toUpperCase(UserName.charAt(2)),
           (int) getOverallScore()
    );
}

public byte[] getIndividualScores() {
    return individualScores;
}

public String getCategory() {
    return Category;
}

public String getEmail() {
    return Email;
}

public String getLevel() {
    return Level;
}

public String getUserName() {
    return UserName;
}

public String getPassword() {
    return Password;
}

public void setIndividualScores(int[] scores) {
	if (scores.length == individualScores.length) {
		System.arraycopy(scores, 0, individualScores,0,scores.length);
	}else {
		System.out.println("Invalid number of scores provided");
		
	}
	
}
// set methods
public void setDateOfBirth(String dateOfBirth) {
    DateOfBirth = dateOfBirth;
}

public void setCompetitionNumber(int competitionNumber) {
    CompetitionNumber = competitionNumber;
}

public void setCompetitorNumber(int competitorNumber) {
    CompetitorNumber = competitorNumber;
}

public void setAge(int age) {
    Age = age;
}

public void setCategory(String category) {
    Category = category;
}

public void setEmail(String email) {
    Email = email;
}

public void setLevel(String level) {
    Level = level;
}

public void setUserName(String userName) {
    UserName = userName;
}

public void setPassword(String password) {
    Password = password;
}


	public int calculateOverallScore() {
	    // Your calculation logic goes here
	    return 0; // Replace 0 with your calculated overall score
}

	public static Competitor getCompetitorWithHighestScore() {
		// TODO Auto-generated method stub
		return null;
	}




public String toString() {
    return "Competitor{" +
            "name='" + UserName + '\'' +
            ", birthDate=" + DateOfBirth +
            
            ", category=" + Category +
            ", email='" + Email + '\'' +
            ", competitorNumber=" + CompetitorNumber +
            ", username='" + UserName + '\'' +
            ", password='" + Password + '\'' +
            ", scores=" + Arrays.toString(individualScores) +
            '}';
}
public void setOverAllScore(int i) {
	// TODO Auto-generated method stub
	
}
}
