<html>
    <title>Registration for Student</title>

        <script language="javascript">
            function SelectRedirect(){
                switch(document.getElementById('s1').value)
                    {
                        case "student":
                        window.location="index.jsp";
                        break;

                        case "employee":
                        window.location="login.jsp";
                        break;
                    }
                }
        </script>
<body class=body>
    <div class="container">
    <form align="center" action="register"  method="POST">
    <form action="registration">
    <h1 style="color:#f00">Event Registration for Student<h1></br>
         Database Name:<select id="s1" name="section" onChange="SelectRedirect();">
                <option value="">-----</option>
                <option value="student">Student</option>
                <option value="employee">Employee</option>
                </select></br>
        First Name : <input type="text" name="firstname"/></br>
        Last Name : <input type="text" name="lastname"/></br>
        Email ID : <input type="email" name="email"/></br>
        Date : <input type="date" name="date"/></br>
        Time : <input type="time" name="time"/></br>
        Topic : <input type="text" name="topic"/></br>
        Location : <select name="location"></br>
            <option>Salem</option>
            <option>Coimbatore</option>
            <option>Mumbai</option>
            <option>Namakkal</option>
            <option>Erode</option>
            <option>Rasipuram</option>
            </select></br>
           <input type="submit" value="Register">
           </form>
           <input type="hidden" name="databasename" value="registration">
           <input type="hidden" name="field1" value="f_name">
           <input type="hidden" name="field2" value="l-name">
           <input type="hidden" name="field3" value="email">
           <input type="hidden" name="field4" value="date">
           <input type="hidden" name="field5" value="time">
           <input type="hidden" name="field6" value="topic">
           <input type="hidden" name="field7" value="location">
</body> 
</html>
