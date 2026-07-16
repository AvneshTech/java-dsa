// without using any functions
let sentence = "JavaScript awesome";
let words = sentence.split(" ");
let result = "";

for (let i = words.length - 1; i >= 0; i--){
    result += words[i] + " ";
}
console.log(result.trim());
