class string
{
	public static void main(String[]args)
	{
		String s="Welcome";
		String s1="PVPIT";
		
		System.out.println(s);

	System.out.println("Method 1: toUpperCase,toLowerCase");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println();
		
		System.out.println("Method 2:length of string");
		System.out.println(s.length());
		System.out.println();
		
		System.out.println("Method 3:charAt");
		System.out.println(s.charAt(0));
	            System.out.println(s.charAt(6));
	            System.out.println();		
		
		System.out.println("Method 4:replace");
		System.out.println(s.replace("e","s"));
		System.out.println();
		
		System.out.println("Method 5:startWith,endWith");
		System.out.println(s.startsWith("w"));
		System.out.println(s.endsWith("t"));
		System.out.println();
	
		System.out.println("Method 6:equals");
		System.out.println(s.equals(s1));
		System.out.println();

                        System.out.println("Method 7:concat"); 
	            System.out.println(s1.concat(s));	
                        System.out.println();

                        System.out.println("Method 8:substring");
                        System.out.println(s.substring(3,7));		 
                        System.out.println();
		
	

            	System.out.println("Method 9:indexOf");
		System.out.println(s.indexOf("o"));
		System.out.println();
		
              	System.out.println("Method 10:join");
		System.out.println(String.join("-",s,s1));
		System.out.println();

                        System.out.println("Method 11:compareTo");
		System.out.println(s.compareTo(s1));
		System.out.println();
	
	
		System.out.println("Method 12;hashcode");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println();
		
		System.out.println("Method 13:split");
		System.out.println(s.split("e",2));
		System.out.println();
		
		System.out.println("Method 14:isEmpty");
		System.out.println(s.isEmpty());
		
	
	}
	
}
