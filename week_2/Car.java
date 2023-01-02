public class Car {
    Person owner;
    String model;
    String color;

    public void showCarInfo(){
        System.out.println("Owner: "+owner.name+"\nmodel: "+model+"\nColor: "+color);

    }


    public Car (Person owner, String model, String color){
        this.model = model;
        this.owner = owner;
        this.color = color;
    }

    public void changeOwner(Person newOwner){
        this.owner = newOwner;
    }

    public Person getOwner(){
        return this.owner;
    }



    
}
