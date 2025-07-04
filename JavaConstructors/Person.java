class Person {
    //Attribute 
    String name;
    int age ;
    Person(String name, int age ){
        this.name = name;
        this.age = age;
    }
    Person(Person previouPerson){
        this.name = previouPerson.name;
        this.age = previouPerson.age;
    }
    public void display(){
        System.out.println("Name = "+name);
        System.out.print("age = "+age);
    }
    public static void main(String[] args){
        Person person1 = new Person("adtiya" ,21);
        Person person2 = new Person(person1);
        person1.display();
        person2.display();
    }
}
