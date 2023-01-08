package com.example.search_engine_acciojob;

import java.sql.Time;
import java.sql.Timestamp;

public class HistoryResult {
    private String keyword;
    private Timestamp timestamp;

    public String getKeyword(){
        return this.keyword;
    }
    public void setKeyword(String keyword){
        this.keyword =keyword;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp time){
        this.timestamp = time;
    }

    HistoryResult(String keyword, Timestamp Time){
        this.keyword = keyword;
        this.timestamp =Time;

    }

}
