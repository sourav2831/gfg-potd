//Inorder Traversal and BST

class Solution {
    static int isRepresentingBST(int arr[], int N) {
        int i=1;
        while(i<N){
            if(arr[i]<arr[i-1])return 0;
            i++;
        }
        return 1;
    }
}