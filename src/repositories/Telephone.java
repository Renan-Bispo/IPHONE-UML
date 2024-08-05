package repositories;

import models.Contact;

public interface Telephone {
    void call(Contact contact);
    void toMeet();
    String initVoiceMail();
}
