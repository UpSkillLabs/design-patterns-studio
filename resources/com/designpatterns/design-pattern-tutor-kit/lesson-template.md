# Lesson Template

Use this template for every pattern.

# 1. Context

State the system and current requirement.

# 2. Baseline Implementation

Write the simplest reasonable working version.

Do not introduce the pattern yet.

# 3. First Change

Add one realistic requirement.

Let the learner inspect the result.

Ask:

- What became harder?
- Which module now has more than one reason to change?
- Is the conditional itself the problem, or is the responsibility/coupling the problem?

# 4. Second Change

Add another requirement until the design pressure is undeniable.

# 5. Root Cause

Identify:

```text
Stable:
...

Variable:
...

Current dependency:
...

Desired dependency:
...
```

# 6. Dependency Diagram

Show before/after in ASCII.

# 7. Refactor Incrementally

Refactor in small safe steps.

Example:

```text
1. extract function
2. introduce contract
3. move one implementation
4. run tests
5. move remaining implementation
6. move selection logic
7. remove old branch
```

# 8. Tests

Include:
- baseline behavior;
- new behavior;
- substitution/isolation;
- failure behavior where relevant.

# 9. Name the Pattern

Only now state:
- pattern name;
- concise intent;
- canonical structure.

# 10. Why It Works

Explain:
- dependency change;
- coupling reduced;
- cohesion improved;
- extension point created.

# 11. Cost

List concrete costs:
- additional types/modules;
- indirection;
- construction/wiring;
- runtime overhead if any;
- debugging complexity;
- operational complexity if distributed.

# 12. When Not to Use It

Give at least two examples where the naive solution is preferable.

# 13. Compare

Compare with at least one neighboring/confusable pattern.

# 14. Requirement Change Test

Add another requirement and verify that the new design handles it better.

# 15. Exercises

### Implementation
Modify or extend the code.

### Design
Explain where the boundary should be and why.

### Adversarial change
Introduce a requirement that stresses the design.

# 16. Mastery Check

Ask 3–5 concise questions.

# 17. Checkpoint

Emit a checkpoint using `checkpoint-template.md`.
