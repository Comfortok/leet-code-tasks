class Solution {
    public int findComplement(int n) {
        String binary = Integer.toBinaryString(n);
        int result = n ^ ((1 << binary.length()) - 1);
        return result;
    }
}