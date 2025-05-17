const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function tinhTienNuoc(soDau, soCuoi) {
    if (soCuoi >= soDau) {
        return (soCuoi - soDau) * 10000;
    } else {
        return -1;
    }
}

rl.question("Nhập số đầu đồng hồ nước: ", (input1) => {
    rl.question("Nhập số cuối đồng hồ nước: ", (input2) => {
        const soDau = parseInt(input1);
        const soCuoi = parseInt(input2);

        if (isNaN(soDau) || isNaN(soCuoi)) {
            console.log("Vui lòng nhập số hợp lệ.");
        } else {
            const thanhTien = tinhTienNuoc(soDau, soCuoi);
            if (thanhTien === -1) {
                console.log("Lỗi: Số cuối phải lớn hơn hoặc bằng số đầu.");
            } else {
                console.log("Thành tiền: " + thanhTien + " đồng");
            }
        }

        rl.close();
    });
});
