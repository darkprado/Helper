package my.home.helper.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface StringResponseBinding {

    String STRING_RESPONSE = "string-response";

    @Output(STRING_RESPONSE)
    MessageChannel getStringResponseChannel();

}
