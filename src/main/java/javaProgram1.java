import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class javaProgram1 {

	public static void main(String[] args) {

		// String reverse

//		String s="Meenakshi";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//		}

		// ====================================================

		// number reverse

//		int num=123;
//		
//		String s=Integer.toString(num);
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//		}

		// =======================================================

		// palindrome

//		String s="meenu";
//		String reverse = "";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			reverse=reverse+s.charAt(i);
//		}
//		
//		if(s.equals(reverse))
//		
//			System.out.println("palindrome");
//		
//		else
//			System.out.println("not");

		// ===========================================================

		// word by word reverse

//		String s="Meenakshi Auti";
//		
//		String[] s1=s.split(" ");
//		
//		String reverse="";
//		
//		for(int i=s1.length-1;i>=0;i--)
//		{
//			reverse=reverse+s1[i] +" ";
//		}
//		
//		System.out.print(reverse);

		// =============================================================

		// second highest no from array

//		int[] arr= {40,10,90,70,50};
//		int temp;
//		int size=arr.length;
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//	
//		System.out.println(arr[size-2]);

		/// =========================================================================
		// remove duplicate char from string

//		String s="Meennuuuuuu";
//		int count;
//		char[] s1=s.toCharArray();
//		
//		for(int i=0;i<s1.length;i++)
//		{
//			count=1;
//			
//			for(int j=i+1;j<s1.length;j++)
//			{
//				if(s1[i]==s1[j] && s1[i]!='0')
//				{
//					count++;
//					s1[j]='0';
//				}
//			}
//			
//			if(count>1 && s1[i]!='0')
//				System.out.println(s1[i]);
//		}

		// =======================================================================

		// seperate num char and spcl char from string

//		String s1="Meenu@8088";
//		int character=0,num=0,spcl=0;
//		s1=s1.toLowerCase();
//		for(int i=0;i<s1.length();i++)
//		{
//			char ch=s1.charAt(i);
//			
//			if(ch>='a' && ch<='z')
//			character++;
//			
//			else if(ch>='0' && ch<='9')
//				num++;
//			
//			else
//			{
//				spcl++;
//			}
//		}
//		
//		System.out.println(spcl);

		// =============================================================================

		// check charatcer is is digit or character
//		int alph=0,nmr=0;
//		String s1="Meenu@8088";
//		
//		s1=s1.toLowerCase();
//	    char ch1;
//	     char[] ch=s1.toCharArray();
//	     
//	     for(int i=0;i<ch.length;i++)
//	     {
//	    	 ch1=s1.charAt(i);
//	    	 if(ch1>='a' && ch1<='z')
//	    	 {
//	    		 alph++;
//	    	 }
//	    	 
//	    	 else if(ch1>='0' && ch1<='9')
//	    	 {
//	    		 nmr++;
//	    	 }
//	     }
//	     
//	     System.out.println(nmr);
//	     System.out.println(alph);
		// =======================================================================

		// find highest value from array

//		int[] arr= {1,90,4,5,7,80};
//		
//		int max=arr[0];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//		}
//			System.out.println(max);

		// =======================================================================

		// shift all zeros at end in array

//		int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
//		int j = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] != 0) {
//				int temp = A[j];
//				A[j] = A[i];
//				A[i] = temp;
//				j++;
//			}
//		}
//		for (int i = 0; i < A.length; i++) {
//			System.out.print(A[i] + " "); // Print the array
//		}
		
		//==============================================================
		
		//prime no upto 100
		
		
		
		
		//count vowel from string
		
//		String s1="Meenu";
//		char[] ch=s1.toCharArray();
//		int vowel=0;
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'|| ch[i]=='o' ||ch[i]=='u')
//			{
//			
//				vowel++;
//			}
//			
//		}
//		
//		System.out.println(vowel);
		
		//========================================================================
		
		//swap no withot third variable
		
//		int x=20,y=10;
//		int temp;
////		x=x+y;
////		y=x-y;  
////		x=x-y;
//		
//		//swaping with third variable
//		temp=x;
//		x=y;
//		y=temp;
//		
//		
//		System.out.println("After swapping x= "+x);
//		System.out.println("After swapping y= "+y);
		
		//=======================================================================
		
		//occurance of word in string
		
//		String s="I love java, I love selenium, love, love java";
//		
//		Map<String,Integer> hashmap=new HashedMap<String, Integer>();
//		
//		String[] s1=s.split(" ");
//		
//		for(String word:s1)
//		{
//			if(hashmap.containsKey(word))
//			{
//				hashmap.put(word, hashmap.get(word)+1);
//			}
//			
//			else
//				hashmap.put(word, 1);
//		}
//		
//		System.out.println(hashmap);
		
		String s="love love";
		
		Map<String, Integer> hs=new HashedMap<String, Integer>();
		
		String[] s1=s.split(" ");
		
		for(String word:s1)
		{
			if(hs.containsKey(word))
			{
				hs.put(word, hs.get(word)+1);
			}
			else
				hs.put(word, 1);
		}
		System.out.println(hs);
		
		
		
		
		
		

	}

}
