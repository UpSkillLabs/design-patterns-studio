# Subskill — Application Architecture

## Layered Architecture — MASTER

### Lab
Small order API:

```text
HTTP
 ↓
Application Service
 ↓
Domain
 ↓
Persistence
```

Then deliberately create boundary leakage and repair it.

Teach responsibility and dependency flow.

---

## Service Layer — MASTER

Model use cases such as:
- PlaceOrder
- CancelOrder
- RefundOrder

Avoid a giant "Services" dumping ground.

---

## Dependency Injection — MASTER

### First
Build object graph manually in `main()` / composition root.

### Then
Optionally show a DI container.

Core lesson:

```text
Dependency Injection != DI framework
```

Teach:
- constructor injection;
- lifetime;
- composition root;
- test substitution.

Warn about service locator.

---

## Repository — MASTER

### Lab
Start with SQL/ORM calls inside business logic.

Extract a repository around domain persistence needs.

Warn against generic repository ceremony over an ORM unless it adds a meaningful boundary.

---

## MVC — MASTER CONCEPTUALLY

Teach through a small UI/web flow.

Explain framework variations rather than pretending one MVC interpretation is universal.

---

## MVP — LATER

Teach by comparison when relevant to a UI framework/codebase.

---

## MVVM — LEARN NEXT FOR UI WORK

Teach:
- view model;
- binding;
- observable state;
- testable presentation logic.

---

## Hexagonal Architecture / Ports & Adapters — MASTER

Treat these as one architectural family.

### Lab
Version A:
domain imports SQL, queue, vendor HTTP SDK.

Version B:

```text
        Application Core
             |
          Ports
       /     |      \
     DB    Queue    Payment
      |      |         |
   Adapters Adapters Adapters
```

Teach dependency direction.

---

## Clean Architecture — MASTER CONCEPTUALLY

Teach after Hexagonal Architecture.

Focus on dependency rule, not folder names.

Question:

> Can business rules execute without HTTP, database, queue, or framework?

If no, inspect dependency direction.

---

## CQRS

Route to distributed/data skill after basic application architecture is understood.
