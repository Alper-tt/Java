class Person {
    String name;
    String surname="ff";
    int id;
    int age;

    public Person(String name, String surname, int id, int age) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }

    public Person(String name, String surname) {
        this(name, surname,0,0);
        this.id++;
    }

    public Person(int id) {
        this("", "", id, 0);

    }

    public Person() {
        this("", "", 0, 0);
        this.id++;
    }
    void display(){
        System.out.println("\n\n\nname :"+this.name+"\nsurname :"+this.surname+"\nid :"+this.id+"\nage :"+this.age);
    }
}
