**Author:** Naga Venkata Dharani Chinta

**ASU ID:** 1228137224

**Asurite:** nvchinta

### Command Pattern
Command Pattern is one of the Behavioral Design Pattern and it’s used to implement lose coupling in a request-response model. In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object. Command object passes the request to the appropriate method of Receiver to perform the specific action. The client program create the receiver object and then attach it to the Command. Then it creates the invoker object and attach the command object to perform an action. Now when client program executes the action, it’s processed based on the command and receiver object.

### Before you begin

Please follow below steps to execute the program:

**Add 'CommandPattern\src\commandPattern\' folder in to Java Source Path**
```
Right Click on the folder in VSCode and click 'Add Folder to Java Source Path'.
```

Execute the below command in the directory 'CommandPattern\src\commandPattern\'

```
javac Main.java && java Main
```

**Sample output**
```
Drone 1 is moving to (10, 20)
Drone 1 is dropping water
Drone 2 is moving to (55, 65)
Drone 2 is dropping water
```
