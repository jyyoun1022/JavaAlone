package 컬렉션프레임워크;

import  java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        List<Board>list = new Vector<>();

        list.add(new Board("제목1","제목1","글쓴이1"));
        list.add(new Board("제목2","제목2","글쓴이2"));
        list.add(new Board("제목3","제목3","글쓴이3"));
        list.add(new Board("제목4","제목4","글쓴이4"));
        list.add(new Board("제목5","제목5","글쓴이5"));

        list.remove(2);// 2번 인덱스 객체(제목3)삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
        list.remove(3);// 3번 인덱스 객체(제목5)삭제

        for(int i=0; i<list.size(); i++){
            Board board =list.get(i);
            System.out.println(board.subject +"\t"+board.content+"\t"+board.writer);
        }
    }
}
