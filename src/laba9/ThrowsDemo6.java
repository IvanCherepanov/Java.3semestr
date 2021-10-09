
package laba9;

import java.util.Scanner;
// пока не разобрался куда вставить throws Exception
public class ThrowsDemo6 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key)  {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) {
        try {
            if(key == "") {
                throw new Exception( "Key set to empty string" );
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception{
        ThrowsDemo6 throwsDemo6 = new ThrowsDemo6();
        throwsDemo6.getKey();
    }
}

