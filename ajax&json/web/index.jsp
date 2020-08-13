<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script>

<%--    原生的ajax书写（了解） --%>
       function f1() {
           let xmlHttpRequest;
           //根据不同浏览器有不同的生成方式
           if ( window.XMLHttpRequest){
             //兼容 chorme ，sarifi，火狐
             xmlHttpRequest = new XMLHttpRequest();
           }else {
              //适合IE 5,6
              xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
           }
       /*
        参数：
           method:   GET  /   POST
           url: get请求时参数需要追加到url后面
           请求是否异步： true(异步) false(同步请求)
           建立连接
       */
         xmlHttpRequest.open("POST","/demo1",true);

         //当请求的方式设为POST需要设置请求头信息
         xmlHttpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded")

       //    发送请求
         xmlHttpRequest.send("name=java&age=18");

       //  处理响应后页面该如何处理
        xmlHttpRequest.onreadystatechange=function () {

            if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status ==200){
                let msg =  xmlHttpRequest.responseText;
                alert(msg)
            }
        }

       }
  </script>

  <body>
         <input type="button" value="点击发送请求" onclick="f1()">
         <input type="text">

  </body>
</html>
