require.config({
    paths : {
        jquery : 'jquery-1.9.0.min'
    }
});

require(['jquery', 'math/arithmetic', 'jQueryPlugins/highlight'], function($, calculator /* no binding, plugin loads into jQuery*/) {
        if(calculator.sum(4, 5) == 9 && calculator.difference(5, 3) == 2) {
            $("body").append("<p>requireJS works</p>")
        }
        $("p").highlight()
    }
);