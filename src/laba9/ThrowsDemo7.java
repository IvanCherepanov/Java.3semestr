package laba9;

import java.util.Scanner;

public class ThrowsDemo7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        try {
            if(key == "") {
                throw new Exception( "Key set to empty string" );
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemo7 throwsDemo7 = new ThrowsDemo7();
        throwsDemo7.getKey();
    }
}
