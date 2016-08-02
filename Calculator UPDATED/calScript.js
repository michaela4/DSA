var memory = "0", recent = "0", operation = 0;
var mxLength = 30;

function addDigit (dig){ //ADD A DIGIT TO DISPLAY (kept as 'Current')
	if (recent.indexOf("!") == -1) {  //if not already an error
		if ( (eval(recent) == 0) && (recent.indexOf(".") == -1)) { 
			recent = dig;
      	} else { 
      		recent = recent + dig;
        };
    	recent = recent.toLowerCase(); //FORCE LOWER CASE
    } 
   
	if (recent.length > mxLength) { 
    	recent = "Aargh! Too long"; //don't allow over MAXLENGTH digits before "." ???
     };
  	document.getElementById('result').innerHTML= recent;
 };

function positiveNegative() // to make values either positive or negative
 {
  if  (recent.indexOf("e") != -1)
    { var epos = recent.indexOf("e-");
      if (epos != -1)
         { recent = recent.substring(0,1+epos) + recent.substring(2+epos); //clip out -ve exponent 
         } else
         { epos = recent.indexOf("e");
           recent = recent.substring(0,1+epos) + "-" + recent.substring(1+epos); //insert -ve exponent
         };
    } else
    {  if ( recent.indexOf("-") == 0 )
         { recent = recent.substring(1);
         } else
         { recent = "-" + recent;
         };
       if (    (eval(recent) == 0)
            && (recent.indexOf(".") == -1 )
          ) { recent = "0"; };
    };
  document.getElementById('result').innerHTML= recent;
 }

function dot (){
	if ( recent.length == 0) {  //no leading ".", use "0."
    	recent = "0.";
    } else {
    	if ( recent.indexOf(".") == -1) {
        	recent = recent + ".";
    	};   
    };
	document.getElementById('result').innerHTML= recent;
};

function del (){ 		//clear entry
	recent = "0";
    document.getElementById('result').innerHTML= recent;
};

function allClear (){
	recent = "0";
	operation = 0;                //clear operation
	memory = "0";                  //clear memory
	document.getElementById('result').innerHTML= recent;
};

function operate (op){
	if (op.indexOf("*") > -1) { operation = 1; };       
  	if (op.indexOf("/") > -1) { operation = 2; };       
  	if (op.indexOf("+") > -1) { operation = 3; };       
  	if (op.indexOf("-") > -1) { operation = 4; };       

  	memory = recent;                 //store value
  	recent = "";                     //or we could use "0"
  	document.getElementById('result').innerHTML= recent;
};

function calculate (){
	if (operation == 1) { recent = eval(memory) * eval(recent); };
    if (operation == 2) { recent = eval(memory) / eval(recent); };
  	if (operation == 3) { recent = eval(memory) + eval(recent); };
  	if (operation == 4) { recent = eval(memory) - eval(recent); };
  	operation = 0;                //clear operation
  	memory    = "0";              //clear memory
  	document.getElementById('result').innerHTML= recent;
};

function fixCurrent (){
	recent = document.getElementById('result').innerHTM
  	recent = "" + parseFloat(recent);
  	if (recent.indexOf("NaN") != -1) {
  		recent = "Aargh! I don't understand";
    };
	document.getElementById('result').innerHTML= recent;
};