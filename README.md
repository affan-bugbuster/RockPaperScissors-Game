# Java Rock Paper Scissors Game

## Overview

This project is a simple command-line **Rock Paper Scissors** game developed in Java. The player competes against the computer by selecting Rock, Paper, or Scissors. The computer randomly generates its choice, and the program determines the winner based on the standard rules of the game.

This project demonstrates the use of user input, random number generation, conditional statements, and basic game logic in Java.

## Features

* Interactive command-line gameplay
* User selects Rock, Paper, or Scissors
* Computer generates a random choice
* Displays both the player's and computer's selections as text
* Determines the winner automatically
* Detects tie games
* Validates user input and handles invalid selections

## Technologies Used

* Java
* `Scanner` class for user input
* `Random` class for random computer choices

## Game Rules

| Number | Choice   |
| -----: | -------- |
|      0 | Rock     |
|      1 | Paper    |
|      2 | Scissors |

Winning Rules:

* Rock beats Scissors
* Paper beats Rock
* Scissors beats Paper
* If both players choose the same option, the game ends in a tie.

## How It Works

1. The program welcomes the player.
2. The player selects one of the following options:

   * `0` = Rock
   * `1` = Paper
   * `2` = Scissors
3. The program displays the player's choice.
4. The computer randomly selects one of the three options.
5. The computer's choice is displayed.
6. The program compares both choices and announces the winner.
7. If an invalid number is entered, the program displays an error message and exits.

## Example

```text
Welcome to the Game

Enter your choice:
0: Rock, 1: Paper, 2: Scissors

1

Your Choice: Paper
Computer Choice: Rock

Congratulation! You Wins
```

## Project Structure

```text
day4/
└── RockPaperScissorsGame.java
```

## How to Run

1. Compile the program:

```bash
javac day4/RockPaperScissorsGame.java
```

2. Run the program:

```bash
java day4.RockPaperScissorsGame
```

## Future Improvements

* Allow users to play multiple rounds without restarting the application.
* Keep track of player and computer scores.
* Implement a "Best of 3" or "Best of 5" game mode.
* Replace the `if-else` statements with a `switch` statement for cleaner code.
* Handle non-numeric input using exception handling.
* Add colorful console output or ASCII art to enhance the user experience.

## Learning Objectives

This project was created to practice the following Java concepts:

* User input with the `Scanner` class
* Random number generation using the `Random` class
* Conditional statements (`if-else`)
* Input validation
* Basic game logic
* Console output formatting

## Author

Created as a beginner Java project to strengthen programming fundamentals and object-oriented programming concepts in Java.
