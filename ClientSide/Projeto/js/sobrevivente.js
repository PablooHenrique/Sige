var inventario = {
  agua :0,
  comida :0,
  medicamento:0,
  municao:0
}

var sobrevivente = {
    nome : "",
    latitude: "",
    longitude: "",
    sexo: "",
    idade: 0,
    inventario
}

function alterarLatitudeLongitude(){
  var id = document.getElementById("usuario")[0].textContent.split(" ")[0];
  var latitude = $('#latitudeSobrevivente').val();
  var longitude = $('#longitudeSobrevivente').val();
  var url = "http://localhost:8080/sobrevivente/alterarLatitudeLongitude/"+id+"/"+latitude+"/"+longitude;
  realizarRequisicao("PUT", url, limparCamposCadastro, "");
}

function indicaInfeccao(e){
    var tr = e.closest("tr");
    var tds = tr.getElementsByTagName('td');
    var id = tds[0].textContent;
    var url = "http://localhost:8080/sobrevivente/marcarComoInfectado/"+id;
    realizarRequisicao("PUT", url);
    importarSobrevivente();
}

function importarSobrevivente(){
  var url = "http://localhost:8080/sobrevivente/buscar";
  //realizarRequisicao("GET", url, renderizaTabelaComBaseNoJSON, "");
  realizarRequisicao("GET", url, gerarDados, "");

}

function gerarDados(json){
  renderizaTabelaComBaseNoJSON(json);
  renderizarDropDownComBaseNoJSON(json);
}

function salvarSobrevivente(){
  var url = "http://localhost:8080/sobrevivente/salvar";
  realizarRequisicao("POST", url, limparCamposCadastro, formToJSON);
}

function buscarInventarioSobrevivente(e){
  var id = pegarIdItemSelecionado();
  var url = "http://localhost:8080/sobrevivente/buscar/"+id;
  realizarRequisicao("GET", url, carregarInventario, "");
}
