package buzz.xinyan.exer;

/**
 * @program: JavaSenior
 * @description: Person類
 * @author: ivan
 * @create: 2020-12-22 23:09
 */
public class Person implements Comparable {
    private  String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Person){
            Person s  = (Person)o;
            return  this.name.compareTo((s.name));
        }
        throw new RuntimeException("didi");

    }
}
