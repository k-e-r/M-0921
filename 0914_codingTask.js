// task1
let Matt = 20
let Simon = 51

// task2
const underTh = 51

if (Matt>=underTh && Simon>=underTh) {  // task3
  console.log("both of them passed the exam.")
} else if (Matt>=underTh || Simon>=underTh) { // task4
  console.log("one of them passed the exam.")
  // task6
  if (Matt>=underTh) {
    console.log("Matt passed the exam. His score:" + Matt)
  } else {
    console.log("Simon passed the exam. His score:" + Simon)
  }
} else {  // task5
  console.log("both of them didn't pass the exam.")
}