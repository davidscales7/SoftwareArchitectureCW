package cw;
import java.io.*;
import java.util.*;


public class Staff 

{
	private int PersonsID;
	private int StaffNumber;
	private String UserName;
	private String Password;
	private String StaffPosition;

public Staff (int PID, int StaffNumbers,String UserNames ,String Passwords ,String Positions)
{
	PersonsID = PID;
	StaffNumber = StaffNumbers;
	UserName = UserNames;
	Password = Passwords;
	StaffPosition = Positions;
}
public int getPersonsID() {
    return PersonsID;
}

public int getStaffNumber() {
    return StaffNumber;
}

public String getUserName() {
    return UserName;
}

public String getPassword() {
    return Password;
}

public String getStaffPosition() {
    return StaffPosition;
}

// Setter methods
public void setPersonsID(int personsID) {
    PersonsID = personsID;
}

public void setStaffNumber(int staffNumber) {
    StaffNumber = staffNumber;
}

public void setUserName(String userName) {
    UserName = userName;
}

public void setPassword(String password) {
    Password = password;
}

public void setStaffPosition(String staffPosition) {
    StaffPosition = staffPosition;
}

}
