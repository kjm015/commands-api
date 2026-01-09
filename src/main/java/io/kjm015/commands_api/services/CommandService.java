package io.kjm015.commands_api.services;

import io.kjm015.commands_api.models.CommandEvent;
import io.kjm015.commands_api.models.CommandEventRequest;
import io.kjm015.commands_api.repositories.CommandEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandService {

    private final CommandEventRepository commandEventRepository;

    public List<CommandEvent> getAllCommandEvents() {
        return commandEventRepository.findAll();
    }

    public CommandEvent saveCommandEvent(CommandEventRequest commandEventRequest) {
        var commandEvent = new CommandEvent();
        commandEvent.setCommandName(commandEventRequest.commandName());
        commandEvent.setCommandArguments(commandEventRequest.commandArguments());

        return commandEventRepository.save(commandEvent);
    }
}
