public class StudentClass {
    private String Name;
    private String PhoneNum;
    private int age;

    public StudentClass(String Name, String PhoneNum, int age) {
        this.Name = Name;
        this.PhoneNum = PhoneNum;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String toString() {
        return " Student Name is " + this.Name;
    }
}