<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/any/StudentController" method="post">
<pre>
	Enter Student ID       : <input type="text" placeholder="Enter ID" name="stuID"/>
	Enter Student Name     : <input type="text" placeholder="Enter Name" name="stuName"/>
	Gender                 : <input type="radio" name="gender" value="male"/> Male
				 <input type="radio" name="gender" value="female"/> Female
				 
        Enter Student course   : <input type="text" placeholder="Enter Course" name="course"/>
        Enter Student Address  : <input type="text" placeholder="Enter Address" name="address"/>
        
        
    			<input type="submit" value="submit"/>
	 
</pre>
</form>
</body>
</html>