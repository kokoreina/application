

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Nhập số thứ nhất: ", (input1) => {
    rl.question("Nhập số thứ hai: ", (input2) => {
        const num1 = parseFloat(input1);
        const num2 = parseFloat(input2);

        if (isNaN(num1) || isNaN(num2)) {
            console.log("Vui lòng nhập số hợp lệ.");
        } else if (num2 === 0) {
            console.log("Lỗi: Không thể chia cho 0!");
        } else {
            const result = num1 / num2;
            console.log(`Kết quả: ${num1.toFixed(2)} / ${num2.toFixed(2)} = ${result.toFixed(2)}`);
        }

        rl.close();
    });
});
