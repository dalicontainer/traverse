### Traverse Problem

Given a 2D array like:

{{1, 2 ,3, 4},<br />
{5, 6, 7, 8},<br />
{9,10,11,12},<br />
{13,14,15,16}}

Traverse the array in the pattern below and print the numbers along the path.

Print: 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10

### Provided Solution
To avoid extra loops or using extra arrays, problem is tried to be solved with indexes.
Only an extra dimentions array is used to calculate the turns during the iteration over the matrix

###Improvements:

- Input matrix can be read from a file 
- Boundry cases could be covered like wrong matrix, incompatible indexes etc
- Any wrong format input could be covered with exception handling for meaningful messages
- For very large arrayes that are asked to be traversed this algorithm will not be sufficient due to memory limitations
- It is not convenient to traverse in parallel with this solution