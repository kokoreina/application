<!DOCTYPE html>
<html>
<head>
    <title>Tìm USCLN của 2 số</title>
</head>
<body>
    <h2>Tìm Ước số chung lớn nhất (USCLN)</h2>

    <label>Nhập số a: </label>
    <input type="number" id="soA"><br><br>

    <label>Nhập số b: </label>
    <input type="number" id="soB"><br><br>

    <button onclick="timUSCLN()">Tìm USCLN</button>
    <p id="ketQua"></p>

    <script>
        // Hàm tính USCLN (sử dụng thuật toán Euclid)
        function uscln(a, b) {
            while (b !== 0) {
                let temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a); // trả về giá trị dương
        }

        function timUSCLN() {
            let a = parseInt(document.getElementById("soA").value);
            let b = parseInt(document.getElementById("soB").value);
            let ketQua = document.getElementById("ketQua");

            if (isNaN(a) || isNaN(b)) {
                ketQua.innerText = "Vui lòng nhập cả hai số nguyên.";
            } else {
                let kq = uscln(a, b);
                ketQua.innerText = `USCLN của ${a} và ${b} là: ${kq}`;
            }
        }
    </script>
</body>
</html>
