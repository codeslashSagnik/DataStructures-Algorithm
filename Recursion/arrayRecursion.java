import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayRecursion {
    public static void main(String[] args) {
        int []array={2,4,5,6,9,9,6,8,8,9,3};
        System.out.println(sortedArray(array, 0)); 
        System.out.println(findItems(array,6,0)); 
        System.out.println(findAllItems(array, 9, 0, new ArrayList<>())); 
        System.out.println(findAllItemsWhereListisNotInArgument(array, 9, 0));
        printtreesub(array);
    }
    static boolean sortedArray(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& sortedArray(arr, index+1);
    }
    static boolean findItems(int arr[],int target,int index){
        if (index==arr.length-1){
            return false;
        }
        return arr[index]==target||findItems(arr, target, index+1);
    }
    static ArrayList<Integer> findAllItems(int arr[],int target,int index,ArrayList<Integer>list){
        if (index==arr.length-1){
            return list;
                }
                if(arr[index]==target){
                    list.add(index);
                }
                return findAllItems(arr, target, index+1, list);

            }
    static ArrayList<Integer>findAllItemsWhereListisNotInArgument(int []arr,int target,int index){//This line defines the signature of the method with its return type and parameters.
        ArrayList<Integer>list =new ArrayList<>();//This line initializes a new ArrayList of integers called list.
        if(index==arr.length){//This line checks if the current index is equal to the length of the array. If it is, then the method returns an empty list because there are no more elements to search.
            return list;
        }
        if(arr[index]==target){//This line checks if the current element in the array is equal to the target value. If it is, then it adds the current index to the list.
            list.add(index);
        }
        ArrayList<Integer>frombelowcalls=findAllItemsWhereListisNotInArgument(arr, target, index+1);////This line recursively calls the findAllItemsWhereListisNotInArgument method with the same array and target value but with the index incremented by 1. It stores the result of the recursive call in a new ArrayList called frombelowcalls.
        list.addAll(frombelowcalls);//This line adds all the elements in frombelowcalls to list.
        return list;

/*The recursive function findAllItemsWhereListisNotInArgument takes three arguments: an integer array arr, 
an integer target, and an integer index. The function returns an ArrayList<Integer> 
containing the indices of all elements in the array arr that are not equal to the target.
The function starts by checking if the index is equal to the length of the array. 
If it is, then it means that we have gone through the entire array, so the function returns an empty ArrayList.
If the current element in the array at the given index is equal to the target, 
then the function adds the index to the list.
Next, the function makes a recursive call to itself with the same arr,
 target, and an incremented index value.
The result of the recursive call is stored in a new ArrayList<Integer> called frombelowcalls.
Finally, the function appends all the elements of the frombelowcalls list to the list 
and returns the final list that contains all the indices where the element is not equal to the target.
The recursion happens when the function calls itself with the updated index value, 
which iterates through the array until the last element is reached. During the recursion,
 the function keeps adding the index of elements that are not equal to the target to the list. 
 Once the last element is reached, the recursion begins to unwind, and the function returns the list with all the indices. */
    }

    static void printtreesub(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        printtreesub(temp);
        System.out.println(Arrays.toString(arr));
    }
}    

