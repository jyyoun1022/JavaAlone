package 스트림And람다식;

import java.util.*;

public class WordCount {
    private static List<String> words = Arrays.asList("Tony","a","Hulk","B","America","X","Nebula","Korea");

    private static Map<String,Integer>  wordKeyValue() {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String key;
        Integer value;
        for (String word : words) {
            key = word.substring(0, 1);
            value = wordCountMap.get(key);
            if (value == null) {
                wordCountMap.put(key, 1);
            } else {
                wordCountMap.put(key, value + 1);
            }
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        final Map<String,Integer>map = wordKeyValue();
        map.keySet().forEach(k -> System.out.println(k+":"+map.get(k)));
    }


    }

