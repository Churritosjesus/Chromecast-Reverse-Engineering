import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import java.util.ArrayList;

final class vl
  extends ve
{
  private static final ArrayList i;
  private final AudioManager j;
  private final vn k;
  private int l = -1;
  
  static
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
    localIntentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
    ArrayList localArrayList = new ArrayList();
    i = localArrayList;
    localArrayList.add(localIntentFilter);
  }
  
  public vl(Context paramContext)
  {
    super(paramContext);
    this.j = ((AudioManager)paramContext.getSystemService("audio"));
    this.k = new vn(this);
    paramContext.registerReceiver(this.k, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
    a();
  }
  
  private void a()
  {
    Object localObject = this.a.getResources();
    int m = this.j.getStreamMaxVolume(3);
    this.l = this.j.getStreamVolume(3);
    localObject = new to("DEFAULT_ROUTE", ((Resources)localObject).getString(a.cq)).a(i).b(3).a(0).e(1).d(m).c(this.l).a();
    a(new tw().a((tn)localObject).a());
  }
  
  public final tu a(String paramString)
  {
    if (paramString.equals("DEFAULT_ROUTE")) {}
    for (paramString = new vm(this);; paramString = null) {
      return paramString;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */