# Read from the file words.txt and output the word frequency list to stdout.
awk '{
    for (i = 1; i <= NF; i++) {
        print $i
    }
}' words.txt | sort | uniq -c | awk '{print $2, $1}' | sort -k2nr