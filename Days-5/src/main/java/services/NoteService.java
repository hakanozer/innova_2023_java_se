package services;

import models.Note;
import utils.DB;

import java.sql.PreparedStatement;

public class NoteService {

    public int save(Note note) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "insert into PUBLIC.NOTE values ( default, ?, ? )";
            PreparedStatement pre = db.connection().prepareStatement(sql);
            pre.setString(1, note.getTitle());
            pre.setString(2, note.getDetail());
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("save error :"+ ex);
        }finally {
            db.close();
        }
        return status;
    }

}
