package Pattern;

public class Pattern1 {
    public  static void pattern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("x");
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        pattern(4);
    }
}
