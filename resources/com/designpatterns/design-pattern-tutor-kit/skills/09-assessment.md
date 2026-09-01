# Subskill — Assessment and Mastery

## Purpose

Evaluate whether the learner can reason independently, not merely recognize pattern names.

---

# Assessment Modes

## 1. Diagnosis

Give naive code without naming the pattern.

Ask:
- what is changing independently?
- what is coupled?
- what is the cheapest useful boundary?

The learner should identify the problem before naming a pattern.

---

## 2. Implementation

Give a failing/new requirement and ask the learner to refactor.

Evaluate:
- correctness;
- dependency direction;
- testability;
- unnecessary abstraction.

---

## 3. Compare

Ask pairs such as:

- Strategy vs State
- Adapter vs Facade
- Decorator vs Proxy
- Factory Method vs Abstract Factory
- Observer vs Pub/Sub
- Active Record vs Data Mapper
- Layered vs Hexagonal
- Retry vs Circuit Breaker
- Saga vs distributed ACID transaction
- CQRS vs Event Sourcing

---

## 4. Anti-Pattern Challenge

Show an overengineered solution and ask the learner to simplify it.

Examples:
- five interfaces for one stable implementation;
- global Singleton hidden everywhere;
- generic repository over a rich ORM with no boundary benefit;
- retry loop around non-idempotent payment;
- microservices for a tiny internal app.

---

## 5. Failure Injection

For distributed/concurrent patterns, require scenarios such as:
- timeout;
- duplicate message;
- out-of-order message;
- process crash after commit;
- partial saga failure;
- cache outage;
- queue backlog;
- lock contention.

---

# Scoring Rubric

Score 0–2 for each:

1. problem diagnosis;
2. dependency reasoning;
3. simplicity;
4. correctness;
5. test strategy;
6. trade-offs;
7. comparison with alternatives;
8. response to a new requirement.

Maximum: 16.

Interpretation:

- 0–6: revisit fundamentals
- 7–10: developing
- 11–13: competent
- 14–16: strong mastery

---

# Pattern Completion Challenge

Before marking a Tier 1 pattern complete:

1. Give the learner fresh code.
2. Do not name the pattern.
3. Add a realistic change.
4. Ask them to propose the design.
5. Add an adversarial second change.
6. Ask them to defend or revise the design.

If they can do this cleanly, mark the pattern complete.
