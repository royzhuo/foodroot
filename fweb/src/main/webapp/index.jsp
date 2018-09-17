<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="./js/jquery.min.js"></script>
</head>
<body>
<form action="/haha/ha" method="get">
    <input type="text" name="ll" />
    <br><input type="submit" value="提交">
</form>
<input type="text" name="name" id="name"/><br>
<button id="btn" type="button">提交</button>
</body>
<script type="text/javascript">

    $(function () {
        $("#btn").click(function () {
            var name=$("#name").val();
            $.ajax({
                url:"/haha/ha2?name="+name,
                type:"get",
                dataType:"json",
                success:function (data) {
                    if (data){
                        alert("data:"+data);
                    }
                }
            })
        })
    })
</script>
</html>
