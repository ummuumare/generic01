public class Runner {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("ummu umare");
        Person<Student>studentPerson=new Person<>();
        studentPerson.setType(student);
        System.out.println(studentPerson);
    }
}
