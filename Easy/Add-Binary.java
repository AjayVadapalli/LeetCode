class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry=0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int bitA = 0;
            int bitB = 0;

            if (i >= 0) {
                if (a.charAt(i) == '1') bitA = 1;
                i--;
            }

            if (j >= 0) {
                if (b.charAt(j) == '1') bitB = 1;
                j--;
            }

            int total = bitA + bitB + carry;

            if (total == 0) {
                sb.append('0');
                carry = 0;
            } else if (total == 1) {
                sb.append('1');
                carry = 0;
            } else if (total == 2) {
                sb.append('0');
                carry = 1;
            } else if (total == 3) {
                sb.append('1');
                carry = 1;
            }
        }

        return sb.reverse().toString();
    }
}