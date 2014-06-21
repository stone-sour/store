<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Sale</title>

<style>
	.divScroll{
		overflow:scroll;
        height:500px;
        width:700px;
        background-color:gray;
        
        
        }
  	.divScroll input, p{
  		margin:12px 20px 8px 20px;
  	}    
  
    #items{
    	float:left;
    } 
    #mainBtns{
    	float:left;
    }
    #bottom{
    	
    	clear:both;
    	align-text:right;
    }
    
</style>

</head>
<body>
<div id="top">

	<div id="topButtons">
		<input type="button" value="Credit" name="Credit" />
		<input type="button" value="Need Assist" name="Need Assist" />
		<input type="button" value="Call For Help" name="Call For Help" />
	</div>
	
	<div id="back">
		<input type="button" id="backBtn" name="backBtn" value="<- Back" />
	</div>
	
	<div id="upcInput">
		<input type="text" name="upc" value="00000000000" id="upc" />
		<input type="button" name="upcEnter" id="upcEnter" value=">" />
	</div>

</div>

<div class="main">

<div id="items" class="divScroll">
	
	<p>40095343534534 - Kids Style Num - Bottoms --------------------- $29.99</p>
	<p>-------------------------------------------------------Sale $14.99</p>
	<input type="button" name="recieptBtn" id="recieptBtn" value="Reciept" />
	<input type="button" name="modifyItemBtn" id="modifyItemBtn" value="Modify" />
	<hr />
	
	<p>40095343534534 - Kids Style Num - Bottoms --------------------- $29.99</p>
	<p>-------------------------------------------------------Sale $14.99</p>
	<input type="button" name="recieptBtn" id="recieptBtn" value="Reciept" />
	<input type="button" name="modifyItemBtn" id="modifyItemBtn" value="Modify" />
	<hr />
	
	<p>40095343534534 - Kids Style Num - Bottoms --------------------- $29.99</p>
	<p>-------------------------------------------------------Sale $14.99</p>
	<input type="button" name="recieptBtn" id="recieptBtn" value="Reciept" />
	<input type="button" name="modifyItemBtn" id="modifyItemBtn" value="Modify" />
	<hr />
	
</div>

<div id="mainBtns">
	<input type="button" name="voidBtn" id="voidBtn" value="Void" /><br />
	<input type="button" name="deleteBtn" id="deleteBtn" value="Delete" /><br />
	<input type="button" name="modifyBtn" id="modifyBtn" value="Modify" /><br />
	<input type="button" name="suspendBtn" id="suspendBtn" value="Suspend" /><br />
	<input type="button" name="creditBtn" id="creditBtn" value="Credit" /><br />
</div>
</div>

<div id="bottom">
	<input type="button" name="enterBtn" id="enterBtn" value="Enter" /><br />
</div>

</body>
</html>