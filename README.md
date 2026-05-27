# 🎮 Guess The Number Game

A fun and interactive Java console game where the player tries to guess a randomly generated number within a limited number of attempts. Built using core Java concepts including random number generation, conditional logic, and loop control.

---

## 📌 About the Project

This project is a classic number guessing game that demonstrates fundamental Java programming concepts — random number generation, input handling, conditional statements, loops, and clean user interaction through the console.

---

## ✨ Features

- 🎲 Random number generation within a defined range (e.g., 1–100)
- 💬 Hints after each guess — "Too High!" or "Too Low!"
- 🔢 Limited attempts to add challenge
- 🏆 Win/lose outcome with attempt count display
- 🔁 Option to play again after each round
- 📊 Score tracking across multiple rounds

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java | Core programming language |
| java.util.Random | Random number generation |
| Scanner | Console input handling |
| Control Flow | if-else, loops, switch statements |

---

## 📁 Project Structure

```
Guess-The-Number-Game/
│
├── GuessTheNumberGame/
│   ├── src/
│   │   ├── Main.java              # Entry point & game loop
│   │   ├── Game.java              # Core game logic
│   │   └── ScoreTracker.java      # Score management
│
└── README.md
```

---

## ⚙️ How to Run

### Prerequisites
- Java JDK 8 or above
- Any IDE or terminal

### Steps

```bash
# Clone the repository
git clone https://github.com/Gethe-Anuradha/Guess-The-Number-Game.git
cd Guess-The-Number-Game/GuessTheNumberGame

# Compile
javac src/*.java

# Run
java src.Main
```

---

## 🖥️ Sample Output

```
===== Guess The Number Game =====
I have picked a number between 1 and 100.
You have 7 attempts. Good luck!

Attempt 1: Enter your guess: 50
Too High! Try again.

Attempt 2: Enter your guess: 25
Too Low! Try again.

Attempt 3: Enter your guess: 37
🎉 Correct! You guessed it in 3 attempts!

Play again? (yes/no): 
```

---

## 🎯 Key Concepts Applied

- **Random Number Generation** — java.util.Random for dynamic gameplay
- **Conditional Logic** — if-else for hint generation and win/lose detection
- **Loop Control** — while loop for game flow management
- **Input Handling** — Scanner class for reading user guesses
- **OOP Principles** — Modular class design for game logic and score tracking

---

## 👩‍💻 Developer

**Anuradha Gethe**
- 🔗 [LinkedIn](https://www.linkedin.com/in/anuradha-gethe-a27232213)
- 🐙 [GitHub](https://github.com/Gethe-Anuradha)
- 📧 anuradhagethe845@gmail.com
