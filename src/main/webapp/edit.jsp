<%--
  Created by IntelliJ IDEA.
  User: Administrator.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>add</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body{
            overflow-x:hidden;
        }
        #main{
            width:1200px;
            height:600px;
            margin-left:500px;
        }
    </style>
</head>
<body>

<div id="main">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>imooc-修改课程</h1>
        </div>
    </div>

    <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/update" method="post">
        <div class="form-group">
            <label class="col-sm-1 control-label">编号</label>
            <div class="col-sm-3">
                <input type="text" value="${students.id}" name="id" readonly="readonly" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">姓名</label>
            <div class="col-sm-3">
                <input type="text" value="${students.name}" name="name" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">性别</label>
            <div class="col-sm-3">
                <input type="text" value="${students.sex}" name="sex" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">年龄</label>
            <div class="col-sm-3">
                <input type="text" value="${students.age}" name="age" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">学院</label>
            <div class="col-sm-3">
                <input type="text" value="${students.classes}" name="classes" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-1 col-sm-3">
                <input type="hidden" name="_method" value="PUT"/>
                <button type="submit" class="btn btn-default">提交</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
