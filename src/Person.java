public class Person {

    public String name;
    public int age;
    public double salary;

    public Person(){}
 
    public Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, int age){
        this.name = name;
        this.salary = -1;
    }

    public String displayInfo() {
        return "Person{" +
                "name='" + name  +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        Person personne1 = new Person();
        Person personne2 = new Person("Lordwin",25,25.5);
        System.out.println(personne1.displayInfo());
        System.out.println(personne2.displayInfo());
        Person personne3 = new Person("Fasio lordwin",0);
        if(personne3.salary ==-1){
            System.out.println("Salary not provided");
        }

    }



}