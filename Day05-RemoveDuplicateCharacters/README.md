# Day 05 - Remove Duplicate Characters

## Problem
Remove duplicate Characters from a String while preserving the original order.

---

## Approach

- Traverse the String.
- Store each character in a LinkedHashSet.
- LinkedHashSet automatically removes duplicates and preserves inseration order.
- Traverse the set and build the final string using StringBuilder.

## Time Complexity
O(n)

## Space Complexity
O(n)

---

## Sample Input
banana

## Sample Output
ban

## Concepts Learned

- LinkedHashSet
- StringBuilder
- Enhanced for loop
- Set