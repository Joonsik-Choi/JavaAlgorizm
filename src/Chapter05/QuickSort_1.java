package Chapter05;

public class QuickSort_1 {

    static void swap(int[] a, int idx1, int idx2){
        int t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }
    static void quickSort(int[] a, int left, int right){
        int pl=left;
        int pr=right;
        int x=a[(pl+pr)/2];

        do{
            while(a[pl]<x)pl++;
            while(a[pr]>x)pr--;
            if(pl<=pr){
                swap(a,pl++,pr--);
            }

        }while(pl<=pr);
    if(left<pr)quickSort(a,left, pr);
    if(pl<right)quickSort(a,pl,right);
    }
    public static void main(String[] args) {
        int[] num={15,321,54,85,3,2,54,8328,851,25,6,24,55};
        quickSort(num, 0, num.length-1);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
