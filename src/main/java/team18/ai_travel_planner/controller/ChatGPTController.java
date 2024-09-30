package team18.ai_travel_planner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team18.ai_travel_planner.service.ChatGPTService;

@RestController
public class ChatGPTController {

    private final ChatGPTService chatGPTService;

    @Autowired
    public ChatGPTController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    // /chat 엔드포인트에서 ChatGPT의 응답을 문자열로 반환
    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        try {
            // ChatGPTService에서 처리된 응답을 문자열로 받아옴
            return chatGPTService.getChatGPTResponse(message);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred: " + e.getMessage();
        }
    }
}
