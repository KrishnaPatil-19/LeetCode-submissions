# Read from the file file.txt and output the tenth line to stdout.
sed -n '10{p;q}' file.txt