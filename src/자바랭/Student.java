package 자바랭;

public class Student {
    private String studnetNum ;

    public Student(String studnetNum) {
        this.studnetNum = studnetNum;
    }

    public String getStudnetNum() {
        return studnetNum;
    }

    public void setStudnetNum(String studnetNum) {
        this.studnetNum = studnetNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student student =(Student)obj;
            if(studnetNum.equals(student.getStudnetNum())){
                return true;
            }
        }return false;
    }

    @Override
    public int hashCode() {
        return studnetNum.hashCode();
    }
}
