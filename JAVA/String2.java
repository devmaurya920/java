class Student {
    String name;
    int roll ;

    Student (String n, int r) {
        name = n;
        roll = r;

    }
    public String toString() {
        return "Name : "+name+" Roll : "+roll;
    }
    public static void main(String args[]) {
        Student s1 = new Student("Ravi", 1);
        Student s2 = new Student("Ramesh", 2);
        System.out.println(s1);
        System.out.println(s2);
    }
}