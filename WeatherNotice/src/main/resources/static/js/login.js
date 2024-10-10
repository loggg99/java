document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const data = {
        userId: document.getElementById('username').value,  // ★ 수정된 부분 (아이디 필드명 일치)
        password: document.getElementById('password').value
    };

    fetch('/api/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
        .then(response => {
            if (response.ok) {
                // 로그인 성공 시 메인 페이지로 이동
                window.location.href = '/';  // ★ 수정된 부분
            } else {
                alert('로그인에 실패했습니다.');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('오류가 발생했습니다.');
        });
});
