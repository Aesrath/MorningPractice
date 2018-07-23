package sg.edu.rp.c346.morningpractrise;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003806 on 23/7/2018.
 */

public class CostumList extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ContactList> contactList;

    public CostumList(@NonNull Context context, int resource, @NonNull ArrayList<ContactList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(layout_id,parent,false);

        TextView tvName = view.findViewById(R.id.textViewName);
        TextView tvCode = view.findViewById(R.id.textViewNumcode);
        TextView tvNumber = view.findViewById(R.id.textViewNum);

        ContactList currentContact = contactList.get(position);

        String name = currentContact.getName();
        String numCode = currentContact.getNumCode();
        int num = currentContact.getNum();

        tvName.setText(name);
        tvCode.setText(numCode);
        tvNumber.setText(num + "");

        return view;

    }
}
