package GfgA1;

import java.util.ArrayList;
import java.util.Scanner;

public class Gfg05Quadratic {
    public ArrayList<Integer> quadraticRoot(int a,int b,int c)
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        double d=(b*b)-(4*a*c);
        if(d<0)
        {
            list.add(-1);
        }
        else
        {
            int x=(int)Math.floor((-1*b+Math.sqrt(d))/(2*a));
            int y=(int)Math.floor((-1*b-Math.sqrt(d))/(2*a));
            list.add((Math.max(x,y)));
            list.add((Math.min(x,y)));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int a,b,c;
            a= sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            Gfg05Quadratic obj=new Gfg05Quadratic();
            ArrayList<Integer> ans=obj.quadraticRoot(a,b,c);
            if(ans.size()==1 && ans.get(0)==-1)
            {
                System.out.println("Imaginary");
            }
            else
            {
                for(Integer val:ans) System.out.println(val+" ");
                System.out.println();
            }
        }
    }
}
