let arr = [4, 5, 6, 4, 8, 9, 67, 34];
let n = arr.length;

let i = 0;
let j = n - 1;

while (i < j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
}

for (let k of arr) {
    console.log(k);
}