package calculations.inheritance;

class person {
    String name;
    String add;
}

class employee extends person {
    int id;

    public employee(String name, String add, int id) {
        this.id = id;
        this.name = name;
        this.add = add;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        employee obj = new employee("sagar", "Delhi", 1);
        System.out.println(obj.name);
        System.out.println(obj.add);
        System.out.println(obj.id);
    }
}
