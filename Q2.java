import java.util.Arrays;
public class Q2 {
    public static boolean Exists(int arr[],int key){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int val = arr[i]+arr[j];
            if(val == key){
                return true;
            }
            else if(val < key){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Exists(arr,10));
    }
}
