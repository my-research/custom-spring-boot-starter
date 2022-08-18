package com.wonit.handler;

public interface CommandHandler <C extends Command> {
    void doCommand(C aCommand);
}
