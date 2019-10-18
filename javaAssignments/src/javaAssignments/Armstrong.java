package javaAssignments;

class Armstrong{  
  public static void main(String[] args)  {  
    int c=0,a,temp;  
    int n=153;                        //It is the number to check armstrong number
    System.out.println(n);
//    int n=123;                     //example for not an armstrong number
//    System.out.println(n);
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  