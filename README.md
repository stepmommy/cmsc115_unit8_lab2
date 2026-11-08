# Reflection – AI Number Program Lab

## Student Name:
(Enter your name here)

## GitHub Repository Link:
(Insert your repository URL here)

## Iteration 1

What the AI code does:
- This first implementation adds the array values and returns their sum. The initial prompt did not specify what result to calculate, so this was one possible interpretation.

Tests passed/failed:
- Assertion-by-assertion analysis predicts that the largest-value, all-negative, and empty-array checks fail; the single-value check passes. Java and Maven are unavailable in this shell, so I could not execute JUnit here. Confirm these results in IntelliJ.

What surprised you:
- The method can compile and return a number while still doing the wrong task. The prompt needs to say what result is wanted.

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- Replaced summing with a loop that compares the values and returns the largest one.

What improved:
- The mixed-value, single-value, and all-negative checks now match the requested largest-value behavior.

What still failed and why:
- The empty-array check fails because the code reads `values[0]` before checking whether the array has any elements. The second prompt did not yet define empty-array behavior.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
-

What was fixed:
-
What you learned:
-
Commit message:
-

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?
