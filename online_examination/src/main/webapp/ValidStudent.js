/**
 * 
 */
function validate(signup)
{

	var username=document.signup.username.value;
	var password=document.signup.password.value;
	var confpassword=document.signup.confpassword.value;
	

	var mobile=document.signup.mobile.value;

	
	  // regular expression to match required date format
    re = /^\d{4}\/\d{1,2}\/\d{1,2}$/;

    if(signup.dob.value != '' && !signup.dob.value.match(re)) {
      alert("Invalid date format: " + signup.dob.value);
      signup.dob.focus();
      return false;
    }

  

	if(isNaN(mobile))
	{
	alert("Moile number should be numeric");
	return false;
	}

	if(mobile.length<10||mobile.length>10)
		{
		alert("Mobile numbermust contain only 10 digits!! ");
		return false;
		}

	if(username=""||username==null){
		alert("Student Name cannot be empty");
		return false;
	}
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

// regular expression to match required date format
re = /^\d{4}\/\d{1,2}\/\d{1,2}$/;

if(dob.value != '' && !dob.value.match(re)) {
  alert("Invalid date format: " + dob.value);
  dob.focus();
  return false;
}



}