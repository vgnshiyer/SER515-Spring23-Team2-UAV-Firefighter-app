**Author:** Sri Harsha Gajavalli

**ASU ID:** 1225891175

**Asurite:** sgajaval

### Adapter Pattern
Adapter pattern is a design pattern that allows objects with incompatible interfaces to work together by creating a wrapper (adapter) that translates one interface to another. It is used to convert the interface of a class into another interface that the client expects. This pattern is particularly useful when you want to reuse existing code without modifying it or when you have to work with a legacy system that has an incompatible interface.

### Before you begin

Please follow below steps to execute the program:

Execute this command in the directory 'ObserverPattern/src'

`javac main.java`
`java main`

**Sample output**
```
Enter 0 to enter into Admin interface
Enter 1 to control drone as Operator
Enter 2 to control drone as Pilot

Output for 0: Admin UI
Click here to create mission
Click here to select mission 1
Click here to select mission 2
Click here to select mission 3
Click here to select mission 4

Output for 1: Operator UI
Click here to control drone
Click here to refill supplies
Click here to view map

Output for 2: Pilot UI
Click here to control drone
Click here to drop retardants");
Click here to return to meet
```