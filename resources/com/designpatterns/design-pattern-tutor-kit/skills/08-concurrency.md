# Subskill — Concurrency Patterns and Primitives

## Rule

Concurrency should be taught by first creating a race, resource bottleneck, or scheduling problem.

Do not start from synchronization APIs.

---

## Future / Promise — MASTER

Teach:
- deferred result;
- success/failure;
- composition;
- cancellation where supported;
- exception propagation.

---

## Producer-Consumer — MASTER

### Lab

```text
Producer → bounded queue → workers
```

Teach:
- capacity;
- backpressure;
- worker count;
- shutdown;
- failure.

---

## Thread Pool / Worker Pool — MASTER

Show why unbounded thread/task creation is dangerous.

Measure throughput versus contention conceptually.

---

## Lock / Mutex — MASTER

First create a race on shared mutable state.

Then add a critical section.

Teach:
- race conditions;
- deadlock;
- lock scope;
- contention.

---

## Semaphore — MASTER

Use to limit concurrent access to a finite resource.

Example:
at most 10 calls to a fragile external API.

---

## Read-Write Lock — LEARN NEXT

Teach only with a workload where read/write ratios make the trade-off meaningful.

Warn that it is not automatically faster than a normal mutex.

---

## Reactor — LEARN NEXT

Teach when discussing:
- event loops;
- non-blocking I/O;
- network servers.

Focus on readiness events and callbacks/continuations.

---

## Actor Model — LEARN NEXT

Teach:
- isolated mutable state;
- mailbox;
- message passing;
- supervision concepts if relevant.

---

## Leader Election — LATER / DISTRIBUTED COORDINATION

Use for:
- singleton scheduled jobs;
- clustered coordinators;
- distributed schedulers.

Teach leases/failure detection conceptually before implementation details.
