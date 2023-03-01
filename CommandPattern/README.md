**Author:** Naga Venkata Dharani Chinta

**ASU ID:** 1228137224

**Asurite:** nvchinta

### Command Pattern
Command Pattern is one of the Behavioral Design Pattern and it’s used to implement lose coupling in a request-response model. In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object. Command object passes the request to the appropriate method of Receiver to perform the specific action. The client program create the receiver object and then attach it to the Command. Then it creates the invoker object and attach the command object to perform an action. Now when client program executes the action, it’s processed based on the command and receiver object.