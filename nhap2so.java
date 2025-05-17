<!DOCTYPE html>
<html>
<head>
    <title>Kiểm tra chia hết</title>
</head>
<body>
    <h2>Kiểm tra a có chia hết cho b</h2>
    <label>Nhập số a: </label>
    <input type="number" id="soA"><br><br>

    <label>Nhập số b: </label>
    <input type="number" id="soB"><br><br>

    <button onclick="kiemTraChiaHet()">Kiểm tra</button>
    <p id="ketQua"></p>

    <script>
        function kiemTraChiaHet() {
            let a = parseInt(document.getElementById("soA").value);
            let b = parseInt(document.getElementById("soB").value);
            let ketQua = document.getElementById("ketQua");

            if (isNaN(a) || isNaN(b)) {
                ketQua.innerText = "Vui lòng nhập cả hai số.";
            } else if (b === 0) {
                ketQua.innerText = "Không thể chia cho 0.";
            } else {
                if (a % b === 0) {
                    ketQua.innerText = `${a} chia hết cho ${b}`;
                } else {
                    ketQua.innerText = `${a} không chia hết cho ${b}`;
                }
            }
        }
    </script>
</body>
</html>
