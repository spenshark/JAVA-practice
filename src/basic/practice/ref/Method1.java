package basic.practice.ref;

public class Method1 {

    public static void main(String[] args) {

        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grede = grade;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("name = " + student.name + " age = " + student.age + " grade = " + student.grede);
    }
}
