document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const data = {
        userid: document.getElementById('username').value,
        password: document.getElementById('password').value
    };

    fetch('/api/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
        .then(response => response.text())
        .then(result => {
            if (result === 'success') {
                // 로그인 성공 시 메인 페이지로 이동
                window.location.href = '/';
            } else {
                alert('로그인에 실패했습니다. 아이디와 비밀번호를 확인하세요.');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('오류가 발생했습니다.');
        });
});
