var Alloy = require("alloy"), _ = Alloy._, Backbone = Alloy.Backbone;

var tabGroup = Titanium.UI.createTabGroup();

var win1 = Titanium.UI.createWindow({
    title: "Tab 1",
    backgroundColor: "#fff"
});

var tab1 = Titanium.UI.createTab({
    icon: "tab1icon.png",
    title: "Tab 1",
    window: win1
});

var win2 = Titanium.UI.createWindow({
    title: "Tab 2",
    backgroundColor: "#fff"
});

var tab2 = Titanium.UI.createTab({
    icon: "tab2icon.png",
    title: "Tab 2",
    window: win2
});

tabGroup.addTab(tab1);

tabGroup.addTab(tab2);

tabGroup.open();

Alloy.createController("index");