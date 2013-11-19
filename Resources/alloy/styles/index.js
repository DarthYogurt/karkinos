module.exports = [ {
    isApi: true,
    priority: 1000.0003,
    key: "Label",
    style: {
        width: Ti.UI.SIZE,
        height: Ti.UI.SIZE,
        color: "#000"
    }
}, {
    isClass: true,
    priority: 10000.0002,
    key: "container",
    style: {
        backgroundColor: "white"
    }
}, {
    isId: true,
    priority: 100000.0004,
    key: "imageView",
    style: {
        image: "/images/Jellyfish.jpg",
        width: 240,
        height: 240,
        top: 100
    }
} ];