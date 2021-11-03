class Student {
    private int id;
    private String stname;

    public Student(int id, String stname) {
        this.id = id;
        this.stname = stname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return stname;
    }

    public void setname(String name) {
        this.stname = name;
    }
}

class Question3 {
    public static void main(String[] args) {
        Student student = new Student(21, "Sagar");
        student.setId(23);
        student.setname("sagar sharma");
        System.out.println("Student id is :- " + student.getId() + " Student Name is :-" + student.getname());
    }
}