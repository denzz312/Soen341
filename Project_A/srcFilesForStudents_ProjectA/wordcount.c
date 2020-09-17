// wordcount.c - Count words in a sourcefile

#include <stdio.h>

typedef enum {false, true} bool;

bool isSpace(int c) {
    return (c == ' ' || c == '\t');
}

int main(int argc, char* args[]) {
    FILE* srcFile = NULL;
    char* srcFilename = "<srcFilename>";

    // Check the command-line.
    if (argc != 2) {
        printf("Usage: wordcount <src>\n");
        return 0;
    }

    // Check if arguments are valid, if the srcFile exists, and if can create the dstFile.
    if (args[1] != NULL) { // Check <src>
        srcFilename = args[1];
//      printf("linecount: srcFilename = '%s'\n", srcFilename);
        srcFile = fopen(srcFilename, "r");
        if (srcFile == NULL) {
            printf("wordcount: Cannot open srcFile '%s'\n", srcFilename);
            return 0;
        }
    } else {
        printf("wordcount: [OK] srcFilename = '%s'\n", srcFilename);
    }

    // Execute the word count.
    int  c;
    int  nWords = 0;
    bool inWord = false;

    while ((c = fgetc(srcFile)) != EOF) {
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

    // Print the result.
    printf("%d words\n", nWords);
    return 1;
}
