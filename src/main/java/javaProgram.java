
public class javaProgram {

	public static void main(String[] args) {
		//Count character from string
//		String s="Meenu Auti Vilas";
//		
//		int count=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)!=' ') 
//			count++;
//		}
//              System.out.println("count is"+count);
		//-----------------------------------------------------------------------
		
		//spcl character from string
		
//		String s="Meenu!@#$8088";
//		String spcl="!@#$%^&*()";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			Character ch=s.charAt(i);
//			if(spcl.contains(Character.toString(ch)))
//			{
//				System.out.println("contains spcl character");
//				break;
//			}
//			
//			else if(i==s.length()-1){
//				System.out.println("no");
//			}
//		}
		
		//===============================================================================
		
		//no of vowels and consonent
		
//		String s="Meenakshi Vilas Auti";
//	    int vcount=0,ccount=0;
//		s=s.toLowerCase();
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//			{
//				vcount++;
//			}
//			
//			else if(ch>'a' && ch<'z')
//			{
//				ccount++;
//			}
//		}
//		
//		System.out.println(ccount +"and"+ vcount);
		
		//======================================================================
				
				//replace lower to upper and vice versa
		
//		String s="Meenu";
//		
//		StringBuffer newStr=new StringBuffer(s);
//		
//		for(int i=0;i<newStr.length();i++)
//		{
//			if(Character.isLowerCase(newStr.charAt(i)))
//			{
//				newStr.setCharAt(i, Character.toUpperCase(newStr.charAt(i)));
//			}
//			
//			else if(Character.isUpperCase(newStr.charAt(i)))
//			{
//				newStr.setCharAt(i, Character.toLowerCase(newStr.charAt(i)));
//			}
//		}
//		System.out.println(newStr);
		
		//===================================================================
		
		//replace space with special character
		
//		String s="Meenakshi Auti";
//		
//		char ch='_';
//		
//		s=s.replace(' ', ch);
//		
//		System.out.println(s);
		
		//===========================================================================
		
		//String palindrome
		
//		String s="MADAM";
//		String reverse = "";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			 reverse=reverse+s.charAt(i);
//		}
//		
//		if(s.equals(reverse))
//		{
//			System.out.println("palindrome");
//		}
//		else
//			System.out.println("not");
		
		//========================================================================
		
		//reverse string
		
//		String s="Meenu";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//		}
		
		//========================================================================
		
		//duplicate char in string
		
//		String s="Great responsibility";
//		int count=0;
//		char[] s1=s.toCharArray();
//		int i;
//		
//		for( i=0;i<s1.length;i++)
//		{
//			count=1;
//			
//			for(int j=i+1;j<s1.length;j++)
//			{
//				if(s1[i]==s1[j] && s1[i]!=' ')
//				{
//					count++;
//					s1[j]='0';
//				}
//			}	
//			if(count>1 && s1[i]!='0')
//				
//				System.out.println(s1[i]); 		
//		}
		
		//====================================================================
		
		//duplicate word
		
//		 String s = "Big black bug bit a big black dog on his big black nose";  
//		 int count=0;
//           s=s.toLowerCase();
//           
//           String[] s1=s.split(" ");
//           for(int i=0;i<s1.length;i++) 
//           {
//        	   count=1;
//        	   for(int j=i+1;j<s1.length;j++)
//        	   {
//        		   if(s1[i].equals(s1[j]))
//        		   {
//        			   count++;
//        			   s1[j]="0";
//        		   }
//        	   }
//        	   
//        	   if(count>1 && s1[i]!="0")
//        	   {
//        		   System.out.println(s1[i]);
//        	   }
//        		   
//           }
		
		//=============================================================
		
		//frequency of char in string
		
		
           
		

		
		
		
		
		
		
		
		
	}

}
