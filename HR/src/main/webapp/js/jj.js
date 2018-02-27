function js_method(obj) {
	if(confirm('确定删除?')==true){
		var empid=obj.parentElement.parentElement.children[0].innerHTML;
		window.location="/HR/emp/del?id="+empid;
	}
		
}