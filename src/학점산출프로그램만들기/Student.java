package 학점산출프로그램만들기;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private Subject majorSubject;
    private List<Score>scoreList = new ArrayList<Score>();

    public Student(int studentID, String studentName, Subject majorSubject) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }
    public void addSubjectScore(Score score){
        scoreList.add(score);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
