package 컬렉션프레임워크;
import java.util.*;

public class Board_Dao {

    public List<Board_> getBoardList(){
        List<Board_>boardList =new ArrayList<>();
        boardList.add(new Board_("제목1","내용1"));
        boardList.add(new Board_("제목2","내용2"));
        boardList.add(new Board_("제목3","내용3"));
        return boardList;
    }

}
