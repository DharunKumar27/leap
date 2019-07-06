import java.util.Scanner;
class leap{
public static void main(String[]args){
Scanner tt=new Scanner(System.in);
int i;
System.out.println("enter the year:");
i=tt.nextInt();
if(i%4==0)
{
  if(i%100==0)
    {
       if(i%400==0){
       System.out.println("yes");
        }
       else{
      System.out.println("no");
       }
    }else{
    System.out.println("yes");
    }
}
else{
System.out.println("no");
}
}
}
