<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lu
  Date: 2023/3/2
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>


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
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="first-titled-pane">
                <h1>
                    书记展示---------显示所有书籍
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
              <a class="bullet-button" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
            </div>
        </div>

    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table-cell">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情 </th>
                    </tr>
                </thead>
                <%--从数据库中遍历出来 foreach--%>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookID}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>

</body>
</html>
