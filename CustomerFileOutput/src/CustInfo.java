import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustInfo {

    public static void main(String [] args){

        Scanner cinput = ( new Scanner( System.in ) );
        String firstName = ( "" );
        String lastName = ( "" );
        String address = ( "" );
        String country = ( "" );
        String phoneNumber = ( "" );
        String email = ( "" );

        System.out.print( "Enter First Name: " );
        firstName = ( cinput.nextLine( ) );

        System.out.print( "Enter Last Name: " );
        lastName = ( cinput.nextLine( ) );

        System.out.print( "Enter Address: " );
        address = ( cinput.nextLine( ) );

        System.out.print( "Enter Country: " );
        country = ( cinput.nextLine( ) );

        System.out.print( "Enter Phone Number: " );
        phoneNumber = ( cinput.nextLine( ) );

        System.out.print( "Enter Email: " );
        email = ( cinput.nextLine( ) );


        File file = ( new File( firstName + lastName + ".txt" ) );

        try {
            file.createNewFile( );

            FileWriter fout = ( new FileWriter( file.toString( ) ) );

            fout.write ( firstName + "\r\n" );
            fout.write( lastName + "\r\n" );
            fout.write( address + "\r\n" );
            fout.write( country + "\r\n" );
            fout.write( phoneNumber + "\r\n" );
            fout.write( email + "\r\n" );
            fout.write( "Dell Laptop Computer" + "\r\n" );
            fout.write( "$400 " );

            fout.close();
        }
        catch ( IOException e ) {

            System.err.println( e.getMessage( ) );
        }
    }
}
