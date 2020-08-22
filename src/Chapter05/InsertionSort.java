package Chapter05;

public class InsertionSort { //단순삽입정렬
    static void swap(int[] a, int idx1, int idx2){
        int t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }
    static void insertionSort(int[] a, int n){
        for(int i=1;i<n;i++){
            int j;
            int tmp=a[i];
            for( j=i; j>0 && a[j-1] >tmp;j--){
                a[j]=a[j-1];
                }
            a[j]=tmp;
            }
        }

    public static void main(String[] args) {
        int[] num={15,321,54,85,3,2,54,8328,851,25,6,24,55};
        insertionSort(num, num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
