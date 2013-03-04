require(["helper/lib"],function(l) {
    var s = l.sum(4, 5);
    if(s == 9) {
        $("body").append("<p>requireJS works</p>")
    }
});