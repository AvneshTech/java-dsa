let arr = [1,2,3,4,5,6,7,8,9,11,6,4,9];
let target = 10;

let seen = new Set();

for (let num of arr) {
    let complement = target - num;

    if (seen.has(complement)) {
        console.log(complement, num);
    }

    seen.add(num);
}