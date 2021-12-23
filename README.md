# Java_oops-session_concept/topic
- **Classes and Onject**
- **Inheritance and Polymorphism**
- **Encapsulation and Abstraction**       



---
## 1. Classes and Onject
 > Class:
         Class like blueprint of object.
     
  > Object:    
         Object occupied memory(object is a real-world entity).
         
**Type of creating object:**
 - new keyword 
 - newInstance()method
 - clone()method
 - deserialization
 - factory method
 > Syntax:
 ```java
class className
      {
          int v; //variable
          void method(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }
```  
![img of class & object](https://drek4537l1klr.cloudfront.net/gupta6/v-3/Figures/image032.jpg)


---
## 2. Inheritance and Polymorphism
 > Inheritance:
    One Parent class inherite the proper in another Child class witn help of extends keyword.




1. Single inheritance
: Single Parent class, Single child class.
> Syntax:
```java
class parent
      {
          int v1; //variable
          void method(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }
class child extends parent
      {
          int v2; //variable
          void anotherMethod(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }
```  
![Sing inheritance](https://1.bp.blogspot.com/-v_H_tp7Njn4/XeVKpj6-wiI/AAAAAAAABQs/mtnfjAMWfF8c5cuFqlH4gPN2RqpEFDHMwCEwYBhgL/s200/Single%2BInheritance.jpg)


 2. multiLevel inheritance
: 'A' is parent class inherit the 'B' child class and 'B' is the parent class inherite the 'C' another child class.
> Syntax:
 ```java
class A
      {
          int v1; //variable
          void method(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }
class B extends A
      {
          int v2; //variable
          void anotherMethod(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }
class C extends B
      {
          int v3; //variable
          void anotherMethod2(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }      
```  
![multilevel inheritance](https://1.bp.blogspot.com/-4x0rFIEcBZs/XeVDHzrZIoI/AAAAAAAABPU/f6FB0fajpokNi58HwaXoGZ2x9iFrmo8iQCLcBGAsYHQ/s320/Multi%2BLevel%2BInheritance.jpg)


 3. hierarchical inheritance 
: 'A' is parent class inherit the 'B' child class and 'B' is the parent class inherite the 'C' another child class.
> Syntax:
 ```java
class Num
      {
          int v1; //variable
          void method(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }
class Add extends Num
      {
          int v2; //variable
          void anotherMethod(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }
class Muil extends Num
      {
          int v3; //variable
          void anotherMethod2(); //method
          //Constructors
          //Blocks
         //Nested class and interface
      }      
```  
![multilevel inheritance](https://1.bp.blogspot.com/-krimBRdYFSE/XeVJtFuxivI/AAAAAAAABQg/wisgmRnroJ8AiBPMUFY_g1_7J8uR4gYlwCLcBGAsYHQ/s320/Hierarchical%2BInheritance.jpg)


 3. Multiple inheritance & Hybrid inheritance
: java not suport multiple inheritance and hybrid inheritance.

![multiple & hybrid](https://static.javatpoint.com/images/core/multiple.jpg)
> **-Miltiple inheritance:**
: multiple inheritance achive with the interface in java, *interface like blueprint of class*, Interface achive 100% abtraction.


> Syntax:
 ```java
interface B
      {
          varible //public, static, final
          method1 //public, abstraction
      }
interface C 
      {
           varible //public, static, final
          method2 //public, abstraction
      }
class A implements B,C
      {
         method1(){}
         method2(){}
      }      
```  
![alt text](https://1.bp.blogspot.com/-AsE-MoEMgTU/XeVGDiA66NI/AAAAAAAABP4/XTw0jY0GLrw50tccLeoie8GtTXZw8eepQCLcBGAsYHQ/s320/Multiple%2BInheritance.jpg)
 
