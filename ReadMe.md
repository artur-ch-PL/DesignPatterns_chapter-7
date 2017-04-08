#Adapter pattern, Facade pattern

Facade
=
- Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interfaces that makes the subsystem  easier to use.
- Implementing a facade requires that we compose the facade with its subsystem and use delegation to perform the work of the facade
- You could implement more then one facade for a subsystem


Adapter
=
- Converts the interface of a class into another interface clients expect. Lets classes work together that couldn't otherwise because of incompatible interfaces.
- Implementing an adapter may require little work or a great deal of work, depending on the size and complexity of the target interface.
- There are two forms of the Adapter Pattern: object and class adapters. Class adapters require multiple inheritance (not possible in JAVA)
- An adapter wraps an object to change its interface, a decorator wraps an object to add new behaviors and responsibilities and a facade "wraps" a set of objects to simplify


Differences
=
- A facade not only simplifies an interface, it decouples a client from a subsystem of components
- Facades and adapters may wrap multiple classes, but a facade's intent is to simplify, while an adapter's is to convert the interface to do something different.

 

OO Principle
=
Only talk to your friends (Demeter law)

