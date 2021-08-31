package com.example.java8.growing.jdk8;

import java.util.Arrays;
import java.util.Collection;

public class StreamDemo {

    private static final class Task {

        Task(Status status, Integer point) {
            this.status = status;
            this.point  = point;
        }

        private enum Status {
            OPEN, CLOSED
        }

        private final Status  status;
        private final Integer point;

        public Status getStatus() {
            return status;
        }

        public Integer getPoint() {
            return point;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "status=" + status +
                    ", point=" + point +
                    '}';
        }
    }

    public static void main(String[] args) {
        final Collection<Task> tasks = Arrays.asList(
                new Task(Task.Status.OPEN, 5),
                new Task(Task.Status.OPEN, 8),
                new Task(Task.Status.CLOSED, 2));
        int sum = tasks.stream()
                .filter(task -> task.getStatus() == Task.Status.OPEN)
                .mapToInt(Task::getPoint)
                .sum();

        System.out.println("total: " + sum);
    }
}
