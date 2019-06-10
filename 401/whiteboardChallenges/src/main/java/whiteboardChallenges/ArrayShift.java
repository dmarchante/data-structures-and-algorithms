package whiteboardChallenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int num) {
        int[] newArray = new int[inputArray.length + 1];
        int index;

        if (inputArray.length % 2 == 0) {
            index = inputArray.length / 2;
        } else {
            index = inputArray.length / 2 + 1;
        }

        for(int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = inputArray[i];
            } else if (i == index){
                newArray[i] = num;
            } else {
                newArray[i] = inputArray[i - 1];
            }
        }

        inputArray = newArray;

        return inputArray;
    }
}
