<!DOCTYPE html>
<html>
<head>
    <title>Tính diện tích HCN</title>
    <meta charset="UTF-8">
</head>
<body>
    <h2>Tính diện tích hình chữ nhật</h2>

    <label for="chieuDai">Chiều dài:</label>
    <input type="number" id="chieuDai" min="0" step="any"><br><br>

    <label for="chieuRong">Chiều rộng:</label>
    <input type="number" id="chieuRong" min="0" step="any"><br><br>

    <button onclick="tinhDienTich()">Tính diện tích</button>

    <p id="ketQua"></p>

    <script>
        function tinhDienTich() {
            let chieuDai = parseFloat(document.getElementById("chieuDai").value);
            let chieuRong = parseFloat(document.getElementById("chieuRong").value);
            let ketQua = document.getElementById("ketQua");

            if (isNaN(chieuDai) || isNaN(chieuRong) || chieuDai <= 0 || chieuRong <= 0) {
                ketQua.innerText = "Vui lòng nhập chiều dài và chiều rộng hợp lệ (lớn hơn 0).";
                ketQua.style.color = "red";
                return;
            }

            let dienTich = chieuDai * chieuRong;
            ketQua.innerText = "Diện tích hình chữ nhật là: " + dienTich.toFixed(2);
            ketQua.style.color = "green";
        }
    </script>
</body>
</html>
