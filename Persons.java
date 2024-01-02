package cw;
import java.io.*;
import java.util.*;

public class Persons {
	private int PersonsID;
	private String FirstName;
	private String LastName;
	private String UserName;
	private String Password;
	private String Email;
public Persons(int PID,String Fn, String Ln,String Un, String PW,String Em) 
{
	PersonsID = PID;
	FirstName = Fn;
	LastName = Ln;
	UserName = Un;
	Password = PW;
	Email = Em;
	}
// get methods
 public int getPersonsID() {
	 return PersonsID;
 }
 public String getFirstName() {
	 return FirstName;
	 }
 public String getLastName() {
	 return LastName;
 }
 
 public String getUserName() {
	 return UserName;
 }
 public String getPassword() {
	return Password;
}
public String getEmail() {
	return Email;
}

// set methods



 public void setPersonsID(int personsID) {
	 PersonsID = personsID; 
	 }
 
 public void SetFirstName(String firstName) {
	 FirstName = firstName;
 }
 public void setLastName(String lastName) {
	 LastName = lastName;
	 
 }
 
 public void setUserName(String userName) {
	 UserName = userName;
 }
 
 public void password(String password) {
	 Password = password;
 }
}

