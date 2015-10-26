import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class akq
  extends j
{
  private String a;
  private akh b;
  private akl c;
  
  static Bundle a(akl paramakl)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("request", paramakl);
    return localBundle;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.cZ, paramViewGroup, false);
    this.b.e = new aks(this, paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    akh localakh = this.b;
    if (localakh.f != null) {
      localakh.c().a(paramInt2, paramIntent);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    m localm;
    if (paramBundle != null)
    {
      this.b = ((akh)paramBundle.getParcelable("loginClient"));
      paramBundle = this.b;
      if (paramBundle.c != null) {
        throw new afq("Can't set fragment once it is already set.");
      }
      paramBundle.c = this;
      this.b.d = new akr(this);
      localm = this.y;
      if (localm != null) {
        break label89;
      }
    }
    for (;;)
    {
      return;
      this.b = new akh(this);
      break;
      label89:
      paramBundle = localm.getCallingActivity();
      if (paramBundle != null) {
        this.a = paramBundle.getPackageName();
      }
      if (localm.getIntent() != null) {
        this.c = ((akl)localm.getIntent().getParcelableExtra("request"));
      }
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelable("loginClient", this.b);
  }
  
  public final void j()
  {
    super.j();
    if (this.a == null)
    {
      Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
      this.y.finish();
    }
    for (;;)
    {
      return;
      akh localakh = this.b;
      Object localObject = this.c;
      if ((localakh.f != null) && (localakh.b >= 0)) {}
      for (int i = 1; (i == 0) && (localObject != null); i = 0)
      {
        if (localakh.f == null) {
          break label86;
        }
        throw new afq("Attempted to authorize while a request is pending.");
      }
      continue;
      label86:
      if ((afb.a() == null) || (localakh.d()))
      {
        localakh.f = ((akl)localObject);
        ArrayList localArrayList = new ArrayList();
        localObject = ((akl)localObject).a;
        if (((akg)localObject).b)
        {
          localArrayList.add(new aka(localakh));
          localArrayList.add(new ake(localakh));
        }
        if (((akg)localObject).c) {
          localArrayList.add(new alb(localakh));
        }
        localObject = new aky[localArrayList.size()];
        localArrayList.toArray((Object[])localObject);
        localakh.a = ((aky[])localObject);
        localakh.e();
      }
    }
  }
  
  public final void k()
  {
    super.k();
    this.y.findViewById(a.cX).setVisibility(8);
  }
  
  public final void l()
  {
    akh localakh = this.b;
    if (localakh.b >= 0) {
      localakh.c().b();
    }
    super.l();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\akq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */