const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseNumber(num) {
    const isNegative = num < 0;
    const reversed = parseFloat(Math.abs(num).toString().split('').reverse().join(''));
    return isNegative ? -reversed : reversed;
}

rl.question('Nhập số thứ nhất: ', (input1) => {
    rl.question('Nhập số thứ hai: ', (input2) => {
        const num1 = parseFloat(input1);
        const num2 = parseFloat(input2);

        if (isNaN(num1) || isNaN(num2)) {
            console.log("Vui lòng nhập số hợp lệ!");
        } else {
            const reversed1 = reverseNumber(num1);
            const reversed2 = reverseNumber(num2);

            console.log(`Số thứ nhất sau khi đảo: ${reversed1}`);
            console.log(`Số thứ hai sau khi đảo: ${reversed2}`);
        }

        rl.close();
    });
});
