# Java

Status: In progress

- If you want to `Do` something, you need `method`
- System.out.print("GM Iqbal");
- JVM looks for `Public Static void main` to start compiling
- File.class is the byte file
- terminal> `java class_name`
- `println` print in new line
- Data Type
    - Primitive
        - Integer
            - int - 4 byte -
            - long - 8 byte -
            - short - 2 byte
            - byte - 1 byte - -128 to 127
        - Float
            - float - 4 byte
            - double - 8 byte (default)
        - Charater
            - char - 2 bytes
        - Boolean
            - True or False
- Type conversion and casting (mentioning explicitly the type name)
- Post-increment `num++` Pre-increment `++num` . They give different result while fetching/returning value
- Comparison:
    - >, <, ==, ! = , ≤ , ≥
- Logical Operators
    - &&
    - ||
    - !
- Conditional Statements
- Ternery operator ?:
    - result = n%2==0 ? 10 : 20;
    - if n is even print result as 10; If odd print 20
- Switch operator
    - if switch operator finds a match, it will run the rest whole other cases if there are no breaks;
    - if nothing matches, there is a default case.
    
    ```java
    int n=1
    
    swith(n){
    		case 1:
    			System.out.println("Hi");
    			break;
    		case 2:
    			System.out.println("Hola");
    			break;
    		case 3:
    			System.out.println("Hello");
    			break;
    		default:
    			System.out.println("Halloww"); 
    }
    ```
    
- Loops
    - while: will run until the condition is true
    - do while: will run at least once even if the condition is false
    - for
- Object Oriented Programming

```java
class classname
    public type_of_return behaviour()
    {
        Method
    }

//example one
		public void playMusic()
    {

    }
//example two
    public String getMeaPen(int cost)
    {
        return "pen";
    }

```

- `Method overloading` : We can have methods having same name. but their parameters need to be different on the basis of parameter numbers or their types.
- JVM has stack memory that works in LIFO way.
- Heap memory
- Enhanced for loop:

```java
for (type variable : iterable) {
   // body of the loop
}
```

- `string constant pool` : Same string is not created multiple times. but they can be referred as different variable names;
- Immutable string - Object
- Mutable string
    - String Buffer:
    - String . . . . .
- Static block is used
- Everytime you create the object:
    - first the class loads; only once.
    - then objects are instantiated.
- every time you load a class, it will call the static class;
- everytime you create a instance variable; make it private
- Getters and setters can be done from IDE’s context menu > Source Action

---

- Class is like a form or template which is used to generate multiple similar instances that are called object.
- Constructor
    - a special method
    - no need to call; gets called automatic
    - doesn't have return type
    - have exact same name as class
    - can be default or have parameters
- Constructor types
    - Default: doesn’t have any parameters
    - Parameterized: have parameters
- Constructor vs Method

| Constructor | Method |
| --- | --- |
| Special method that is called automatically when an object is created | Normal method that is called explicitly |
| Must have the same name as the class | Can have any name (except for reserved keywords) |
| No return type specified in the method signature | Return type specified in the method signature |
| Used to initialize the object's state | Used to perform some action or compute some value |
| Cannot be called directly using the object reference | Must be called explicitly using the object reference |
| Cannot be inherited or overridden | Can be inherited and overridden |
| Can be overloaded by having multiple constructors with different parameter lists | Can be overloaded by having multiple methods with the same name and different parameter lists |
- Static keyword is used to save memory; It’s not related to object. It’s related to class;

Here, all student of IEM 16 have different name and id but same university name. So, saving it seperately for every student is memory consuming. Rather if universityName is made `static` then it will refer to the same universityName for all the students resulting in memory savings.

```java
class Student{
	String name;
	int id;
	static String universityName = "KUET";
```

- Static variable ব্যবহার করার জন্য object তৈরি করা লাগে না। এটা ক্লাসের সাথে সম্পর্কিত। তাই সরাসরি `className.staticVariable` দিয়ে ইউস করা যাবে

```java
class student {
    String name;
    int id;
    static String universityName = "KUET";
}

System.out.println(student.universityName);
```

- Static method have two restrictions:
    - static method can't use non static member/variables but non-static can use static members
    - "this" and "super" keywords can't be used
- Variable Types
    - Local
        - declared inside method, constructor or in a block
    - Instance Variable
        - declared inside the class; but outside of any method;
        - they are not declared as static
    - Static
        - have “static” before them
- `Variable Arguments` : variable-length arguments with the **`int...`** syntax. This means that the method can accept any number of integer arguments separated by commas. The method then can be iterated through the arguments using a **`for-each`** loop to do things.
- Recursion:
    - Recursive call: calling a function inside it
    - Base case: the condition used to stop it for looping infinitely
- Method overriding:
    - declaring a method in subclass which is already  present in superclass
    - method signature (name, parameter, return type) needs to be same
    - if a method is not inherited, then it can not be overridden
    - Static method can’t be overridden as it is bound to class. whereas method is bound to object
    - main method can’t be overridden as it’s also static method
    - static and final ei duita keyword use kora jaabe na override e
- 
    
    
    | Recursion | Iteration |
    | --- | --- |
    | Use selection structure (if, else, switch…) | Use repetition structure (for , while ,do while) |
    | Terminates when base case is satisfied. | Terminates when continuation condition fails. |
    | It’s slow. | It’s fast. |
    | Code is smaller. | Code is bigger. |
- Super Keyword
    - used to refer immediate super class object
    - to call super class instance variable
    - to call super class method (overridden method)
    - to call super class constructor
- This keyword
    - used to refer current class object
    - refer current class instance variable
    - can be used to call current class constructor
- Final keyword
    - final fixes the value of the variable
    - if the variable is not fixed then it’s called blank final variable;
    which can be initialized by constructor;
    - Static blank final variables need to initialized by static block;
- Modifiers
    - Access Modifier:
        1. Private
        2. default
        3. protected
        4. public
    1. Nonaccess Modifiers
        1. Static
        2. Abstract
        3. Volatile
        4. etc
- OOP:
    1. Encapsulation:
        1. In a real life capsule the contents are kept together in a package and protected manner.
        2. Two types
            1. Variables and method are kept into a single unit. Like having variables and methods in a class.
            2. Protecting data by declaring them as private. They can be accessed by setters and getters with public methods.
        3. Provides data hiding, reusability, can be modified without breaking the code. Easy Maintenance.
    2. Inheritance:
        1. the process where one class acquires the properties of another class.
        2. to reuse and save time and implement parent-child relation
        3. Use `extends` keyword
        4. Get everything from another class in a new class;
        5. class child extends parent;
        here child class is also called child class, sub class, derived class
        here parent class is also called parent class, super class, base class
        6. `instanceof` basically asks a object “ei class ki tor baap / purbopurush kina?” to idenfy the objects class or inhertance
        7. Types
            1. Single
            one subclass inherits one super class
            2. Multilevel
            Super class for one is subclass for other
            3. Hierarchical
            Multiple subclass derived from single superclass
            4. Multiple
            Ekta subclass jodi dui ta ke eksathe inherit korte chay
            kintu eta java support kore na
    3. Polymorphism:
    is a mechanism where a parent class reference variable can take many forms ( it can refer object from different class)
        1. Types
            1. Compile time polymorphism/ static binding:
                1. Method overloading: different methods with different parameters
                2. Constructor overloading: 
            2. Run time polymorphism / dynamic binding: 
                1. Method overriding: inherited subclass having same method signature with @override annotation
    4. Abstraction
    is the process of hiding the implementation details and showing only the functionality to the user.
    Eg: You press ‘withdraw’ at atm and get money; But you don’t know the process of withdrawl.
        1. Can be achieved in two ways
            1. Abstract class (0-100%)
                1. abstract class have `abstract` keyword before it. 
                2. It doesn’t have any body.
                3. it ends with semicolon
                4. parameter may or 
                5. it must be in abstract class. 
                6. it must be overridden.
                7. never be final and static
                8. can’t be instantiated
                9. if an abstract class is extended, all the abstract methods are to be overridden or the new class needs to be abstract as well.
                10. Abstract class can have abstract and nonabstract method.
                11. Nonabstract class can’t have abstract method
                12. Abstract class can’t have objects; but can be referenced with variable (super class reference)
            2. Interface (100%)
            is a collection of abstract methods
                1. for fully abstraction 100%
                2. supports multiple inheritance
                3. `interface` keyword
                4. automatically add `public abstract void` before the methods. because interface is 100% abstract
                5. automatically the variables are `public static final` so the variables are constant. instance variable can’t be declared.
                6. Methods in interface are implicitly public.
                7. A class can inherit from just one superclass, but can implement multiple interfaces!
                8. Class extends Class
                Interface extends Interface
                Class implements Interface
- Package
is a group of related classes , interfaces and subpackages;
    - 2 types
        - Built-in
            - java (Package)
            (subpackages below)
                - io - read write (class)
                - lang -  math, string, buffer
                - net - url socket
                - util - scanner , array, array list, random
                - awt - button, image, label, menu
                - applet - applet
        - User defined
            - defined by the user
            - import user_defined.*
- Casting
    - Type casting
    converting one data type to another
        - Implicit type casting
            - Widening
            byte —> short —> int —> long —> float —> double
            the previous ones can be casted to the later ones as they have higher capacity
        - Explicit type casting
            - Narrowing
            - Double —>float —>long —> int —> short —> byte
            - Boro theke choto kora
    - Object type casting
        - Upcasting
        - Downcasting
- Exception is run time error.
    - Arithmetic exception
    can’t divide a number by zero
    - Null pointer exception
    printing character of empty string
    - String Index out of bounds exception
    printing string index that is higher than the actual string index
    - Number format exception
    converting string to int
    - File not found exception
    if file is not found
    - Array index out of bounds exception
    - Class not found exception
    - IO exception
    - Method not found exception
    - 
    
    ![Untitled](Java%20a30fe2c0c5234f69a3c55703490c7b03/Untitled.png)
    
- Exception handling
powerful mechanism to handle runtime errors.
    - keywords
        - try
        - catch
        - finally
        - throw
        - throws

[Java Hierarchies](Java%20a30fe2c0c5234f69a3c55703490c7b03/Java%20Hierarchies%207fbfcbd20911454089deefb8711c8772.md)