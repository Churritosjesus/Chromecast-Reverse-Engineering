package android.support.v7.widget;

import a;
import aak;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import fb;
import rl;
import rv;
import tf;

public class ShareActionProvider
  extends fb
{
  private int c = 4;
  private final aak d = new aak(this);
  private final Context e;
  private String f = "share_history.xml";
  
  public ShareActionProvider(Context paramContext)
  {
    super(paramContext);
    this.e = paramContext;
  }
  
  public final View a()
  {
    ActivityChooserView localActivityChooserView = new ActivityChooserView(this.e);
    if (!localActivityChooserView.isInEditMode())
    {
      rl localrl2 = rl.a(this.e, this.f);
      localObject = localActivityChooserView.a;
      rl localrl1 = ActivityChooserView.a(((rv)localObject).c).a;
      if ((localrl1 != null) && (((rv)localObject).c.isShown())) {
        localrl1.unregisterObserver(ActivityChooserView.i(((rv)localObject).c));
      }
      ((rv)localObject).a = localrl2;
      if ((localrl2 != null) && (((rv)localObject).c.isShown())) {
        localrl2.registerObserver(ActivityChooserView.i(((rv)localObject).c));
      }
      ((rv)localObject).notifyDataSetChanged();
      if (localActivityChooserView.c())
      {
        localActivityChooserView.b();
        localActivityChooserView.a();
      }
    }
    Object localObject = new TypedValue();
    this.e.getTheme().resolveAttribute(a.p, (TypedValue)localObject, true);
    localObject = tf.a(this.e, ((TypedValue)localObject).resourceId);
    localActivityChooserView.b.setImageDrawable((Drawable)localObject);
    localActivityChooserView.c = this;
    localActivityChooserView.d = a.bX;
    int i = a.bW;
    localObject = localActivityChooserView.getContext().getString(i);
    localActivityChooserView.b.setContentDescription((CharSequence)localObject);
    return localActivityChooserView;
  }
  
  public final void a(SubMenu paramSubMenu)
  {
    paramSubMenu.clear();
    rl localrl = rl.a(this.e, this.f);
    PackageManager localPackageManager = this.e.getPackageManager();
    int j = localrl.a();
    int k = Math.min(j, this.c);
    ResolveInfo localResolveInfo;
    for (int i = 0; i < k; i++)
    {
      localResolveInfo = localrl.a(i);
      paramSubMenu.add(0, i, i, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setOnMenuItemClickListener(this.d);
    }
    if (k < j)
    {
      paramSubMenu = paramSubMenu.addSubMenu(0, k, k, this.e.getString(a.bU));
      for (i = 0; i < j; i++)
      {
        localResolveInfo = localrl.a(i);
        paramSubMenu.add(0, i, i, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setOnMenuItemClickListener(this.d);
      }
    }
  }
  
  public final boolean f()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\ShareActionProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */