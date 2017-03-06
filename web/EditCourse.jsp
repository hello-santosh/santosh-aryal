<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Add Course</title>
<link href="http://fonts.googleapis.com/css?family=Abel" rel="stylesheet" type="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<link href="form-basic.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery.dropotron-1.0.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1>Add Course</h1>
				
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
	

        
            
               
	<!-- end #page -->
</div>
        
        <form class="form-basic" action="CourseControl" method="POST">
            <c:forEach items="${coursedata}" var="course">
             <input type="hidden" name="cid" value="${course.cid}">

            <div class="form-row">
                <label>
                    <span>Title</span>
                    <input type="text" name="title" value="${course.title}">
                </label>
            </div>
            <div class="form-row">
                <label>
                    <span>Price</span>
                    <input type="text" name="price" value="${course.price}">
                </label>
            </div>
            <div class="form-row">
                <label>
                    <span>Duration</span>
                    <input type="text" name="duration" value="${course.duration}">
                </label>
            </div>
            
            <div class="form-row">
                <button type="submit" name="edit" >Edit</button>
            </div>
</c:forEach>
        </form>




<div id="footer">
   
	<p>2015. Santosh Aryal. All rights reserved.</p>
</div>
<!-- end #footer -->
</body>
</html>
