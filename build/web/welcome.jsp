<%-- 
    Document   : welcome
    Author     : Cassio
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <title>Welcome,  
            <%
                String name = (String) request.getAttribute("name");
                String email = (String) request.getAttribute("email");
                out.print(name);%>          
            ! | DBox</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap core CSS -->
        <link href="style/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="style/sign.css" rel="stylesheet">
        <!-- Favicon image -->
        <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
        <link rel="icon" href="img/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container">
            <% if (request.getAttribute("changedPassword") != null) {
                    Boolean changedPassword = (Boolean) request.getAttribute("changedPassword");
                    if (changedPassword) {
            %>
            <div class="alert alert-success" style="text-align: center;" role="alert">
                Password changed successfully!
            </div>
            <%}
                    }%>
            <h2 class="form-signin-heading" style="text-align: center;">Hello, <% out.print(name);%>!</h2>
            <form class="form-signin" action="ShowFriends" method="POST">
                <input type="hidden" name="name" value="<% out.print(name);%>">
                <input type="hidden" name="email" value="<% out.print(email);%>">
                <button class="btn btn-lg btn-primary btn-block" type="submit">Show my friends</button>
            </form>
            <form class="form-signin" action="RequestPassword" method="POST">
                <input type="hidden" name="name" value="<% out.print(name);%>">
                <input type="hidden" name="email" value="<% out.print(email);%>">
                <input name="password" type="password" class="form-control" placeholder="Enter new password">
                <button class="btn btn-lg btn-primary btn-block" type="submit">Set new password</button>
            </form>
            <form class="form-signin" action="RequestDelete" method="POST">
                <input type="hidden" name="email" value="<% out.print(email);%>">
                <button class="btn btn-lg btn-danger btn-primary btn-block" type="submit">Delete my account</button>
                <button onclick="window.location.href = 'signin.jsp'" class="btn btn-lg btn-primary btn-block" type="button">Logout</button>
            </form>
            <%
                ArrayList<String> allFriends = (ArrayList<String>) request.getAttribute("friends");
                if (allFriends != null) {
                    out.println("<h2 style=\"text-align: center;\">Your friends:</h2>");
                    for (String friend : allFriends) {
                        out.println("<h3 style=\"text-align: center;\">" + friend + "</h3>");
                    }
                }
            %>
        </div> <!-- /container -->
        <!-- jQuery library -->
        <script src="js/jquery-1.11.2.min.js"></script>
    </body>
</html>
