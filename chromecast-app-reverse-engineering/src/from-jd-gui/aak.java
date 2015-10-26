import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

public final class aak
  implements MenuItem.OnMenuItemClickListener
{
  public aak(ShareActionProvider paramShareActionProvider) {}
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = rl.a(ShareActionProvider.a(this.a), ShareActionProvider.b(this.a)).b(paramMenuItem.getItemId());
    if (localIntent != null)
    {
      paramMenuItem = localIntent.getAction();
      if (("android.intent.action.SEND".equals(paramMenuItem)) || ("android.intent.action.SEND_MULTIPLE".equals(paramMenuItem))) {
        ShareActionProvider.a(this.a, localIntent);
      }
      ShareActionProvider.a(this.a).startActivity(localIntent);
    }
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */