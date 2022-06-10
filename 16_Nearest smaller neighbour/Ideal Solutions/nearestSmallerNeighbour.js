/* Given an array A having N positive integers. Find the nearest smaller number for every element such that the smaller element is on left side.

Note - If any element doesn't have any smaller element that it to it's left, print -1 for it.
 */

/*  **Sample Input**
	input: N = 5
	A : 1 2 5 3 5

    **Sample Output**
	A: -1 1 2 2 3
    
*/

const input = `1 2 5 3 5`.split(" ").map(Number);

function nearestsmallernumber(arr) {
  let stack = [];
  let res = [];
  for (let i in arr) {
    while (stack.length && stack[stack.length - 1] >= arr[i]) {
      stack.pop();
    }
    if (stack.length) {
      res.push(stack[stack.length - 1]);
    } else res.push(-1);
    stack.push(arr[i]);
  }
  return res.join(" ");
}

console.log(nearestsmallernumber(input)); //-1 1 2 2 3
