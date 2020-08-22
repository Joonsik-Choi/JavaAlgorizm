package Chapter03;

import java.util.Scanner;

public class 선형검색_1
{
    static int seqSearch(int[] a, int n, int key){
        for(int i=0;i<n;i++) {
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("요솟수 :");
        int num=scanner.nextInt();
        int[] x=new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x["+i+"]:");
            x[i]=scanner.nextInt();
        }
        System.out.println("검색할 값: ");
        int ky=scanner.nextInt();

        int idx=seqSearch(x, num, ky);
        if(idx==-1){
            System.out.println("값 없음");
        }
        else{
            System.out.println("x["+idx+"]에 있음");
        }
    }
}
