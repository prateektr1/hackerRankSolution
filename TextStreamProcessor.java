import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class TextStreamProcessor {
    private static StringBuilder textStream = new StringBuilder();

    public static void searchAndPrint(String searchString) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int lineNo = 0;

        while ((line = reader.readLine()) != null) {
            lineNo++;
            int col = 0;
            Matcher matcher = Pattern.compile(searchString).matcher(line);
            
            while (matcher.find()) {
                col = matcher.start() + 1;
                int endCol = matcher.end();
                System.out.println(lineNo + "," + col + ":" + lineNo + "," + endCol);
            }
        }
    }

    public static void updateAndPrint(String range, String updateString) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int lineNo = 0;

        while ((line = reader.readLine()) != null) {
            lineNo++;
            StringBuilder updatedLine = new StringBuilder(line);
            String[] parts = range.split(":");
            String[] start = parts[0].split(",");
            String[] end = parts[1].split(",");
            int startLine = Integer.parseInt(start[0]);
            int startCol = Integer.parseInt(start[1]);
            int endLine = Integer.parseInt(end[0]);
            int endCol = Integer.parseInt(end[1]);

            if (lineNo >= startLine && lineNo <= endLine) {
                // Update the line within the specified range
                int startIndex = startCol - 1;
                int endIndex = endCol;
                
                for (int i = startIndex; i < endIndex; i++) {
                    if (i >= updatedLine.length()) {
                        updatedLine.append(updateString.charAt(i - startIndex));
                    } else {
                        updatedLine.setCharAt(i, updateString.charAt(i - startIndex));
                    }
                }
            }

            System.out.println(updatedLine.toString());
        }
    }
}
