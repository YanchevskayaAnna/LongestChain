import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesApp {

    public static final String READFILE = "src/main/resources/input.txt";
    public static final String WRITEFILE = "src/main/resources/output.txt";

    public static char[] readFile(){
        try(FileReader reader = new FileReader(READFILE))
        {
            char [] a = new char[100];   // Количество символов, которое будем считывать
            reader.read(a);
            return a;
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return new char[0];
    }

    public static void writeFile(String maxSequence)  {
        try(FileWriter writer = new FileWriter(WRITEFILE, false))
        {
            writer.write(maxSequence);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
