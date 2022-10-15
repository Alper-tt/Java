public class Worker {

    String name;
    int socialSecurityNumber;
    int workingHours;
    float wage;
    
    public void displayInfo(){
        System.out.println("SSN : "+socialSecurityNumber+"\nname : "+name);
    }
    public void displaySalary(){
        System.out.println("Salary (daily) : "+workingHours*wage);
    }
}