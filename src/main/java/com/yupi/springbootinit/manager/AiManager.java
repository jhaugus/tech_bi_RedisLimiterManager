package com.yupi.springbootinit.manager;


import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.apache.tomcat.util.buf.ByteChunk;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AiManager {
    @Resource
    private YuCongMingClient yuCongMingClient;


    /**
     * AI 对话
     * @param massage
     * @return
     */
    public String doChat(long biModelId, String massage){
        DevChatRequest devChatRequest = new DevChatRequest();
//        devChatRequest.setModelId(1651468516836098050L);
        devChatRequest.setModelId(biModelId);
        devChatRequest.setMessage(massage);

        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        System.out.println(response.getData());
        if(response == null){
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "AI 响应错误");
        }
        return response.getData().getContent();
    }


}
