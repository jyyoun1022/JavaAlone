package 컬렉션프레임워크;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체수: "+size);

        Iterator<String> iterator = set.iterator(); //반복자 얻기
        while(iterator.hasNext()){  //객체 수만큼 루핑
            String element = iterator.next();   //1개의 객체를 가져옴
            System.out.println("\t"+element);
        }
        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체수: "+set.size());

        iterator = set.iterator();  //반복자 얻기
        for(String element : set){  //객체 수만큼 루핑
            System.out.println("\t"+element);
        }

        set.clear();
        if(set.isEmpty()){
            System.out.println("비어 있음");
        }
    }
}
