package io.kjm015.commands_api.services;

import io.kjm015.commands_api.models.CommandEvent;
import io.kjm015.commands_api.repositories.CommandEventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CommandService {

    private final CommandEventRepository commandEventRepository;

    public List<CommandEvent> getAllCommandEvents() {
        return commandEventRepository.findAll();
    }

    public CommandEvent saveCommandEvent(CommandEvent commandEvent) {
        log.info("Received save request with name {} and args {}", commandEvent.getCommandName(), commandEvent.getCommandArguments());
        return commandEventRepository.save(commandEvent);
    }
}
