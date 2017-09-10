<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

  function checkForm(form)
  {
    // regular expression to match required date format
    re = /^\d{4}\/\d{1,2}\/\d{1,2}$/;

    if(form.startdate.value != '' && !form.startdate.value.match(re)) {
      alert("Invalid date format: " + form.startdate.value);
      form.startdate.focus();
      return false;
    }

    // regular expression to match required time format
    re = /^\d{1,2}:\d{2}([ap]m)?$/;

    if(form.starttime.value != '' && !form.starttime.value.match(re)) {
      alert("Invalid time format: " + form.starttime.value);
      form.starttime.focus();
      return false;
    }
   
	var name=document.form.name.value;

	


	if(isNaN(name))
	{
	alert("Moile number should be numeric");
	return false;
	}
	
    alert("All input fields have been validated!");
    return true;
  }

</script>
</head>
<body>
Enter date fiormat yyyy/mm/dd
<form name="form" onsubmit="return checkForm(form)">
<input type="date" name="startdate" value="startdate"/>
<input type="date" name="starttime" value="startdate"/>
<input type="text" name="name" value="startdate"/>

<input type="submit" value="submit">
</form>
</body>
</html>
