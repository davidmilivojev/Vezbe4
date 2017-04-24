package rs.reviewer.tools;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import rs.reviewer.R;

public class FragmentTransition
{
	public static void to(Fragment newFragment, FragmentActivity activity)
	{
		to(newFragment, activity, true);
	}
	
	public static void to(Fragment newFragment, FragmentActivity activity, boolean addToBackstack)
	{
		FragmentTransaction transaction = activity.getSupportFragmentManager()
			.beginTransaction()
			.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
			.replace(R.id.mainContent, newFragment);
		if(addToBackstack) transaction.addToBackStack(null);
		transaction.commit();
	}
	
	public static void remove(Fragment fragment, FragmentActivity activity) // TODO izbaciti fragment parametar
	{
		activity.getSupportFragmentManager().popBackStack();
	}
}
