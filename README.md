# Low-Level-System-Design

Most codes are from the book Head first design patterns (Eric Freeman & Elisabeth Robson)
But I rewrote them for practice

## Object-Oriented Principles
- Encapsulate what varies
- Favor composition over inheritance
- Program to interface, not implementations.
- Strive for loosely coupled designs between objects that interact.
- Classes should be open for extension, but closed for modification.

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
- step 2 used interface and so we have to override every method. Now in step 3, I used abstract class to which i gave some default implementations for each actions for State. I will only override those necessary methods in the state rather than again implementing all the methods.
  - this reduces the code duplication especially if the application is big enough and there are alot of states.

## Proxy Pattern (Gumball Machine but accessing from remote)
- step 1 is just a very bad implementation of calling the gumball machine that is present in the same jvm (terminal). and so they are accessing the same heap objects.
  - Execute in terminal because it needs two arguments. Location, initial count of gumballs
    - `ashok@Mac Low-Level-System-Design % cd src/main/java/org/example/proxyPattern.step1_gumballmonitor
        ashok@Mac step1_gumballmonitor % java GumballMachineTestDrive.java Newyork 12`
  