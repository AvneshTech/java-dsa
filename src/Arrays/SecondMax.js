let Arr = [3, 6, 7, 8, 6, 4, 0, 23];

// Replaced Integer.MIN_VALUE with JavaScript's -Infinity
let max = -Infinity;
let secondMax = -Infinity;

for (let i = 0; i < Arr.length; i++) {
    if (Arr[i] > max) {
        secondMax = max;
        max = Arr[i];
    } else if (Arr[i] > secondMax && Arr[i] !== max) {
        secondMax = Arr[i];
    }
}

console.log(secondMax); // Output: 8