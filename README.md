# 🚀 Mars Rover Control Program

Welcome to the **Mars Rover TDD Practice** repository! This is a training exercise designed to help you practice **Test-Driven Development (TDD)** while solving a real-world inspired problem.

## 📘 Background

Imagine you're a software engineer on a Mars exploration team. You're tasked with developing a control system for a Mars rover that receives movement commands from Earth and reports its final position.

## 🎯 Objectives

* Understand and apply **TDD principles**.
* Break down requirements into smaller, testable tasks.
* Commit changes in **small, logical increments**.
* Ensure full test coverage and code correctness.

## 📜 Requirements

The Mars Rover is initialized with:

* A starting position: `(x, y)`
* A facing direction: `N`, `E`, `S`, or `W`

### 🔧 Supported Commands:

| Command | Description            |
| ------- | ---------------------- |
| `M`     | Move forward one unit  |
| `L`     | Turn left 90 degrees   |
| `R`     | Turn right 90 degrees  |
| `B`     | Move backward one unit |

Commands may be sent as **single commands** or **batch strings** (e.g., `"MRMLB"`).

---

## 💡 Hints

- Remember the direction cycle for turns:
    - Left turn: N → W → S → E → N
    - Right turn: N → E → S → W → N
- Moving forward or backward depends on the current direction.
- Keep your code clean and modular for easier testing.

--- 

## 🧪Example Test Case
```java
@Test
void test_moveForward() {
    MarsRover rover = new MarsRover(0, 0, Direction.N);
    rover.execute("M");
    assertEquals("(0, 1) N", rover.report());
}
```
This test verifies moving forward by one unit from initial position (0, 0) facing North results in (0, 1) N.

---

## 📂 Project Structure

```
├── src
│   └── main
│       └── java
│           └── MarsRover.java
│           └── *.java
│
├── test
│   └── java
│       └── MarsRoverTest.java
│
└── README.md
```

## 🧪 How to Test

This project uses JUnit 5. Run tests via your IDE or build tool (Maven/Gradle).

## 🧠 Tips

* Start small: write a failing test, make it pass, then refactor.
* Use meaningful test names.
* Make **frequent small commits** as you progress through the requirements.
* Do not implement the whole solution up front—follow the red-green-refactor cycle.

## 🔁 Example

Input:

```
Initial: (0, 0, N)
Command: MRMLM
```

Final Report:

```
(1, 2) N
```

## 🏁 Stretch Goal (Optional)

* Handle invalid commands gracefully.
* Consider using a 3D grid with (x, y, z) positioning.

---

Happy coding! 💻

📢 **Remember:** TDD = Think in tests first!

---

*Prepared for Training Session - 2025*  
*Instructor: Wei Huang / Thoughtworks*