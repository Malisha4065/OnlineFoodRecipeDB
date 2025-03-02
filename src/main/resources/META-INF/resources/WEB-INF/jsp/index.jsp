<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet"/>
    <title>Document</title>
</head>
<body>
    <%@ include file="common/navigation.jspf" %>
    <table style="margin-top: 60px" class="table">
        <thead>
        <tr>
            <th>name</th>
            <th>rating</th>
            <th>ingredients</th>
            <th>steps</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${recipes}" var="recipe">
            <tr>
                <td>${recipe.name}</td>
                <td>${recipe.rating}</td>
                <td>${recipe.ingredients}</td>
                <td>${recipe.steps}</td>
                <td><a href="delete-recipe?id=${recipe.id}" class="btn btn-warning">Delete</a></td>
                <td><a href="update-recipe?id=${recipe.id}" class="btn btn-success">Update</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="add-recipe" class="btn btn-outline-success">Add Recipe</a>

    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
</body>
</html>