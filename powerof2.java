import java.util.*;
class powerof2
{
    public static void main(String args[])
    {
        int a=8388608;
        if((a&(a-1))==0)
        {
        System.out.println("power of 2");
        }
        else
        {
         System.out.println("Not power of 2");
        }
    }
}