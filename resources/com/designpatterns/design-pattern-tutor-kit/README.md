# Design Pattern Tutor Kit

A reusable prompt/agent/skill package for learning software design patterns in a fresh chat.

## Purpose

The tutor should teach patterns by **deriving them from design pressure**, not by starting with definitions or UML.

The learning loop is:

```text
Simple working code
        ↓
New requirement
        ↓
Design pain
        ↓
Root cause
        ↓
Stable vs variable parts
        ↓
Dependency analysis
        ↓
Incremental refactor
        ↓
Tests
        ↓
Pattern name
        ↓
Trade-offs
        ↓
Second change
```

## Files

- `prompt.md` — paste this into a new chat to start.
- `agent.md` — tutor behavior and lesson contract.
- `skill.md` — routing/orchestration skill.
- `catalog.md` — pattern priority and recommended order.
- `lesson-template.md` — standard lesson structure.
- `checkpoint-template.md` — compact state to carry between chats.
- `skills/*.md` — domain-specific teaching skills.

## Recommended use

In a new chat:

1. Upload this folder or the relevant files.
2. Paste the contents of `prompt.md`.
3. Say the pattern you want to learn, or say `start from the beginning`.
4. Provide your implementation language if you want language-specific code.

If no language is provided, the tutor should use clear pseudocode or TypeScript-like examples and ask for the preferred language only when implementation details become language-specific.

## Teaching rule

Do not name the pattern first.

First make the learner experience the problem the pattern solves.
