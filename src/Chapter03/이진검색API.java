package Chapter03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 이진검색API {
    public static void main(String[] args) {
        int[] a={5,7,9,10,55,107,532};
        Scanner scanner=new Scanner(System.in);
        System.out.println("찾고자 하는 값 :");
        int num=scanner.nextInt();
        int idx= Arrays.binarySearch(a, 10);
        if(idx==-1){
            System.out.println("찾을 수 없음");
        }
        else
            System.out.println("a["+idx+"]에 있음");
    }
}
