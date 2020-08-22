package Chapter02;

import java.util.Scanner;

public class Q2_역순정렬하기 {
    static void swap(int[] num, int a, int b){
        int temp;
        temp=num[a];
        num[a]= num[b];
        num[b]=temp;
    }

    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("배열의 크기 입력");
        int n=scanner.nextInt();
        int[] num=new int[n];
        for (int i=0;i<n;i++){
            num[i]=scanner.nextInt();
        }
        for (int j=0;j<n;j++){
            System.out.print(num[j]+" ");
        }
        System.out.println();
        for(int i=0;i<n/2;i++) {
            System.out.println(num[i]+"와 "+num[n-i-1]+"을 교환합니다.");
            swap(num, i, n-i-1);
            for (int j=0;j<n;j++){
                System.out.print(num[j]+" ");
            }
        }
    }
}
