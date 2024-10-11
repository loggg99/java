document.getElementById("registerForm").addEventListener("submit", function(event) {
    event.preventDefault(); // 기본 폼 제출 방지

    const userid = document.getElementById("userid").value;
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    // API 호출 예시
    fetch('/api/register', {
        method: 'POST',  // 반드시 POST 방식으로 전송
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            userid: userid,
            username: username,
            password: password
        })
    })
        .then(response => {
            if (response.status === 201) {
                alert("회원가입이 완료되었습니다.");
                window.location.href = "/login"; // 로그인 페이지로 이동
            } else {
                alert("회원가입에 실패했습니다.");
            }
        })
        .catch(error => console.error('Error:', error));
});
