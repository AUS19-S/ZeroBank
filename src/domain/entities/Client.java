package domain.entities;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String document;
    private String password;

    public String getName(){
        return this.name;
    }
    public void setName( String name){
        this.name = name;
    }

}
