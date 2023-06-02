function navigateToScreen(url) {
    window.location.href = "second_page.html?image_url=" + encodeURIComponent(url);
}

function setState(url,variable){
    $("img[data-variable='" + variable +"']").attr('src',url);
}