import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
	    al.add("meenu");
	    al.add('a');
	    al.add(1.20);
	    
//	    System.out.println(al);
//	    System.out.println(al.remove(2));
//	    System.out.println(al);
//	    
//	    for(Object o:al)
//	    {
//	    	System.out.print(o);
//	    }
	    
	    ArrayList bl=new ArrayList();
	    
	    bl.add(90);
	    bl.add(80);
	    bl.add("Auti");
	    
	    bl.addAll(al);
	    
	    System.out.println(bl);
	    
	    bl.removeAll(al);
	    
	    System.out.println(bl);
	    
	    bl.add(0);
	    bl.add(null);
	    bl.add("afterNull");
	    bl.add("Meenu");
	    System.out.println(bl);
	    bl.add(null);
	    System.out.println(bl);
	    
	    for(int i=0;i<bl.size();i++)
	    {
	    	System.out.println(bl.get(i));
	    }
	    
	    System.out.println(bl.indexOf("Meenu"));

	}

}
