function doClick(e) {
    alert($.label.text);
}

function clickImage(e) {
	Titanium.UI.createAlertDialog({title:'Image View', message:'You clicked me!'}).show();
}

$.index.open();
