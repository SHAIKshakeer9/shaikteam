package package1;

public class Forloop {

	public static void main(String[] args) {
		
	/*	
		for(int a=1;a<=20;a++)
		{
			System.out.println(a);
		}
    */
		
		//forloop in string 
		/*	
	String text="This is Anees Automation";
	String text1="This is Shakeer";
	System.out.println(text);
	System.out.println(text1);
	for(int i=text.length()-1;i>=0;i--) 
	{
		System.out.println(text.charAt(i));
	}
	for(int j=0;j<=text.length();j++) 
	{
		System.out.println(text1.charAt(j));
	}
		*/
		
		
		//enhanced forloop
		
		String text1="This is  Anees Automation paracticed by 1shakeer";
		System.out.println(text1);
		
		String[]Splitvalue=text1.split("  ");
		for(int i=0;i<Splitvalue.length;i++)
		{
			System.out.println(Splitvalue[i]);
			System.out.println("this is the length of splitvalue"+":"+Splitvalue[i].length());
		}
	   
		String[]Splitvalue1=text1.split("1");
		for(int j=0;j<Splitvalue1.length;j++)
		{
		    System.out.println(Splitvalue1[j]);
		    System.out.println("this is the length of splitvalue1"+":"+Splitvalue1[j].length());
	    }
		
		
		
		
		
		
		
	}

}
