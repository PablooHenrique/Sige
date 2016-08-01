function alterarLat(requestType, url, acao) {
  $.ajax({
        type: requestType,
        contentType: 'application/json',
        url: url,
        dataType: "json",
        data: formToJSON(),

    }).done(function(json){
        acao(json);
    } )
    ;
}


function prepararDadosParaAlteracao(){
  $('.alterarDados').css('display', 'none');
  document.getElementById("titulo").textContent = "Alterar";
  document.getElementById("btnSalvarSobrevivente").textContent = "Alterar";
}



function realizarRequisicao(requestType, url, acao(), valores) {
  console.log("vai entrar na requisicao");
  $.ajax({
        type: requestType,
        contentType: 'application/json',
        url: url,
        dataType: "json",
        data: valores,

    }).done(function(json){
        console.log("Vai entrar na acao");
        acao(json);
    } )
    ;
}
