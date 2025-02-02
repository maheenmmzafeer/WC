# Word Count Utility (Java)

This is a simple command-line word count utility in Java, similar to the Unix `wc` command. It allows users to count lines, words, characters, and bytes in a given file.

## Usage

Compile the program using:

```sh
javac Main.java WC.java
```

Run the program with the following syntax:

```sh
java Main [options] <file>
```

### Options

- `-l` : Count lines
- `-w` : Count words
- `-c` : Count characters
- `-b` : Count bytes

If no options are provided, all counts (lines, words, characters, and bytes) are displayed.

### Example

To count lines, words, characters, and bytes in `sample.txt`, run:

```sh
java Main sample.txt
```

To count only words and characters:

```sh
java Main -w -c sample.txt
```
