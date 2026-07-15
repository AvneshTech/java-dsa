// let str = "Avnesh kumar";
//
// let reverseStr = str.split("").reverse().join("");
//
// console.log(reverseStr);

let str = "Avnesh kumar";
let reverseStr = "";

for (let i = str.length - 1; i >= 0; i--) {
    reverseStr += str[i];
}

console.log(reverseStr);