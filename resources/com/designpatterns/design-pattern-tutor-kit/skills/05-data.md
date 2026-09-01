# Subskill — Data Patterns

## Repository — MASTER

Use domain-oriented persistence needs.

Teach:
- aggregate loading;
- save semantics;
- test boundaries;
- query-model exceptions.

---

## Active Record — LEARN NEXT

### Lab
Simple CRUD model that persists itself.

Teach why it is productive.

Then show where rich domain logic and persistence concerns collide.

---

## Data Mapper — LEARN NEXT

Separate domain object from persistence mapping.

Compare directly with Active Record.

---

## Unit of Work — LEARN NEXT

### Lab
Modify multiple related entities in one application use case.

Teach:
- change tracking;
- transaction boundary;
- commit.

Point out that many ORMs already implement this internally.

---

## Identity Map — LATER

Teach when discussing ORM sessions/change tracking.

Question:
> If the same row is loaded twice in one unit of work, should we get two independent domain identities?

---

## Cache-Aside — MASTER

### Baseline

```text
read key
  ↓
cache?
 ├─ hit → return
 └─ miss → DB → cache → return
```

### Must test
- stale data;
- invalidation;
- expiration;
- cache outage;
- thundering herd;
- read-after-write behavior.

---

## Read Replicas — LEARN NEXT

Teach replication lag and read-after-write anomalies.

---

## Sharding — LATER

Prerequisites:
- indexing;
- query planning;
- replication;
- partitioning;
- caching;
- vertical scaling.

Do not present sharding as an early scalability default.

---

## Database per Service — DISTRIBUTED

Teach with data ownership and eventual consistency.

---

## Shared Database — TRADE-OFF

Teach comparatively:
- simplicity;
- coupling;
- ownership ambiguity;
- coordinated schema changes.

---

## CQRS / Event Sourcing

Route to distributed-systems subskill.
