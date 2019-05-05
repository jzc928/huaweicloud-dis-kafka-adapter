package com.huaweicloud.streamkafka.disadapter;

import com.huaweicloud.dis.DISConfig;

public class DisAdapterUtils
{
    
    public static DISConfig buildDisConfig(){
        return new DISConfig()
        .setEndpoint("https://x.x.x.x:xx")
        .setAK("xxx")
        .setSK("xxxx")
        .setProjectId("xxxxx")
        .setRegion("southchina")
        .set("key.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer")
        .set("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer")
        .set("key.deserializer", "org.apache.kafka.common.serialization.ByteArrayDeserializer")
        .set("value.deserializer", "org.apache.kafka.common.serialization.ByteArrayDeserializer")
        ;
    }
    
}
