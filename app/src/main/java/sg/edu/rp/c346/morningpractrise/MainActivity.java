package sg.edu.rp.c346.morningpractrise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;

    ArrayList<ContactList> alContactList;
    CostumList caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);

        alContactList = new ArrayList<>();
        ContactList contact1 = new ContactList("Mary","+65",65442334);
        ContactList contact2 = new ContactList("Ken","+65",97442437);
        alContactList.add(contact1);
        alContactList.add(contact2);

        caContact = new CostumList(this,R.layout.contact_list,alContactList);

        lvContact.setAdapter(caContact);


    }
}
