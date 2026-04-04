// ❌ Drawbacks of Arrays in Java
// Drawback Description

// 1. Fixed Size -> Once an array is created, its size cannot be changed. You must
// know the number of elements in advance.


// 2. No Built-in Methods ->  Arrays don't have many useful methods like add(),
// remove(), or contains() (unlike ArrayList).

// 3. Inefficient Insertion/Deletion -> Inserting or deleting elements (especially
// in the middle) requires shifting other elements manually.

// 4. Type-Specific ->  Arrays are type-specific, so you cannot store different
// types of data in the same array without using Object[].

// 5. No Bounds Checking Beyond Exception -> Java throws
// ArrayIndexOutOfBoundsException, but no automatic prevention of errors during
// runtime.

// 6. Less Flexibility -> Arrays lack dynamic resizing, sorting, or searching
// features compared to collections like ArrayList, HashMap, etc.

// 7. Limited Functional Programming Support -> Arrays don't support stream
// operations as naturally as collections in modern Java (Stream, filter, map,
// etc.).