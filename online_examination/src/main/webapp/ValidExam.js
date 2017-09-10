/**
 * 
 */

function validate()
{
	  // regular expression to match required date format
    re = /^\d{4}\/\d{1,2}\/\d{1,2}$/;

    if(signup.examdate.value != '' && !signup.examdate.value.match(re)) {
      alert("Invalid date format: " + signup.examdate.value);
      signup.examdate.focus();
      return false;
    }

  

	
	
var examid=document.signup.examid.value;

if(examid=""||examid==null){
	alert("Examid cannot be empty");
	return false;
}
var examname=document.signup.examname.value;

if(examname=""||examname==null){
	alert("Exam Name cannot be empty");
	return false;
}


var examtime=document.signup.examtime.value;

if(examtime=""||examtime==null){
	alert("Exam Time cannot be empty");
	return false;
}
var marks=document.signup.marks.value;
if(isNaN(marks))
{
alert("Marks should be numeric value");
return false;
}
else if(marks==""||marks==null)
	{
	alert("Exam marks cannot be empty!!");
	return false;
	}

var instituteid=document.signup.instituteid.value;

if(instituteid=""||instituteid==null){
	alert("Instituteid cannot be empty");
	return false;
}


}
