package com.kodilla.patterns2.observer.homework;



public class Mentor implements Observer  {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void upDate(StudentsTasks studentsTasks) {
        System.out.println(username + ": New messages " + studentsTasks.getName() + "\n" +
                " (total: " + studentsTasks.getTasks().size() + " messages)");
        updateCount++;
    }
}


