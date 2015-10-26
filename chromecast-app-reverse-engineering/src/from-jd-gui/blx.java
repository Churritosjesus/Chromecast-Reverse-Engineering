import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Application;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class blx
{
  private static blp a = new blp("Util", false);
  
  public static int a(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.widthPixels;
  }
  
  public static View a(Context paramContext, int paramInt, String paramString, String... paramVarArgs)
  {
    View localView = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt, null);
    paramContext = (TextView)localView.findViewById(f.bY);
    paramContext.setText(paramString);
    a(paramContext, paramVarArgs);
    return localView;
  }
  
  public static View a(Context paramContext, String paramString, String... paramVarArgs)
  {
    return a(paramContext, a.fm, paramString, paramVarArgs);
  }
  
  public static dax a(String[] paramArrayOfString)
  {
    dax localdax = new dax();
    localdax.d = blj.c();
    localdax.a = Integer.valueOf(1);
    localdax.c = 1;
    localdax.b = paramArrayOfString;
    return localdax;
  }
  
  public static String a(Context paramContext)
  {
    return paramContext.getString(b.cS, new Object[] { blj.b() });
  }
  
  public static String a(Context paramContext, bdf parambdf)
  {
    switch (bmf.a[(parambdf.b() - 1)])
    {
    }
    for (paramContext = paramContext.getString(b.bc);; paramContext = paramContext.getString(b.bd)) {
      return paramContext;
    }
  }
  
  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return paramString;
      if (paramString.length() == 1)
      {
        paramString = Character.toString(Character.toTitleCase(paramString.charAt(0)));
      }
      else
      {
        char c = Character.toTitleCase(paramString.charAt(0));
        paramString = String.valueOf(paramString.substring(1));
        paramString = String.valueOf(paramString).length() + 1 + c + paramString;
      }
    }
  }
  
  public static Set a(Context paramContext, daz paramdaz)
  {
    Object localObject1 = paramContext.getPackageManager().getInstalledApplications(128);
    paramContext = new HashSet(((List)localObject1).size());
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      paramContext.add(((ApplicationInfo)((Iterator)localObject1).next()).packageName.toLowerCase(Locale.US));
    }
    localObject1 = new HashSet();
    for (Object localObject2 : paramdaz.f) {
      if (paramContext.contains(((dba)localObject2).b.toLowerCase(Locale.US))) {
        ((Set)localObject1).add(((dba)localObject2).a);
      }
    }
    return (Set)localObject1;
  }
  
  public static void a(Activity paramActivity, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (paramActivity.isFinishing()) {
      return;
    }
    blz localblz = new blz(paramOnClickListener);
    Object localObject;
    if (Build.VERSION.SDK_INT < blf.S(paramActivity)) {
      localObject = new bma(paramActivity);
    }
    for (paramActivity = new AlertDialog.Builder(paramActivity).setMessage(b.ce).setCancelable(true).setNegativeButton(b.bn, (DialogInterface.OnClickListener)localObject).setPositiveButton(b.I, paramOnClickListener).create();; paramActivity = new AlertDialog.Builder(paramActivity).setMessage(b.dU).setTitle(b.dV).setCancelable(true).setNegativeButton(b.dT, paramOnClickListener).setPositiveButton(b.dS, (DialogInterface.OnClickListener)localObject).create())
    {
      paramActivity.setOnDismissListener(localblz);
      paramActivity.show();
      break;
      localObject = new bmb(paramActivity);
    }
  }
  
  public static void a(Activity paramActivity, SearchView paramSearchView, View paramView, View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    Object localObject1 = (SearchManager)paramActivity.getSystemService("search");
    paramSearchView.a(false);
    paramSearchView.l = ((SearchManager)localObject1).getSearchableInfo(paramActivity.getComponentName());
    int i;
    if (paramSearchView.l != null)
    {
      if (SearchView.a)
      {
        paramSearchView.b.setThreshold(paramSearchView.l.getSuggestThreshold());
        paramSearchView.b.setImeOptions(paramSearchView.l.getImeOptions());
        int j = paramSearchView.l.getInputType();
        i = j;
        if ((j & 0xF) == 1)
        {
          j &= 0xFFFEFFFF;
          i = j;
          if (paramSearchView.l.getSuggestAuthority() != null) {
            i = j | 0x10000 | 0x80000;
          }
        }
        paramSearchView.b.setInputType(i);
        if (paramSearchView.j != null) {
          paramSearchView.j.a(null);
        }
        if (paramSearchView.l.getSuggestAuthority() != null)
        {
          paramSearchView.j = new aal(paramSearchView.getContext(), paramSearchView, paramSearchView.l, paramSearchView.n);
          paramSearchView.b.setAdapter(paramSearchView.j);
          ((aal)paramSearchView.j).e = 1;
        }
      }
      paramSearchView.c();
    }
    if (SearchView.a) {
      if ((paramSearchView.l != null) && (paramSearchView.l.getVoiceSearchEnabled()))
      {
        localObject1 = null;
        if (paramSearchView.l.getVoiceSearchLaunchWebSearch())
        {
          localObject1 = paramSearchView.e;
          if (localObject1 == null) {
            break label637;
          }
          if (paramSearchView.getContext().getPackageManager().resolveActivity((Intent)localObject1, 65536) == null) {
            break label631;
          }
          i = 1;
          label279:
          if (i == 0) {
            break label643;
          }
        }
      }
    }
    label631:
    label637:
    label643:
    for (boolean bool = true;; bool = false)
    {
      paramSearchView.k = bool;
      if (paramSearchView.k) {
        paramSearchView.b.setPrivateImeOptions("nm");
      }
      paramSearchView.b(paramSearchView.i);
      localObject1 = paramSearchView.findViewById(a.bn);
      Object localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
      ((LinearLayout.LayoutParams)localObject2).leftMargin = 0;
      ((LinearLayout.LayoutParams)localObject2).rightMargin = 0;
      ((LinearLayout.LayoutParams)localObject2).topMargin = 0;
      ((LinearLayout.LayoutParams)localObject2).bottomMargin = 0;
      ((LinearLayout.LayoutParams)localObject2).height = -1;
      ((LinearLayout.LayoutParams)localObject2).width = -1;
      ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject1 = (TextView)paramSearchView.findViewById(a.br);
      ((TextView)localObject1).setTextColor(paramActivity.getResources().getColor(a.dp));
      ((TextView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((TextView)localObject1).setPadding(0, 0, 0, 0);
      ((TextView)localObject1).setTextSize(2, 14.0F);
      ((TextView)localObject1).setImeOptions(3);
      ((ImageView)paramSearchView.findViewById(a.bp)).setLayoutParams(new LinearLayout.LayoutParams(0, 0));
      localObject2 = (ImageView)paramSearchView.findViewById(a.bm);
      ((ImageView)localObject2).setImageResource(a.eD);
      i = paramActivity.getResources().getDimensionPixelSize(a.dZ);
      ((ImageView)localObject2).setPadding(i, 0, i, 0);
      ((ImageView)paramSearchView.findViewById(a.bs)).setImageResource(a.eG);
      View localView = paramSearchView.findViewById(a.bq);
      localObject2 = (LinearLayout.LayoutParams)localView.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject2).height = -1;
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localView.setBackgroundColor(0);
      paramSearchView.findViewById(a.bv).setBackgroundColor(0);
      paramActivity.getWindow().setSoftInputMode(3);
      ((TextView)localObject1).setOnFocusChangeListener(new bmc(paramView, paramOnFocusChangeListener, paramActivity, (TextView)localObject1));
      paramView.setOnClickListener(new bmd((TextView)localObject1));
      ((TextView)localObject1).clearFocus();
      return;
      if (!paramSearchView.l.getVoiceSearchLaunchRecognizer()) {
        break;
      }
      localObject1 = paramSearchView.f;
      break;
      i = 0;
      break label279;
      i = 0;
      break label279;
    }
  }
  
  private static void a(Activity paramActivity, String paramString)
  {
    PackageManager localPackageManager = paramActivity.getApplication().getPackageManager();
    Intent localIntent2 = new Intent("android.intent.action.VIEW");
    localIntent2.setData(Uri.parse(paramString));
    localIntent2.setPackage("com.android.vending");
    Intent localIntent1 = localIntent2;
    if (localIntent2.resolveActivity(localPackageManager) == null)
    {
      localIntent1 = new Intent("android.intent.action.VIEW");
      localIntent1.setData(Uri.parse(paramString));
    }
    paramActivity.startActivity(localIntent1);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    a(paramContext, paramString, null);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent("android.intent.action.CAST", Uri.parse(paramString1));
    localIntent.addFlags(268435456);
    localIntent.putExtra("source", "com.google.android.apps.chromecast.app");
    if (a(paramContext, localIntent, paramString2)) {}
    for (;;)
    {
      return;
      if (!a(paramContext, localIntent.setAction("android.intent.action.VIEW"), paramString2))
      {
        paramString1 = localPackageManager.getLaunchIntentForPackage(paramString1);
        if (paramString1 != null)
        {
          paramString1.addFlags(268435456);
          paramContext.startActivity(paramString1);
        }
        else
        {
          Toast.makeText(paramContext, b.bD, 0).show();
        }
      }
    }
  }
  
  public static void a(View paramView, int paramInt)
  {
    a(paramView, paramView.getContext().getString(paramInt));
  }
  
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if (paramView == null) {}
    for (;;)
    {
      return;
      if (TextUtils.isEmpty(paramCharSequence))
      {
        paramView.setVisibility(8);
      }
      else
      {
        ((TextView)paramView).setText(paramCharSequence);
        paramView.setVisibility(0);
      }
    }
  }
  
  public static void a(TextView paramTextView, String paramString1, String paramString2, apd paramapd)
  {
    a(paramTextView, paramString1, paramString2, null, paramapd);
  }
  
  public static void a(TextView paramTextView, String paramString1, String paramString2, String paramString3, apd paramapd)
  {
    if ((TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString1))) {
      paramTextView.setVisibility(8);
    }
    for (;;)
    {
      return;
      paramTextView.setVisibility(0);
      paramTextView.setText(paramString1);
      paramTextView.setOnClickListener(new bme(paramString2, paramString3, paramapd));
    }
  }
  
  public static void a(TextView paramTextView, String... paramVarArgs)
  {
    int i = 0;
    Object localObject;
    String str;
    SpannableString localSpannableString;
    int j;
    if (i < paramVarArgs.length - 1)
    {
      localObject = paramVarArgs[i];
      str = paramVarArgs[(i + 1)];
      paramTextView.setLinksClickable(true);
      paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
      localSpannableString = SpannableString.valueOf(paramTextView.getText());
      for (j = 0; (j < ((String)localObject).length()) && (Character.getType(((String)localObject).charAt(0)) == 16); j++) {}
      if (j <= 0) {
        break label159;
      }
      localObject = ((String)localObject).substring(j);
    }
    label159:
    for (;;)
    {
      localObject = Pattern.compile((String)localObject, 2).matcher(localSpannableString);
      while (((Matcher)localObject).find())
      {
        int k = ((Matcher)localObject).start();
        j = ((Matcher)localObject).end();
        localSpannableString.setSpan(new bly(str, null), k, j, 33);
      }
      i += 2;
      break;
      paramTextView.setAutoLinkMask(1);
      paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
      return;
    }
  }
  
  public static boolean a()
  {
    return false;
  }
  
  public static boolean a(int paramInt)
  {
    if ((paramInt == 82) && ("LGE".equalsIgnoreCase(Build.MANUFACTURER)) && (Build.VERSION.SDK_INT == 16)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(int paramInt, m paramm)
  {
    if ((paramInt == 82) && ("LGE".equalsIgnoreCase(Build.MANUFACTURER)) && (Build.VERSION.SDK_INT == 16)) {
      paramm.openOptionsMenu();
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean a(Context paramContext, Intent paramIntent, String paramString)
  {
    boolean bool = true;
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (!TextUtils.isEmpty(paramString))
    {
      paramIntent.setPackage(paramString);
      if (localPackageManager.resolveActivity(paramIntent, 65536) != null) {
        paramContext.startActivity(paramIntent);
      }
    }
    for (;;)
    {
      return bool;
      paramIntent.setPackage(null);
      if (localPackageManager.resolveActivity(paramIntent, 65536) != null) {
        paramContext.startActivity(paramIntent);
      } else {
        bool = false;
      }
    }
  }
  
  public static int b(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return Math.min(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
  }
  
  public static String b(Context paramContext)
  {
    return paramContext.getString(b.dK, new Object[] { blj.b() });
  }
  
  public static String b(Context paramContext, bdf parambdf)
  {
    switch (bmf.a[(parambdf.b() - 1)])
    {
    }
    for (paramContext = paramContext.getString(b.bh);; paramContext = paramContext.getString(b.bf)) {
      return paramContext;
    }
  }
  
  public static int c(Activity paramActivity)
  {
    int j = 1;
    int k = paramActivity.getWindowManager().getDefaultDisplay().getRotation();
    int i = paramActivity.getResources().getConfiguration().orientation;
    if (i == 1)
    {
      i = j;
      if (k != 0)
      {
        if (k != 3) {
          break label46;
        }
        i = j;
      }
    }
    for (;;)
    {
      return i;
      label46:
      i = 9;
      continue;
      if (i == 2)
      {
        if ((k == 0) || (k == 1)) {
          i = 0;
        } else {
          i = 8;
        }
      }
      else {
        i = -1;
      }
    }
  }
  
  public static void d(Activity paramActivity)
  {
    ape.a().a(15, Integer.valueOf(2));
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    localIntent.setData(Uri.parse(blf.h(paramActivity)));
    paramActivity.startActivity(localIntent);
  }
  
  public static void e(Activity paramActivity)
  {
    a(paramActivity, paramActivity.getString(b.ay));
  }
  
  public static void f(Activity paramActivity)
  {
    ape.a().a(15, Integer.valueOf(0));
    a(paramActivity, blf.W(paramActivity));
  }
  
  public static void g(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramActivity.getWindow().clearFlags(67108864);
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(a.dj, localTypedValue, true);
      paramActivity.getWindow().setStatusBarColor(localTypedValue.data);
    }
  }
  
  public static void h(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramActivity.getWindow().setFlags(67108864, 67108864);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */