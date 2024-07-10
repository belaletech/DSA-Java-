package CollectionFrameWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;

public class collection01CustomArrayList {
    private int [] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public collection01CustomArrayList()
    {
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num)
    {
        if(isFull())
        {
            resize();
        }
    }
    private void resize(){
        int[] temp=new int[data.length*2];
        //copy the current items in the new array
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
    }
    private boolean isFull()
    {
        return size==data.length;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index)
    {
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }
//    @Override
//    public String toString()
//    {
//        return "CustomArrayList{"+"data="+ Arrays.toString(data)+", Size="+size+"}";
//    }


    @Override
    public String toString() {
        return "collection01CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
        collection01CustomArrayList list1=new collection01CustomArrayList();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        for (int i=0;i<14;i++)
        {
            list1.add(2*i);
        }
        System.out.println(list1);
    }
}
