import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ajq
  extends Dialog
{
  String a = "fbconnect://success";
  ajx b;
  WebView c;
  boolean d = false;
  boolean e = false;
  private String f;
  private ProgressDialog g;
  private ImageView h;
  private FrameLayout i;
  private boolean j = false;
  
  public ajq(Context paramContext, String paramString)
  {
    this(paramContext, paramString, 16973840);
  }
  
  private ajq(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, 16973840);
    this.f = paramString;
  }
  
  public ajq(Context paramContext, String paramString, Bundle paramBundle, int paramInt, ajx paramajx)
  {
    super(paramContext, k);
    paramContext = paramBundle;
    if (paramBundle == null) {
      paramContext = new Bundle();
    }
    paramContext.putString("redirect_uri", "fbconnect://success");
    paramContext.putString("display", "touch");
    paramBundle = ajh.a();
    String str2 = ajh.d();
    String str1 = String.valueOf("dialog/");
    this.f = aji.a(paramBundle, String.valueOf(str2).length() + 1 + String.valueOf(str1).length() + String.valueOf(paramString).length() + str2 + "/" + str1 + paramString, paramContext).toString();
    this.b = paramajx;
  }
  
  private static int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    double d1 = 0.5D;
    int k = (int)(paramInt1 / paramFloat);
    if (k <= paramInt2) {
      d1 = 1.0D;
    }
    for (;;)
    {
      return (int)(d1 * paramInt1);
      if (k < paramInt3) {
        d1 = 0.5D + (paramInt3 - k) / (paramInt3 - paramInt2) * 0.5D;
      }
    }
  }
  
  protected Bundle a(String paramString)
  {
    paramString = Uri.parse(paramString);
    Bundle localBundle = aji.b(paramString.getQuery());
    localBundle.putAll(aji.b(paramString.getFragment()));
    return localBundle;
  }
  
  public final void a()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    int k;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      k = localDisplayMetrics.widthPixels;
      if (localDisplayMetrics.widthPixels >= localDisplayMetrics.heightPixels) {
        break label129;
      }
    }
    label129:
    for (int m = localDisplayMetrics.heightPixels;; m = localDisplayMetrics.widthPixels)
    {
      k = Math.min(a(k, localDisplayMetrics.density, 480, 800), localDisplayMetrics.widthPixels);
      m = Math.min(a(m, localDisplayMetrics.density, 800, 1280), localDisplayMetrics.heightPixels);
      getWindow().setLayout(k, m);
      return;
      k = localDisplayMetrics.heightPixels;
      break;
    }
  }
  
  protected final void a(Throwable paramThrowable)
  {
    if ((this.b != null) && (!this.d))
    {
      this.d = true;
      paramThrowable = (afq)paramThrowable;
      this.b.a(null, paramThrowable);
      dismiss();
    }
  }
  
  public void cancel()
  {
    if ((this.b != null) && (!this.d)) {
      a(new afr());
    }
  }
  
  public void dismiss()
  {
    if (this.c != null) {
      this.c.stopLoading();
    }
    if ((!this.j) && (this.g != null) && (this.g.isShowing())) {
      this.g.dismiss();
    }
    super.dismiss();
  }
  
  public void onAttachedToWindow()
  {
    this.j = false;
    super.onAttachedToWindow();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.g = new ProgressDialog(getContext());
    this.g.requestWindowFeature(1);
    this.g.setMessage(getContext().getString(a.dc));
    this.g.setOnCancelListener(new ajr(this));
    requestWindowFeature(1);
    this.i = new FrameLayout(getContext());
    a();
    getWindow().setGravity(17);
    getWindow().setSoftInputMode(16);
    this.h = new ImageView(getContext());
    this.h.setOnClickListener(new ajs(this));
    paramBundle = getContext().getResources().getDrawable(a.cV);
    this.h.setImageDrawable(paramBundle);
    this.h.setVisibility(4);
    int k = this.h.getDrawable().getIntrinsicWidth() / 2 + 1;
    paramBundle = new LinearLayout(getContext());
    this.c = new ajt(this, getContext().getApplicationContext());
    this.c.setVerticalScrollBarEnabled(false);
    this.c.setHorizontalScrollBarEnabled(false);
    this.c.setWebViewClient(new ajw(this));
    this.c.getSettings().setJavaScriptEnabled(true);
    this.c.loadUrl(this.f);
    this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.c.setVisibility(4);
    this.c.getSettings().setSavePassword(false);
    this.c.getSettings().setSaveFormData(false);
    this.c.setFocusable(true);
    this.c.setFocusableInTouchMode(true);
    this.c.setOnTouchListener(new aju(this));
    paramBundle.setPadding(k, k, k, k);
    paramBundle.addView(this.c);
    paramBundle.setBackgroundColor(-872415232);
    this.i.addView(paramBundle);
    this.i.addView(this.h, new ViewGroup.LayoutParams(-2, -2));
    setContentView(this.i);
  }
  
  public void onDetachedFromWindow()
  {
    this.j = true;
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      cancel();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onStart()
  {
    super.onStart();
    a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */