package ArrayPrograms;
import java.util.*;

public class VoteList {
    public static void countVotes(List<Character> valid,List<Character> voted){
        List<Character> li = new ArrayList<Character>();
        for(int i=0;i<valid.size();i++){
            for(int j=0;j<voted.size();j++){
                if(valid.get(i)==voted.get(j)){
                    li.add(voted.get(j));
                }
            }
        }
//        for(int i=0;i<valid.size();i++){
//            for(int j=0;j<voted.size();j++) {
//                if(valid.get(i) == voted.get(j)){
//                    voted.remove(j);
//                }
//            }
//        }
//
////        for(Character y : voted){
////            System.out.println(y);
////        }
//        for(int i=0;i<valid.size();i++){
//            for (int j=0;j<voted.size();j++){
//                if(valid.get(i) == voted.get(j)){
//                    voted.remove(j);
//                }
//            }
//        }
        Map<Character,Integer>  frequencyMap = new HashMap<>();
        for(Character c : li) {
            Integer count = frequencyMap.get(c);
            if (count == null) {
                count = 0;
            }
            frequencyMap.put(c, count + 1);
        }
        for(Map.Entry<Character,Integer> entry : frequencyMap.entrySet()){
            System.out.print(entry.getKey()+"="+entry.getValue());
            System.out.print(" ");
        }
        System.out.print("  ");
        System.out.print("invalidVotes = "+ (voted.size() - li.size()));
        Map.Entry<Character,Integer> max = null;
        for(Map.Entry<Character,Integer> i : frequencyMap.entrySet()){
            if(max == null || i.getValue().compareTo(max.getValue())>0){
                max = i;
            }
        }
        System.out.println(" Winner = "+max.getKey());
    }
    public static void main(String[] args) {
        List<Character> validCandidates = new ArrayList<Character>();
        validCandidates.add('A');
        validCandidates.add('B');
        validCandidates.add('C');
        List<Character> voteCasted = new ArrayList<Character>();
        voteCasted.add('A');
        voteCasted.add('F');
        voteCasted.add('A');
        voteCasted.add('B');
        voteCasted.add('A');
        voteCasted.add('B');
        voteCasted.add('A');
        voteCasted.add('C');
        voteCasted.add('E');
        countVotes(validCandidates,voteCasted);
    }
}
