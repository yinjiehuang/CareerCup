// CareerCup 1.4
// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end of the string to hold the additional characters, and that ou are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
// Example
// Input:  "Mr John Smith    "
// Output: "Mr%20John%20Smith"


class Test{
        public static void main(String[] args){
                System.out.println("CareerCup 1.4!!!");
                String s = "Mr John Smith    ";
                Replace r = new Replace();
                System.out.println(r.run(s));
        }
}

class Replace{
        public String run(String str1){
                int flag = 0;
                int j = str1.length()-1;
                char[] ch = str1.toCharArray();
                for (int i = str1.length()-1; i >= 0; i--){
                        if (ch[i] == ' ' && flag == 0){
                                continue;
                        }else if (ch[i] != ' '){
                                char temp = ch[j];
                                ch[j] = ch[i];
                                ch[i] = temp;
                                flag = 1;
                                j--;
                        }else{
                                ch[j] = '0';
                                ch[j-1] = '2';
                                ch[j-2] = '%';
                                j = j - 3;
                        }
                }
                return new String(ch);
        }
}
