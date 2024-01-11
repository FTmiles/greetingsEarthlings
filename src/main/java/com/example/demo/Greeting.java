package com.example.demo;

public class Greeting {

    private long id;
    private String content = "hacked jaja";

    public long getId(){
        return id;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    //    public void setId(long id){
//        this.id = id;
//    }

    public String getContent(){
        return content;
    }

//    public void setContent(String content){
//        this.content = content;
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Greeting{");
        sb.append("id=").append(id);
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
