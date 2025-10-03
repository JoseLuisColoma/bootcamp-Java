
public class HolaMundo {
    public static void main(String[] args) {
        String langName = "Java";
        System.out.println("Hi world from " + langName);
        System.out.println("length variable: " + langName.length());

        Person person1 = new Person("Jose", 25);
        Person person2 = new Person("Anna", 20);
        person1.greet();
        System.out.println(person1.equals(person2));
    }

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void greet() {
            System.out.println("Hi, I`m " + this.name + " and I'm " + this.age + " years old");
        }
    }
}

