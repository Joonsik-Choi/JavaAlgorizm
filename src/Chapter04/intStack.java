package Chapter04;

public class intStack {
    int max;
    int ptr;
    int[] stk;
    public intStack(int n){
        stk=new int[n];
        max=n;
        ptr=0;
    }
    public int size(){return ptr;}
    public int push(int x){
        if(ptr<max){
            stk[ptr++]=x;
            return x;
        }
        return -1;

    }
    public int pop(){
        if(ptr>0){
            return stk[--ptr];
        }
        return -1;
    }
    public int peek(){
        if(ptr>0){
            return stk[ptr-1];
        }
        return -1;
    }
    public boolean isEmpty(){
        return ptr==0?true:false;
    }
    public boolean isFull(){  return ptr==max?true:false;}
    public void dump(){}//bottom에서 top 순으로 출력
    public void clear(){ptr=0;}
    public int capacity(){return max;}
    public int indexOf(int x){return 0;}//top에서 bottom 순으로 출력
}
