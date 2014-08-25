// Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
// Very interesting idea...In my way, I have to use isSubString several times, this is stupid. This means this "plus" and "minus" idea is also important.

class Test{
        public static void main(String[] args){
                System.out.println("CareerCup 1.8!!!!");
                String s1 = "String";
                String s2 = "ingStr";
                RotString rs = new RotString();
                System.out.println(rs.isRotation(s2,s1));
        }
}

class RotString{
        // To check if s1 is the substring of s2
        public boolean isSubString(String s1, String s2){
                if (s1 == null || s1 == "")
                        return true;
                if (s2.indexOf(s1) >= 0)
                        return true;
                else 
                        return false;
        }

        public boolean isRotation(String s1, String s2){
                int n1 = s1.length();
                int n2 = s2.length();
                if (n1 ==0 || n2 ==0 || n1 != n2)
                        return false;
                else{
                        String s = s1 + s2;
                        return isSubString(s2,s);
                }
                
        }
}
