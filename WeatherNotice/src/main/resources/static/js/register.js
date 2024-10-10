document.getElementById('registerForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const data = {
        userId: document.getElementById('user_id').value,
        password: document.getElementById('password').value,
        userName: document.getElementById('user_name').value
    };

    fetch('/api/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
        .then(response => {
            if (response.ok) {
                // 회원가입 성공 시 로그인 페이지로 이동
                window.location.href = '/login';  // ★ 수정된 부분
            } else {
                alert('회원가입에 실패했습니다.');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('오류가 발생했습니다.');
        });
});
