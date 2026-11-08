# Reflection – AI Number Program Lab

## Student Name:


## GitHub Repository Link:
https://github.com/stepmommy/cmsc115_unit8_lab2.git

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
- Assertion-by-assertion analysis predicts the empty-array check fails because the code reads `values[0]` before checking whether the array has any elements. The second prompt did not yet define empty-array behavior. Confirm by running JUnit in IntelliJ.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
- Returns the largest integer in a nonempty array and `Integer.MIN_VALUE` when the array is empty.

What was fixed:
- Added an empty-array check before accessing the first value.

What you learned:
- Requirements and tests for edge cases help catch behavior that ordinary examples miss. Separate commits make each step of the changes visible.

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?
  - The first prompt left the required result open to interpretation. The later prompts specified the largest value, then defined the empty-array result.
- How did testing affect your changes?
  - The tests expose the wrong sum behavior, then identify the empty-array edge case. Run the JUnit suite in IntelliJ and update this reflection with its actual results before submission.
- What did version control help you understand?
  - Separate commits preserve each iteration and show how the implementation changed as the requirements became clearer.

## Test Execution Note

- The test suite is included, but it could not be run in the current shell because Java and Maven are not installed or available on PATH. Run all four JUnit tests in IntelliJ before submitting, and replace the assertion-based predictions above with the actual results.
