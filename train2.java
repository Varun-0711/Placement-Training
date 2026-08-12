import java.util.*;
public class train2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int l = 0;
        int r = 0;
        while (r < arr.length){
            if (arr[r] % 10 != 0) {
                int temp = arr[r];
                for (int i = r; i > l; i--){
                    arr[i] = arr[i - 1];
                }
                arr[l] = temp;
                l++;
            }
            r++;
        }
        for (int x : arr) {System.out.print(x + " ");}
    }
}