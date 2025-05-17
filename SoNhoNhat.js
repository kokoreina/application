function timSoNhoNhat() {
    const so1 = parseFloat(document.getElementById("so1").value);
    const so2 = parseFloat(document.getElementById("so2").value);
    const ketQua = document.getElementById("ketQua");

    if (isNaN(so1) || isNaN(so2)) {
        ketQua.innerText = "Vui lòng nhập cả 2 số hợp lệ!";
        ketQua.style.color = "red";
        return;
    }

    const nhoNhat = so1 < so2 ? so1 : so2;

    ketQua.innerText = `Số nhỏ nhất là: ${nhoNhat}`;
    ketQua.style.color = "green";
}
