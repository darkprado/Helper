package my.home.helper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

@RequiredArgsConstructor
@EnableBinding(StringResponseBinding.class)
public class StringResponseService {

    private final StringResponseBinding stringResponseBinding;

    public void send(String msg) {
        Message<String> message = MessageBuilder.withPayload(msg).build();
        stringResponseBinding.getStringResponseChannel().send(message);
    }

}
