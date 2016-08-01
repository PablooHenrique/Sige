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
          "<td><button class='btn btn-primary' onclick='indicaInfeccao(this)'>Indicar Infecção</button></td>" +
          "<td>" + json[i].numeroIndicacoes + "</td>" +
        "<tr>";
  }
  $elTableTBody.html(strTBody);
}


function formToJSON() {
  sobrevivente.nome = $('#nomeSobrevivente').val();
  sobrevivente.latitude = $('#latitudeSobrevivente').val();
  sobrevivente.longitude = $('#longitudeSobrevivente').val();
  sobrevivente.sexo = $('#sexoSobrevivente').val();
  sobrevivente.idade = $('#idadeSobrevivente').val();
  sobrevivente.inventario.agua = $('#aguaSobrevivente').val();
  sobrevivente.inventario.comida = $('#comidaSobrevivente').val();
  sobrevivente.inventario.municao = $('#medicamentoSobrevivente').val();
  sobrevivente.inventario.medicamento = $('#municaoSobrevivente').val();

  return JSON.stringify(sobrevivente);
}

function limparCamposCadastro(){
  $('#nomeSobrevivente').textContent = "";
  $('#latitudeSobrevivente').textContent= "";
  $('#longitudeSobrevivente').textContent= "";
  $('#sexoSobrevivente').textContent= "";
  $('#idadeSobrevivente').textContent = "";
  $('#aguaSobrevivente').textContent = "";
  $('#comidaSobrevivente').textContent = "";
  $('#medicamentoSobrevivente').textContent = "";
  $('#municaoSobrevivente').textContent = "";
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

function pegarIdItemSelecionado(){
  var id = $('#sobreviventeUm').val().split(" ")[0];
  console.log(id);
  return id;
}

function carregarInventario(json){
    var dropDown = $('#inventarioSobreviventeUm tbody');
    var strOption = "";

    strOption += "" +
    "<tr>" +
      "<td>Agua</td>" +
      "<td>" + json.inventario.agua + " </td>" +
    "</tr>" +

    "<tr>" +
      "<td>Comida</td>" +
      "<td>" + json.inventario.comida + " </td>" +
    "</tr>" +

    "<tr>" +
      "<td>Medicamento</td>" +
      "<td>" + json.inventario.medicamento + " </td>" +
    "</tr>" +

    "<tr>"+
      "<td>Munição</td>" +
      "<td>" + json.inventario.municao + " </td>" +
    "</tr>";
    dropDown.html(strOption);
}










//var id = document.getElementById("usuario")[0].textContent.split(" ")[0];
