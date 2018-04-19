
function doPOST() {

		$.ajax({
			type : "POST",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			data : JSON.stringify({
				name : $('#nom').val(),
			}),
			 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/clients',
		      
		});

};




