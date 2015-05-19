import com.healthmarketscience.jackcess.*;
import java.io.*;
public class AccessExport {
  public static void main(String []args) throws IOException {
    System.out.println(Database.open(new File(args[0])).getTable(args[1]).display());
  }
}