class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> list = paths
                .stream()
                .map(cities -> cities.get(1))
                .toList();
        return list.stream()
                .filter(city -> !paths.stream().map(cities -> cities.get(0)).toList().contains(city))
                .findAny()
                .get();
    }
}