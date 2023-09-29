import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: sproc <command> [arguments]");
            System.exit(1);
        }

        String command = args[0];

        if ("search".equals(command)) {
            if (args.length < 2) {
                System.err.println("Usage: sproc search <SEARCH_STRING>");
                System.exit(1);
            }

            String searchString = args[1];
            TextStreamProcessor.searchAndPrint(searchString);
        } else if ("update".equals(command)) {
            if (args.length < 4) {
                System.err.println("Usage: sproc update <LINE1,COLUMN1:LINE2,COLUMN2> <UPDATE_STRING>");
                System.exit(1);
            }

            String range = args[1];
            String updateString = args[2];
            TextStreamProcessor.updateAndPrint(range, updateString);
        } else {
            System.err.println("Invalid command: " + command);
            System.exit(1);
        }
    }
}
