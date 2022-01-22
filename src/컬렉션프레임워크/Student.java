package 컬렉션프레임워크;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return student.equals(studentNum) && (student.name.equals(name));
        } else {
            return false;
        }


    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
