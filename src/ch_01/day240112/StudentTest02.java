package ch_01.day240112;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("안연수");
        System.out.println(student1.getStudentName());

        Student student2 = new Student();
        student2.setStudentName("홍길동");
        System.out.println(student2.getStudentName());
    }
}
