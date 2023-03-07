<%--
  Created by IntelliJ IDEA.
  User: Lu
  Date: 2023/3/6
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>


    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="http://apps.bdimg.com/libs/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">

    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="http://apps.bdimg.com/libs/bootstrap/3.2.0/css/bootstrap-theme.min.css"></script>

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://apps.bdimg.com/libs/jquery/1.11.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://apps.bdimg.com/libs/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="chart-alternative-row-fill">
        <div class="chart-alternative-row-fill">
            <div class="page">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${QBook.bookID}">
        <div class="form-select-button">
            <label for="bkname">书籍名称</label>
            <input type="text" name="bookName" class="form-select-button" id="bkname" value="${QBook.bookName}" required>
        </div>

        <div class="form-select-button">
            <label>书籍数量</label>
            <input type="text"  name="bookCounts" class="form-select-button" value="${QBook.bookCounts}" required>
        </div>

        <div class="form-select-button">
            <label for="bkdetil">书籍详情</label>
            <input type="text"  name="detail"  class="form-select-button" id="bkdetil" value="${QBook.detail}" required>
        </div>

        <div class="form-select-button">

            <input type="submit" class="form-select-button" value="修改">
        </div>
    </form>



</div>
</body>
</html>