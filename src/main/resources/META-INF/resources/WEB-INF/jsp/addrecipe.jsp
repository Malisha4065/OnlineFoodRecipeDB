<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add New Recipe</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <%@ include file="common/navigation.jspf" %>
    <div style="margin-top: 60px;">
        <h1>Enter recipe details</h1>
        <form:form method="post" modelAttribute="recipe">
            <fieldset class="mb-3">
                <form:label path="name">Name</form:label>
                <form:input type="text" path="name" required="required"/>
                <form:errors path="name" cssClass="text-warning"/>
            </fieldset>
            <fieldset class="mb-3">
                <form:label path="steps">Steps</form:label>
                <form:input type="text" path="steps" required="required"/>
                <form:errors path="steps" cssClass="text-warning"/>
            </fieldset>
            <fieldset class="mb-3">
                <form:label path="ingredients">Ingredients</form:label>
                <form:input type="text" path="ingredients" required="required"/>
                <form:errors path="ingredients" cssClass="text-warning"/>
            </fieldset>
            <fieldset class="mb-3">
                <form:label path="ingredients">Rating</form:label>
                <form:input type="text" path="rating" required="required"/>
                <form:errors path="rating" cssClass="text-warning"/>
            </fieldset>
            <input type="submit" class="btn btn-success"/>
        </form:form>
    </div>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
</body>
</html>