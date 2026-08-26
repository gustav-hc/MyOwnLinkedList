# My Own Linked List

A custom implementation of a singly linked list in Java, built from scratch to understand how linked lists work internally.

## Features

The implementation supports:

- `addFirst()` – add an element to the beginning
- `addLast()` – add an element to the end
- `addAtIndex()` – insert an element at a specific index
- `removeFirst()` – remove the first element
- `removeLast()` – remove the last element
- `removeAtIndex()` – remove an element at a specific index
- `contains()` – check if a value exists
- `get()` – retrieve a value by index
- `isEmpty()` – check if the list is empty
- `printList()` – print all elements

## Structure

The project consists of two main classes:

### Node

Each node contains:
- A value
- A reference to the next node

### LinkedIntList

The linked list keeps track of:
- `head` – the first node
- `tail` – the last node
- `size` – the number of nodes

## Concepts

This project was built to practice and understand:

- Object-oriented programming
- References between objects
- Linked list traversal
- Nodes and pointers/references
- Exception handling
- Edge cases
- Basic data structures and algorithms

## What I Learned

Building the linked list from scratch helped me understand how objects can reference each other and how a linked list can be traversed without using an array.

A key part of the project was understanding how `head`, `tail` and `next` references work when adding and removing nodes.

## Error Handling

`IndexOutOfBoundsException` is used when an invalid index is provided.

## Technologies

- Java
- IntelliJ IDEA
- Git / GitHub