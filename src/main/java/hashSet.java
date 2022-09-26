import java.util.ArrayList;
import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
String a="java";
		
		char [] abc =a.toCharArray();
		
		ArrayList ar =new ArrayList();
		
		for(Object o:abc)
		{
			ar.add(o);
		}
		
		System.out.println(ar);
		
		for(int i=ar.size()-1;i>=0;i--)
		{
			System.out.print(ar.get(i));
		}
		

	}

}
