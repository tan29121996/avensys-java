<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Todos Page</title>
  <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
  <style>
    .table tbody td.status span {
      position: relative;
      border-radius: 30px;
      padding: 4px 10px;
    }

    .table tbody td.status .active {
      background: #cff6dd;
      color: #1fa750;
    }

    .table tbody td.status .active:after {
      background: #23bd5a;
    }

    .table tbody td.status .waiting {
      background: #fdf5dd;
      color: #cfa00c;
    }

    .table thead th,
    .table tbody td {
      text-align: center;
    }
    
    .table tbody td {
      vertical-align: middle;
    }

    body {
    	background-color: #2e3347;
    }

  .table {
    color: white;
    border-color: white;
    border: 1px solid #242c34;
    border-collapse: separate;
    border-spacing: 0; 
  }
    
    h1 {
    	color: #fff;
    }
    
    thead {
    	background-color: #242c34;
    }
    
 	.flex-button {
	    display: flex;
	    justify-content: center; 
	    align-items: center; 
	    background-color: #4b938d;
	    color: #bcdbdc;
	 }

  </style>
</head>

<body>
  <div class="container">
    <h1 class="mt-3">Your To-dos are:</h1>
    <div class="row">
      <div class="col-md-12">
        <div class="table-wrap">
          <table class="table">
            <thead>
              <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Status</th>
                <th>Delete</th>
                <th>Update</th>
              </tr>
            </thead>
            <tbody>
              <tr class="alert" role="alert">
                <c:forEach items="${todos}" var="todo">
                  <tr>
                    <td>${todo.id}</td>
                    <td>${todo.name}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td class="status"><span class="active">${todo.done}</span></td>
                    <td class="actions"><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
                    <td class="actions"><a href="update-todo?id=${todo.id}" class="btn btn-primary">Update</a></td>
                  </tr>
                </c:forEach>
              </tr>
            </tbody>
          </table>
          <a href="add-todo" class="btn flex-button">Add To-do</a>
        </div>
      </div>
    </div>
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
  </div>
</body>
</html>
