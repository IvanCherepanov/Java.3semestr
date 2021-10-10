package laba24;

import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );

        while(true){
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try {
                printDetails( key );
            }
            catch (Exception e){
                System.out.println(e);
                continue;
            }
            break;
        }

    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo8 throwsDemo8 = new ThrowsDemo8();
        throwsDemo8.getKey();
    }

}
