# Word Count Utility (Java)

This is a simple command-line word count utility in Java, similar to the Unix `wc` command. It allows users to count lines, words, characters, and bytes in a given file.

## Features

- Line counting
- Word counting
- Character counting
- Byte counting
- JUnit tests

## Tech Stack

- Java
- JUnit 4

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

## Project Structure

```text
src/
├── Main.java
├── WC.java
└── Test/
    └── WCTest.java
```

### Example

To count lines, words, characters, and bytes in `sample.txt`, run:

```sh
java Main sample.txt
```

To count only words and characters:

```sh
java Main -w -c sample.txt
```

## Challenge

Built as part of the Coding Challenges WC challenge:

https://codingchallenges.fyi/challenges/challenge-wc/
