function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px"; // 왼쪽으로 메뉴 열기
    document.getElementById("menuBtn").innerHTML = "&times;";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft = "0"; // 왼쪽으로 메뉴 닫기
    document.getElementById("menuBtn").innerHTML = "&#9776;";
}

function toggleNav() {
    if (document.getElementById("mySidenav").style.width === "250px") {
        closeNav();
    } else {
        openNav();
    }
}

function searchFunction() {
    var input = document.getElementById("searchInput").value;
    fetch(`/api/products/search?keyword=${input}`)
        .then(response => response.json())
        .then(data => {
            console.log(data); // 결과를 화면에 표시하도록 적절히 수정
            alert("검색 결과: " + JSON.stringify(data));
        })
        .catch(error => console.error('Error:', error));
}
