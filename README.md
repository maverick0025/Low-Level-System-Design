# Low-Level-System-Design

Most codes are from the book Head first design patterns (Eric Freeman & Elisabeth Robson)
But I rewrote them for practice

## Object-Oriented Principles
- Encapsulate what varies from what stays the same.
- Favor composition over inheritance
- Program to interface, not implementations.
- Strive for loosely coupled designs between objects that interact.
- Classes should be open for extension, but closed for modification.
- Principle of least knowledge: talk only to your immediate friends. 
- 

## Strategy Pattern (Ducks)
- Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Stragegy lets the algorithm vary independently of clients that use it.
- Refer to page 22 of the book. The image over there paints the whole picture.

## Observer Pattern (Weather Station and displays)
- Defines a one-to-many dependency between objects (subject->observers) so that when one object changes state, all of its dependents are notified and updated automatically.
- Class diagram in page 52. 
- step1 is the basic simple implementation of observer pattern.
- step1_javadefault is, we don't define any observer or observable(subject) interfaces. We make use of java.util.observable, java.util.observer prebuilt packages.
- Checkout the Weather station class diagram in page 57. I used this to write down the step2
  - WeatherData is subject
  - CurrentConditionsDisplay, StatisticsDisplay, etc... are observers
- step2 is, one weather station, and it has multiple displays.
- java.util.Observable and java.util.Observer used in step2_javadefault

## Decorator Pattern (StarBuzz coffee and condiments)
- Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
- Decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the job.
- Check pattern's class diagram on page 91.
- Check page 92 for the actual example's class diagram.
- step1_starbuzz is a real world example of this pattern.
- step2_addSizes is incorporating glass sizes also.

## Singleton Pattern (Chocolate Boiler)
- Ensure a class only has one instance and provide a global point of access to it.
- step1 is the basic implementation of a singleton. Not thread safe
- step2 is the thread safe implementation
- step3 is synchronizing only if instance is null unlike synchronizing everytime getInstance is triggered.
- Step4 is letting the JVM create this singleton class eagerly when the class is loaded itself. This is guaranteed to be threadsafe also.
- Step5 is a real life example
- Step6 is the superior to all above implementations of singletons. Synchronization, Class loading issues, reflection and serialization/deserialization issues all can be solved

## Iterator and Composite Patterns (Restaurants and their menus merging)
- merging 3 restaurants. all use the same MenuItem Class. So that makes things a little easy. If not, need to modify the codebases to maintain decorum
- step 1 is a using custom iterator for both array list and arrays in pancakehouse and diner menu respectively
- step 2 is to use the inbuilt iterator for arraylist (pancakehouse) and custom iterator for array(diner menu)
- step 3 is to merge cafe restaurant
- step 4 (solely composite pattern) is to make changes to ensure we can have submenus inside menus classes. So, here, we shall Make every restaurant reimplement their Menu classes. So that we can accomodate future acquisitions and submenus. 
  - should be able to traverse in a tree like fashion in menus ans submenus.
  - need to traverse items in a more flexible manner. migh need to iterate over only he Diner's dessert menu, or we might need to iterate over the Diner's entire menu, includign the dessert submenu.

## State Pattern (Gumball Machine)
- step 1 is just a very bad normal implementation
- step 2 is we modify our step 1 implementation adhering to state pattern
- step 2 used interface, and so we have to override every method. Now in step 3, I used abstract class to which i gave some default implementations for each actions for State. I will only override those necessary methods in the state rather than again implementing all the methods.
  - this reduces the code duplication especially if the application is big enough and there are alot of states.

## Proxy Pattern (Gumball Machine but accessing from remote)
- Provide surrogate or placeholder for another object to control access to it.
- Step 1 is just a very bad implementation of calling the gumball machine that is present in the same jvm (terminal). and so they are accessing the same heap objects.
  - Execute in terminal because it needs two arguments. Location, initial count of gumballs
    - `ashok@Mac Low-Level-System-Design % cd src/main/java/org/example/proxyPattern/step1_gumballmonitor`
    - `ashok@Mac step1_gumballmonitor % java GumballMachineTestDrive.java Newyork 12`
- Step2 is implementing the rmi registry to call reports on gumball machines present at different location in the world from a single remote computer.
  - remote interface : GumballMachineRemote
  - remote service : GumballMachine (service), GumballMachineTestDrive (implementation)
  - client : GumballRemote (class), GumballMonitorTestDrive (implementation) 
  - Actual execution: Need three terminals.(rmiregistry, service in a jvm, client aka monitor in a separate jvm)
    1. Perform maven clean and then do maven compile if made any changes to the existing classes
    2. In terminal 1, navigate to `/Users/ashok/Documents/System Design/Low-Level-System-Design/target/classes` and start rmiregistry using the command `rmiregistry &`
    3. In terminal 2, get to `/Users/ashok/Documents/System Design/Low-Level-System-Design/` (from where you will have access to target directory) and run the following command `java -cp target/classes org.example.proxyPattern.step2_gumballWithProxy.GumballMachineTestDrive localhost 25`. Here, localhost is the location and 25 is the gumball count. 
    4. In terminal 3, get to `/Users/ashok/Documents/System Design/Low-Level-System-Design/` and we can run the monitor class using the following command `java -cp target/classes org.example.proxyPattern.step2_gumballWithProxy.GumballMonitorTestDrive`
- Step3 is virtual proxy
- Step 4 is using Protection proxy. I don't create this proxy. I wil use Java's default proxy to design my own protection proxy.
  - It's like an agent handling business on behalf of a client when other's approach the client.

## Compound Pattern
- We start with a basic implementation and when a new use case comes, we add a new design pattern accordingly.
- Step 1: Simple basic Ducks simulator using an interface to quack
- Step 2: Adapter Pattern
  - We have a goose that honks instead of quacking. So we adapt goose's interface to implement Duck's Quackable
  - A new GooseAdapter (adapt goose to duck) for goose so than I shall just use quack() method from duck's Quackable interface.
- Step 3: Decorator Pattern
  - In this we will calculate all the quacks recorded. Only quacks. Not honks
- Step 4: Factory Pattern
  - Duck factory. At the moment there is only one type of goose so just added this into the duck factory also. In future, if there are more than one type of goose, need to add a new factory.
- Step 5: Composite pattern
  - We have a lot of ducks. now let's create a flock of them and use them as a flock iteratively.
  - flock of few ducks or combination of them.
- Step 6: Observer Pattern
  - No flock in this case. we shall register observers for individual ducks. step 7 we shall register them for a flock.
  - Only one observer (observer_quackologist) is registered at the moment.

## Adapter Pattern
 - Converts an interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 - step1 is all about Object adapter. pic on page 246. We use composition to pass requests to the Adaptee.
 - Other type is Class adapter and it includes multiple inheritance technique and is not applicable in Java.
 - step2 is, old collections like Hashtables, vector uses enumeration to loop through an object but newly, it's all about iterators.

## Facade Pattern
- Provides a unified interface to a set of interfaces in a subsystem.
- Facade defines a higher level interface that makes the subsystem easier to use while the client can still use the subsystems individually. So, it's not an abstraction and only a way to simplify set of tasks with a few simpler methods.

## Factory Pattern
- step 1: a common misconception of factory pattern. looks like factory pattern but it is not. It's a programmign Idiom
- 
