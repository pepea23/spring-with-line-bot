package authenticate.example.utils;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

/**
 * utils
 */
@LineMessageHandler
public class Utils {
    @EventMapping
    public Message handleTextMessage(MessageEvent<TextMessageContent> e) {
        System.out.println("event: " + e);
        // TextMessageContent message = ;
        return new TextMessage("line://app/1653659118-dVN9QJbJ");
    }
}