/* 01-----------------------Power---------------------------------------------------------------------
Write a function called power which accepts a base and an exponent. 
The function should return the power of the base to the exponent. 
This function should mimic the functionality of Math.pow()  
        - do not worry about negative bases and exponents.
*/
// power(2,0) // 1
// power(2,2) // 4
// power(2,4) // 16

function power(base, exponent) {
  if (exponent < 1) return 1; // ignore negative value
  return base * power(base, exponent - 1);
}
console.log("01--------------------");
console.log(power(2, 0)); // 1
console.log(power(2, 2)); // 4
console.log(power(2, 4)); // 16
console.log(power(3, 3)); // 27
console.log(power(3, 5)); // 243
console.log(power(4, 10)); // 1,048,576

/* 02-----------------------productOfArray---------------------------------------------------------------------
Write a function called 'productOfArray' which takes in an array of numbers and 
returns the product of them all.
*/
// productOfArray([1,2,3]) // 6
// productOfArray([1,2,3,10]) // 60

function productOfArray(arr) {
  if (arr.length <= 1) return arr; // ignore empty array
  return arr.shift() * productOfArray(arr);
}
console.log("02--------------------");
console.log(productOfArray([1, 2, 3])); // 6
console.log(productOfArray([1, 2, 3, 10])); // 60
console.log(productOfArray([5, 2, 3])); // 30
console.log(productOfArray([2, 2, 3, 10])); // 120
console.log(productOfArray([])); // []

/* 03-----------------------reverse---------------------------------------------------------------------
Write a recursive function called 'reverse' which accepts a string and returns 
a new string in reverse.
*/
// reverse('awesome') // 'emosewa'
// reverse('rithmschool') // 'loohcsmhtir'

function reverse(str) {
  // add whatever parameters you deem necessary - good luck!
  if (str.length === 1) return str;
  return reverse(str.slice(1)) + str[0];
}
console.log("03--------------------");
console.log(reverse("awesome")); // 'emosewa'
console.log(reverse("rithmschool")); // 'loohcsmhtir'
console.log(reverse("test")); // 'tset'

/* 04-----------------------isPalindrome---------------------------------------------------------------------
Write a recursive function called 'isPalindrome' which returns true if the string 
passed to it is a palindrome (reads the same forward and backward). 
Otherwise it returns false.
*/
// isPalindrome('awesome') // false
// isPalindrome('foobar') // false
// isPalindrome('tacocat') // true
// isPalindrome('amanaplanacanalpanama') // true
// isPalindrome('amanaplanacanalpandemonium') // false

function isPalindrome(str) {
  // add whatever parameters you deem necessary - good luck!
  if (str.length === 1) return true;
  return str.slice(str.length - 1) === str[0]
    ? isPalindrome(str.slice(1, -1))
    : false;
}
// if (str.length === 1) return str;
// return str.slice(str.length - 1) + reverse(str.slice(0, str.length - 1));
console.log("04--------------------");
console.log(isPalindrome("awesome")); // false
console.log(isPalindrome("foobar")); // false
console.log(isPalindrome("tacocat")); // true
console.log(isPalindrome("amanaplanacanalpanama")); // true
console.log(isPalindrome("amanaplanacanalpandemonium")); // false

console.log(isPalindrome("m")); // true
