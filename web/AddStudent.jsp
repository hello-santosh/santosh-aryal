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
<script type="text/javascript" src="jquery.dropotron-1.0.js"></script>
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

            <div class="form-row">
                <label>
                    <span>First name</span>
                    <input type="text" name="firstname">
                </label>
            </div>
            <div class="form-row">
                <label>
                    <span>Middle name</span>
                    <input type="text" name="middlename">
                </label>
            </div>
            <div class="form-row">
                <label>
                    <span>Last name</span>
                    <input type="text" name="lastname">
                </label>
            </div>
            
           <div class="form-row">
                <label><span>Gender</span></label>
                <div class="form-radio-buttons">

                    <div>
                        <label>
                            <input type="radio" name="gender" value="M">
                            <span>Male</span>
                        </label>
                    </div>

                    <div>
                        <label>
                            <input type="radio" name="gender" value="F">
                            <span>Female</span>
                        </label>
                    </div>

                </div>
            </div>

            <div class="form-row">
                <label>
                    <span>City</span>
                    <input type="text" name="city">
                </label>
            </div>
            
             <div class="form-row">
                <label>
                    <span>Address</span>
                    <input type="text" name="address">
                </label>
            </div>
            
             <div class="form-row">
                <label>
                    <span>Phone</span>
                    <input type="text" name="phone">
                </label>
            </div>
            
             <div class="form-row">
                <label>
                    <span>E-Mail</span>
                    <input type="text" name="email">
                </label>
            </div>
            
               <div class="form-row">
                <label>
                    <span>Level</span>
                    <select name="level">
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
                    <select name="level">
                        <option>Management</option>
                        <option>Science</option>
                        <option>Forestry</option>
                        <option>Humanities</option>
                    </select>
                </label>
            </div>

            <div class="form-row">
                <button type="submit" name="insert">Submit</button>
            </div>

        </form>

   



<div id="footer">
   
	<p>2015. Santosh Aryal. All rights reserved.</p>
</div>
<!-- end #footer -->
</body>
</html>
