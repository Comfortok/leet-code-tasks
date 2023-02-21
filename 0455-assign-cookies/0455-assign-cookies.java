class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        List<Integer> children = new ArrayList<>(Arrays.stream(g).boxed().collect(Collectors.toList()));
        Collections.sort(children);
        List<Integer> cookies = new ArrayList<>(Arrays.stream(s).boxed().collect(Collectors.toList()));
        Collections.sort(cookies);

        int i = children.size() - 1;
        int j = cookies.size() - 1;
        while (i >= 0 && j >= 0) {
            if (cookies.get(j) >= children.get(i)) {
                count++;
                i--;
                j--;
            } else {
                i--;
            }
        }

        return count;
    }
}