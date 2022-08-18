package oop.p;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (firstName == "" && lastName == "") {
            return "";
        } else if (lastName == "" || lastName == null) {
            return firstName;
        } else if (firstName == "" || firstName == null) {
            return lastName;
        } else {
            return firstName+" "+lastName;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("Cristiano");
        p1.setLastName("Ronaldo");
        p1.setAge(38);
        System.out.println(p1.getFullName());
        System.out.println(p1.isTeen());
        
        Person p2 = new Person();
        p2.setFirstName("Lionel");
        p2.setAge(15);
        System.out.println(p2.getFullName());
        System.out.println(p2.isTeen());
    }
    
}
