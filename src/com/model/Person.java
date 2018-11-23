package com.model;

import java.io.Serializable;  
import java.text.DateFormat;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.util.Date;  
import java.util.GregorianCalendar;  
  
  
public class Person implements Serializable  
{  
    private String name;  // The name of the user  
    private byte age;  // The age of the user  
    private String dateOfBirth; // The date of birth of the user  
    private Calendar birthday; // The birthday of the user  
    private DateFormat birthdateFormat; // The format of the birth date  
    private Date birthdate; // The dateOfBirth in a Date format  
    private Calendar todaysDate;  // Todays date  
       
    // Initialise any variables with default values  
    public Person()  
    {  
        name = "";  
        age = 0;       
        birthday = GregorianCalendar.getInstance();  
        birthdateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        dateOfBirth = birthdateFormat.format(new Date());  
        birthdate = new Date();  
        todaysDate = GregorianCalendar.getInstance();  
    }  
  
    // The Getter method for the name  
    public String getName()   
    {  
        return name;  
    }  
  
    // The Setter method for the name  
    public void setName(String name)   
    {  
        this.name = name;  
    }  
  
    // The Getter method for the age  
    public int getAge()   
    {      
        // Call the method to calculate the age before returning it  
        calculateAge();  
      
        return age;  
    }  
  
    // The Setter method for the date of birth  
    public void setDateOfBirth(String dateOfBirth)   
    {  
        this.dateOfBirth = dateOfBirth;  
    }  
    
    // The method that calculates the user's age from their date of birth  
    private void calculateAge()  
    {   
        try   
        {  
           // Convert the user supplied date of birth String to a Date in the specified format  
           birthdate = birthdateFormat.parse(dateOfBirth);  
      
           // Cast the Date value to a Calendar to allow easier use  
           birthday.setTime(birthdate);  
        }
   
        catch (ParseException ex)   
        {  
           System.out.println("Parse Exception when parsing the dateOfBirth");  
        }  
  
        // Calculate the age  
        age = (byte)(todaysDate.get(Calendar.YEAR) - birthday.get(Calendar.YEAR));  
      
        // Get the date of the user's birthday this year  
        birthday.add(Calendar.YEAR, age);  
      
        // Check if the user's birthday has passed this year  
        if (todaysDate.before(birthday))  
        {  
           // Reduce the age by one if it hasn't  
           age --;  
        }  
    }  
}  
