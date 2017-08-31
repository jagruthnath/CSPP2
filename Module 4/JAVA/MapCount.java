import java.util.HashMap;

public class MapCount {
    public static void main(String[] args) {
        String k="convergence";
        int count=0;
        char ch;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(char i='a'; i<='z'; i++)
        {
            count = 0;
            for(int j=0; j<k.length(); j++)
            {
                ch=k.charAt(j);
                if(ch==i)
                    count++;
            }
            if(count!=0)
            {
                hm.put(i,count);
            }
        }
        System.out.println(hm);
        HashMap<Integer,String> hm2=new HashMap<Integer,String>();
        for (Character key: hm.keySet())
        {
            if (!hm2.containsKey(hm.get(key)))
                hm2.put(hm.get(key),key.toString());
            else
                hm2.put(hm.get(key),(hm2.get(hm.get(key)).concat(','+key.toString())));
        }
        System.out.println(hm2);
    }
}