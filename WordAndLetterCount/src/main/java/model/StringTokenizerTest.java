/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author HELLO
 */
import java.util.HashMap;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    
    HashMap<String, Integer> strList = new HashMap<>();
    HashMap<Character, Integer> letterList = new HashMap<>();
    
    public void start(String string) {
        String str = string.toLowerCase();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreElements()) {
            String str2 = st.nextToken();
            Integer count = strList.get(str2);
            if (count == null) 
                strList.put(str2, 1);
            else 
                strList.put(str2, count+1);
            for (char c: str2.toCharArray()) {
                Integer letterCount = letterList.get(c);
                if (letterCount == null)
                    letterList.put(c, 1);
                else 
                    letterList.put(c, letterCount+1);
            }
        }
    }
    
    public HashMap<String, Integer> getStrList() {
        return strList;
    }
    
    public HashMap<Character, Integer> getLetterList() {
        return letterList;
    }  
    
}
