# 212
Contains codes that I had to create for my OOP java class, generic linked list class, and generic node class

I will explain to you what each code is suppose to do: 

Circle_vs_Square:
In this code you have two class one is the circle class and the other is the square class. Each class implements the interface Enclosure
which has two abstract methods and one final variable that both the circle class and square class get access to. Then you have the 
shapeDemo which contains the main method where the objects for circle and square are created. In there you create 2 circles and 2 squares 
and compare the two circles together to see if they are the same and do the same for the squares. As well as print out the area and 
perimeter of each object created. 

Create_files:
This code was created to allow you to create files in the C: in a certain folder which i had that was called hello. You can change it to 
whatever location you wish the file to appear in. Then it ask for the extension because this file code doesn't just create .txt files. 
If you do create a .txt file you have the option to input data using this program into that file. If it isn't a .txt file it will just 
create the file and then tell you the file has been created. If the file can not be found then there is a try catch block created to 
tell you that an error has occurred. 

Generic_ArrayList:
This code contains a class that has a generic arraylist and has three methods. One method is to add to the arraylist, the other is to tell 
you the largest number in that list, and the third method tell you the smallest value. In the main I created two objects of this class
one is for Integers and the other is for Doubles. Once you run the code it will tell you the largest and smallest number of the Integer in 
the arraylist and the same goes for the Doubles. 

Generic_Nodes:
This folder contains two node classes one is for nodes and the other is for double nodes. The difference between the two is that one
only connects to the next node(packet of data) and the double node class connects to the previous and to the next node. 

Linked_List_genric:
This is a linked list which has nodes that contain data but have a head and tail to keep track of the linked list. This also has a size 
variable so you can get the size of the linked list. This linked list only has a one way connection so it connects to the next node not the
one before it. 

Ships:
You basically have three different types of ships and each one has there own class and two of the ship classes inherit from one of the ship
classes. In the mmain method called shipDemo you talk about each of the classes and call some of the methods in each class. 

Test_Grades_exceptions:
I created a class that extends the exception class so I could make that classes name the name of the exception I can throw. Then I
created another class that takes in test scores and adds them to an array. If the test scores are greater than 100 and less than 0
then the exception is thrown. I have two methods in this class one that figures out the sum and the other figures out the average of
the test scores. I also have setter and getters for the array. In the testDemo I created two ojects of the testScores class and one 
contains good grades and the other contains bad grades. Then it prints out the average of the bad and good grades. If one of them 
is less than 0 or greater than 100 the exception is thrown. 

