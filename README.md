# OOP-college-assignment
1. Create a class called Person which contains methods to show the biodata of a person. Create
different objects of that class.
2. Create a class called Box which contains a method to display the volume of a Box object.
Use overloaded constructors for initializing the box. Create different Box class objects to
test the constructors inside a different class called Demo.
3. Create a class called Matrix. Write appropriate accessor and mutator methods for the
Matrix objects. Use both Random class and random() method to populate different
matrices. Write methods for matrix multiplication, matrix addition and matrix transpose
inside Matrix class. Test Matrix class from another class MatDemo.
4. Create a class Stack for stacking different data types using Object class. Write appropriate
constructor, push and pop methods for the Stack. Test the Stack class from another class.
5. Create a class called Point which will have 2 co-ordinate values x & y and will be able to
calculate the distance between two points. Write appropriate constructors and methods of the
class. Create an abstract class called Shape, which contains abstract methods for area(),
perimeter(), colour() and compareShape(Shape ob). Create the derived class Triangle,
Rectangle and Circle. Write the appropriate overridden methods for these classes.
[compareShape(Shape ob) checks if area and perimeter are same for two objects and returns
the result[suppose for two Rectangle Objects then return “Matching Rectangles” otherwise
return “Non matching Rectangle”]. Test your code using dynamic method dispatch.
6. Define an interface “Queue” which includes two methods enqueue() and dequeue() inside
package adtInterface. Inside another package called service write a class OperatorService
which implements a queue to generate tickets for waiting customers and remove the
customers from the queue after service. Write another class Test inside package myPackage
to test the functionality of the OperatorService class.
7. Write a private inner class EvenIterator that will iterate to the even item of the data
structure contained within its enclosing class.
8. Create an exception class “InvalidInputException” which takes an integer (say -10) and prints:
“InvalidInputException [-10]”. Create a class TestPrime which contains a method isPrime() that
takes an user input and returns true/false testing the given input whether it is prime or not. The
method throws an exception InvaildInputException if inputs are 0, 1 or any negative number. The
said method does not handle the exception. Create another class Test containing the main method to
test the functionality of the TestPrime class.
9. Write a program, which can run two threads simultaneously. One thread will calculate the
factorial of a number and another thread will calculate the factors of that number. Make sure
the main thread finishes last.
10.Write a program to create three threads with high, low and normal priority. Threads will
increment and display a counter value while they are running. Make sure the main thread
finishes last.
11.Write classes for implementing two threads Producer and Consumer, which access a shared
integer x. Thread Producer indefinitely produces the value of x by increasing it and
Consumer indefinitely consumes the value of x by printing its value on the console, i.e.
threads run in an infinite loop. Make sure the Producer must not produce the value of x till
Consumer is consuming and Consumer must not consume the same value of x. Write the
appropriate methods for these two classes.
