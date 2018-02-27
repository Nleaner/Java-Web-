function deleteEmpById(id) {
	var r = confirm("确定要删除当前记录吗?");
	if (r) {
		window.location.href="/WebPrj/permission/emp/delete?id=" + id;
	}
}