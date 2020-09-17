// linecount.c - Count lines in a sourcefile

#include <stdio.h>

int main(int argc, char* args[]) {
    FILE* srcFile = NULL;
    char* srcFilename = "<srcFilename>";

    // Check the command-line.
    if (argc != 2) {
        printf("Usage: linecount <src>\n");
        return 0;
    }

    // Check if arguments are valid, if the srcFile exists, and if can create the dstFile.
    if (args[1] != NULL) { // Check <src>
        srcFilename = args[1];
//      printf("linecount: srcFilename = '%s'\n", srcFilename);
        srcFile = fopen(srcFilename, "r");
        if (srcFile == NULL) {
            printf("linecount: Cannot open srcFile '%s'\n", srcFilename);
            return 0;
        }
    } else {
        printf("linecount: [OK] srcFilename = '%s'\n", srcFilename);
    }

    // Execute the line count.
    int c;
    int nLines = 0;

    while ((c = fgetc(srcFile)) != EOF) {
        if (c == '\n') ++nLines;
    }

    // Close and flush the file.
    fclose(srcFile);

    // Print the result.
    printf("%d lines\n", nLines);
    return 1;
}
