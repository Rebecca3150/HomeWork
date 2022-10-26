public class MethodExcercise02 {
    public static void main(String[] args){
        Person p=new Person();
        p.name="123";
        p.age=17;
        MyTools mt=new MyTools();
        Person pp= mt.copyPerson(p);
    }
}

class Person{
    String name;
    int age;
}

class MyTools{
    public Person copyPerson(Person p){
        Person pp=new Person();
        pp.age=p.age;pp.name=p.name;
        return pp;
    }
}
