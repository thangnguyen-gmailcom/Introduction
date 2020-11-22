public class AddElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        array = addInt(array, 3, 34);

        System.out.print("New array : ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
    }
    public static int[] addInt(int[] array,int pos, int newInt){
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i < pos; i++) {
            newArray[i] = array[i];
        }
        newArray[pos] = newInt;
        for(int i = pos+1; i < newArray.length; i++) {
            newArray[i] = array[i-1];
        }
        return newArray;
    }
}
