let Arr= [3,6,7,8,6,4,0,23];

let max = Integer.MIN_VALUE;
let secondMax = Integer.MIN_VALUE;

for(let i = 0; i < Arr.length; i ++){
    if (Arr[i] > max){
        secondMax = max ;
        max = Arr[i];
    }
     else if (Arr[i] > secondMax && Arr[i] !== max) {

        secondMax = Arr[i];
    }
}
console.log(secondMax);