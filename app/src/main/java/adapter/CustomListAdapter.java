package adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.takeaway.R;

public class CustomListAdapter extends ArrayAdapter<String> {

	private final Activity context;
	private ArrayList<String> itemname = new ArrayList<String>();
	private ArrayList<String> itemdesc = new ArrayList<String>();
	private ArrayList<Integer> imgid = new ArrayList<Integer>();
	
	
	
	public CustomListAdapter(Activity context, ArrayList<String> itemname,ArrayList<String> itemdesc, ArrayList<Integer> imgid) {
		super(context, R.layout.mylist, itemname);
		// TODO Auto-generated constructor stub
		
		this.context=context;
		this.itemname=itemname;
		this.imgid=imgid;
		this.itemdesc=itemdesc;
	}
	
	public View getView(int position,View view,ViewGroup parent) {
		LayoutInflater inflater=context.getLayoutInflater();
		View rowView=inflater.inflate(R.layout.mylist, null,true);
		
		TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		TextView extratxt = (TextView) rowView.findViewById(R.id.itemtype);
		
		txtTitle.setText(itemname.get(position));
		imageView.setImageResource(imgid.get(position));
		extratxt.setText("Description "+itemdesc.get(position));
		return rowView;
		
	};
}