$(document).ready(() => {
    checkSession();
    loadBoardDetail(); // 기존 게시글 로드
    handleEditSubmit(); // 수정 사항 제출
});

let checkSession = () => {
    let hUserId = $('#hiddenUserId').val();
    if (hUserId == null || hUserId === '')
        window.location.href = "/member/login";
}

let loadBoardDetail = () => {
    let hId = $('#hiddenId').val();

    $.ajax({
        type: 'GET',
        url: '/api/board/' + hId,
        success: (response) => {
            $('#title').val(response.title);   // 제목을 입력 필드에 로드
            $('#content').val(response.content); // 내용을 입력 필드에 로드

            if (response.filePath) {
                let fileName = response.filePath.substring(response.filePath.lastIndexOf('\\') + 1);
                $('#fileList').append(`<li>${fileName}</li>`);
            }
        },
        error: (error) => {
            alert('게시글을 불러오는데 오류가 발생했습니다.');
            console.error('Error:', error);
        }
    });
}

let handleEditSubmit = () => {
    $('#submitBtn').on('click', (event) => {
        event.preventDefault();

        let formData = new FormData($('#editForm')[0]); // Form 데이터 수집

        $.ajax({
            type: 'PUT',
            url: '/api/board', // 서버의 업데이트 엔드포인트
            data: formData,
            processData: false,
            contentType: false,
            success: (response) => {
                alert('게시글이 성공적으로 수정되었습니다!');
                window.location.href = '/'; // 성공 시 목록 페이지로 이동
            },
            error: (error) => {
                alert('게시글 수정 중 오류가 발생했습니다.');
                console.error('Error:', error);
            }
        });
    });
}
