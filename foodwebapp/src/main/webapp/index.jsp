<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <script type="application/javascript" src="./skin/js/jquery.min.js"></script>
</head>
<body>
<h2>Hello World!-foot-web</h2>

<input type="text" id="name" placeholder="输入名称"><button id="testBtn" type="button" value="测试" style="margin-left: 5px">测试</button>
<form action="/test/isOk" method="get">
    <input type="text" name="name" /><br/>
    <input type="submit" value="提交">
</form>
</body>
<script type="text/javascript">
    $(function () {
        $("#testBtn").click(function () {
            var name=$("#name").val();
            var url="/test/isOk";
            debugger;
            $.ajax({
                url:url,
                type:"post",
                data:{"name":name},
                dataType:"json",
                success:function (data) {
                    if (data){
                        alert(data);
                    }
                },
                error:function (error) {
                    if (error){
                        alert(error);
                    }
                }
            })

        })
    })
</script>
</html>
