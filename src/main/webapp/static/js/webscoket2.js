var websocket = null;

//判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
    websocket = new WebSocket("ws://localhost:8001/websocket");
} else {
    alert('Not support websocket')
}

//连接发生错误的回调方法
websocket.onerror = function () {
    alert("连接错误")
};

//连接成功建立的回调方法
websocket.onopen = function (event) {

}

//接收到消息的回调方法
websocket.onmessage = function (event) {
    console.log("回调内容 : " + event.data)
    if (event.data != null && event.data != "") {
        document.getElementById("iframe1").src =event.data
    }
}

//连接关闭的回调方法
websocket.onclose = function () {
    alert("WebSocket连接关闭");
}

//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function () {
    websocket.close();
}

//关闭连接
function closeWebSocket() {
    websocket.close();
}

