import java.util.*;
public class train1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int l = 0;
        for (int r = 0; r < arr.length; r++){
            if (arr[r] % 10 != 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }
        for (int x : arr) {System.out.print(x + " ");}
    }
}
