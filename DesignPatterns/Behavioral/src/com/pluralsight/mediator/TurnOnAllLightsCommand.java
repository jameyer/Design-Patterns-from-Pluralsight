package com.pluralsight.mediator;

import com.pluralsight.mediator.Command;
import com.pluralsight.mediator.Mediator;

public class TurnOnAllLightsCommand implements Command {
    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();

    }
}
