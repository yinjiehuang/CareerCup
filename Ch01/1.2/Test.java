// CareerCup 1.2
// Implement a function void reverse (char* str) in C or C++ which reverses a null-terminated string
//
// Only make sure this reverse is implemented in place
// we can do it o(n)
//
// The mistakes I made in this problem
// 1. can't believe I made mistakes on the boundary of the array, shit
// 2. this time I learned some techniques of how to transfer between char array and string, good to know

class Test
{
        public static void main(String[] args)
        {
                String s = "abcd";
                char[] c = s.toCharArray();
                int i = 0, j = s.length()-1;
                while(true)
                {
                        if (i < j)
                        {
                                char t = c[i];
                                c[i] = c[j];
                                c[j] = t;
                                i++;
                                j--;
                        }else
                                break;
                }
                System.out.println(c);
        }
}
