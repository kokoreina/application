// Hàm tính GCD (Ước chung lớn nhất)
function gcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Hàm tính BCNN (Bội số chung nhỏ nhất)
function lcm(a, b) {
    return Math.abs(a * b) / gcd(a, b);
}

// Nhập số từ người dùng
function findLCM() {
    let num1 = parseInt(prompt("Nhập số thứ nhất:"));
    let num2 = parseInt(prompt("Nhập số thứ hai:"));

    let result = lcm(num1, num2);
    alert(`Bội số chung nhỏ nhất của ${num1} và ${num2} là: ${result}`);
}

// Gọi hàm để tìm BCNN
findLCM();
