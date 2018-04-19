function doGet() {
	alert('coucou')
	$.ajax({
						
						type : "GET",
						contentType : "application/json; charset=utf-8",
						dataType : "json",
						url : "http://localhost:8080/restws/services/patientservice/Patients/"
								+ $('#patientID').val()
					}).then(function(data) {
				$('#patientID').val(data.id);
				$('#patientName').val(data.name);
			});
}



function doPost() {
	$.ajax({
		type : "POST",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		data : JSON.stringify({
			name : $('#nom').val(),
		}),
		 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/clients',
	      
	});

}

function doDelete() {
	$
			.ajax(
					{
						type : "DELETE",
						contentType : "application/json; charset=utf-8",
						dataType : "json",
						url : "http://localhost:8080/restws/services/patientservice/Patients/"
								+ $('#patientID').val(),
						success : function(result) {
							if (result)
								alert("The patient has been deleted !");
						}
					}).then(function(data) {
				alert('Patient Deleted');
			});
}

function doPut() {
	$.ajax({
		type : "PUT",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		data : JSON.stringify({
			id : $('#patientID').val(),
			name : $('#patientName').val()
		}),
		url : "http://localhost:8080/restws/services/patientservice/Patients/"
	}).then(function(data) {

		$('#patientID').val(data.id);
		$('#patientName').val(data.name);
	});
}