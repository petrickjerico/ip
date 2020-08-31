package duke.task;

import duke.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    protected LocalDate taskDate;

    public Deadline(String taskName, LocalDate taskDate) {
        super(taskName);
        this.taskDate = taskDate;
    }

    @Override
    public String getDate() {
        return taskDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public String toString() {
        return String.format("[D][%s] %s (by: %s)", getStatusIcon(), taskName, taskDate.format(DateTimeFormatter.ofPattern("MMM dd yyyy")));
    }
}