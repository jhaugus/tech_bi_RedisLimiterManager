package com.yupi.springbootinit.api;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;

import java.util.HashMap;

public class OpenAiApi {


    // openai 调用方式
    public static void main(String[] args) {
        String url = "https://api.openai.com/v1/chat/completions";

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("message", "需要输入的消息");
        String json = JSONUtil.toJsonStr(hashMap);
        String result = HttpRequest.post(url)
                .header("Authorization", "替换为自己的key")
                .body(json)
                .execute()
                .body();
        System.out.println(result);
    }
}
