Sealed classes
---
Sealed classes, first introduced in Java 15, provide a mechanism to determine which sub-classes are allowed to extend or implement a parent class or interface.

Let’s illustrate this by defining an interface and two implementing classes:

>public sealed interface JungleAnimal permits Monkey, Snake  {
}\
public final class Monkey implements JungleAnimal {
}\
public non-sealed class Snake implements JungleAnimal {
}

The sealed keyword is used in conjunction with the permits keyword to determine exactly which classes are allowed to implement this interface. In our example, this is Monkey and Snake.
All inheriting classes of a sealed class must be marked with one of the following:

* sealed – meaning they must define what classes are permitted to inherit from it using the permits keyword.
* final – preventing any further subclasses
* non-sealed – allowing any class to be able to inherit from it.

A significant benefit of sealed classes is that they allow for exhaustive pattern matching checking without the need for a catch for all non-covered cases. For example, using our defined classes, we can have logic to cover all possible subclasses of JungleAnimal:

>JungleAnimal j = // some JungleAnimal instance\
if (j instanceof Monkey m) {\
// do logic\
} else if (j instanceof Snake s) {\
// do logic\
}

We don’t need an else block as the sealed classes only allow the two possible subtypes of Monkey and Snake.