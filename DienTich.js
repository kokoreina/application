function tinhDienTich() {
    const dai = parseFloat(document.getElementById("chieuDai").value);
    const rong = parseFloat(document.getElementById("chieuRong").value);
    const ketQua = document.getElementById("ketQua");

    if (isNaN(dai) || isNaN(rong) || dai <= 0 || rong <= 0) {
        ketQua.innerText = "Vui lòng nhập số hợp lệ cho chiều dài và chiều rộng.";
        ketQua.style.color = "red";
        return;
    }

    const dienTich = dai * rong;
    ketQua.innerText = `Diện tích hình chữ nhật là: ${dienTich.toFixed(2)}`;
    ketQua.style.color = "green";
}
