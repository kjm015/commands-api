package io.kjm015.commands_api.repositories;

import io.kjm015.commands_api.models.CommandEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandEventRepository extends JpaRepository<CommandEvent, Long> {
}
