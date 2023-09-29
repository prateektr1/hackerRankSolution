Step by step Instructions to run the file

1. Clone the repo https://github.com/prateektr1/hackerRankSolution-Question3.git
2. Open CMD
3. Navigate to folder hackerRankSolution-Question3.git
4. Run the commands as per your requirements mentioned below

# ASCII Text Stream Processor (sproc)

This is a command-line tool for processing ASCII text streams. It provides commands for searching and updating text streams.

## Usage

### Search
To search for occurrences of a string in a text stream, use the following command:

```sh
java Main search <SEARCH_STRING>

Example:

sh
Copy code
java Main search needle
Update
To replace sections in a text stream with an input string, use the following command:

sh
Copy code
java Main update <LINE1,COLUMN1:LINE2,COLUMN2> <UPDATE_STRING>
Example:

sh
Copy code
java Main update 3,14:3,19 fiddle
Input
The input text stream should be provided through standard input (stdin). You can pipe a file or enter text manually.

Output
The output is displayed on standard output (stdout).

Note
Lines and columns start from 1.
Only exact matches with the SEARCH_STRING are counted.
Both ends of the range in the update command are inclusive, and characters at these points are also overwritten.
How to Run
Compile the Java code:

sh
Copy code
javac Main.java TextStreamProcessor.java
Run the sproc tool:

For searching:
sh
Copy code
java Main search <SEARCH_STRING>
For updating:
sh
Copy code
java Main update <LINE1,COLUMN1:LINE2,COLUMN2> <UPDATE_STRING>
Provide the input text stream through stdin (e.g., pipe a file or enter text manually).

View the output on stdout.

This is a basic implementation to get you started. Depending on your requirements, you may need to add more features and error handling to make it more robust and user-friendly.

perl
Copy code

Please make sure to replace `<SEARCH_STRING>`, `<LINE1,COLUMN1:LINE2,COLUMN2>`, and `<UPDATE_STRING>` with actual values when using the tool.
