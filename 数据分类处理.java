import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arrL=new String[n];
        Set set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            arrL[i]=input.next();
        }

        int m = input.nextInt();
        for(int i=0;i<m;i++){
            int tmp=input.nextInt();
            set.add(tmp);
        }
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(Object tm:set){
            Map<Integer,String> map=new HashMap<>();
            for(int i=0;i<n;i++){
                if(arrL[i].contains(String.valueOf(tm))){
                    map.put(i,arrL[i]);
                }
            }
            if(map.size()>0) {
                sb.append(String.valueOf(tm) + " " + map.size() + " ");
                for (int key : map.keySet()) {
                    sb.append(String.valueOf(key) + " " + map.get(key) + " ");
                }
                count += 2 * (map.size() + 1);
            }
        }
        if(sb.length()==0){
            System.out.print(count);
        }
        else
            System.out.print(count+" "+sb.substring(0,sb.length()-1));
    }
}


