<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>WebSocket</title>
</head>
<style>
    .wrapper{

        text-align: center;
    }

</style>

<body>
    <div class="wrapper">
        Welcome<br/>
        <input id="text" type="text"/>
        <button onclick="send()">发送</button>
        <button onclick="closeWebSocket()">关闭</button><br/><br/>
        <button onclick="sendMSG('https://www.baidu.com/')">推送百度页面到iframe</button>
        <button onclick="sendMSG('https://www.163.com/')">推送163页面到iframe</button><br/><br/>
        以下为服务器返回内容 ： <br/>
        <div id="message">  </div>

    </div>


</body>

<script src="../../static/js/jquery-1.12.0.min.js"></script>
<script src="../../static/js/webscoket1.js"></script>
<script>
    function sendMSG(index) {
        $.post("/push",{"index": index},function () {

        });
    }



</script>
</html>