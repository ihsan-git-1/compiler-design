function navigateToScreen(page,src,desc) {
    window.location.href = page+".html?image_url=" + encodeURIComponent(src) + "&image_description="+encodeURIComponent(desc);
}

