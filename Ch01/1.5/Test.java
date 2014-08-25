// CareerCup 1.5
// Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. if the "compressed" string would not become smaller than the original string, your method should return the original string.
//
// Problem I have got
// 1. I did not notice the end situation
// 2. I did not check the size, or let me put this way, I did not understand the size information.

class Test{
    public static void main(String[] args){
            System.out.println("CareerCup 1.5!!!!");
            String s1 = "abcd";
            String s2 = "aabcccccaaa";
            Compression c = new Compression();
            System.out.println("Original String 1: " + s1);
            System.out.println("Compressed: " + c.compress(s1));
            System.out.println("Original String 2: " + s2);
            System.out.println("Compressed: " + c.compress(s2));
    }
}

class Compression{
    public String compress(String s){
            if (s == null || s.isEmpty())
                    return null;
            char[] c = s.toCharArray();
            int i, count = 1, size = 0;
            StringBuffer sb = new StringBuffer();
            for (i = 0;i < c.length-1; i++){
                    if (c[i] == c[i+1]){
                            count++;
                    }else{
                          sb.append(c[i]);
                          sb.append(count);
                          count = 1;
                          size += 1 + count;
                    }
            }
            size += 1 + count;
            if (size <= s.length()){
            		sb.append(c[i]);
            		sb.append(count);
            		return sb.toString();
            }
            else
                    return s;
    }
}
