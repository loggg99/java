document.addEventListener("DOMContentLoaded", function() {
    const editBtn = document.getElementById("editBtn");
    const hiddenId = document.getElementById("hiddenId").value;

    // 수정 버튼 클릭 시 처리
    editBtn.addEventListener("click", openEditForm);

    function openEditForm() {
        window.location.href = "/edit?id=" + hiddenId; // 수정 페이지로 이동
    }

    const form = document.getElementById("editForm");
    const cancelButton = document.getElementById("cancel-btn");

    // "취소" 버튼 클릭 시 처리
    cancelButton.addEventListener("click", function() {
        if (confirm("수정을 취소하시겠습니까? 변경사항이 저장되지 않습니다.")) {
            window.history.back(); // 이전 페이지로 돌아감
        }
    });

    // 폼 제출 이벤트 처리
    form.addEventListener("submit", function(event) {
        event.preventDefault(); // 기본 제출 방지

        const formData = new FormData(form);

        fetch("/api/board/update", {
            method: "POST",
            body: formData
        })
            .then(response => {
                if (response.ok) {
                    alert("게시글이 성공적으로 수정되었습니다.");
                    window.location.href = "/detail?id=" + formData.get("id"); // 수정 후 상세 페이지로 이동
                } else {
                    alert("게시글 수정 중 오류가 발생했습니다.");
                }
            })
            .catch(error => {
                console.error("Error:", error);
                alert("오류가 발생했습니다. 다시 시도해 주세요.");
            });
    });
});
