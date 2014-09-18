package exchange.rate.app;

import info.androidhive.tabsswipe.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Convertor extends Fragment {
	
	final Context context = this;
	Button convert;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_convertor, container, false);
		convert = (Button)rootView.findViewById(R.id.button1);
		convert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// custom dialog
				final Dialog dialog = new Dialog(context);
				dialog.setContentView(R.layout.dialogue);
				dialog.setTitle("Exchange Results");
	 
				// set the custom dialog components - text, image and button
				TextView text = (TextView) dialog.findViewById(R.id.text);
				text.setText("Results is :");
				
	 
				Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
				// if button is clicked, close the custom dialog
				dialogButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
					}
				});
	 
				dialog.show();
			}
		});
		
		return rootView;
	}
}
