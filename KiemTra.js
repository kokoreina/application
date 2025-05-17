function kiemTraDoiXung() {
    const so = document.getElementById("soNhap").value;
    const ketQua = document.getElementById("ketQua");

    if (so === "") {
        ketQua.innerText = "Vui lòng nhập một số!";
        ketQua.style.color = "red";
        return;
    }

    const soGoc = so;
    const soDao = so.split("").reverse().join("");

    if (soGoc === soDao) {
        ketQua.innerText = `${so} là số đối xứng ✅`;
        ketQua.style.color = "green";
    } else {
        ketQua.innerText = `${so} không phải là số đối xứng ❌`;
        ketQua.style.color = "red";
    }
}
