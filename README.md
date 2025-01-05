# My JAVA programs
For Self Reference purpose,

This repository is to contain my java programs as I learn this language forward.

# Basics
Create a file with .java extension
Open the file, the main class name is the same name as file.

If the file name is *farhan.java* then the main class is *farhan*

In the main class, the main method is defined as
`public static void main(String[] args)`

The type for main method is always *void*. _args_ is string array holding all command-line arguments (possibly, haven't tested it out yet).

Two type of methods exist in Java
1. public
2. private

public methods can be accessed through class instances (Objects)
private methods cannot be accessed through class instances

private methods are useful when developers would like to execute a certain code within the class and don't want it to be accessed outside the class through class instances manually.

Rest of the syntax is a similar to that of C language.

To create a class object, say you created a class calculator with four public methods (sum, dif, product, div)
you first create a variable of the class type and then create a class instance with *new* keyword.
It would look like this...
`calculator calc_object = new calculator();`

Here _calculator_ is used as datatype for object **calc_object**
