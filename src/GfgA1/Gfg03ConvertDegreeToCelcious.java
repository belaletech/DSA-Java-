package GfgA1;

public class Gfg03ConvertDegreeToCelcious {
    public double CtoF(int c)
    {
        double farenhight=(c*9/5)+32;
        return farenhight;
    }

    public static void main(String[] args) {
        Gfg03ConvertDegreeToCelcious obj=new Gfg03ConvertDegreeToCelcious();
        System.out.println(obj.CtoF(25));
    }
}
