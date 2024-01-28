package com.java2e.martin.common.message.skywalking;

import lombok.Data;

/**
 * @author 狮少
 * @version 1.0
 * @date 2020/9/27
 * @describtion Alarm，SkyWalking 发送的消息体内容
 * @since 1.0
 */
@Data
public class Alarm {
    private Integer scopeId;
    private String scope;
    private String name;
    private String id0;
    private String id1;
    private String ruleName;
    private String alarmMessage;
    private Long startTime;
}
