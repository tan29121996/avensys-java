<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Todos Page</title>
		<link href = "/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
	</head>
	<body>
		<div class = "container">
			<h1>Enter To-do Details</h1>
			<form:form method = "post" modelAttribute = "todo">
				<div class="mb-3">
					<label for="description" class="form-label">Description:</label>
					<form:input type="text" class="form-control" id="description" path="description" required = "required" />
					<form:errors path = "description" class="text-warning"/>
					<form:input type="hidden" path = "id" />
					<form:input type="hidden" path = "done" />
				</div>
				<div class="mb-3">
					<label for="targetDate" class="form-label">Target Date:</label>
					<form:input type="date" class="form-control" id="targetDate" path="targetDate" />
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form:form>
		</div>
		<script src = "/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src = "/webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>