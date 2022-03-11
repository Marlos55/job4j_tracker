package ru.job4j.tracker;

public class Error {
    private boolean active;
    private int status;
    private String message;


    public Error() {

    }
    public  Error(boolean active, int status, String message){
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo(){
        System.out.println(active);
        System.out.println(message);
        System.out.println(status);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error er = new Error(true, 500, "Activated");
        er.printInfo();
    }

}
