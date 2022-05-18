import java.util.Arrays;
import java.util.HashSet;

public class  Common {
    public static void main(String[] args) {
       /* int[] arr1 = {1, 2, 4, 5, 6, 7, 9};
        int[] arr2 = {2, 9, 11, 46, 78, 577,};
        System.out.println("arr1"+Arrays.toString(arr1));
        System.out.println("arr2"+Arrays.toString(arr2));
        for (int i=0;i<arr1.length;i++) {
            for (int j=0;j<arr2.length;j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.println("common element "+arr1[i]);
                }
            }
        }
    }
}*/
        String[] array1={"nag","mani","venky","jani","siva"};
        String[] array2={"siva","lokesh","abhi","ranjan"};
        System.out.println("arr1"+Arrays.toString(array1));
        System.out.println("arr2"+Arrays.toString(array2));
        HashSet<String> hs=new HashSet<String>();
        for (int i=0;i<array1.length;i++) {
            for (int j=0;j<array2.length;j++) {
                if (array1[i]==array2[j]) {
                    hs.add(array1[i]);
                }
            }
        }
        System.out.println("common value in both arrays is "+hs);
    }
}