# Read from the file file.txt and print its transposed content to stdout.
awk '
{
    for (i = 1; i <= NF; i++) {
        values[i, NR] = $i
    }
}

END {
    for (i = 1; i <= NF; i++) {
        for (j = 1; j <= NR; j++) {
            if (j > 1) {
                printf " %s", values[i,j]
            }
            else {
                printf "%s", values[i,j]
            }
        }
        printf "\n"
    }
}
' file.txt