import java.io.*;
class Multiplication
{
  public static void main(String args[])
  {
    int i,j,n;
    Scanner s=new Scanner(System.in);
    System.out.println("enter n value");
    n=s.nextInt();
    for(i=1;i<=n;i++)
    {
     for(j=1;j<n;j++)
     {
      System.out.println(i*j);
      }
    }
}