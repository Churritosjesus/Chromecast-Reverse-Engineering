package android.support.v7.widget;

import a;
import aaa;
import aab;
import aac;
import aad;
import aae;
import aaf;
import aag;
import aah;
import aai;
import aaj;
import aal;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import fi;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kj;
import oq;
import th;
import vt;
import xu;
import zx;
import zy;
import zz;

public class SearchView
  extends xu
  implements vt
{
  public static final boolean a;
  public static final aaj m;
  private CharSequence A;
  private boolean B;
  private int C;
  private CharSequence D;
  private CharSequence E;
  private boolean F;
  private int G;
  private Runnable H = new zx(this);
  private final Runnable I = new aab(this);
  private Runnable J = new aac(this);
  private final View.OnClickListener K = new aag(this);
  private View.OnKeyListener L = new aah(this);
  private final TextView.OnEditorActionListener M = new aai(this);
  private final AdapterView.OnItemClickListener N = new zy(this);
  private final AdapterView.OnItemSelectedListener O = new zz(this);
  private TextWatcher P = new aaa(this);
  public final SearchView.SearchAutoComplete b;
  public final int c;
  public final int d;
  public final Intent e;
  public final Intent f;
  public boolean i;
  public kj j;
  public boolean k;
  public SearchableInfo l;
  public final WeakHashMap n = new WeakHashMap();
  private final View o;
  private final View p;
  private final View q;
  private final ImageView r;
  private final ImageView s;
  private final ImageView t;
  private final ImageView u;
  private final View v;
  private final ImageView w;
  private final Drawable x;
  private final CharSequence y;
  private boolean z;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 8) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      m = new aaj();
      return;
    }
  }
  
  public SearchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.O);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = th.a(paramContext, paramAttributeSet, oq.aW, paramInt, 0);
    paramAttributeSet.a();
    LayoutInflater.from(paramContext).inflate(paramAttributeSet.e(oq.bg, a.bS), this, true);
    this.b = ((SearchView.SearchAutoComplete)findViewById(a.br));
    this.b.a = this;
    this.o = findViewById(a.bn);
    this.p = findViewById(a.bq);
    this.q = findViewById(a.bv);
    this.r = ((ImageView)findViewById(a.bl));
    this.s = ((ImageView)findViewById(a.bo));
    this.t = ((ImageView)findViewById(a.bm));
    this.u = ((ImageView)findViewById(a.bs));
    this.w = ((ImageView)findViewById(a.bp));
    this.p.setBackgroundDrawable(paramAttributeSet.a(oq.bh));
    this.q.setBackgroundDrawable(paramAttributeSet.a(oq.bl));
    this.r.setImageDrawable(paramAttributeSet.a(oq.bk));
    this.s.setImageDrawable(paramAttributeSet.a(oq.be));
    this.t.setImageDrawable(paramAttributeSet.a(oq.bb));
    this.u.setImageDrawable(paramAttributeSet.a(oq.bn));
    this.w.setImageDrawable(paramAttributeSet.a(oq.bk));
    this.x = paramAttributeSet.a(oq.bj);
    this.c = paramAttributeSet.e(oq.bm, a.bR);
    this.d = paramAttributeSet.e(oq.bc, 0);
    this.r.setOnClickListener(this.K);
    this.t.setOnClickListener(this.K);
    this.s.setOnClickListener(this.K);
    this.u.setOnClickListener(this.K);
    this.b.setOnClickListener(this.K);
    this.b.addTextChangedListener(this.P);
    this.b.setOnEditorActionListener(this.M);
    this.b.setOnItemClickListener(this.N);
    this.b.setOnItemSelectedListener(this.O);
    this.b.setOnKeyListener(this.L);
    this.b.setOnFocusChangeListener(new aad(this));
    a(paramAttributeSet.a(oq.bf, true));
    paramInt = paramAttributeSet.c(oq.ba, -1);
    if (paramInt != -1)
    {
      this.C = paramInt;
      requestLayout();
    }
    this.y = paramAttributeSet.c(oq.bd);
    this.A = paramAttributeSet.c(oq.bi);
    paramInt = paramAttributeSet.a(oq.aY, -1);
    if (paramInt != -1) {
      this.b.setImeOptions(paramInt);
    }
    paramInt = paramAttributeSet.a(oq.aZ, -1);
    if (paramInt != -1) {
      this.b.setInputType(paramInt);
    }
    setFocusable(paramAttributeSet.a(oq.aX, true));
    paramAttributeSet.a.recycle();
    this.e = new Intent("android.speech.action.WEB_SEARCH");
    this.e.addFlags(268435456);
    this.e.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.f = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.f.addFlags(268435456);
    this.v = findViewById(this.b.getDropDownAnchor());
    if (this.v != null)
    {
      if (Build.VERSION.SDK_INT < 11) {
        break label789;
      }
      this.v.addOnLayoutChangeListener(new aae(this));
    }
    for (;;)
    {
      b(this.z);
      c();
      return;
      label789:
      this.v.getViewTreeObserver().addOnGlobalLayoutListener(new aaf(this));
    }
  }
  
  private Intent a(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      Object localObject2 = aal.a(paramCursor, "suggest_intent_action");
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (Build.VERSION.SDK_INT >= 8) {
          localObject1 = this.l.getSuggestIntentAction();
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "android.intent.action.SEARCH";
      }
      Object localObject3 = aal.a(paramCursor, "suggest_intent_data");
      localObject1 = localObject3;
      if (a)
      {
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = this.l.getSuggestIntentData();
        }
      }
      localObject3 = localObject1;
      if (localObject1 != null)
      {
        String str = aal.a(paramCursor, "suggest_intent_data_id");
        localObject3 = localObject1;
        if (str != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = (String)localObject1 + "/" + Uri.encode(str);
        }
      }
      if (localObject3 == null)
      {
        localObject1 = null;
        localObject3 = aal.a(paramCursor, "suggest_intent_query");
        paramString = a((String)localObject2, (Uri)localObject1, aal.a(paramCursor, "suggest_intent_extra_data"), (String)localObject3, paramInt, paramString);
        paramCursor = paramString;
      }
      for (;;)
      {
        return paramCursor;
        localObject1 = Uri.parse((String)localObject3);
        break;
        try
        {
          paramInt = paramCursor.getPosition();
          Log.w("SearchView", "Search suggestions cursor at row " + paramInt + " returned exception.", paramString);
          paramCursor = null;
        }
        catch (RuntimeException paramCursor)
        {
          for (;;)
          {
            paramInt = -1;
          }
        }
      }
    }
    catch (RuntimeException paramString) {}
  }
  
  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null) {
      paramString1.setData(paramUri);
    }
    paramString1.putExtra("user_query", this.E);
    if (paramString3 != null) {
      paramString1.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      paramString1.putExtra("intent_extra_data_key", paramString2);
    }
    if (paramInt != 0)
    {
      paramString1.putExtra("action_key", paramInt);
      paramString1.putExtra("action_msg", paramString4);
    }
    if (a) {
      paramString1.setComponent(this.l.getSearchActivity());
    }
    return paramString1;
  }
  
  private void a(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = a("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(paramString1);
  }
  
  private void a(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (;;)
    {
      return;
      try
      {
        getContext().startActivity(paramIntent);
      }
      catch (RuntimeException localRuntimeException)
      {
        Log.e("SearchView", "Failed launch activity: " + paramIntent, localRuntimeException);
      }
    }
  }
  
  private boolean a(int paramInt)
  {
    Cursor localCursor = this.j.c;
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt))) {
      a(a(localCursor, 0, null));
    }
    d(false);
    this.b.dismissDropDown();
    return true;
  }
  
  private boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this.l == null) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (this.j != null)
      {
        bool1 = bool2;
        if (paramKeyEvent.getAction() == 0)
        {
          bool1 = bool2;
          if (fi.a(paramKeyEvent)) {
            if ((paramInt == 66) || (paramInt == 84) || (paramInt == 61))
            {
              bool1 = a(this.b.getListSelection());
            }
            else
            {
              if ((paramInt == 21) || (paramInt == 22))
              {
                if (paramInt == 21) {}
                for (paramInt = 0;; paramInt = this.b.length())
                {
                  this.b.setSelection(paramInt);
                  this.b.setListSelection(0);
                  this.b.clearListSelection();
                  m.a(this.b, true);
                  bool1 = true;
                  break;
                }
              }
              bool1 = bool2;
              if (paramInt == 19)
              {
                bool1 = bool2;
                if (this.b.getListSelection() == 0) {
                  bool1 = bool2;
                }
              }
            }
          }
        }
      }
    }
  }
  
  static boolean a(Context paramContext)
  {
    if (paramContext.getResources().getConfiguration().orientation == 2) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void c(boolean paramBoolean)
  {
    this.s.setVisibility(8);
  }
  
  private void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      post(this.H);
    }
    for (;;)
    {
      return;
      removeCallbacks(this.H);
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager != null) {
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
      }
    }
  }
  
  private void e(boolean paramBoolean)
  {
    int i1;
    if ((this.k) && (!this.i) && (paramBoolean))
    {
      i1 = 0;
      this.s.setVisibility(8);
    }
    for (;;)
    {
      this.u.setVisibility(i1);
      return;
      i1 = 8;
    }
  }
  
  private int f()
  {
    return getContext().getResources().getDimensionPixelSize(a.ae);
  }
  
  private void g()
  {
    int i3 = 8;
    if ((this.k) && (!this.i)) {}
    for (int i2 = 1;; i2 = 0)
    {
      int i1 = i3;
      if (i2 != 0) {
        if (this.s.getVisibility() != 0)
        {
          i1 = i3;
          if (this.u.getVisibility() != 0) {}
        }
        else
        {
          i1 = 0;
        }
      }
      this.q.setVisibility(i1);
      return;
    }
  }
  
  private void h()
  {
    int i4 = 1;
    int i3 = 0;
    int i1;
    int i2;
    label47:
    label61:
    Drawable localDrawable;
    if (!TextUtils.isEmpty(this.b.getText()))
    {
      i1 = 1;
      i2 = i4;
      if (i1 == 0)
      {
        if ((!this.z) || (this.F)) {
          break label99;
        }
        i2 = i4;
      }
      localObject = this.t;
      if (i2 == 0) {
        break label105;
      }
      i2 = i3;
      ((ImageView)localObject).setVisibility(i2);
      localDrawable = this.t.getDrawable();
      if (localDrawable != null) {
        if (i1 == 0) {
          break label112;
        }
      }
    }
    label99:
    label105:
    label112:
    for (Object localObject = ENABLED_STATE_SET;; localObject = EMPTY_STATE_SET)
    {
      localDrawable.setState((int[])localObject);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label47;
      i2 = 8;
      break label61;
    }
  }
  
  private void i()
  {
    post(this.I);
  }
  
  private void j()
  {
    b(false);
    this.b.requestFocus();
    d(true);
  }
  
  private void k()
  {
    Object localObject2 = m;
    Object localObject1 = this.b;
    if (((aaj)localObject2).a != null) {}
    try
    {
      ((aaj)localObject2).a.invoke(localObject1, new Object[0]);
      localObject1 = m;
      localObject2 = this.b;
      if (((aaj)localObject1).b != null) {}
      try
      {
        ((aaj)localObject1).b.invoke(localObject2, new Object[0]);
        return;
      }
      catch (Exception localException1)
      {
        for (;;) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final void a()
  {
    if (this.F) {}
    for (;;)
    {
      return;
      this.F = true;
      this.G = this.b.getImeOptions();
      this.b.setImeOptions(this.G | 0x2000000);
      this.b.setText("");
      j();
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.b;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i1 = 0;; i1 = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i1);
      return;
    }
  }
  
  public final void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.b.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      this.b.setSelection(this.b.length());
      this.E = paramCharSequence;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.z == paramBoolean) {}
    for (;;)
    {
      return;
      this.z = paramBoolean;
      b(paramBoolean);
      c();
    }
  }
  
  public final void b()
  {
    a("", false);
    clearFocus();
    b(true);
    this.b.setImeOptions(this.G);
    this.F = false;
  }
  
  public void b(boolean paramBoolean)
  {
    boolean bool2 = true;
    int i2 = 8;
    this.i = paramBoolean;
    int i1;
    boolean bool1;
    if (paramBoolean)
    {
      i1 = 0;
      if (TextUtils.isEmpty(this.b.getText())) {
        break label113;
      }
      bool1 = true;
      label34:
      this.r.setVisibility(i1);
      c(bool1);
      Object localObject = this.o;
      if (!paramBoolean) {
        break label119;
      }
      i1 = 8;
      label60:
      ((View)localObject).setVisibility(i1);
      localObject = this.w;
      if (!this.z) {
        break label124;
      }
      i1 = i2;
      label80:
      ((ImageView)localObject).setVisibility(i1);
      h();
      if (bool1) {
        break label129;
      }
    }
    label113:
    label119:
    label124:
    label129:
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      e(paramBoolean);
      g();
      return;
      i1 = 8;
      break;
      bool1 = false;
      break label34;
      i1 = 0;
      break label60;
      i1 = 0;
      break label80;
    }
  }
  
  public void c()
  {
    Object localObject1;
    SearchView.SearchAutoComplete localSearchAutoComplete;
    Object localObject2;
    if (this.A != null)
    {
      localObject1 = this.A;
      localSearchAutoComplete = this.b;
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "";
      }
      localObject1 = localObject2;
      if (this.z)
      {
        if (this.x != null) {
          break label100;
        }
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      localSearchAutoComplete.setHint((CharSequence)localObject1);
      return;
      if ((a) && (this.l != null) && (this.l.getHintId() != 0))
      {
        localObject1 = getContext().getText(this.l.getHintId());
        break;
      }
      localObject1 = this.y;
      break;
      label100:
      int i1 = (int)(this.b.getTextSize() * 1.25D);
      this.x.setBounds(0, 0, i1, i1);
      localObject1 = new SpannableStringBuilder("   ");
      ((SpannableStringBuilder)localObject1).setSpan(new ImageSpan(this.x), 1, 2, 33);
      ((SpannableStringBuilder)localObject1).append((CharSequence)localObject2);
    }
  }
  
  public void clearFocus()
  {
    this.B = true;
    d(false);
    super.clearFocus();
    this.b.clearFocus();
    this.B = false;
  }
  
  final void e()
  {
    b(this.i);
    i();
    if (this.b.hasFocus()) {
      k();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.I);
    post(this.J);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.i)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    switch (i2)
    {
    default: 
      paramInt1 = i1;
    }
    for (;;)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      break;
      if (this.C > 0)
      {
        paramInt1 = Math.min(this.C, i1);
      }
      else
      {
        paramInt1 = Math.min(f(), i1);
        continue;
        paramInt1 = i1;
        if (this.C > 0)
        {
          paramInt1 = Math.min(this.C, i1);
          continue;
          if (this.C > 0) {
            paramInt1 = this.C;
          } else {
            paramInt1 = f();
          }
        }
      }
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    i();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    boolean bool = false;
    if (this.B) {}
    for (;;)
    {
      return bool;
      if (isFocusable()) {
        if (!this.i)
        {
          bool = this.b.requestFocus(paramInt, paramRect);
          if (bool) {
            b(false);
          }
        }
        else
        {
          bool = super.requestFocus(paramInt, paramRect);
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */