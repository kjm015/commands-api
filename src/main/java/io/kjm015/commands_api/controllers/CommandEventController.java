package io.kjm015.commands_api.controllers;

import io.kjm015.commands_api.models.CommandEvent;
import io.kjm015.commands_api.models.CommandEventRequest;
import io.kjm015.commands_api.services.CommandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController("/events")
@RequiredArgsConstructor
public class CommandEventController {

    private final CommandService commandService;

    @GetMapping("/all")
    @CrossOrigin(origins = "*")
    public List<CommandEvent> getAllCommandEvents() {
        log.info("Received request to get all command events");
        return commandService.getAllCommandEvents();
    }

    @PostMapping("/save")
    public CommandEvent saveCommandEvent(@RequestBody CommandEventRequest commandEventRequest) {
        return commandService.saveCommandEvent(commandEventRequest);
    }

}
