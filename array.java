public class array {
    public static void main(String argd[]){
        int arr[][]= new int[5][]; 
        arr[0] = new int[]{2,3,5,6,7};
        arr[1] = new int[]{4,1,1,5,6};
        arr[2] = new int[]{3,3,6,7,8};
        arr[3] = new int[]{3,5,6,7,0};
        arr[4] = new int[]{2,3,5,6,7};
        for (int a[] : arr){
            for (int b : a){
                System.out.print(b[1]);
            }

           
        }
    }
    
}
