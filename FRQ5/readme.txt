SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA.
Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
Unless otherwise noted in the question, assume that parameters in method calls are not null and that methods are called only when their preconditions are satisfied.
In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.
 The following class represents a customer. The variable name represents the name of the customer, and the variable currAccNum represents the customer’s account number. Each time a Customer object is created, the static variable nextAccNum is used to assign the customer’s account number.
public class Customer
{

private static int nextAccNum = 1;
private String name;
private int currAccNum;

public Customer(String n)
{
name = n;
currAccNum = nextAccNum;
nextAccNum++;
}
}


(a)   Write a method for the Customer class that that will return a string representing a bill notice when passed a double value representing an amount due.
For example, if the customer has name "Jeremiah", has account number 3, and has amount due 50.50, the method should return a string in the following format.
Jeremiah, account number 3, please pay $50.50
Write the method below. Your implementation must conform to the example above.
(b)   Write a method for the Customer class that returns the value of the next account number that will be assigned.

(c)   A student has written the following method to be included in the Customer class. The method is intended to update the name of a customer but does not work as intended.
public void updateName(String name)
{
name = name;
}
Write a correct implementation of the updateName method that avoids the error in the student’s implementation.
