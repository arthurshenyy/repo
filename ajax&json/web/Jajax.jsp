<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jquery下的ajax</title>
</head>
 <script src="js/jquery-3.2.1.min.js"></script>
 <script>

     $(function () {
         $("#search").click(function () {
             //     $.ajax({
             //         type:"POST"              // 设置请求的方式
             //         ,url:"/demo1"           //设置url  get请求参数直接添加到url后面
             //         ,data:"name=java&age=18"         // post请求  添加data属性
             //         ,success:function (obj) {    //成功的响应函数
             //             alert(obj)
             //         }
             //         ,error:function (obj) {     //响应失败后的函数
             //             alert(obj)
             //         }
             //         ,dataType: "text"        //设置接收到的响应数据的格式
             //     })
             // })

             // $.get(url,data,响应函数,dataType)
             // $.post(url,data,响应函数,dataType)







         })



     })


 </script>
<body>

   <input type="button" value="点击此处按钮" id="search">


</body>
</html>
