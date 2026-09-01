# Subskill — Distributed-System Patterns

## Teaching Rule

Distributed patterns must be taught through failures.

Happy-path-only examples are insufficient.

---

## Timeout — MASTER FIRST

Every remote call may:
- succeed;
- fail;
- become unacceptably slow.

Teach time budgets and cancellation where available.

---

## Retry — MASTER

Prerequisite: Timeout.

Teach:
- transient vs permanent failure;
- max attempts;
- exponential backoff;
- jitter;
- retry budgets;
- idempotency.

Failure exercise:
simulate many clients retrying at once and discuss retry storms.

---

## Circuit Breaker — MASTER

Prerequisites:
- remote call failures;
- Timeout;
- Retry.

State model:

```text
Closed → Open → Half-Open → Closed
```

Teach protection of both caller and dependency.

---

## Bulkhead — LEARN NEXT

Partition resources:
- thread/worker pools;
- connection pools;
- concurrency slots.

Goal:
one dependency/workload cannot exhaust everything.

---

## Rate Limiting / Throttling — LEARN NEXT

Teach:
- fixed window;
- sliding window;
- token bucket.

Lab:
per-user / per-tenant / per-endpoint limits.

---

## Transactional Outbox — MASTER

### Start with dual-write failure

```text
1. commit Order
2. publish OrderCreated
```

Crash between steps.

### Derive

```text
DB transaction:
  Order
  OutboxMessage
```

Separate publisher sends outbox rows.

Teach:
- duplicate publication;
- consumer idempotency;
- ordering;
- cleanup.

---

## Saga — MASTER

### Lab

```text
Create Order
→ Reserve Inventory
→ Charge Payment
→ Arrange Shipping
```

Inject payment failure.

Derive compensating actions.

Teach:
- choreography;
- orchestration;
- compensation limitations;
- observability.

---

## CQRS — MASTER CONCEPTUALLY

Introduce only when read and write models have genuinely conflicting needs.

Minimal idea:

```text
Commands → change state
Queries  → read state
```

Do not require:
- microservices;
- Event Sourcing;
- multiple databases.

---

## Event Sourcing — LEARN LATER

Prerequisites:
- messaging;
- idempotency;
- ordering;
- CQRS concepts;
- eventual consistency.

Teach:
- event log as source of truth;
- projections;
- replay;
- schema evolution;
- snapshots;
- temporal queries;
- operational complexity.

Do not present it as a default persistence strategy.

---

## API Gateway — LEARN NEXT

Teach edge concerns:
- routing;
- auth;
- throttling;
- aggregation.

Discuss bottleneck/god-gateway risk.

---

## Backend for Frontend — LEARN NEXT

Use when clients have materially different API needs.

Lab:
- web;
- mobile;
- partner API.

---

## Anti-Corruption Layer — LEARN NEXT

Protect the internal domain from a legacy/external model.

Lab:
vendor fulfillment API with incompatible terminology.

---

## Strangler Fig — LEARN NEXT

Teach incremental legacy replacement through routing/migration boundaries.

---

## Database per Service — LEARN NEXT

Teach:
- ownership;
- autonomy;
- cross-service queries;
- eventual consistency;
- reporting trade-offs.

Do not equate logical ownership with necessarily separate physical servers.
