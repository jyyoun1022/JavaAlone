package 학점산출프로그램만들기;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Subject {
    private String subjectName;
    private int subjectID;
    private int gradeType;
    private  List<Student>studentList = new ArrayList<>();
    //이 과목을 수강 신청한 학생 리스트,


    public Subject(String subjectName, int subjectID, int gradeType) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
        this.gradeType = Define.AB_TYPE;    //학점 평가 정책은 기본으로 A,B 방식을 사용한다.
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void register(Student student){
        studentList.add(student);
    }
}
