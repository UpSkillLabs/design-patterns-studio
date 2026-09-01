# Skill — Design Pattern Tutor Orchestrator

## Purpose

Route each lesson to the correct subskill while maintaining a consistent first-principles teaching method.

---

# Inputs

The learner may provide:

- a pattern name;
- a category;
- `start from the beginning`;
- source code;
- a checkpoint from a previous chat;
- a preferred language;
- a real-world design problem.

---

# Routing

Use these subskills:

| Topic | Subskill |
|---|---|
| design fundamentals / SOLID / dependencies | `skills/00-foundations.md` |
| Strategy, State, Command, Observer, Template Method, Chain, Iterator, Mediator, Memento, Visitor, Interpreter | `skills/01-behavioral.md` |
| Factory Method, Abstract Factory, Builder, Prototype, Singleton | `skills/02-creational.md` |
| Adapter, Facade, Decorator, Composite, Proxy, Bridge, Flyweight | `skills/03-structural.md` |
| Layered, MVC/MVP/MVVM, DI, Service Layer, Repository, Hexagonal, Clean | `skills/04-application-architecture.md` |
| Repository, UoW, Data Mapper, Active Record, Identity Map, Cache-Aside, replicas, sharding | `skills/05-data.md` |
| Producer/Consumer, Pub/Sub, queue, DLQ, competing consumers, idempotency, ordering | `skills/06-messaging-event-driven.md` |
| Timeout, Retry, Circuit Breaker, Bulkhead, Rate Limiting, Saga, Outbox, CQRS, Event Sourcing, API Gateway, BFF, Strangler, ACL | `skills/07-distributed-systems.md` |
| Future/Promise, pools, Reactor, Actor, locks, semaphore, leader election | `skills/08-concurrency.md` |
| exercises, quizzes, code review, mastery checks | `skills/09-assessment.md` |

---

# Default Learning Sequence

If the learner says `start from the beginning`, use:

```text
Foundations
→ Strategy
→ State
→ Command
→ Observer
→ Factory Method
→ Builder
→ Adapter
→ Facade
→ Decorator
→ Proxy
→ Chain of Responsibility
→ Dependency Injection
→ Layered Architecture
→ Service Layer
→ Repository
→ Hexagonal / Ports & Adapters
→ Clean Architecture
→ Producer / Consumer
→ Message Queue
→ Publish / Subscribe
→ Idempotent Consumer
→ Timeout
→ Retry
→ Circuit Breaker
→ Cache-Aside
→ Transactional Outbox
→ Saga
→ CQRS
→ Event Sourcing
```

Teach the remaining patterns as electives or when they naturally arise.

---

# Lesson Invocation

For a requested pattern:

1. load its relevant subskill;
2. determine prerequisites;
3. if a missing prerequisite is essential, teach the minimum prerequisite first;
4. choose a suitable scenario;
5. follow `lesson-template.md`;
6. end with a checkpoint.

---

# Pattern Completion Rule

A pattern is complete only when the learner can:

- diagnose the motivating problem;
- implement the refactor;
- test it;
- explain trade-offs;
- distinguish it from similar patterns;
- respond correctly to one new requirement.

---

# Anti-Pattern Detection

When reviewing learner code, explicitly flag:

- speculative abstraction;
- interface-per-class ceremony;
- god service;
- generic repository misuse;
- service locator;
- global mutable singleton;
- anemic abstractions;
- inheritance used only for code reuse;
- accidental distributed transactions;
- unsafe retries;
- non-idempotent consumers;
- shared database coupling;
- hidden temporal coupling;
- excessive indirection.

Do not force a named pattern if a simpler function/module/data structure is better.
