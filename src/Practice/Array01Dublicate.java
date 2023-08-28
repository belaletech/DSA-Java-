package Practice;

import java.awt.*;

public class Array01Dublicate {
    public static void main(String[] args)
    {
        int arr[]={10,15,15,25,25,25,35,34};
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++)
            {
              if((arr[i]==arr[j]) && (i!=j))
              {
                  System.out.println("Duplicate Element of Array is : "+arr[j]);
              }
            }
        }
    }
}
