// task1
let Matt = 20;
let Simon = 51;

// task2
const underTh = 51;

if (Matt >= underTh && Simon >= underTh) {
  // task3
  console.log("both of them passed the exam.");
} else if (Matt >= underTh || Simon >= underTh) {
  // task4
  console.log("one of them passed the exam.");
  // task6
  if (Matt >= underTh) {
    console.log("Matt passed the exam. His score:" + Matt);
  } else {
    console.log("Simon passed the exam. His score:" + Simon);
  }
} else {
  // task5
  console.log("both of them didn't pass the exam.");
}
// var people = [
//   { firstName: "John", age: 20 },
//   { firstName: "Bob", age: 20 },
//   { firstName: "Nick", age: 20 },
//   { firstName: "Sally", age: 20 },
// ];
// var x = 0;

// var every = people.every(function (person) {
//   console.log(++x + " - " + (person.age >= 20));
//   return person.age >= 20;
// });

// console.log(every);

// var y = 0;

// var some = people.some(function (person) {
//   console.log(++y + " - " + (person.age >= 20));
//   return person.age >= 20;
// });

// console.log(some);

// var input = [];
// for (let i = 0; i < 100; i++) input.push(i);
// //console.log(input);

// function func1(ary) {
//   let result = [];
//   for (let i = 0; i < ary.length; i++) result.push(ary[i] * 10);
//   return result;
// }

// //console.log(func1(input));

// function func2(ary) {
//   return ary.map((x) => x * 10);
// }

// //console.log(func2(input));

// console.time("func1");
// for (let i = 0; i < 100000; i++) func1(input);
// console.timeEnd("func1");

// console.time("func2");
// for (let i = 0; i < 100000; i++) func2(input);
// console.timeEnd("func2");
