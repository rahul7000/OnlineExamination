/**
 * 
 */

function validate()
{
/*var Qname=document.qstn.Qname.value;

if(Qname=""||Qname==null){
	alert("Question cannot be empty");
	return false;
}*/

	var q = document.qstn.Qname.value;
	if(q=="")
	{
	alert("Please Enter Question???");
	document.qstn.Qname.focus();
	return false;
	}

	
var optB=document.qstn.optB.value;
if(optB==""||optB==null){
alert("Please provide option 2.");
return false;
}

var optC=document.qstn.optC.value;
if(optC==""||optC==null){
alert("Please provide option 3.");
return false;
}
var optD=document.qstn.optD.value;
if(optD==""||optD==null){
alert("Please provide option 4.");
return false;
}



var qno=document.qstn.qno.value;
if(qno==""||qno==null){
alert("Please provide Question numberr.");
return false;
}


if(isNaN(qno))
{
alert("Question number should be numeric");
return false;
}

var examid=document.qstn.examid.value;
if(examid==""||examid==null){
alert("Please provide exam Id.");
return false;
}

var optA=document.qstn.optA.value;
if(optA==""||optA==null){
alert("Please provide option 1.");
return false;
}

var correct=document.qstn.correct.value;
if(correct==""||correct==null){
alert("Please provide correct answer.");
return false;
}




}