// copy.c - Copy sourceFile to destinationFile

#include <stdio.h>

#define EOF -1

int main(int argc, char* args[]) {
    FILE* srcFile = NULL;
    FILE* dstFile = NULL;
    char* srcFilename = "<srcFilename>";
    char* dstFilename = "<dstFilename>";

    // Check the number of arguments.
    // In C, the command name 'copy' is considered as an argument.
    if (argc != 3) {
        printf("Usage: copy.exe <src> <dst> (on Windows)\n");
        return 0;
    }

    // Check if arguments are valid, if the srcFile exists, and if can create the dstFile.
    if (args[1] != NULL) { // Check <src>
        srcFilename = args[1];
        printf("copy: srcFilename = '%s'\n", srcFilename);
        srcFile = fopen(srcFilename, "r");
        if (srcFile == NULL) {
            printf("copy: Cannot open srcFile '%s'\n", srcFilename);
            return 0;
        }
    } else {
        printf("copy: [OK] srcFilename = '%s'\n", srcFilename);
    }

    if (args[2] != NULL) { // Check <dst>
        dstFilename = args[2];
        printf("copy: dstFilename = '%s'\n", dstFilename);
        dstFile = fopen(dstFilename, "w");
        if (dstFile == NULL) {
            printf("copy: Cannot open dstFile '%s'\n", dstFilename);
            return 0;
        }
    } else {
        printf("copy: [OK] dstFilename = '%s'\n", dstFilename);
    }

    // Execute the copy.
    int c;

    while ((c = fgetc(srcFile)) != EOF) {
        fputc(c, dstFile);
        putchar('.');
    }

    // Close and flush all the files.
    fclose(srcFile);
    fclose(dstFile);

    printf("copy: done.\n");
    return 1;
}
