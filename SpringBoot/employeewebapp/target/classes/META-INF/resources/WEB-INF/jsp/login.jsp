<html>
<head>
	<title>Login Page</title>
	<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
	<style>
		.wrap {
			background-color: #242c34;
			border-radius: 5px;
			box-shadow: 0px 10px 34px -15px rgba(0, 0, 0, 0.4);
		}
		
		body {
			background-color: #2e3347;
		}
		
		.row {
			display: flex; /* Add this line to enable flexbox */
			align-items: center;
			justify-content: center;
			min-height: 100vh; /* Add this line to make the container full height */
		}
		
		.form-label {
			color: #fff;
		}
		
		pre {
			padding: 10px;
			background-color: pink;
			border-radius: 5px;
		}
		
	 	.button {
		    display: flex;
		    justify-content: center; 
		    align-items: center; 
		    background-color: #4b938d;
		    color: #bcdbdc;
		 }
	</style>
</head>
<body>
	<div class="container  justify-content-center">
		<div class="row">
			<div class="col-md-7 col-lg-5">
				<div class="wrap">
					<div class="login-wrap p-4 p-md-5">
						<div class="d-flex">
							<div>
								<h3 class="form-label">Log In</h3>
							</div>
						</div>
						<script>
							var errorMessage = "${errorMessage}";
							if (errorMessage) {
								document.write('<pre>' + errorMessage + '</pre>');
							}
						</script>
						<form method="post" class="signin-form">
							<div class="mt-3">
								<label for="name" class="form-label">Name:</label>
								<input type="text" class="form-control" id="name" name="name" required>
							</div>
							<div class="mt-3">
								<label for="password" class="form-label">Password:</label>
								<input type="password" class="form-control" id="password" name="password" required>
							</div>
							<div class="mt-4">
								<button type="submit" class="form-control btn button submit">Login</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>

