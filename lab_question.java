import java.util.Scanner;

public class lab_question{



    public static void main(String[] args){
        Worker worker2 = new Worker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Worker name");
        worker2.name = scanner.nextLine();

        System.out.println("Social security number");
        worker2.socialSecurityNumber = scanner.nextInt();

        System.out.println("Working hours");
        worker2.workingHours = scanner.nextInt();

        System.out.println("Wage");
        worker2.wage = scanner.nextFloat();

        worker2.displayInfo();
        worker2.displaySalary();


    }

}
  /* public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.name = "alper";
        worker1.socialSecurityNumber = 200;
        worker1.wage = 12;
        worker1.workingHours = 9;
        worker1.displayInfo();
        worker1.displaySalary();
    }*/