package com.wonit.handler;

public class SimpleCommandHandler implements CommandHandler<SimpleCommand> {

    @Override
    public void doCommand(SimpleCommand aCommand) {
        System.out.println("simple command " + aCommand.toString());
    }
}
