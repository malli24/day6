import java.util.*;
class missing
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        int s=0;
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        int res=((t+1)*(t+2))/2;
        System.out.println(res-s);
    }
}

    