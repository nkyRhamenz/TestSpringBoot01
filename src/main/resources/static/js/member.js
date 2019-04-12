function executeSubmit(){
	var name = document.getElementById('seiName').value;
	if (name == ''){
		alert('氏名を入力してください');
		return;
	}
	console.log(name);
	document.forms[0].submit();
	return;
}

$(function(){
	$('#num-input').on('input',function(){
		console.log('test1');
		var halfVal = $(this).val().replace(/[!-~]/g,
				function(tmpStr){
					return String.fromCharCode(tmpStr.charCodeAt(0) - 0xFEE0);
				}
		);
		$(this).val(halfVal.replace(/[^0-9]/g,''));
	});
});