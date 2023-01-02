package week_8;

public class week_8 {
    public class animal{
        String color;
        public void eat(){};
        void showDetails(){
            System.out.println("color "+ color);
        }
    }

    public class dog extends animal{
        String breed;
        public void bark(){};
    }
    public class cat extends animal{
        int age;
        public void meow(){};
    }
    public class vanCat extends cat{
        String colorOfEyes;
    }

    public static void main(String[] args) {
        vanCat cat1 = new vanCat();
        cat1.color = "white";
        cat1.eat();
        cat1.age = 10;
        cat1.meow();
        cat1.colorOfEyes = "blue,brown";
        cat1.showDetails();

        dog dog1 = new dog();
        dog1.breed = "";
        dog1.eat();
        dog1.bark();
        dog1.color = "black";
        cat1.showDetails();
        System.out.println("aaaaaaaaaaaa");
    }

}
