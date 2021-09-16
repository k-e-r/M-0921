/*
**********************CODING TASK No 2*****************************
1. Create an array - students, insert four items, which should be objects and have three properties: name, score1, score2, 
    with the following values:
    a. John, 47, 46
    b. Bob, 23, 24
    c. Nick, 40, 35
    d. Alex, 44, 45
2. Suppose that, students have chance to get different degrees of diploma, like A, B, C, D, E and those degrees are relevant
    to the following passing limits 91, 81, 71, 61, 51. According to that, create two arrays for passing limits and for degrees
3. Create function which will calculate total score (score1 + score2) for each student.
4. Create function and use in it for loops, if else statements and whatever you need, in order to figure out, which student 
    has passed an exam and what kind of degree he has got.
5. Display the final result in console.
*/

// SOLUTION:
// task1
const students = [
    {
        name: 'John',
        score1: 47,
        score2: 46
    },
    {
        name: 'Bob',
        score1: 23,
        score2: 24
    },
    {
        name: 'Nick',
        score1: 40,
        score2: 35
    },
    {
        name: 'Alex',
        score1: 44,
        score2: 45
    }
]

// task2
const degs = ['A', 'B', 'C', 'D', 'E']
const pass = [91, 81, 71, 61, 51]

// task3
function totalScore() {
    // task4
    let deg, score
    for (let student of students) {
        score = student.score1 + student.score2
        for (let j=0; j < pass.length; j++) {
            if (score >= pass[j]) {
                deg = degs[j]
                break
            } else deg='failed'
        }
        console.log(student.name + '\'s degree:' + deg)
    }
}

totalScore()


/* 
// sample answer
var students = [
    {
        name: 'John',
        score1: 47,
        score2: 46
    },
    {
        name: 'Bob',
        score1: 23,
        score2: 24
    },
    {
        name: 'Nick',
        score1: 40,
        score2: 35
    },
    {
        name: 'Alex',
        score1: 44,
        score2: 45
    }
]

var scores = [91, 81, 71, 61, 51]
var degrees = ['A', 'B', 'C', 'D', 'E']

function calcSum(score1, score2) {
    var sum;
    sum = score1 + score2;
    return sum;
}

function calcFinal() {
    for (var i = 0; i < students.length; i++) {
        var sum = calcSum(students[i].score1, students[i].score2);
        if (sum >= 51) {
            console.log(students[i].name + ' passed the exam.');
            for (var x = 0; x < scores.length; x++) {
                if (sum >= scores[x]) {
                    console.log('He has ' + sum + ' points and he got a degree ' + degrees[x]);
                    break;
                }
            }
        } else {
            console.log(students[i].name + ' failed the exam.');
        }
    }
}

calcFinal()
*/