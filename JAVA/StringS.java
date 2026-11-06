public class StringS {
    String name = "Ravi";
    int age = 20;
    int marks = 90;

    public String toString() {
        return "Name : "+name+" Age : "+age ;
    }
    public String toString(String subject) {
        return "Name : "+name+" Age : "+age+" Marks : "+marks+" Subject : "+subject;
    }
        public String toString(int marks) {
        return "Name : "+name+" Age : "+age+" Marks : "+marks;

    
    }
        public static void main(String args[]) {
        StringS s1 = new StringS();
        System.out.println(s1);
        System.out.println(s1.toString("Maths"));
        System.out.println(s1.toString(95));
    }
}
