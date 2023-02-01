class Solution {
    public int maxNumberOfBalloons(String text) {
        int result = 0;
        String balloon = "balloon";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (balloon.contains(String.valueOf(ch))) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        if (map.size() < 5) {
            return result;
        }

        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);

        return Collections.min(map.values());
    }
}