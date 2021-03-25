package my.home.helper.listener;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

@RequiredArgsConstructor
@EnableBinding(StringRequestBinding.class)
public class StringListener {

    @StreamListener(StringRequestBinding.STRING_REQUEST)
    public void receive(@Payload String msg) {
        System.out.println(msg);
    }
}
