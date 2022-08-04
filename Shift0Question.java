import java.util.Arrays;

public class reorder1 {

    public static void reorder(int [] A){
        int k = 0;

        for(int i: A)
        {
            if(i != 0){
                A[k++]=i;
            }
        }
        for(int i =k;i < A.length; i++){
            A[i]=0;
        }

    } 
    public static void main(String[] args){

        int[] A = {2,5,0,5,2,6,8,0,3,3,0,3,3,0};
        reorder(A);
        System.out.println(Arrays.toString(A));

    }
}
