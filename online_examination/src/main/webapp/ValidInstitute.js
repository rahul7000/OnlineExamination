/**
 * 
 */
function ivalidate()
{

	var institutephone=document.isignup.institutephone.value;
	if(isNaN(institutephone))
	{
	alert("Moile number should be numeric");
	return false;
	}
	else if(institutephone.length<10||institutephone.length>10)
		{
		alert("Mobile number must contain only 10 digits!! ");
		return false;
		}

	
	var institutename=document.isignup.institutename.value;

if(institutename=""||institutename==null){
	alert("Institute Name cannot be empty");
	return false;
}



var password=document.isignup.institutepassword.value;
var confpassword=document.isignup.confpassword.value;
if(password.length<6){
	
	alert("Password should be 6 characters long!");
	return false;
}
if(password==confpassword)
	{
	return true;
	}
else
	{
	alert("Passwords should match!!");
	return false;
	}






}