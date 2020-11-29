package ArrayPrograms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FrequencyElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(Integer i :list){
            Integer count  = hashMap.get(i);
            if(count == null){
                count = 0;
            }
            if(hashMap.containsKey(i)){
                hashMap.put(i,count+1);
            }else{
                hashMap.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> me : hashMap.entrySet()){
            System.out.println(me.getKey()+":"+me.getValue());
        }
    }
}
