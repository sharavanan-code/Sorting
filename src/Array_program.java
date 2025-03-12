public class Array_program {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3};
        System.out.print(arr[0]+" ");

        for(int i = 0;i<arr.length;i++){
            boolean isduplicate = false;
            for(int j = 0;j<i;j++){
                if(arr[i]==arr[j]){
                    isduplicate = true;
                    break;
                }
            }

            if(!isduplicate){
                System.out.print(arr[i]+" ");
            }
        }


    }
}
