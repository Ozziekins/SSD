# SSD Assignment 1

Group 12: Online Private Tutors Finder System

Team members: Daniel Atonge, Magomed Magomedov, Ozioma Okonicha, Marko Pezer

Chosen Pattern: Factory method

### Description

This private tutor system will help to find tuition teachers from nearby locations. Teachers can also get a student just by logging onto the website and setting up the profile. In the personal tutor finder system, there are three entities namely, Admin, Parents, and Tutor. Admin can login, manage tutor by adding new teachers and update their profiles. Admin can also manage E-books by adding new books to the library. Admin can also check for the registered parents. Admin will register tutors and credentials will be shared with tutors by Email. Parents can register and login, tutors can be viewed by parents. Parents can filter and select the tutor and after selecting parents will raise the request of the demo lecture. After attending the lecture, they can book the tutor online, rate the tutor and view the E-Books. The tutor can login by using credentials that will be provided by mail. They can check for the request for a demo lecture and accept the request. They can also check the booking done. They need to set their profile. This private tuition system can help the tutors to get students and parents to find the best tutors for their children

### Introduction

**Factory method** is a creational design pattern that helps creating objects by eliminating the need to state the particular classes. Hence the user does not need to be aware of the inner implementations but simply create objects using the specified interface. This promotes the **loose-coupling** by eliminating the need to bind application-specific classes into the code and also adds flexibility to the code.

#### Reason for the choice

We chose the factory method for two main reasons. Firstly, in a system such as ours where in the long run there would be a need to make use of a large databse depending on the amount of users, it would be useful and more convenient to be able to create users and access previous users from a  method.

Secondly, using this method, the system would be able to in the future add new kinds of users easily (such as )

### UML diagram

For our UML, first we created an enum *UserType* to be able to easily switch case between the three different entity kinds during creation. Then we created a BaseUser abstract class as well as concrete classes (ParentUser, TutorUser, AdminUser) that extend the BaseUser abstract class. A factory class UserFactory is then defined and the TutorFinder with the main driver will pass information (Parent|Tutor|Admin) to UserFactory to get the concrete type of object it needs.

![](/home/ozzie_kins/Downloads/UMLProject12-Final.png)

Altogether,

1. We have **BaseUser** that is the abstract class and has methods common to the three classes that extend it: **ParentUser**, **TutorUser**, **AdminUser**.
2. **AbstractFactory** is the main factory method itself that produces the user object with the return type of the *create* method being of type **BaseUser**.  
3. **ParentUser**, **TutorUser**, **AdminUser** which has the specifics of the three types of users.
4. The class that has the main driver is the **TutorFinder** class.

We have two other classes not related to the pattern, but mentioned in the description that we chose to include. The first is the Lecture class that contains information about a single lecture to be created. Second is Library which contains an array of book; where books are stored by their names as strings.

### Implementation

We implemented the structure illustrated by our UML diagram in java programming language.