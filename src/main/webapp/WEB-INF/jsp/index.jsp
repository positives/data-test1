<%@page pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>
        <h1>Hello Word  1</h1>
        <span id="cc"></span>
</body>
<script src="../../static/js/jquery-1.12.0.min.js"></script>
<script type="text/javascript">

    $.ajax({
        dataType:"json",
        url:"/query",
        type:'post',
        success:function (data) {
            console.log(data)
           $("#cc").html(data)
        }
    });
</script>
</html>