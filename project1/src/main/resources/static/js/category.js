$(document).ready(function() {
    // 드롭다운 콘텐츠 초기화
    $('.dropdown-content').hide();

    // 카테고리 버튼 클릭 시 하부 항목 토글
    $('.dropdown-btn').on('click', function () {
        $('.dropdown-content').not($(this).next()).slideUp();
        $('.dropdown-btn').not(this).removeClass('active');
        $(this).next('.dropdown-content').slideToggle();
        $(this).toggleClass('active');
    });

    // 사이드바 열기/닫기
    $('#menuBtn').on('click', function () {
        $('#mySidenav').css('width', '250px');
    });
    $('#closeBtn').on('click', function () {
        $('#mySidenav').css('width', '0');
    });

    // 검색 버튼 클릭 이벤트 처리
    $('.sidenav button').on('click', function() {
        const keyword = $('.sidenav input[type="text"]').val();
        if (keyword) {
            searchProducts(keyword);
        }
    });

    // 검색 API 호출 함수
    function searchProducts(keyword) {
        $.ajax({
            url: '/api/products/search',
            method: 'GET',
            data: { keyword: keyword },
            success: function(response) {
                renderSearchResults(response);
            },
            error: function() {
                console.error('Error fetching search results');
            }
        });
    }

    // 검색 결과 렌더링 함수
    function renderSearchResults(products) {
        const container = $('#search-result-container');
        container.empty(); // 기존 결과 지우기

        if (products.length > 0) {
            products.forEach(product => {
                const productHtml = `
                    <div class="product-item">
                        <img src="${product.contentImg}" alt="${product.title}">
                        <h3>${product.title}</h3>
                        <p>${product.price}원</p>
                    </div>
                `;
                container.append(productHtml);
            });
        } else {
            container.append('<p>검색 결과가 없습니다.</p>');
        }
    }


});
