package 컬렉션프레임워크;
import java.util.*;

public class HashSetExercise {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"신용권"));
        set.add(new Student(1,"조민우"));  //학번이 같으므로 저장되지 않는다.

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.studentNum+ ":" + student.name);
        }

    }
}
