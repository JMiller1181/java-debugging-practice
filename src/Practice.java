import java.util.Arrays;

public class Practice {
    public static void main(String[] args){
        //First code snippet
        int[] arr = {1,2,3,4,5};
        double avg = (double) Arrays.stream(arr).sum() / (double) arr.length;
        System.out.println(avg);
        //Index out of bounds exception
//        int[] arr = {1,2,3,4,5};
//        double sum = 0;
//        //Exception occurred below, x <= arr.length is too much because index starts at 0 and goes to 4, not 5
//        //Used debugger to see what x incremented to, change it to x < arr.length fixes problem
//        for(int x = 0; x <= arr.length; x++){
//            sum += arr[x];
//        }
//       double avg =  sum / arr.length;
//        System.out.println(avg);
//        //Null pointer exception
//        int[] arr = null;
//        //Exception occurred below, arr was initialized as null, cannot execute methods sum or length
//        //Use debugger to see what was set as null, give arr an array value to fix problem
//        double avg = (double) Arrays.stream(arr).sum() / (double) arr.length;
//        System.out.println(avg);
//        //Logic error
//        int[] arr = {1,2,3,4,5};
//        double sum = 0;
//        for(int x = 0; x < arr.length; x++){
//            //Logic error occurs below, sum is set to the index of the current iteration rather than added to
//            //Use debugger to see what value of sum is, making it sum += fixes problem
//            sum = arr[x];
//        }
//       double avg =  sum / arr.length;
//        System.out.println(avg);
    }
}
