<%-- 
    Document   : signup
    Author     : Cassio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <title>Sign up</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap core CSS -->
        <link href="style/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="style/sign.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <form class="form-signin" action="RequestSignUp" method="POST">
                <h2 class="form-signin-heading">Please sign up</h2>
                <input name="email" type="email" class="form-control" placeholder="Email address" autofocus="true">
                <input name="name" type="name" class="form-control" placeholder="Username">
                <input name="password" type="password" class="form-control" placeholder="Password">
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
                <button onclick="window.location.href = 'signin.jsp'" class="btn btn-lg btn-primary btn-block" type="button">Already a user? Sign in</button>
            </form>
        </div> <!-- /container -->
        <!-- jQuery library -->
        <script src="js/jquery-1.11.2.min.js"></script>
        <!-- Loads head elements -->
        <script src="js/header.js"></script>
    </body>
</html>
