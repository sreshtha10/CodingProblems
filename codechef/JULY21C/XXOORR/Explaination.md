# Concept used - Bit Manipulation

## Important Observations:
* a XOR b = a-b where a and b are in int format.
* 2^p in binary will contain only one bit as 1 and all others as 0.
* An integer being stored in a 32-bit format.

## Aproach 
* Since 2^p has only one bit as 1, therefore at a time it will only make one place 1 XOR 1 = 0.    
  For example, at one time 2^p may target the 3rd bit of array elements and make them zero.
* Now if two numbers have ith bit = 1, then both of the array elements can be targeted at once.
  For example, if k = 2 and 10 and 8 both contains 3rd bit as 1 therefore XOR with 2^3 will make the third bit of both the number = 0 at once.

* We can count the number of 1s at each positions from 0-31 bit and add them to calculate total    
  number of 1s at a particular index.

* We can calculate the total number of operations by calculating operations at each index.At each
  index total number of operations required will be ceil of (total 1s at that index/ k).
  
