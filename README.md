<h2> Object-Oriented Data Structure Using Java, 4th Edition </h2>

<h4>Patricia Antlitz - NECC 2022</h4>

<h3> Chapter 1 - Problem 36 </h3>

Write a program that declares a 10 element array of Date, uses a loop to initialize the elements to December 1 through 10 of 2005, and then uses another loop to print the contents of the arrays, one date per line.

This program use's the book file Date.java as requested by Professor Penta.
<hr>
<h3>Problems:</h3>

I tried to use all existing methods, but I could not find a useful way to use method lilian();
It would not make sense to use it.

No library was used for the date, since .Date has been deprecated (and if I am not mistaken we were told to create our own).

<hr>
<h3>Structure:</h3>
All other methods there were present on Date.java are present on this file.

* The class was named Date_PatriciaAntlitz.java. This class contains the main method, but is an extention of Data.java<br>
* Date.java file is an exact copy of the Date class from the book<br>
* An array of Date_PatriciaAntlitz was created.<br> 
* The class constructor passes the parameters of the super class constructor, but reassigns the value o year to 2005
* The object Date_PatriciaAntlitz was passed with parameter values 12, 1, 2005. MINYEAR wis not used.
<br>
* These values passed to the object are assigned to variables month, year, day.<br>
* Both loops are inside a new method called addToArray();, present in Data_PatriciaAntlitz<br>
* Inside the loop the array is created with the values that come from the getter classes. + i was added to the day to increment the count.<br>

<hr>
<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Date_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory /......Date_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Date_PatriciaAntlitz.java => compile
    * java Date_PatriciaAntlitz.java => run
    
<hr>
