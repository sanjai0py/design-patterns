
### programming to interface
```java
class Animal{
        Animal type;
    
    Animal(Animal type){
        this.Animal = type; 
    }
}

public class strategy{
    public static void main (){
            Animal dog = new Dog();
            dog.makeSound();
        }
    }
    
```

### programming to interface/supertype
```java
interface Animal{
    public void makeSound();
} 

class Dog implements Animal{
    
    @Override
    public void makeSound(){
        System.out.print("woffff");
    }
}
    
public class strategy{
    public static void main (String[] args){
        Animal animal = new Dog();
        animal.makeSound();
    }
}
```