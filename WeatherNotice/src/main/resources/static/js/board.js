document.getElementById("registerBtn").addEventListener("click", function() {
    window.location.href = "/register"; // 회원가입 페이지로 이동
});

document.getElementById("loginBtn").addEventListener("click", function() {
    window.location.href = "/login"; // 로그인 페이지로 이동
});

document.addEventListener("DOMContentLoaded", function () {
    // 서버에서 사용자 이름을 가져오는 함수
    fetch('/api/getUsername')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();  // 서버에서 JSON 응답 받기
        })
        .then(data => {
            if (data.username) {
                // 로그인한 사용자의 이름을 화면에 표시
                document.getElementById('username').innerText = data.username + "님";
                document.querySelector('.greeting').innerText = data.username + "님 환영합니다!"; // 환영 메시지 추가
            }
        })
        .catch(error => {
            console.error('사용자 이름을 가져오는 중 오류 발생:', error);
        });
});



// 예시: 날씨 정보를 API에서 받아오는 부분 (여기서는 더미 데이터 사용)
// 실제 날씨 API와 연결하여 날씨 정보를 가져오는 코드를 작성해야 합니다.
function fetchWeather() {
    const weatherInfo = document.getElementById("weatherInfo");
    // 더미 데이터 예시
    const weatherData = [
        { location: "서울", temperature: "20°C", condition: "맑음" },
        { location: "부산", temperature: "22°C", condition: "흐림" },
        { location: "대구", temperature: "18°C", condition: "비" }
    ];

    weatherInfo.innerHTML = ""; // 기존 데이터 초기화

    weatherData.forEach(weather => {
        const weatherItem = document.createElement("div");
        weatherItem.innerHTML = `<strong>${weather.location}</strong>: ${weather.temperature}, ${weather.condition}`;
        weatherInfo.appendChild(weatherItem);
    });
}

// 페이지 로드 시 날씨 정보 불러오기
window.onload = fetchWeather;