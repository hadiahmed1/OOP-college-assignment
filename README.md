# OOP-college-assignment
1. Create a class called Person which contains methods to show the biodata of a person. Create
different objects of that class.

Name :Hadi
Age :21
Profession :Student
Gender :Male
Name :Ann
Age :35
Profession :Poet
Gender :Female

2. Create a class called Box which contains a method to display the volume of a Box object.
Use overloaded constructors for initializing the box. Create different Box class objects to
test the constructors inside a different class called Demo.

b1's area:-1.0
b2's area:125.0
b3's area:60.0

3. Create a class called Matrix. Write appropriate accessor and mutator methods for the
Matrix objects. Use both Random class and random() method to populate different
matrices. Write methods for matrix multiplication, matrix addition and matrix transpose
inside Matrix class. Test Matrix class from another class MatDemo.

Printing Matrix:
2  1  0  
2  8  9  
9  5  4  
Printing Matrix:
0  4  1  
4  4  4  
0  4  6  
Multipluing:
Printing Matrix:
4  12  6  
32  76  88  
20  72  53  
Addition:
Printing Matrix:
2  5  1  
6  12  13  
9  9  10  
Transpose:
Printing Matrix:
2  2  9  
1  8  5  
0  9  4  

4. Create a class Stack for stacking different data types using Object class. Write appropriate
constructor, push and pop methods for the Stack. Test the Stack class from another class.

Stack is full. Cannot push 3
7 is Popped
4 is Popped
1 is Popped
6 is Popped
5 is Popped
Stack is Empty. Cannot pop 
null is Popped

Stack is full. Cannot push 3.9
7.5 is Popped
2.4 is Popped
1.4 is Popped
7.6 is Popped
5.7 is Popped
Stack is Empty. Cannot pop 
null is Popped

Stack is full. Cannot push nop
Stack is full. Cannot push uvw
klm is Popped
ghi is Popped
xyz is Popped
def is Popped
abc is Popped
Stack is Empty. Cannot pop 
null is Popped

5. Create a class called Point which will have 2 co-ordinate values x & y and will be able to
calculate the distance between two points. Write appropriate constructors and methods of the
class. Create an abstract class called Shape, which contains abstract methods for area(),
perimeter(), colour() and compareShape(Shape ob). Create the derived class Triangle,
Rectangle and Circle. Write the appropriate overridden methods for these classes.
[compareShape(Shape ob) checks if area and perimeter are same for two objects and returns
the result[suppose for two Rectangle Objects then return “Matching Rectangles” otherwise
return “Non matching Rectangle”]. Test your code using dynamic method dispatch.

Triangle:
Area=6.0
Perimeter=12.0

Circle:
Area=28.274333882308138
Perimeter=18.84955592153876

Rectangle
Area=20.0
Perimeter=18.0
Comparing1:true
Comparing2:false

6. Define an interface “Queue” which includes two methods enqueue() and dequeue() inside
package adtInterface. Inside another package called service write a class OperatorService
which implements a queue to generate tickets for waiting customers and remove the
customers from the queue after service. Write another class Test inside package myPackage
to test the functionality of the OperatorService class.

Customer1 added to the queue.
Customer2 added to the queue.
Customer3 added to the queue.
Customer1 removed from the queue.
Customer2 removed from the queue.
Customer3 removed from the queue.
Queue is empty.

7. Write a private inner class EvenIterator that will iterate to the even item of the data
structure contained within its enclosing class.

1
3
5
7
9

8. Create an exception class “InvalidInputException” which takes an integer (say -10) and prints:
“InvalidInputException [-10]”. Create a class TestPrime which contains a method isPrime() that
takes an user input and returns true/false testing the given input whether it is prime or not. The
method throws an exception InvaildInputException if inputs are 0, 1 or any negative number. The
said method does not handle the exception. Create another class Test containing the main method to
test the functionality of the TestPrime class.

13 is prime: true
10 is prime: false
InvalidInputException [-5]

9. Write a program, which can run two threads simultaneously. One thread will calculate the
factorial of a number and another thread will calculate the factors of that number. Make sure
the main thread finishes last.

Factorial of 6: 720
Factors of 6: 1 2 3 6 
Main thread finished.

10.Write a program to create three threads with high, low and normal priority. Threads will
increment and display a counter value while they are running. Make sure the main thread
finishes last.

LowPriorityThread: Counter value = 2
NormalPriorityThread: Counter value = 3
HighPriorityThread: Counter value = 2
NormalPriorityThread: Counter value = 4
HighPriorityThread: Counter value = 5
LowPriorityThread: Counter value = 4
NormalPriorityThread: Counter value = 6
HighPriorityThread: Counter value = 7
LowPriorityThread: Counter value = 8
NormalPriorityThread: Counter value = 9
HighPriorityThread: Counter value = 10
LowPriorityThread: Counter value = 11
NormalPriorityThread: Counter value = 12
HighPriorityThread: Counter value = 13
LowPriorityThread: Counter value = 14
Main thread finished.

11.Write classes for implementing two threads Producer and Consumer, which access a shared
integer x. Thread Producer indefinitely produces the value of x by increasing it and
Consumer indefinitely consumes the value of x by printing its value on the console, i.e.
threads run in an infinite loop. Make sure the Producer must not produce the value of x till
Consumer is consuming and Consumer must not consume the same value of x. Write the
appropriate methods for these two classes.

Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
Produced: 6
Consumed: 6
Produced: 7
Consumed: 7
Produced: 8
Consumed: 8
Produced: 9
Consumed: 9
Produced: 10
Consumed: 10
Produced: 11
Consumed: 11
Produced: 12
Consumed: 12
Produced: 13
Consumed: 13
Produced: 14
Consumed: 14
Produced: 15
Consumed: 15
Produced: 16
Consumed: 16
Produced: 17
Consumed: 17
Produced: 18
Consumed: 18
Produced: 19
Consumed: 19
Produced: 20
Consumed: 20
Produced: 21
Consumed: 21
Produced: 22
Consumed: 22
Produced: 23
Consumed: 23
Produced: 24
Consumed: 24
Produced: 25
Consumed: 25
Produced: 26
Consumed: 26
Produced: 27
Consumed: 27
Produced: 28
Consumed: 28
Produced: 29
Consumed: 29
Produced: 30
Consumed: 30
Produced: 31
Consumed: 31
Produced: 32
Consumed: 32
Produced: 33
Consumed: 33
Produced: 34
Consumed: 34
Produced: 35
Consumed: 35
Produced: 36
Consumed: 36
Produced: 37
Consumed: 37
Produced: 38
Consumed: 38
Produced: 39
Consumed: 39
Produced: 40
Consumed: 40
Produced: 41
Consumed: 41
Produced: 42
Consumed: 42
Produced: 43
Consumed: 43
Produced: 44
.
.
.