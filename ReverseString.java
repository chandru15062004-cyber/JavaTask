package org.lo;

public class ReverseString {
  public static void main(String[] args) {
//	  String str="Java";
//	  String rev="";
//	  for(int i=str.length()-1;i>=0;i--)
//	  {
//		  rev +=str.charAt(i);
//	  }
//	  System.out.println(rev);
//	  String str = "Hello";
//      String rev = new StringBuffer(str).reverse().toString();
//      System.out.println("Reversed: " + rev);
//      
	   
	  int n = 121,r,sum=0,temp=n;
	  while(n>0)
	  {
		  r=n%10;
		  sum=sum*10+r;
		  n/=10;
	  }
      System.out.println(temp==sum ? "palindrome" : "Not");
}
}
