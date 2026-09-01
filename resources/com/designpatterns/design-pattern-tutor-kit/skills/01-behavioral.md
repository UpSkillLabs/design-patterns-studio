# Subskill — Behavioral Patterns

## Strategy — MASTER

### Pressure
Multiple interchangeable algorithms change independently.

### Suggested lab
Shipping calculation:
- standard
- express
- overnight
- international

### Derivation
Move algorithm variation behind `ShippingPolicy`.

### Compare
- Strategy vs State
- Strategy vs Template Method

### Stress change
Add drone delivery without changing checkout.

---

## State — MASTER

### Pressure
Behavior depends on lifecycle state and conditionals spread everywhere.

### Suggested lab
Order lifecycle:
`Pending → Paid → Shipped → Delivered → Cancelled`

### Compare
Strategy is externally selected behavior.
State changes because the object's lifecycle changes.

### Stress change
Make `cancel()` legal only in selected states.

---

## Command — MASTER

### Pressure
An operation needs to be queued, logged, retried, undone, or treated as data.

### Lab
- `PlaceOrderCommand`
- `CancelOrderCommand`
- `RefundOrderCommand`

### Stress change
Queue commands for asynchronous execution.

### Compare
Command vs ordinary service method.

---

## Observer — MASTER

### Pressure
One event has many interested listeners and the source should not know all of them.

### Lab
`OrderPlaced → Email, Analytics, Inventory`

### Compare
Observer vs Pub/Sub.

### Stress change
Add fraud analytics without touching order placement.

---

## Template Method — LEARN NEXT

### Pressure
Algorithms share a fixed skeleton but customize selected steps.

### Lab
CSV and JSON import workflows.

### Compare
Template Method uses inheritance.
Strategy uses composition.

---

## Chain of Responsibility — MASTER

### Pressure
A request passes through configurable processing stages.

### Lab
HTTP-like pipeline:
`Auth → Authorization → Validation → Logging → Handler`

### Stress change
Insert rate limiting without rewriting handlers.

---

## Iterator — LEARN NEXT

Teach conceptually, then show language-native iteration.

Focus on lazy traversal and hiding collection representation.

---

## Mediator — LATER

Use for chaotic many-to-many object communication.

Good lab:
complex UI form coordination.

---

## Memento — LATER

Use for snapshots / undo.

Good lab:
editor state history.

---

## Visitor — LATER

Use stable object structure + frequently added operations.

Good lab:
AST or document tree.

Explain that algebraic data types/pattern matching may be a better fit in some languages.

---

## Interpreter — LATER

Use for small DSLs / expression languages / rule systems.

Do not use as a first compiler/parser lesson unless requested.
