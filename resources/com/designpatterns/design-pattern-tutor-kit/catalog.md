# Design Pattern Learning Catalog

## Tier 1 — Master

### Code-level
- Strategy
- State
- Command
- Observer
- Factory Method
- Builder
- Adapter
- Facade
- Decorator
- Proxy
- Composite
- Chain of Responsibility
- Dependency Injection

### Application architecture
- Layered Architecture
- Service Layer
- Repository
- Hexagonal Architecture / Ports & Adapters
- Clean Architecture concepts
- MVC

### Messaging / distributed
- Producer / Consumer
- Message Queue
- Publish / Subscribe
- Idempotent Consumer
- Timeout
- Retry
- Circuit Breaker
- Cache-Aside
- Transactional Outbox
- Saga
- CQRS

### Concurrency fundamentals
- Future / Promise
- Producer-Consumer
- Thread / Worker Pool
- Lock / Mutex
- Semaphore

---

## Tier 2 — Learn Next

- Abstract Factory
- Template Method
- Bridge
- Iterator
- Unit of Work
- Data Mapper
- Active Record
- MVVM
- Dead Letter Queue
- Competing Consumers
- Bulkhead
- Rate Limiting / Throttling
- API Gateway
- Backend for Frontend
- Anti-Corruption Layer
- Strangler Fig
- Read Replicas
- Event Sourcing
- Reactor
- Actor Model
- Read-Write Lock

---

## Tier 3 — Learn When Needed

- Prototype
- Singleton implementation details
- Flyweight
- Mediator
- Memento
- Visitor
- Interpreter
- MVP
- Identity Map
- Sharding
- Leader Election

---

# Pattern Dependencies

```text
Composition / interfaces
        ↓
Strategy
   ├── State
   ├── Command
   └── Observer

Factory Method
   ├── Builder
   └── Abstract Factory

Adapter
   ├── Facade
   ├── Decorator
   ├── Proxy
   └── Composite

Dependency Injection
        ↓
Layered Architecture
        ↓
Service Layer / Repository
        ↓
Hexagonal / Ports & Adapters
        ↓
Clean Architecture concepts

Producer / Consumer
        ↓
Message Queue
        ↓
Pub/Sub + DLQ + Idempotency + Ordering
        ↓
Timeout → Retry → Circuit Breaker
        ↓
Transactional Outbox
        ↓
Saga
        ↓
CQRS
        ↓
Event Sourcing
```

---

# Elective Rule

Tier 3 does not mean obsolete.

It means:
- know the intent;
- recognize the structure;
- implement only if the learner's domain needs it.
