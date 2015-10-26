import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public final class oi
  extends Dialog
{
  public boolean a;
  public boolean b = true;
  private final tz c;
  private final on d;
  private final uh e;
  private boolean f;
  private View g;
  private Button h;
  private Button i;
  private ImageButton j;
  private ImageButton k;
  private ImageView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private View p;
  private LinearLayout q;
  private SeekBar r;
  private boolean s;
  private ct t;
  private om u;
  private dq v;
  private cf w;
  
  public oi(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  private oi(Context paramContext, int paramInt)
  {
    super(a.a(paramContext), 0);
    paramContext = getContext();
    this.u = new om(this);
    this.c = tz.a(paramContext);
    this.d = new on(this);
    this.e = tz.d();
    a(tz.e());
  }
  
  private void a(dm paramdm)
  {
    Object localObject1 = null;
    if (this.t != null)
    {
      this.t.a(this.u);
      this.t = null;
    }
    if (paramdm == null) {
      return;
    }
    if (this.f)
    {
      try
      {
        localObject2 = new ct;
        ((ct)localObject2).<init>(getContext(), paramdm);
        this.t = ((ct)localObject2);
        if (this.t != null)
        {
          paramdm = this.t;
          localom = this.u;
          if (localom == null) {
            throw new IllegalArgumentException("callback cannot be null");
          }
        }
      }
      catch (RemoteException paramdm)
      {
        om localom;
        for (;;)
        {
          Log.e("MediaRouteControllerDialog", "Error creating media controller in setMediaSession.", paramdm);
        }
        Object localObject2 = new Handler();
        paramdm.a.a(localom, (Handler)localObject2);
      }
      if (this.t != null) {
        break label163;
      }
      paramdm = null;
      label130:
      if (paramdm != null) {
        break label179;
      }
      paramdm = null;
      label136:
      this.w = paramdm;
      if (this.t != null) {
        break label187;
      }
    }
    label163:
    label179:
    label187:
    for (paramdm = (dm)localObject1;; paramdm = this.t.a.b())
    {
      this.v = paramdm;
      b();
      break;
      break;
      paramdm = this.t.a.c();
      break label130;
      paramdm = paramdm.a();
      break label136;
    }
  }
  
  private boolean b()
  {
    boolean bool = false;
    if ((!this.e.a()) || (this.e.b())) {
      dismiss();
    }
    while (!this.a) {
      return bool;
    }
    a();
    this.o.setText(this.e.c);
    label73:
    label91:
    label137:
    int i1;
    label162:
    label191:
    label204:
    label236:
    int i2;
    label254:
    int i3;
    if (this.e.g)
    {
      this.h.setVisibility(0);
      if (this.e.n == null) {
        break label345;
      }
      this.k.setVisibility(0);
      if (this.g == null)
      {
        if (this.w == null) {
          break label465;
        }
        if (this.w.c == null) {
          break label357;
        }
        this.l.setImageBitmap(this.w.c);
        this.l.setVisibility(0);
        CharSequence localCharSequence = this.w.a;
        if (TextUtils.isEmpty(localCharSequence)) {
          break label412;
        }
        this.m.setText(localCharSequence);
        i1 = 1;
        if (TextUtils.isEmpty(this.w.b)) {
          break label434;
        }
        this.n.setText(this.w.b);
        i1 = 1;
        if (i1 != 0) {
          break label454;
        }
        this.p.setVisibility(8);
        if (this.v == null) {
          break label570;
        }
        if ((this.v.a != 6) && (this.v.a != 3)) {
          break label486;
        }
        i1 = 1;
        if ((this.v.b & 0x204) == 0L) {
          break label491;
        }
        i2 = 1;
        if ((this.v.b & 0x202) == 0L) {
          break label496;
        }
        i3 = 1;
        label273:
        if ((i1 == 0) || (i3 == 0)) {
          break label502;
        }
        this.j.setVisibility(0);
        this.j.setImageResource(a.a(getContext(), a.ci));
        this.j.setContentDescription(getContext().getResources().getText(a.co));
      }
    }
    for (;;)
    {
      bool = true;
      break;
      this.h.setVisibility(8);
      break label73;
      label345:
      this.k.setVisibility(8);
      break label91;
      label357:
      if (this.w.d != null)
      {
        this.l.setImageURI(this.w.d);
        this.l.setVisibility(0);
        break label137;
      }
      this.l.setImageDrawable(null);
      this.l.setVisibility(8);
      break label137;
      label412:
      this.m.setText(null);
      this.m.setVisibility(8);
      i1 = 0;
      break label162;
      label434:
      this.n.setText(null);
      this.n.setVisibility(8);
      break label191;
      label454:
      this.p.setVisibility(0);
      break label204;
      label465:
      this.l.setVisibility(8);
      this.p.setVisibility(8);
      break label204;
      label486:
      i1 = 0;
      break label236;
      label491:
      i2 = 0;
      break label254;
      label496:
      i3 = 0;
      break label273;
      label502:
      if ((i1 == 0) && (i2 != 0))
      {
        this.j.setVisibility(0);
        this.j.setImageResource(a.a(getContext(), a.cj));
        this.j.setContentDescription(getContext().getResources().getText(a.cp));
      }
      else
      {
        this.j.setVisibility(8);
        continue;
        label570:
        this.j.setVisibility(8);
      }
    }
  }
  
  public void a()
  {
    int i1 = 1;
    if (!this.s)
    {
      if ((!this.b) || (this.e.j != 1)) {
        break label68;
      }
      if (i1 == 0) {
        break label73;
      }
      this.q.setVisibility(0);
      this.r.setMax(this.e.l);
      this.r.setProgress(this.e.k);
    }
    for (;;)
    {
      return;
      label68:
      i1 = 0;
      break;
      label73:
      this.q.setVisibility(8);
    }
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.f = true;
    this.c.a(tx.c, this.d, 2);
    a(tz.e());
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().requestFeature(1);
    setContentView(a.cl);
    paramBundle = new ol(this);
    this.h = ((Button)findViewById(b.n));
    this.h.setOnClickListener(paramBundle);
    this.i = ((Button)findViewById(b.v));
    this.i.setOnClickListener(paramBundle);
    this.k = ((ImageButton)findViewById(b.u));
    this.k.setOnClickListener(paramBundle);
    this.l = ((ImageView)findViewById(b.l));
    this.m = ((TextView)findViewById(b.y));
    this.n = ((TextView)findViewById(b.w));
    this.p = findViewById(b.x);
    this.j = ((ImageButton)findViewById(b.s));
    this.j.setOnClickListener(paramBundle);
    this.o = ((TextView)findViewById(b.t));
    this.q = ((LinearLayout)findViewById(b.q));
    this.r = ((SeekBar)findViewById(b.r));
    this.r.setOnSeekBarChangeListener(new oj(this));
    this.a = true;
    if (b())
    {
      this.g = null;
      paramBundle = (FrameLayout)findViewById(b.o);
      if (this.g != null)
      {
        paramBundle.findViewById(b.m).setVisibility(8);
        paramBundle.addView(this.g);
      }
    }
  }
  
  public final void onDetachedFromWindow()
  {
    this.c.a(this.d);
    a(null);
    this.f = false;
    super.onDetachedFromWindow();
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramInt == 25) || (paramInt == 24))
    {
      paramKeyEvent = this.e;
      if (paramInt == 25)
      {
        paramInt = -1;
        paramKeyEvent.b(paramInt);
      }
    }
    for (;;)
    {
      return bool;
      paramInt = 1;
      break;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 25) || (paramInt == 24)) {}
    for (boolean bool = true;; bool = super.onKeyUp(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\oi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */