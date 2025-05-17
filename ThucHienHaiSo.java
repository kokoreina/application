function cong(a, b) {
    return a + b;
}

function tru(a, b) {
    return a - b;
}

function nhan(a, b) {
    return a * b;
}

function chia(a, b) {
    if (b !== 0) {
        return a / b;
    } else {
        return "Lỗi: Không thể chia cho 0";
    }
}

// Gọi thử hàm với 2 số bất kỳ
let a = 10;
let b = 5;

console.log("Số thứ nhất:", a);
console.log("Số thứ hai:", b);
console.log("Tổng:", cong(a, b));
console.log("Hiệu:", tru(a, b));
console.log("Tích:", nhan(a, b));
console.log("Thương:", chia(a, b));
