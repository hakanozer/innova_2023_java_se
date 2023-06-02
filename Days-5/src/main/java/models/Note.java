package models;

import lombok.Data;

@Data
public class Note {

    private Integer nid;
    private String title;
    private String detail;

    public Note() {

    }

    public Note(Integer nid, String title, String detail) {
        this.nid = nid;
        this.title = title;
        this.detail = detail;
    }
}
