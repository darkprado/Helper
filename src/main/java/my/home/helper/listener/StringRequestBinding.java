package my.home.helper.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StringRequestBinding {

    String STRING_REQUEST = "string-request";

    @Input(STRING_REQUEST)
    SubscribableChannel getStringRequestChannel();

}
