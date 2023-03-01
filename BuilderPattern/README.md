**Author:** Vignesh V Iyer

**ASU ID:** 1227792802

**Asurite:** viyer10

### Observer Pattern
The builder pattern is used to provide a flexible solution to various object creation problems in object oriented programming. The intent of builder pattern is to separate the construction of a complex object from its representation.[[3]](https://en.wikipedia.org/wiki/Builder_pattern)
In the context of this application, we are considering UAVs to have multiple types and all the different types of UAV may have different sets of attributes available when we create its object. Therefore it requires us to provide a separate class for constructing the UAV objects with whatever attributes we have available for that particular UAV.
Here the UAV class has a UAVbuilder class which provides the flexibility to the clients to specify whatever attributes they have to create a UAV object.


### Before you begin

Please follow below steps to execute the program:

Execute this command in the directory 'BuilderPattern/src'

`javac main.java`
`java main`

**Sample output**
View main.java