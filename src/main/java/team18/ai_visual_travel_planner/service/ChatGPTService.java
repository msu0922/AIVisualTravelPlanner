package team18.ai_visual_travel_planner.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class ChatGPTService {

    // ChatGPT와의 통신을 통해 메시지 결과를 받아옴
    public String getChatGPTResponse(String message) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("python3", "python/chatgpt.py", message);
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            result.append(line);
        }

        // 응답을 문자열 형태로 반환
        return result.toString();
    }
}
