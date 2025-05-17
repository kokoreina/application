<!DOCTYPE html>
<html>
<head>
    <title>Phép nhân hai số</title>
</head>
<body>
    <h2>Nhập hai số để nhân</h2>
    <input type="number" id="soA" placeholder="Nhập số a">
    <input type="number" id="soB" placeholder="Nhập số b">
    <button onclick="nhanHaiSo()">Tính tích</button>
    <p id="ketQua"></p>

    <script>
        function nhanHaiSo() {
            // Lấy giá trị từ ô input
            let a = parseFloat(document.getElementById("soA").value);
            let b = parseFloat(document.getElementById("soB").value);

            // Tính tích
            let ketQua = a * b;

            // Hiển thị kết quả
            document.getElementById("ketQua").innerText = `Kết quả: ${a} * ${b} = ${ketQua}`;
        }
    </script>
</body>
</html>
