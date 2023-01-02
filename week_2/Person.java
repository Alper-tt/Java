import java.util.ArrayList;

public class Person {

    String name;
    String lastName;
    int age;
    String job;
    ArrayList<Car> garage;

    void showInfo() {
        System.out.println("\n///\nName: " + name + "\nLastname: " + lastName + "\nAge: " + age + "\nJob: " + job+"\n///\n");
    }

    void addCarToGarage(Car car,Person owner,String model,String color){
        Car c = new Car(owner, model, color);
        garage.add(c);
    }
    void showCarsInGarage(Person p){
        System.out.println(p.garage);

    }

}
