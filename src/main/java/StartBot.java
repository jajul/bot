import me.shib.java.lib.telegram.bot.service.TelegramBot;
import me.shib.java.lib.telegram.bot.types.ChatId;
import me.shib.java.lib.telegram.bot.types.Message;
import me.shib.java.lib.telegram.bot.types.Update;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by Julia on 21.05.2016.
 */
public class StartBot {
    public static void main(String[] args) throws IOException {
        TelegramBot bot = TelegramBot.getInstance("235049961:AAE0at0Ytsu5qajD_KycVs-hTfxP4ql0jcE");
        Update[] updates;
        while ((updates = bot.getUpdates()) != null) {
            for (Update update : updates) {
                Message message = update.getMessage();
                if (message != null) {
                    bot.sendMessage(new ChatId(message.getChat().getId()), "Hehey! How are you? :)");
                }
            }
        }
    }
}
