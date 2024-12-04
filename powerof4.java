import java.util.*;
class powerof4
{
    public static void main(String args[])
    {
        int a=16777216;
        if((a&(a-2))==0)
        {
        System.out.println("power of 4");
        }
        else
        {
         System.out.println("Not power of 4");
        }
    }
}