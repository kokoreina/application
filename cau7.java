// Function to perform the division and handle the error
function divideNumbers() {
    // Prompt user for input
    let num1 = parseFloat(prompt("Nhập số thứ nhất:"));
    let num2 = parseFloat(prompt("Nhập số thứ hai:"));
    
    // Check if the second number is zero
    if (num2 === 0) {
        alert("Lỗi: Không thể chia cho 0!");
    } else {
        let result = num1 / num2;
        alert(`Kết quả: ${num1} / ${num2} = ${result.toFixed(2)}`);
    }
}

// Call the function
divideNumbers();
