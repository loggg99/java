function toggleMenu() {
    var menu = document.getElementById("side-menu");
    menu.classList.toggle("open"); // 사이드바 열고 닫기
}

function closeMenu(event) {
    event.stopPropagation(); // 이벤트 전파 차단
    var menu = document.getElementById("side-menu");
    menu.classList.remove("open"); // 사이드바 닫기
}



