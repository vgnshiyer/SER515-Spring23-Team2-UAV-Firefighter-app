##### Author: Vignesh V Iyer

**ASU ID:** 1227792802

**Asurite:** viyer10

### Observer Pattern
The observer pattern is a one to many relationship where all the observers of an observable object are notified and updated when the observable object changes its state.[[1]](https://github.com/ajitpal/BookBank/blob/master/%5BO%60Reilly.%20Head%20First%5D%20-%20Head%20First%20Design%20Patterns%20-%20%5BFreeman%5D.pdf)
In the context of this application, we are considering the drone as the observable object which changes its state frequently.(eg. take off, join pack, disband, malfunction, exhausted resources, etc). And for the observers, we create an abstract class ‘Person’ which monitors the state changes of the drone. 
The person class consists of the operator and the pilot who have their own implementation of the update() method.
