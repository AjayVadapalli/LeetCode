class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        long val = 1;
        result.add((int) val); 

        for (int i = 1; i <= rowIndex; i++) {
            val = val * (rowIndex - i + 1) / i;  
            result.add((int) val);  
        }

        return result;
    }
}