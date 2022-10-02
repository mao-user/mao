public class string {
    class Solution {
        public String reverseWords(String s) {
            String[] way = s.split(" ");
            for(int i=0;i<way.length;i++){
                char[] part = way[i].toCharArray();
                reverse(part, 0, part.length-1);
                way[i] = part.toString();
            }
            return String.join(" ",way);
        }
        public void reverse(char[] s,int left,int right){
            while(left < right){
                char way = s[left];
                s[left] = s[right];
                s[right] = way;
                left++;
                right--;
            }
        }
    }
}
