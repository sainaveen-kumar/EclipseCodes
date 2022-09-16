package Hash;
import java.util.*;
public class cdf {
	/*
	 * n=int(input())
m=int(input())
l=[]
d={}
for i in range(n):
    l.append(input())
for i in l:
        t="".join(sorted(set(i)))
        if t not in d:
            d[t]=1
        else:
            d[t]+=1
c=0
for i in d:
    if(d[i]>=2):
        c+=d[i]
print(c)
       
        
	 */
	public static long cs(List<String> words){
		long count=0;
		HashMap<String,Integer> h=new HashMap();
		for (int i=0;i<words.size();i++){
			TreeSet<Character> s=new TreeSet();
			for (int j=0;j<words.get(i).length();j++){
				s.add(words.get(i).charAt(j));
			}
			String t=String.valueOf(s);
			if(h.containsKey(t)){
			 h.replace(t, h.get(t)+1);
			}
			else{
				h.put(t, 1);
			}
		}
	     for (Map.Entry<String,Integer> mapElement : h.entrySet()) {
             int val= mapElement.getValue();
	            if(val>=2){
	            	count+=val*(val-1)/2;
	            }
	        }
		return count;
	}
    public static void main(String args[])
    {
    	ArrayList <String> al=new ArrayList();
    	al.add("abc");
    	al.add("aa");
    	al.add("ba");
    	//al.add("cba");
    	System.out.print(cs(al));
    }
}

