import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int firstOfElement = array[0];
        for(int i = 0 ; i < array.length - 1; i++)
            array[i] = array[i+1];
        array[array.length - 1] = firstOfElement;
        System.out.println(Arrays.toString(array));
    }
}
