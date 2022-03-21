package work;

public class MphasisDemo {

     public static void main(String[] args)
    {
        String  str = new String("MPHASIS");
        printRotatedString(str);
    }


    static void printRotatedString(String str)
    {
        int len = str.length();
   
        StringBuffer sb;
         
        for (int i = 0; i < len; i++)
        {
            sb = new StringBuffer();
             
            int j = i;  
            int k = 0;        
            
            for (int k2 = j; k2 < str.length(); k2++) {
                sb.insert(k, str.charAt(j));
                k++;
                j++;
            }
      
            
            j = 0;
            while (j < i)
            {
                sb.insert(k, str.charAt(j));
                j++;
                k++;
            }
      
            System.out.println(sb);
        }
    }

}
