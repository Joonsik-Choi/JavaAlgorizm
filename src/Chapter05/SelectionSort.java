package Chapter05;

public class SelectionSort { //단순 선택정렬
    static void swap(int[] a, int idx1, int idx2){
        int t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }
    static void selectionSort(int[] a, int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            swap(a, min, i);
        }

    }

    public static void main(String[] args) {
        int[] num={15,321,54,85,3,2,54,8328,851,25,6,24,55};
        selectionSort(num, num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
