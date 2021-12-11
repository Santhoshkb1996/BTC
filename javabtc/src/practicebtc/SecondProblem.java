package practicebtc;
import java.util.*;
import java.util.Map.Entry;
public class SecondProblem {
public static void main(String[] args) {
 HashMap<String,String> m1=new HashMap<String,String>();
 m1.put("ram","hari");
 m1.put("cisco","barfi");
 m1.put("honeywell","cs");
 m1.put("cts","hari");
 String s2="hari";
 getValues(m1,s2);
}
public static void getValues(HashMap<String, String> m1, String s2) {
 ArrayList<String>h1=new ArrayList<String>();
 for(Entry<String, String> m:m1.entrySet()){
  m.getKey();
  m.getValue();
  if(m.getValue().equals(s2)) 
   h1.add(m.getKey());  }
 String[] op= new String[h1.size()];
 for(int i=0;i<h1.size();i++){ 
  op[i]=h1.get(i) ;
  System.out.println(op[i]); }
}
}
