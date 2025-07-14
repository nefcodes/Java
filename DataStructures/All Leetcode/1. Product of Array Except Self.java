
/*
Q.238
given an array, return an array that has each item as product of all items excluded itself
brute force approach using simple division

 */
class solution {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int solutionArray[] = new int[arr.length];
        int allMultiplied = 1;

        //array of [multiplication of all numbers except ith index]
        for(int i : arr){
            allMultiplied *= i;

        }

        for(int i = 0; i < arr.length; i++ ){
            solutionArray[i] = allMultiplied / arr[i];
        }

        for(int item : solutionArray){
            System.out.println(item);
        }

    }
}
