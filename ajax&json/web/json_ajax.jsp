
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jquery-3.2.1.min.js"></script>
<script>

    $(function () {
        let str = JSON.stringify({"age":20,"birthday":1594882887571,"checked":true,"id":1,"name":"java"})
        $.post("/demo2",{"user":str},function (obj) {
                console.log(obj)
        })

    })


</script>
<body>

    <input type="button" value="点击按钮" id="btn">


</body>
</html>
