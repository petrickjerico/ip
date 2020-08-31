package duke.task;

import duke.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    protected LocalDate taskDate;

    public Event(String taskName, LocalDate taskDate) {
        super(taskName);
        this.taskDate = taskDate;
    }

    @Override
    public String getDate() {
        return taskDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public String toString() {
        return String.format("[E][%s] %s (at: %s)", getStatusIcon(), taskName, taskDate.format(DateTimeFormatter.ofPattern("MMM dd yyyy")));
    }
}