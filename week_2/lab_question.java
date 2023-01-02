public class lab_question {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "alper";
        p1.lastName = "tp";
        p1.age = 22;
        p1.job = "CE";
        Person p2 = new Person();
        p2.name = "arda";
        p2.lastName = "tp";
        p2.age = 12;
        p2.job = "AR";

        Car c1 = new Car(p1, "model", "color");
        p1.showInfo();
        p1.addCarToGarage(c1, p1, "quasqai", "white");
        c1.showCarInfo();
        c1.changeOwner(p2);
        c1.showCarInfo();
        c1.getOwner();
        c1.showCarInfo();
        p1.showCarsInGarage(p1);


    }

}
