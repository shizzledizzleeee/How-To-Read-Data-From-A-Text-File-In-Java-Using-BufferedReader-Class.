/*
 * How To Read Data From A Text File In Java Using BufferedReader Class.
 * https://mauricemuteti.info/how-to-read-data-from-a-text-file-in-java-using-bufferedreader-class/
 */
package readfromatextfilebufferedreaderclassjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Authentic
 */
public class ReadFromATextFileBufferedReaderClassJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Storing File Name In A String Variable.
        String fileName = "textFileData.txt";

        //Invoking readFromATextFileBufferedReaderClassJava Method.
        readFromATextFileBufferedReaderClassJava(fileName);

    }

    /**
     * readFromATextFileBufferedReaderClassJava Method.
     *
     * Static Method for reading data From A Text File BufferedReader Class In
     * Java.
     *
     * @param fileName
     */
    public static void readFromATextFileBufferedReaderClassJava(String fileName) {
        File file = new File(fileName);
        String content;
        int textFileNumberOfLines = 0;
        //Creating FileReader Object.
        FileReader fileReader = null;
        //Creating BufferedReader Object.
        BufferedReader bufferedReader = null;
        try {
            System.out.println("Inside try catch block.");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            System.out.println("Reading From A Text file.");
            while ((content = bufferedReader.readLine()) != null) {
                textFileNumberOfLines++;
                System.out.println("Line " + textFileNumberOfLines + " : " + content);
            }
            System.out.println("Finished Reading From A Text file.");
        } catch (IOException iOException) {
            System.out.println("Error : " + iOException.getMessage());
        } finally {

            if (bufferedReader != null) {
                try {
                    System.out.println("Closing Buffered Reader Object");
                    //Closing Buffered Reader Object
                    bufferedReader.close();
                } catch (IOException iOException) {
                    System.out.println("Error : " + iOException.getMessage());
                }
            }

            if (fileReader != null) {
                try {
                    System.out.println("Closing File Reader Object");
                    //Closing File Reader Object
                    fileReader.close();
                } catch (IOException iOException) {
                    System.out.println("Error : " + iOException.getMessage());
                }
            }
        }

    }
}
