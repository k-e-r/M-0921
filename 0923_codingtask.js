// return true if the array is sorted either
// ascending, or descending.
// [] => true
// [42] => true
// [39, 42] => true
// [42, 39] => true
// [1, 2, 3, 4, 5] => true
// [5, 4, 3, 2, 1] => true
// [1, 5, 2] => false

// solution1(not using sort)
// compare current value with next value
function isSorted1(arr) {
  let j = 0;
  if (arr.length > 1) {
    for (let i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) j++;
      else j--;
    }
    if (Math.abs(j) === arr.length - 1) return true;
  } else return true;
  return false;
}

console.log("Solution 1:");
console.log(isSorted1([]));
console.log(isSorted1([42]));
console.log(isSorted1([39, 42]));
console.log(isSorted1([42, 39]));
console.log(isSorted1([1, 2, 3, 4, 5]));
console.log(isSorted1([5, 4, 3, 2, 1]));
console.log(isSorted1([1, 5, 2]));

console.log("----------------------");

// solution2(using sort)
// compare origin value with sorted value
function isSorted2(arr) {
  let compareArr = arr.concat();
  compareArr.sort();
  for (i = 0; i < compareArr.length; i++) {
    if (compareArr[i] !== arr[i]) break;
  }
  if (i === compareArr.length) return true;
  compareArr.sort((a, b) => b - a);
  for (i = 0; i < compareArr.length; i++) {
    if (compareArr[i] !== arr[i]) break;
  }
  if (i === compareArr.length) return true;
  return false;
}

console.log("Solution 2:");
console.log(isSorted2([]));
console.log(isSorted2([42]));
console.log(isSorted2([39, 42]));
console.log(isSorted2([42, 39]));
console.log(isSorted2([1, 2, 3, 4, 5]));
console.log(isSorted2([5, 4, 3, 2, 1]));
console.log(isSorted2([1, 5, 2]));

console.log("----------------------");

// solution3(ex.the shortest code)
// compare current value with next value
function isSorted1(arr) {
  let j = 0;
  for (i = 0; i < arr.length - 1; i++) arr[i] < arr[i + 1] ? j++ : j--;
  return Math.abs(j) === i;
}

console.log("Solution 3:");
console.log(isSorted1([]));
console.log(isSorted1([42]));
console.log(isSorted1([39, 42]));
console.log(isSorted1([42, 39]));
console.log(isSorted1([1, 2, 3, 4, 5]));
console.log(isSorted1([5, 4, 3, 2, 1]));
console.log(isSorted1([1, 5, 2]));
