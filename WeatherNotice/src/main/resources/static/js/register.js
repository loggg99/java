document.getElementById('registerForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const data = {
        userid: document.getElementById('userid').value,
        password: document.getElementById('password').value,
        username: document.getElementById('username').value
    };

    fetch('/api/register', {
        method: 'POST',  // 반드시 POST 방식으로 전송
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)  // 수정된 부분: 'data' 객체를 바로 사용
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
