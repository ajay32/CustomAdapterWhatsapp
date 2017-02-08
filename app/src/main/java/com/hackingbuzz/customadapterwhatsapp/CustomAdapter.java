package com.hackingbuzz.customadapterwhatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Avi Hacker on 12/11/2016.
 */

public class CustomAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    public static final int MaxItems = 50;

    String[] myArray;
    int[] imagesss;



    public CustomAdapter(LayoutInflater inflater, String []array, int[] images){
        mInflater = inflater;
        this.myArray = array;
        this.imagesss = images;
    }


    @Override
    public int getCount() {
        return myArray.length;
    }

    @Override
    public Object getItem(int position) {    // this method returns what it has when we click on a button (when clicklistener call )..so tell here what you wanna print with toast (just the position (all it has got ) or somthing else modifly it

        if((position+1) %2 == 0) {   // position+1 to make it start with 1  not 0   --  (0+1 %2 == 0 )
            return "I am whatsapp at " + (position+1);  // +1 cuz it starts with zero..i want it to print 1 number extra (means it will seems it starts with 1
        }
        return "I am Launcher at "+ (position+1);     // put brackets otherwise it will consider it as a sting coz i also user quotes here na...
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {


            convertView = mInflater.inflate(R.layout.custom_adapter, parent, false);
        }
        ImageView callNchat = (ImageView) convertView.findViewById(R.id.wastage);

        TextView number = (TextView) convertView.findViewById(R.id.number);

        callNchat.setImageResource(imagesss[position]);   // see we checking if position of view is even put call image nai to whatsapp

        number.setText(myArray[position]);  // it disply on text view just



        return  convertView;
    }
}
