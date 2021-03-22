public class lab02_56 {
    public static void tangdan(int [] arr){
        int temp = arr[0];
        for (int i =0; i < arr.length -1; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] =temp;
                }
            }
        }
    }
    public static void sum_tb(int [] arr){
        int sum = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Tong cua mang la: " +sum);
        System.out.println("Trung binh cong cua mang: " +(double)sum/ arr.length);
    }
    public static void main(String[] args){
        int arr[] ={1789,2035,1899,1456,2013};
        tangdan(arr);
        System.out.println("Day so duoc sap xep la: ");
        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sum_tb(arr);
    }
}
