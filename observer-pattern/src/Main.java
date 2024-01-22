// import java.util.List;
// import java.util.ArrayList;

// interface Observable {
//     void registerObserver(Observer o);
//     void removeObserver(Observer o);
//     void notifyObservers();
// }

// class Store implements Observable{
//     private String message = "";
//     private List<Observer> observers = new ArrayList<>();

//     public void setMessage(String message){
//         this.message = message;
//         this.notifyObservers();
//     }

//     @Override
//     public void registerObserver(Observer o){
//         this.observers.add(o);
//     }

//     @Override
//     public void removeObserver(Observer o){
//         this.observers.remove(o);
//     }

//     @Override
//     public void notifyObservers(){
//         for(Observer o : this.observers){
//             o.update(this.message);
//         }
//     }
// }

// interface Observer {
//     void update(String message);
// }

// class Customer implements Observer {
//     private Observable observable;

//     Customer(Observable obs){
//         this.observable = obs;
//         this.observable.registerObserver(this);
//     }

//     @Override
//     public void update(String message){
//         System.out.println("Received message: " + message);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Store store = new Store();
//         Customer customer1 = new Customer(store);
//         Customer customer2 = new Customer(store);
//         Customer customer3 = new Customer(store);

//         store.setMessage("New product arrived!");
//         store.setMessage("New shoes arrived!");
//     }
// }

//  the interfaces

// Observable
public interface Observable{

    // register the subscribers
    public void registerObserver(Observer ob);

    // remove subscriber
    public void removeObserver(Observer ob);

    // notify all the subscriber
    public void notifyObservers();
}

// Observer
public void Observer{
    public void update(float temp, float humidity, float pressure); // concreate arguments!! arguments are tend to change??
}

// Display 
public void Display{
    public void display();
}

public class CurrentConditionDisplay implements Observer, Display{
    private float temp;
    private float humid;
    private WeatherData weatherData;
}