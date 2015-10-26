import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public class nf
  extends m
  implements ba, mp, ng
{
  private nh e;
  
  private boolean e()
  {
    int i = 0;
    Object localObject1 = at.a(this);
    az localaz;
    if (localObject1 != null) {
      if (at.a(this, (Intent)localObject1))
      {
        localaz = az.a(this);
        if (!(this instanceof ba)) {
          break label289;
        }
      }
    }
    label289:
    Object localObject2;
    for (localObject1 = ((ba)this).b();; localObject2 = null)
    {
      if (localObject1 == null) {
        localObject1 = at.a(this);
      }
      for (;;)
      {
        if (localObject1 != null)
        {
          ComponentName localComponentName = ((Intent)localObject1).getComponent();
          localObject3 = localComponentName;
          if (localComponentName == null) {
            localObject3 = ((Intent)localObject1).resolveActivity(localaz.b.getPackageManager());
          }
          localaz.a((ComponentName)localObject3);
          localaz.a.add(localObject1);
        }
        if (localaz.a.isEmpty()) {
          throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Object localObject3 = (Intent[])localaz.a.toArray(new Intent[localaz.a.size()]);
        localObject3[0] = new Intent(localObject3[0]).addFlags(268484608);
        localObject1 = localaz.b;
        int j = Build.VERSION.SDK_INT;
        if (j >= 16)
        {
          ((Context)localObject1).startActivities((Intent[])localObject3, null);
          i = 1;
          if (i == 0)
          {
            localObject1 = new Intent(localObject3[(localObject3.length - 1)]);
            ((Intent)localObject1).addFlags(268435456);
            localaz.b.startActivity((Intent)localObject1);
          }
        }
        for (;;)
        {
          try
          {
            if (Build.VERSION.SDK_INT >= 16)
            {
              finishAffinity();
              bool = true;
              return bool;
              if (j < 11) {
                break;
              }
              ((Context)localObject1).startActivities((Intent[])localObject3);
              i = 1;
              break;
            }
            finish();
            continue;
          }
          catch (IllegalStateException localIllegalStateException)
          {
            finish();
            continue;
          }
          at.b(this, localIllegalStateException);
          continue;
          boolean bool = false;
        }
      }
    }
  }
  
  public final void a(Toolbar paramToolbar)
  {
    d().a(paramToolbar);
  }
  
  public final void a_()
  {
    d().f();
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    d().b(paramView, paramLayoutParams);
  }
  
  public final Intent b()
  {
    return at.a(this);
  }
  
  public final mo c()
  {
    return d().h();
  }
  
  public final nh d()
  {
    if (this.e == null) {
      this.e = nh.a(this, getWindow(), this);
    }
    return this.e;
  }
  
  public MenuInflater getMenuInflater()
  {
    return d().b();
  }
  
  public void invalidateOptionsMenu()
  {
    d().f();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    d().a(paramConfiguration);
  }
  
  public void onContentChanged() {}
  
  public void onCreate(Bundle paramBundle)
  {
    d().i();
    super.onCreate(paramBundle);
    d().a(paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    d().g();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool;
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      mj localmj = d().a();
      if ((paramMenuItem.getItemId() == 16908332) && (localmj != null) && ((localmj.b() & 0x4) != 0)) {
        bool = e();
      } else {
        bool = false;
      }
    }
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    d().c();
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    d().e();
  }
  
  public void onStop()
  {
    super.onStop();
    d().d();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    d().a(paramCharSequence);
  }
  
  public void setContentView(int paramInt)
  {
    d().a(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    d().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    d().a(paramView, paramLayoutParams);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */