<!DOCTYPE html>
<html>
<head>
    <title>In hai số theo thứ tự tăng dần</title>
</head>
<body>
    <h2>Nhập hai số và in theo thứ tự tăng dần</h2>

    <label>Nhập số thứ nhất: </label>
    <input type="number" id="soA"><br><br>

    <label>Nhập số thứ hai: </label>
    <input type="number" id="soB"><br><br>

    <button onclick="inTangDan()">In theo thứ tự tăng dần</button>
    <p id="ketQua"></p>

    <script>
        function inTangDan() {
            let a = parseFloat(document.getElementById("soA").value);
            let b = parseFloat(document.getElementById("soB").value);
            let ketQua = document.getElementById("ketQua");

            if (isNaN(a) || isNaN(b)) {
                ketQua.innerText = "Vui lòng nhập đủ hai số.";
            } else {
                if (a < b) {
                    ketQua.innerText = `Thứ tự tăng dần: ${a}, ${b}`;
                } else if (a > b) {
                    ketQua.innerText = `Thứ tự tăng dần: ${b}, ${a}`;
                } else {
                    ketQua.innerText = `Hai số bằng nhau: ${a}`;
                }
            }
        }
    </script>
</body>
</html>
