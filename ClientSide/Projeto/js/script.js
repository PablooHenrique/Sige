$(document).ready(function() {
		importarSobrevivente();
});

// var btn = $('#btn-trocaritens');
// btn.addEventListener("click", carregarInventario);

function prepararDadosParaAlteracao(){
  $('.alterarDados').css('display', 'none');
  document.getElementById("titulo").textContent = "Alterar";
  document.getElementById("btnSalvarSobrevivente").textContent = "Alterar";
}


// VERIFICAR O POR QUE QUANDO COLOCO PRA CHAMAR AQUI NAO TA FUNFANDO
//var botaoSalvarSobrevivente = $('#btnSalvarSobrevivente');
//btnSalvarSobrevivente.addEventListener("click", salvarSobrevivente);



$(document).ready(function() {

	$('#btn-inserir').click(function() {
		document.getElementById("titulo").textContent = "Cadastrar";
    $('.alterarDados').css('display', 'block');
		document.getElementById("btnSalvarSobrevivente").textContent = "Salvar";
		$('#box-sobrevivente').css('display', 'none');
		$('#box-cadastrar').css('display', 'block');
	});

	$('#btn-trocaritens').click(function() {
		prepararDadosParaAlteracao();
		$('#box-cadastrar').css('display', 'none');
		$('#box-sobrevivente').css('display', 'block');
	});

	$('#btn-alterarLocal').click(function() {
		$('#box-sobrevivente').css('display', 'none');
		$('#box-cadastrar').css('display', 'block');
		prepararDadosParaAlteracao();
	});

});
