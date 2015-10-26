import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

final class awz
  implements View.OnClickListener
{
  awz(awr paramawr, dbb paramdbb) {}
  
  public final void onClick(View paramView)
  {
    boolean bool = true;
    paramView = apg.a(122);
    paramView.c = awr.e(this.b);
    paramView.b();
    paramView = this.b.y;
    Object localObject = this.a.b;
    if (localObject == null) {
      throw new NullPointerException("The videoId cannot be null");
    }
    Intent localIntent = new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", (String)localObject);
    localIntent.putExtra("app_package", paramView.getPackageName()).putExtra("app_version", daj.a(paramView)).putExtra("client_library_version", daj.a());
    localObject = localIntent.putExtra("developer_key", "AIzaSyBdEFvybu3pLLqPgu8m3MvsdScdKFfD6vE").putExtra("autoplay", true).putExtra("lightbox_mode", false).putExtra("start_time_millis", 0);
    if ((paramView.getWindow().getAttributes().flags & 0x400) == 0) {}
    for (;;)
    {
      ((Intent)localObject).putExtra("window_has_status_bar", bool);
      this.b.a(localIntent);
      return;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\awz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */