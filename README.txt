Exception Handling in Java 

In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.


Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.


Keyword	Description
try	The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone.
	The try block must be followed by either catch or finally.

catch	The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. 
	It can be followed by finally block later.

finally	The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.

throw	The "throw" keyword is used to throw an exception.

throws	The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. 
	It is always used with method signature.


The Above Java program demonstrates the use of Nested try and catch block in java.



