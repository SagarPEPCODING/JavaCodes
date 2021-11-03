package calculations;

class Personis {
    private String stname;

    public Personis(String stname) {
        this.stname = stname;
    }
    public String getname() {
        return stname;
    }

    public void setname(String name) {
        this.stname = name;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Personis personis = new Personis("uttam");
        personis.setname("uttam nagar");
        System.out.println("Person Name is :-" + personis.getname());
    }
}