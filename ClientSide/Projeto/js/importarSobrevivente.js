// Quando o DOM Estiver carregado...
/*
$(document).ready(function () {
  obtenhaJSON();
})
*/

//Buscan o json
function obtenhaJSON() {

  $.ajax({
    dataType: "json",
    url: "http://localhost:8080/sobrevivente/buscar",
    data: {}
  })
  .done(function (json) {
      renderizaTabelaComBaseNoJSON(json);
	  renderizarDropDownComBaseNoJSON(json);
  })
}

function renderizarDropDownComBaseNoJSON(json){
  var $dropDown =  $(".dropDownMenu");
  var strOption = "";

  for(var i = 0; i < json.length; i++) {
    strOption += "" +
          "<option>" + json[i].id + " - " + json[i].nome + " </option>" ;
  }

  $dropDown.html(strOption);
}

/*
function renderizaTabelaComBaseNoJSON(json) {
  var $elTableTBody =  $("#placeHolder table tbody");
  var strTBody = "";

  for(var i = 0; i < json.length; i++) {
    strTBody += "" +
        "<tr>" +
          "<td>" + json[i].id + "</td>" +
          "<td>" + json[i].nome + "</td>" +
          "<td>" + "" + " </td>" +
          "<td>" + json[i].latitude + "</td>" +
          "<td>" + json[i].longitude + "</td>" +
          "<td>" + json[i].sexo + "</td>" +
          "<td><button class='btn btn-primary pablo' onclick='indicaInfeccao(this)'>Indicar Infecção</button></td>"
        "<tr>";
  }
  $elTableTBody.html(strTBody);
}

*/
