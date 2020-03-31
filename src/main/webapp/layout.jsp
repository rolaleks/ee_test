<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta charset="utf-8">
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="content">
            <jsp:include page="${file}"></jsp:include>
        </div>
    </body>
</html>
