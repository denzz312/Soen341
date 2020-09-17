// wc.c - Count characters, lines, and words

#include <stdio.h>

typedef enum {false, true} bool;

bool isSpace(int c) {
    return (c == ' ' || c == '\t');
}

int main(int argc, char* args[]) {
    FILE* srcFile = NULL;
    char* srcFilename = "<srcFilename>";
    int   totalLines, totalWords, totalChars;

    // Check the command-line.
    if (argc < 2) {
        printf("Usage: wc <src> { <src> }\n");
        return 0;
    }

    for (int n = 1; n < argc; ++n) {
        // Check if arguments are valid, if the srcFile exists, and if can create the dstFile.
        if (args[n] != NULL) { // Check <src>
            srcFilename = args[n];
//          printf("linecount: srcFilename = '%s'\n", srcFilename);
            srcFile = fopen(srcFilename, "r");
            if (srcFile == NULL) {
                printf("wc: Cannot open srcFile '%s'\n", srcFilename);
                return 0;
            }
        } else {
            printf("wc: [OK] srcFilename = '%s'\n", srcFilename);
        }

        // Execute the word count.
        totalLines = totalWords = totalChars = 0;
        int  c;
        int  nChars, nLines, nWords;
        bool inWord = false;
        
        nChars = nLines = nWords = 0;

        while ((c = fgetc(srcFile)) != EOF) {
            // Count characters.
            ++nChars;

            // Count lines.
            if (c == '\n') ++nLines;


            // Count words.
            if (!isSpace(c)) {
                if (!inWord) {
                    inWord = true;
                    ++nWords;
                }
            } else {
                inWord = false;
            }
        }
        // Close and flush the file.
        fclose(srcFile);

        // Print the result of the source file.
        printf("%s: %d lines, %d words, %d chars\n",
               srcFilename, nLines, nWords, nChars);

        totalLines += nLines;
        totalWords += nWords;
        totalChars += nChars;
    }

    // Print the total if more than one source file.
    if (argc > 2) {
        printf("**Total: %d lines, %d words, %d chars\n",
               totalLines, totalWords, totalChars);
    }
    return 1;
}
