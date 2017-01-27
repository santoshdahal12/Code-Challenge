<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.1.1.js"></script>
<title>Ten Sub String</title>
<script type="text/javascript">
	function ajaxCall() {
		var contextRoot = "/" + window.location.pathname.split('/')[1];
		var number = $('#getTenSubString').val();
		$.ajax({
			url :  'getnumber',
			type : 'GET',
			dataType : "json",
			data:"number="+number,
			success : function(list) {
				displayResult(list);

			},
			error : function(jqXHR, textStatus, exception) {
				alert("Something went wrong!!");
				
				
			}
		});

	}

	function displayResult(list) {
		console.log(list);
		$("#showDiv").html("");
		 for (i in list) {
			$("#showDiv").append('<H4 align="center">' + list[i] + '</H4>');
} 
	}
</script>
</head>

<body>
	<div>
		<p>
			Input <input required="required" type="text" id="getTenSubString" name="number" />
			<button onclick="ajaxCall(); return false;">Submit</button>
		</p>
		<div id="showDiv">
		</div>
	</div>
	
</body>