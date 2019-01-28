class Java1HW5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person ("Ivanov Ivan", "Engineer", "Vivian@excample.net",899918955, 30000, 30);
        persArray[1] = new Person ("Gnaduc Sofia", "Manager", "sgnaduc@excample.net",899995956, 20000, 18);
        persArray[2] = new Person ("Cherenkov Alek", "Director", "SamiyGlavniy@excample.net",899918959, 50000, 39);
        persArray[3] = new Person ("Kalinkina Alena", "Doctor", "Kalinka@excample.net",899918957, 40000, 24);
        persArray[4] = new Person ("Johnny Depp", "Actor", "JonnatanCristoferDepp@excample.net",899999999, 10000000, 55);
        System.out.println(Person.name + ", " + Person.proffesion + ", " + Person.email + ", " + Person.number + ", " + Person.salary + ", " + Person.age);
    }
}

class Person {
    static String name;
    static String proffesion;
    static String email;
    static long number;
    static int salary;
    static int age;

    Person(String name, String proffesion, String email, long number, int salary, int age ) {
        this.name = name;
        this.proffesion = proffesion;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    void setAge() {
        if (age >= 40) {
            this.age = age;
        }
    }

    String getAge() {
        return name;
    }


    @Override
    public String toString() {
        return name + ", " + proffesion + ", " + email + ", " + number + ", " + salary + ", " + age;
    }
}