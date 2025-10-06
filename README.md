# Low-Level-System-Design

Most codes are from the book Head first design patterns
But I rewrote them for practice

## Iterator Pattern
- merging 3 restaurants. all use the same MenuItem Class. So that makes things a little easy. If not, need to modify the codebases to maintain decorum
- step 1 is a using custom iterator for both array list and arrays in pancakehouse and diner menu respectively
- step 2 is to use the inbuilt iterator for arraylist (pancakehouse) and custom iterator for array(diner menu)
- step 3 is to merge cafe restaurant