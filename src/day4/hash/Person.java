package day4.hash;

/**
 * Created by admin on 7/14/2016.
 */
public class Person {
    private String name;
    private int age;
    private long salary;
    private Address address;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        salary = 1000;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {

        int result = 25;
        result = 37 * result + name.hashCode();
        result = 37 * result + age;
        result = 37 * result + new Long(salary).hashCode();
        if (address != null){
            result = 37 * result + address.hashCode();
        }
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (name != null && address !=null && name.equals(p.name)
                    && p.age == age && p.salary == salary && p.address.equals(address)) {
                return true;
            }
        }
        return false;
    }
}
