import java.util.*;
class checkcase
{
   public static void main(String args[])throws Exception
   {
       Scanner sc=new Scanner(System.in);
       char ch,i;
       System.out.println("enter any character");
       ch=sc.next().charAt(0);
       for(i='a';i<='z';i++)
       {
           if(i==ch)
           {
               System.out.println("lower case");
            }
        }
        for(i='A';i<='Z';i++)
        {
            if(i==ch)
            {
                System.out.println("upper case");
            }
        }
    }
}
