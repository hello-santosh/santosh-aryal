<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Add Student</title>
<link href="http://fonts.googleapis.com/css?family=Abel" rel="stylesheet" type="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<link href="form-basic.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery.dropotron-1.0.js"></script>\
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1>Add Student</h1>
				
			</div>
		</div>
	</div>
	<!-- end #header -->
	<div id="menu-wrapper">
		<ul id="menu">
			<li ><a href="index.jsp"><span>Homepage</span></a></li>
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
        
        <form class="form-basic" action="StudentControl" method="POST">
            <c:forEach items="${studentdata}" var="student">
                <input type="hidden" name="sid" value="${student.sid}">
            <div class="form-row">
                <label>
                    <span>First name</span>
                    <input type="text" name="firstname" value="${student.firstname}">
                </label>
            </div>
            <div class="form-row">
                <label>
                    <span>Middle name</span>
                    <input type="text" name="middlename" value="${student.middlename}">
                </label>
            </div>
            <div class="form-row">
                <label>
                    <span>Last name</span>
                    <input type="text" name="lastname" value="${student.lastname}">
                </label>
            </div>
            
           <div class="form-row">
                <label><span>Gender</span></label>
                <div class="form-radio-buttons" >

                    <div>
                        <label>
                            <input type="radio" name="gender" value="M" <c:if test="${student.gender=='M'}">checked</c:if>>
                            <span>Male</span>
                        </label>
                    </div>

                    <div>
                        <label>
                            <input type="radio" name="gender" value="F" <c:if test="${student.gender=='F'}">checked</c:if>>
                            <span>Female</span>
                        </label>
                    </div>

                </div>
            </div>

            <div class="form-row">
                <label>
                    <span>City</span>
                    <input type="text" name="city" value="${student.city}">
                </label>
            </div>
            
             <div class="form-row">
                <label>
                    <span>Address</span>
                    <input type="text" name="address" value="${student.address}">
                </label>
            </div>
            
             <div class="form-row">
                <label>
                    <span>Phone</span>
                    <input type="text" name="phone" value="${student.phone}">
                </label>
            </div>
            
             <div class="form-row">
                <label>
                    <span>E-Mail</span>
                    <input type="text" name="email" value="${student.email}">
                </label>
            </div>
            
               <div class="form-row">
                <label>
                    <span>Level</span>
                    <select name="level" value="${student.level}">
                        <option>Plus Two</option>
                        <option>Bachelor</option>
                        <option>Masters</option>
                        <option>PHD</option>
                    </select>
                </label>
            </div>
            
            <div class="form-row">
                <label>
                    <span>Area</span>
                    <select name="level" value="${student.area}">
                        <option>Management</option>
                        <option>Science</option>
                        <option>Forestry</option>
                        <option>Humanities</option>
                    </select>
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
