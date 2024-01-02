package cw;
import java.io.*;
import java.util.*;


public class Competitor {
	private Date DateOfBirth;  
	private int CompetitionNumber ;
	private int CompetitorNumber;
	private int Age;
	private String Category;
	private String Email;
	private int Level;
	private String UserName;
	private String Password;
	
public Competitor (Date DOB, int CompetitionN, int CompetitorN,int age, String cat,String Em,int Lev,String Un,String Pw)
{
	DateOfBirth = DOB;
	CompetitionNumber = CompetitionN;
	CompetitorNumber = CompetitorN;
	Age = age;
	Category = cat;
	Email = Em;
	Level = Lev;
	UserName = Un;
	Password = Pw;
	}

//get methods
public Date getDateOfBirth() {
	return DateOfBirth;
	}
public int getCompetitionNumber() {
	return CompetitionNumber;
	}

public int getCompetitorNumber() {
	return CompetitorNumber;
	}
public int getAge() {
    return Age;
}
public double getOverallScore() { return 5; }
getfulldetails.append(// all the score)
}
getShortdetails.append(//only competitor number, initials and overall score)
		// looks exactly like CN100(KJT) has overall score 5.
public String getCategory() {
    return Category;
}

public String getEmail() {
    return Email;
}

public int getLevel() {
    return Level;
}

public String getUserName() {
    return UserName;
}

public String getPassword() {
    return Password;
}


// set methods
public void setDateOfBirth(Date dateOfBirth) {
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

public void setLevel(int level) {
    Level = level;
}

public void setUserName(String userName) {
    UserName = userName;
}

public void setPassword(String password) {
    Password = password;
}



}

