import models.Note;
import services.NoteService;

import java.util.ArrayList;

public class MainApplication {

    public static void main(String[] args) {

        NoteService service = new NoteService();

        /*
        Note note = new Note();
        note.setTitle("Veli Toplantısı");
        note.setDetail("Toplantı Detay");
        int status = service.save(note);
        System.out.println("Status :" + status);
         */

        ArrayList<Note> ls = service.allNote();
        for ( Note item : ls ) {
            System.out.println(item);
        }

    }

}
