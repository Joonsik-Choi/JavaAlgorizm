package Chapter03;

import java.util.Scanner;

public class 이진검색_1
{
    static int binSearch(int[] a, int n, int key){
        int pl=0;
        int pr=n-1;

        do{
            int pc=(pl+pr)/2;
            if(a[pc]==key)return pc;
            else if(a[pc]<key){
                pl=pc+1;
            }else{
                pr=pc-1;
            }
        }while(pl<=pr);
        return -1;

    }

    public static void main(String[] args) {
        int[] a={5,7,9,10,55,107,532};
        Scanner scanner=new Scanner(System.in);
        System.out.println("찾고자 하는 값 :");
        int num=scanner.nextInt();
        int idx=binSearch(a, a.length, num);
        if(idx==-1){
            System.out.println("찾을 수 없음");
        }
        else
            System.out.println("a["+idx+"]에 있음");
    }
}
