<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Display Student</title>
<link href="http://fonts.googleapis.com/css?family=Abel" rel="stylesheet" type="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<link href="form-basic.css" rel="stylesheet" type="text/css" media="screen" />
<link href="flat-table.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery.dropotron-1.0.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1>Display Student</h1>
				
			</div>
		</div>
	</div>
	<!-- end #header -->
	<div id="menu-wrapper">
		<ul id="menu">
			<li><a href="index.jsp"><span>Homepage</span></a></li>
			<li><span>Student</span>
				<ul>
					<li class="first"> <a href="AddStudent.jsp">Add Student</a> </li>
					<li class="last">  <a href="StudentControl">Display Student</a> </li>
				</ul>
			</li>
			
			<li><span>Course</span>
				<ul>
					<li class="first"> <a href="AddCourse.jsp">Add Course</a> </li>
					<li class="last"> <a href="CourseControl">Display Course</a> </li>
				</ul>
			</li>
                          <li><span>User</span>
				<ul>
					<li class="first"> <a href="AddUser.jsp">Add User</a> </li>
					<li class="last"> <a href="UserControl">Display User</a> </li>
				</ul>
			</li>
                        <li><a href="LoginMain.jsp"><span>Sign Out</span></a></li>
                        
		</ul>
		<script type="text/javascript">
			$('#menu').dropotron();
		</script>
        </div>
            <br>
                
<table class="flat-table" align="center" >

    <tr>
                    <th>Sid</th>
                    <th>First name</th>
                    <th>Middle name</th>
                    <th>Last Name</th>
                    <th>Gender</th>
                    <th>City</th>
                    <th>Address</th>
                    <th>Phone</th>
                    <th>E-Mail</th>
                    <th>Level</th>
                    <th>Area</th>
                    <th>Edit</th>
                    <th>Delete</th>
    </tr>
    <c:forEach items="${studentdata}" var="student">
        <tr>
                    <td>${student.sid}</td>
                    <td>${student.firstname}</td>
                    <td>${student.middlename}</td>
                    <td>${student.lastname}</td>
                    <td>${student.gender}</td>
                    <td>${student.city}</td>
                    <td>${student.address}</td>
                    <td>${student.phone}</td>
                    <td>${student.email}</td>
                    <td>${student.level}</td>
                    <td>${student.area}</td>
                    <td><a href="StudentControl?sid=${student.sid}&action=edit">Edit</a></td>
                    <td><a href="StudentControl?sid=${student.sid}&action=delete">Delete</a></td>
        </tr>
   
  </c:forEach>
	</table>
                <br>
                
	
<div id="footer">
   
	<p>2015. Santosh Aryal. All rights reserved.</p>
</div>
<!-- end #footer -->
</body>
</html>
