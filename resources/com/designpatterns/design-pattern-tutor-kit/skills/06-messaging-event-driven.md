# Subskill — Messaging and Event-Driven Systems

## Producer / Consumer — MASTER

### Lab

```text
Producer → Queue → Consumer
```

Introduce bounded capacity and failure.

Teach:
- backpressure;
- acknowledgement;
- retry;
- throughput;
- shutdown.

---

## Message Queue — MASTER

Teach:
- enqueue;
- receive;
- acknowledgement;
- redelivery;
- visibility/lease concepts;
- poison messages.

Use broker-neutral language first.

---

## Publish / Subscribe — MASTER

### Lab

```text
OrderPlaced
  ├→ Email
  ├→ Inventory
  └→ Analytics
```

Compare with Observer:
- Observer is commonly direct/in-process.
- Pub/Sub commonly uses mediation and may cross processes.

---

## Delivery Semantics — MASTER

Teach:
- at-most-once;
- at-least-once;
- duplicates;
- deduplication;
- why end-to-end "exactly once" claims need careful qualification.

Do not move to advanced messaging until this is understood.

---

## Idempotent Consumer — MASTER

### Lab
Deliver the same `ChargePayment` or `ReserveInventory` message twice.

The second delivery must not duplicate the business effect.

Teach:
- idempotency key;
- processed-message table;
- business-key dedupe;
- transaction boundary.

---

## Message Ordering — MASTER

### Lab
Deliver:
- `OrderCreated`
- `OrderCancelled`

out of order.

Teach:
- partition/key ordering;
- sequence numbers;
- stale event rejection;
- commutative operations where possible.

---

## Dead Letter Queue — LEARN NEXT

Create poison messages and define an operational recovery workflow.

A DLQ without investigation/replay procedures is incomplete.

---

## Competing Consumers — LEARN NEXT

Run several consumers against one queue.

Observe:
- throughput;
- duplicate delivery;
- ordering;
- concurrency.

---

## Transactional Outbox

Route to distributed-systems subskill after delivery semantics and idempotency are understood.
