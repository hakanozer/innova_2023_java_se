package services;

import models.Note;
import utils.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    public ArrayList<Note> allNote() {
        ArrayList<Note> ls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from PUBLIC.NOTE";
            PreparedStatement pre = db.connection().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int nid = rs.getInt("nid");
                String title = rs.getString("title");
                String detail = rs.getString("detail");
                Note n = new Note(nid, title, detail);
                ls.add(n);
            }
        }catch (Exception ex) {
            System.err.println("allNote error :"+ ex);
        }finally {
            db.close();
        }
        return ls;
    }



}
