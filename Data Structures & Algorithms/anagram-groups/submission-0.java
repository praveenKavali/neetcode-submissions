class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            char[] currentString = strs[i].toCharArray();
            Arrays.sort(currentString);
            String s = new String(currentString);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
