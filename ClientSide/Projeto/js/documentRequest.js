function realizarRequisicao(requestType, url, acao, valores) {
  $.ajax({
        type: requestType,
        contentType: 'application/json',
        url: url,
        dataType: "json",
        data: valores,

    }).done(function(json){
        acao(json);
    });
}
