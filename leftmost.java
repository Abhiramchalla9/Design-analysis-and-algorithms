public class leftmost {    
    public static void main(String args[]) {
        int[] A = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        int target = 4;
        int low = 0;
        int high = A.length - 1;
        int res = -1;  

        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) {
                res = mid;  
                high = mid - 1;  
            } else if (A[mid] < target) {
                low = mid + 1;  
            } else {
                high = mid - 1;  
            }
        }
        if (res != -1) {
            System.out.println("The rightmost occurrence of " + target + " is at index " + res);
        } else {
            System.out.println("The target " + target + " is not in the array.");
        }
    }
}

