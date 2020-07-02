package org.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IllegalArgumentException {
       int[] arr = new int[]{8,7,7,5,3,8,8,3,5,3,7};
       int result = getminimum(arr);
       System.out.println(result);
    }

    public static int getminimum(int[] arr) throws IllegalArgumentException {
        if(arr==null)
            return 0;
        int count = 1;
        int len = arr.length;
        if(len <= 1)
            return len;
        if(len>50)
        {
            throw new IllegalArgumentException("Max candle Exceeded");
        }
        for(int i=1; i<len; i++)
        {
            int j=0;
            for(j=0; j<=i; j++) {
                if (arr[i] == arr[j])
                    break;
            }
            if (i == j)
                count++;
        }
        return count;
    }
}
