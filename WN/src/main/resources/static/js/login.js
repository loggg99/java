document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault(); // 기본 폼 제출 방지

    const userId = document.getElementById("userid").value;
    const password = document.getElementById("password").value;

    // API 호출 예시
    fetch('/api/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            userId: userid,
            password: password
        })
    })
        .then(response => {
            if (response.ok) {
                alert("로그인 성공");
                window.location.href = "/"; // 메인 페이지로 이동
            } else {
                alert("로그인 실패: 아이디 또는 비밀번호를 확인하세요.");
            }
        })
        .catch(error => console.error('Error:', error));
});

// 버튼 클릭 시 회원가입 또는 메인 페이지로 이동
document.getElementById("registerBtn").addEventListener("click", function() {
    window.location.href = "/register"; // 회원가입 페이지로 이동
});

document.getElementById("mainBtn").addEventListener("click", function() {
    window.location.href = "/"; // 메인 페이지로 이동
});
