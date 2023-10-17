
public class Pattern1 
{
  public static void main(String[] args) 
  {
	  int i;
      int j;
      for(i=1;i<=5;i++)
      {
              for(j=1;j<=9;j++)
              {       if(j>=6-i && j<=4+i)
                              System.out.print("*");
                              else
                      System.out.print(" ");
          }
      System.out.println();
      }

       for(i=2;i<=5;i++)
       {
               for(j=1;j<=9;j++)
               { if(j>=i && j<=10-i)
                       System.out.print("*");
               else
                       System.out.print(" ");
               }
               System.out.println();
       }


  }
}
