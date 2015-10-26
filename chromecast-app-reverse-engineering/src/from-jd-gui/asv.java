import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.apps.chromecast.app.backdrop.PeoplePickerRecipientView;

final class asv
  implements View.OnClickListener
{
  asv(asu paramasu, PeoplePickerRecipientView paramPeoplePickerRecipientView) {}
  
  public final void onClick(View paramView)
  {
    j localj = this.b.x.a("sharedPhotosFragment");
    paramView = localj;
    if (localj == null)
    {
      paramView = asu.a(this.b, this.a.getText().toString()).trim();
      if (asu.b(this.b, paramView)) {
        paramView = asx.a(asu.p(), paramView);
      }
    }
    else
    {
      paramView = this.b.x.a().b(f.bk, paramView, "sharedPhotosFragment");
      paramView.a(4097);
      paramView.b();
      ape.a().a(new apd(75).a(asu.p().b.intValue()));
    }
    for (;;)
    {
      return;
      Toast.makeText(this.b.y.getApplicationContext(), b.bE, 0).show();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\asv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */