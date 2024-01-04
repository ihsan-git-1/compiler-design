
function setState(url,variable,textVar,textVal){
    $("img[data-variable='" + variable +"']").attr('src',url);
}

$("img").on("click", function() {
    var clickedImg = $(this);

    var jsonData = clickedImg.data('json');
    jsonData = JSON.stringify(jsonData);
    var jsonObject = JSON.parse(jsonData);
    var keys = Object.keys(jsonObject);


    keys.forEach(function(key) {
        var value = jsonObject[key];
        var x = "[data-"+key+"]";
        $(x).text(value);
    });


});