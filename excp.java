class A 
{
  public static void main(String arg[])
  {
	  
	  try
	  {
	     int c[]={2,3,4,5};
		 System.out.println(c[10]);
	 
	  }
	  catch(Exception e)
	  {
		 System.out.println(e); 
	  }
	  finally
	  {
		  System.out.println("hello");
	  }
  }

}