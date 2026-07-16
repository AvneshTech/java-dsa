// // without using any functions
// let sentence = "JavaScript awesome";
// let words = sentence.split(" ");
// let result = "";
//
// for (let i = words.length - 1; i >= 0; i--){
//     result += words[i] + " ";
// }
// console.log(result.trim());

// using fucntion

let sentence = "Everything is okay";
let reversed = sentence.split(" ").reverse().join(" ");
console.log(reversed);