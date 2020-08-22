package Chapter05;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2){
        int t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }

    static void bubbleSoer(int[] a, int n){
        for(int i=0;i<n-1;i++){
            int exchange=0;
            for(int j=n-1;j>i;j--){
                if(a[j-1]>a[j]){
                    swap(a, j-1, j);
                exchange++;
                }
            }
            if(exchange==0)break;
        }
    }

    public static void main(String[] args) {
        int[] num={15,321,54,85,3,2,54,8328,851,25,6,24,55};
        bubbleSoer(num, num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
