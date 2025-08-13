class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        Map<Character ,String > keypad = new HashMap<>();
        keypad.put('2', "abc");
        keypad.put('3', "def");
        keypad.put('4', "ghi");
        keypad.put('5', "jkl");
        keypad.put('6', "mno");
        keypad.put('7', "pqrs");
        keypad.put('8', "tuv");
        keypad.put('9', "wxyz");
        func(0,digits,keypad,res,"");
        return res;
    }
    public void func(int ind, String dig,Map<Character ,String > keypad, List<String> res, String cur){
        if(dig.length()==cur.length()){
            res.add(cur);
            return;
        }
        String l = keypad.get(dig.charAt(ind));
        for(char ch : l.toCharArray()){
            func(ind+1,dig,keypad,res,cur+ch);
        }
        
    }
}