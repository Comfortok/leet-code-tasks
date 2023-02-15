class Solution {
    
    public int distinctIntegers(int n) {
        Set<Integer> numsOnBoard = new HashSet<>();
        numsOnBoard.add(n);
        countRemainingNums(n, numsOnBoard);
        return numsOnBoard.size();
    }
    
    private void countRemainingNums(int n, Set<Integer> numsOnBoard) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                numsOnBoard.add(i);
                countRemainingNums(i, numsOnBoard);
            }
        }
    }
    
}