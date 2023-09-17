package space.yurisi.salute.command;

import net.kyori.adventure.text.Component;

import java.util.Random;

public class SaluteBaseCommand {

    private Component[] messages;

    public void setMessages(Component[] messages){
        this.messages = messages;
    }

    private int getRandom(){
        Random rand = new Random();
        return rand.nextInt(messages.length);
    }

    public Component getMessage(){
        return this.messages[getRandom()];
    }

}
