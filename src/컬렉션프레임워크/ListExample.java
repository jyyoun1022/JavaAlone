package 컬렉션프레임워크;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        Board_Dao dao = new Board_Dao();
        List<Board_> boardList = dao.getBoardList();
        for(Board_ bo : boardList){
            System.out.println(bo.getTitle()+"-"+bo.getContent());
        }
    }
}
