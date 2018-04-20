//------------LISTENER DE POST---------------

function doPost() {

	
		$.ajax({
			type : "POST",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			data : JSON.stringify({
				name : $('#nom').val(),
				familyName : $('#prenom').val(),
				email : $('#email').val(),
				address : $('#address').val()
			}),
			 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/clients',
		      
		});
	
	document.location.href="SelectAllClients";


};

//------------FIN DE LISTENER DE POST---------------//

//------------LISTENER DE DELETE---------------//

var element = document.querySelectorAll("#delete");
var i = element.length;
for(var j=0; j<i; j++){
	element[j].addEventListener("click", del,false);	
}


function del() {

	$.ajax({
	type : "DELETE",
	contentType : "application/json; charset=utf-8",
	dataType : "json",
	url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/clients/'
			+ $(this).attr('name'),

});
	window.location.reload();
	
}	
	//------------FIN DE LISTENER DE DELETE---------------	
	
	
	//------------LISTENER DE PUT---------------

	function doPut() {
			$.ajax({
				type : "PUT",
				contentType : "application/json; charset=utf-8",
				dataType : "json",
				data : JSON.stringify({
					id : $('#id').val(),
					name : $('#nom').val(),
					familyName : $('#prenom').val(),
					email : $('#email').val(),
					address : $('#address').val(),
				}),
				 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/clients',
			      
			});
			alert("Modification effecutée");

			

	};
	//------------FIN DE LISTENER DE POST---------------

	//------------POST DE COMPTE COURANT---------------
	function doPostCompteCourant() {

		$.ajax({
			type : "POST",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			data : JSON.stringify({
				id : $('#id').val()
			}),
			 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/createAccountCurrent/'
				+ $('#id').val(),
		});
		alert("Compte créé");
		document.location.href="SelectAllClients";

	};
	
	//------------POST DE COMPTE EPARGNE---------------
	function doPostCompteEpargne() {

		$.ajax({
			type : "POST",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			data : JSON.stringify({
				id : $('#id').val()
			}),
			 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/createAccountSaving/'
				+ $('#id').val(),
		});
		alert("Compte créé");
		document.location.href="SelectAllClients";

};

//------------DELETE DE COMPTE EPARGNE---------------
function doDeleteCompteEpargne() {

	$.ajax({
		type : "DELETE",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		data : JSON.stringify({
			id : $('#id').val()
		}),
		 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/deleteAccountSaving/'
			+ $('#id').val(),
	});
	alert("Compte surrpimé");
	document.location.href="SelectAllClients";
};

//------------DELETE DE COMPTE EPARGNE---------------
function doDeleteCompteCourant() {

	$.ajax({
		type : "DELETE",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		data : JSON.stringify({
			id : $('#id').val()
		}),
		 url : 'http://localhost:8080/JBB_SJ_ProxiBanqueV3/services/JBB_SJ_ProxiBanque/deleteAccountCurrent/'
			+ $('#id').val(),
	});
	alert("Compte surrpimé");
	document.location.href="SelectAllClients";

};

	
