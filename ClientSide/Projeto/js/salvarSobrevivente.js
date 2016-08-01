var botaoSalvarSobrevivente = $('#btnSalvarSobrevivente');
//btnSalvarSobrevivente.addEventListener("click", enviarDados);
btnSalvarSobrevivente.addEventListener("click", salvarDados);

function enviarDados() {
  $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: "http://localhost:8080/sobrevivente/salvar",
        dataType: "json",
        data: formToJSON(),

    }).done(function(json){
        obtenhaJSON();
    });
    limparCamposCadastro();
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

	console.log(sobrevivente);
  console.log(sobrevivente.inventario);
    return JSON.stringify(sobrevivente);
}

function salvarDados(tipoAlteracao){
    if (document.getElementById("btnSalvarSobrevivente").textContent == "Salvar") {
      enviarDados();
      limparCamposCadastro();
    }else if (document.getElementById("btnSalvarSobrevivente").textContent == "Alterar"){
      alterarLatitudeLongitude();
      limparCamposCadastro();
    }
}

function limparCamposCadastro(){
  $('#nomeSobrevivente').val("");
  $('#latitudeSobrevivente').val("");
  $('#longitudeSobrevivente').val("");
  $('#sexoSobrevivente').val("");
  $('#idadeSobrevivente').val("");
  $('#aguaSobrevivente').val("");
  $('#comidaSobrevivente').val("");
  $('#medicamentoSobrevivente').val("");
  $('#municaoSobrevivente').val("");
}
