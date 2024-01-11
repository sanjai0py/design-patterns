// interface Ibehaviour{
//     public void putTV();
// } 

//  class enthiranPutTV implements Ibehaviour{
//     @Override
//     public void putTV(){
//         System.out.print("damal dumeel damal dumeel 💥💥💥 \n");
//     }
// }

//  class iPutTV implements Ibehaviour{
//     @Override
//     public void putTV(){
//         System.out.print("the tv is turned on and hands-up 🔫🔫.\n");
//     }
// }


// class Robot{
//     String name;
//     Ibehaviour behaviour;


//     // const
//     Robot(String name){
//         this.name = name; //initially the robot's name is only determined not its behaviour
//     }

//     // set its behaviour
//     public void setBehviour(Ibehaviour behaviour){
//         this.behaviour = behaviour;
//     }

//     // get its behaviour
//     public Ibehaviour getBehaviour(){
//         return this.behaviour;
//     }

//     // set its name
//     public void setName(String newName){
//         this.name = newName;
//     }

//     // get its name
//     public String getName(){
//         return this.name;
//     }

// }



// public class strategy{
//     public static void main(String[] args){
//         Robot iRobot = new Robot("i");
//         Robot enthiranRobot = new Robot("enthiran");

//         iRobot.setBehviour(new iPutTV());
//         iRobot.getBehaviour().putTV();
        
//         enthiranRobot.setBehviour(new enthiranPutTV());
//         enthiranRobot.getBehaviour().putTV();
//     }
// }


// programming to implementation
// class Animal{
//     public String name;

//     Animal(String name){
//         this.name = name;
//     }
// }


// class Dog extends Animal{
//     Dog(String name){
//         super(name);
//     }

//     public void bark(){
//         System.out.print("woff");
//     }
// }


// public class strategy{
//     public static void main(String[] args){
//         Dog jensy = new Dog("jensy");
//         jensy.bark();       
//     }
// }

// 1. Testing the Duck code

// the class is abstract because standlone duck class cannt be instantiated
abstract class Duck{
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){}

    public abstract void display(); 

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.print("All ducks float, even decoys!\n");
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
}  

// interface is used to represent the behaviour of the duck
interface FlyBehaviour{
    public void fly();
}

interface QuackBehaviour{
    public void quack();
}

// concrete classes that implement the behaviour interface
 class FlyWithWings implements FlyBehaviour{
    public void fly(){
        System.out.print("I'm flying!!\n");
    }
}

 class FlyNoWay implements FlyBehaviour{
    public void fly(){
        System.out.print("I can't fly\n");
    }
}

class FlyRocketPowered implements FlyBehaviour{
    public void fly(){
        System.out.print("I'm flying with a rocket\n");
    }
}

 class Quack implements QuackBehaviour{
    public void quack(){
        System.out.print("Quack\n");
    }
}

 class MuteQuack implements QuackBehaviour{
    public void quack(){
        System.out.print("<< Silence >>\n");
    }
}

 class Squeak implements QuackBehaviour{
    public void quack(){
        System.out.print("Squeak\n");
    }
}

 class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.print("I'm a real Mallard duck\n");
    }
}   

 class ModelDuck extends Duck{
    public ModelDuck(){
        // start with a model duck that can't fly or quack
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display(){
        System.out.print("I'm a model duck\n");
    }
}


// main class
public class strategy{
    public static void main(String[] args){
        // Duck mallard = new MallardDuck();
        // mallard.performQuack();
        // mallard.performFly();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}