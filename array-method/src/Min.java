public class Min {
    public static void main(String[] args) {
    int[] array = {13,8,4,2,9};
    int mini  = minValue(array);
        System.out.println("The smallest element in the array is: " + mini);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for(int i= 0 ; i < array.length; i++ ) {
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index ;

    }
}
