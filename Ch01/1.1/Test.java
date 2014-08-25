// CareerCup 1.1 
// Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure?
//
// I did not use the bit vector in the first method
// Pay Attention to Bit Vector, a bit hard to understand at first glance
// checker |= (1 << val)
class Test{
        public static void main(String[] args){
                String s1 = "3ay2uy";
                String s2 = "23jui";
                isUniqueChar iuc = new isUniqueChar();
                System.out.println(iuc.method1(s2));
                System.out.println(iuc.method2(s1));
        }
}

class isUniqueChar{
        public boolean method1(String s){
                int[] table = new int[256];
                for (int i=0;i < s.length();i++){
                        int temp = s.charAt(i);
                        if (table[temp] == 1)
                                return false;
                        else
                                table[temp] = 1;
                }
                return true;
        }

       public boolean method2(String s){
               for (int i=0;i<s.length()-1;i++){
                       for (int j=i+1;j<s.length();j++){
                               int temp1 = s.charAt(i);
                               int temp2 = s.charAt(j);
                               if (temp1 == temp2)
                                       return false;
                       }
               }
               return true;
       }
}
