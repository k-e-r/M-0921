let array = [6, 2, 8, 3, 7, 4, 0, 1, 9, 5];

function heapSort(arr, length = arr.length) {
  for (let parent = Math.floor(length / 2) - 1; parent >= 0; ) {
    // child(right)
    if (arr[parent] < arr[parent * 2 + 1] && parent * 2 + 1 < length) {
      [arr[parent], arr[parent * 2 + 1]] = [arr[parent * 2 + 1], arr[parent]];
    }
    // child(left)
    if (arr[parent] < arr[parent * 2 + 2] && parent * 2 + 2 < length) {
      [arr[parent], array[parent * 2 + 2]] = [arr[parent * 2 + 2], arr[parent]];
    }
    parent--;
  }
  [arr[0], arr[length - 1]] = [arr[length - 1], arr[0]];
  if (length > 1) heapSort(arr, length - 1);
  return arr;
}

console.log("array1:", array);
console.log("array2:", heapSort(array));
