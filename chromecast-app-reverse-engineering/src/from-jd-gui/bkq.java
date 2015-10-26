import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import com.google.android.apps.chromecast.app.HelpActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.apps.chromecast.app.setup.DeviceSetupActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class bkq
{
  private static final blp a = new blp("FeedbackHelper", false);
  private static GoogleApiClient b;
  
  private static String a(Activity paramActivity, String paramString)
  {
    localObject = null;
    try
    {
      paramString = paramActivity.getPackageManager().getPackageInfo(paramString, 0);
      paramActivity = (Activity)localObject;
      if (paramString != null) {
        paramActivity = paramString.versionName;
      }
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
      for (;;)
      {
        paramActivity = (Activity)localObject;
      }
    }
    return paramActivity;
  }
  
  public static void a(Activity paramActivity, baq parambaq)
  {
    Intent localIntent2 = parambaq.e();
    Intent localIntent1 = localIntent2;
    if (localIntent2 == null) {
      localIntent1 = HelpActivity.a(paramActivity, paramActivity.getString(b.dG));
    }
    if (a(paramActivity)) {
      localIntent1.putExtra("screenShot", b(paramActivity));
    }
    localIntent1.putExtra("feedbackSupported", true);
    localIntent1.putParcelableArrayListExtra("feedbackDevices", parambaq.b_());
    paramActivity.startActivity(localIntent1);
  }
  
  public static void a(Activity paramActivity, List paramList)
  {
    Bundle localBundle = new Bundle();
    blf.a(localBundle, paramActivity);
    Object localObject1 = SetupApplication.a();
    if (((SetupApplication)localObject1).k()) {
      localBundle.putString("last-setup-failure", String.format("%d seconds ago: %s", new Object[] { Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - ((SetupApplication)localObject1).k)), ((SetupApplication)localObject1).l }));
    }
    a(localBundle, "gms-core-version", a(paramActivity, "com.google.android.gms"));
    a(localBundle, "app-version-youtube", a(paramActivity, "com.google.android.youtube"));
    a(localBundle, "app-version-play-movies", a(paramActivity, "com.google.android.videos"));
    a(localBundle, "app-version-play-music", a(paramActivity, "com.google.android.music"));
    a(localBundle, "app-version-netflix", a(paramActivity, "com.netflix.mediaclient"));
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      String str = UUID.randomUUID().toString();
      localBundle.putString("feedback-id", String.format(Locale.US, blf.J(paramActivity), new Object[] { str }));
      long l = SystemClock.elapsedRealtime();
      localObject1 = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      label249:
      label348:
      label358:
      while (paramList.hasNext())
      {
        Object localObject3 = (bko)paramList.next();
        Object localObject2;
        if (!TextUtils.isEmpty(((bko)localObject3).a))
        {
          ((ArrayList)localObject1).add(((bko)localObject3).a);
          localObject2 = ((bko)localObject3).a;
          if (TextUtils.isEmpty(((bko)localObject3).c)) {
            break label348;
          }
          localArrayList.add(((bko)localObject3).c);
        }
        for (;;)
        {
          if (((bko)localObject3).b == null) {
            break label358;
          }
          localObject2 = new bfn(((bko)localObject3).b, str);
          localObject3 = new bfe(new bfd[] { localObject2 });
          ((bfe)localObject3).a = new bkr((bfn)localObject2, l);
          ((bfe)localObject3).a();
          break;
          ((ArrayList)localObject1).add("???");
          break label249;
          localArrayList.add("?");
        }
      }
      localBundle.putString("build-Chromecast", TextUtils.join(",", (Iterable)localObject1));
      localBundle.putString("type-Chromecast", TextUtils.join(",", localArrayList));
    }
    if (b == null) {
      b = new bwf(SetupApplication.a()).a(cib.a).b();
    }
    if ((!b.d()) && (!b.e())) {
      b.b();
    }
    paramList = null;
    localObject1 = paramActivity.getIntent().getExtras();
    if (localObject1 != null) {
      paramList = (Bitmap)((Bundle)localObject1).getParcelable("screenShot");
    }
    localObject1 = paramList;
    if (paramList == null)
    {
      localObject1 = paramList;
      if (a(paramActivity)) {
        localObject1 = b(paramActivity);
      }
    }
    cib.a(b, (Bitmap)localObject1, localBundle);
  }
  
  private static void a(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramBundle.putString(paramString1, paramString2);
    }
  }
  
  public static boolean a()
  {
    return true;
  }
  
  private static boolean a(Activity paramActivity)
  {
    int i;
    boolean bool;
    if ((paramActivity instanceof DeviceSetupActivity))
    {
      paramActivity = ((DeviceSetupActivity)paramActivity).b.a(f.ai);
      if ((paramActivity instanceof bgr))
      {
        if (!((bgr)paramActivity).a.c.isChecked())
        {
          i = 1;
          if (i == 0) {
            break label59;
          }
        }
      }
      else {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      i = 0;
      break;
      label59:
      bool = false;
      continue;
      bool = true;
    }
  }
  
  private static Bitmap b(Activity paramActivity)
  {
    for (;;)
    {
      try
      {
        View localView = paramActivity.getWindow().getDecorView().getRootView();
        boolean bool = localView.isDrawingCacheEnabled();
        localView.setDrawingCacheEnabled(true);
        Bitmap localBitmap = localView.getDrawingCache();
        if (localBitmap == null) {
          continue;
        }
        int j = localBitmap.getWidth();
        int i = localBitmap.getHeight();
        if (j * i > 360000)
        {
          j /= 2;
          i /= 2;
          continue;
        }
        paramActivity = localBitmap;
        if (j != localBitmap.getWidth()) {
          paramActivity = Bitmap.createScaledBitmap(localBitmap, j, i, true);
        }
        localBitmap = paramActivity.copy(Bitmap.Config.RGB_565, false);
        paramActivity = localBitmap;
        if (!bool)
        {
          localView.setDrawingCacheEnabled(false);
          localView.destroyDrawingCache();
          paramActivity = localBitmap;
        }
      }
      catch (OutOfMemoryError paramActivity)
      {
        paramActivity.toString();
        paramActivity = null;
        continue;
      }
      return paramActivity;
      paramActivity = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */