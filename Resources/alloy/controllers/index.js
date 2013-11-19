function Controller() {
    function doClick() {
        alert($.label.text);
    }
    function clickImage() {
        Titanium.UI.createAlertDialog({
            title: "Image View",
            message: "You clicked me!"
        }).show();
    }
    require("alloy/controllers/BaseController").apply(this, Array.prototype.slice.call(arguments));
    this.__controllerPath = "index";
    arguments[0] ? arguments[0]["__parentSymbol"] : null;
    arguments[0] ? arguments[0]["$model"] : null;
    arguments[0] ? arguments[0]["__itemTemplate"] : null;
    var $ = this;
    var exports = {};
    var __defers = {};
    $.__views.index = Ti.UI.createWindow({
        backgroundColor: "white",
        id: "index"
    });
    $.__views.index && $.addTopLevelView($.__views.index);
    $.__views.imageView = Ti.UI.createImageView({
        image: "/images/Jellyfish.jpg",
        width: 240,
        height: 240,
        top: 100,
        id: "imageView"
    });
    $.__views.index.add($.__views.imageView);
    clickImage ? $.__views.imageView.addEventListener("click", clickImage) : __defers["$.__views.imageView!click!clickImage"] = true;
    $.__views.label = Ti.UI.createLabel({
        width: Ti.UI.SIZE,
        height: Ti.UI.SIZE,
        color: "#000",
        text: "Tron, Tron",
        id: "label"
    });
    $.__views.index.add($.__views.label);
    doClick ? $.__views.label.addEventListener("click", doClick) : __defers["$.__views.label!click!doClick"] = true;
    exports.destroy = function() {};
    _.extend($, $.__views);
    $.index.open();
    __defers["$.__views.imageView!click!clickImage"] && $.__views.imageView.addEventListener("click", clickImage);
    __defers["$.__views.label!click!doClick"] && $.__views.label.addEventListener("click", doClick);
    _.extend($, exports);
}

var Alloy = require("alloy"), Backbone = Alloy.Backbone, _ = Alloy._;

module.exports = Controller;