// charcount.c - Count characters in a sourcefile

#include <stdio.h>

int main(int argc, char* args[]) {
    FILE* srcFile = NULL;
    char* srcFilename = "<srcFilename>";

    // Check the command-line.
    if (argc != 2) {
        printf("Usage: charcount <src>\n");
        return 0;
    }

    // Check if arguments are valid, if the srcFile exists, and if can create the dstFile.
    if (args[1] != NULL) { // Check <src>
        srcFilename = args[1];
//      printf("charcount: srcFilename = '%s'\n", srcFilename);
        srcFile = fopen(srcFilename, "r");
        if (srcFile == NULL) {
            printf("charcount: Cannot open srcFile '%s'\n", srcFilename);
            return 0;
        }
    } else {
        printf("charcount: [OK] srcFilename = '%s'\n", srcFilename);
    }

    // Execute the character count.
    int c;
    int nChars = 0;

    while ((c = fgetc(srcFile)) != EOF) {
        ++nChars;
    }

    // Close and flush the file.
    fclose(srcFile);

    // Print the result.
    printf("%d characters\n", nChars);
    return 1;
}
