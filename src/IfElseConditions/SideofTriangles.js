const prompt = require("prompt-sync")();

// Input
let side1 = Number(prompt("Enter the side1 of the triangle: "));
let side2 = Number(prompt("Enter the side2 of the triangle: "));
let side3 = Number(prompt("Enter the side3 of the triangle: "));

// Check if valid triangle
if (
    side1 + side2 > side3 &&
    side1 + side3 > side2 &&
    side2 + side3 > side1
) {
    console.log("Valid Triangle");

    // Check Right-angled triangle
    if (
        side1 * side1 === side2 * side2 + side3 * side3 ||
        side2 * side2 === side1 * side1 + side3 * side3 ||
        side3 * side3 === side1 * side1 + side2 * side2
    ) {
        console.log("Right-angled Triangle");
    } else {
        console.log("Not a Right-angled Triangle");
    }
} else {
    console.log("Not a Triangle");
}