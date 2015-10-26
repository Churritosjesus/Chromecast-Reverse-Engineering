import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;

public final class ark
  extends i
{
  private final blp Z = new blp("BackdropPreviewFragment", false);
  private int aa;
  private int ab;
  private DeviceSettingsActivity ac;
  private ari ad;
  private dcd ae;
  private String af;
  private String ag;
  private String ah;
  private dca ai;
  private int aj;
  private TextView ak;
  private TextView al;
  private ImageView am;
  private ViewFlipper an;
  private RecyclerView ao;
  private xq ap;
  private Dialog aq;
  private Integer ar;
  private Integer as;
  
  public static ark a(String paramString1, String paramString2, int paramInt1, Long paramLong, String paramString3, int paramInt2)
  {
    ark localark = new ark();
    Bundle localBundle = new Bundle();
    localBundle.putString("displayId", paramString1);
    localBundle.putString("albumName", paramString2);
    localBundle.putInt("position", paramInt1);
    if (paramLong == null) {}
    for (long l = -1L;; l = paramLong.longValue())
    {
      localBundle.putLong("albumId", l);
      localBundle.putString("photoContainerId", paramString3);
      localBundle.putInt("numPhotos", paramInt2);
      localark.f(localBundle);
      return localark;
    }
  }
  
  private int p()
  {
    return (int)((this.aq.getWindow().getDecorView().getWidth() / 3 - this.aa * 2) * 0.5625F);
  }
  
  public final void a()
  {
    super.a();
    this.ac = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ac = ((DeviceSettingsActivity)paramActivity);
  }
  
  public final void a(dcd paramdcd)
  {
    int i = 1;
    label108:
    ari localari;
    if (e().getConfiguration().orientation == 1) {
      if (this.ar == null)
      {
        if (this.aj == 0)
        {
          this.ab = e().getDimensionPixelSize(a.dX);
          this.ar = Integer.valueOf(Math.min(i, 3) * (p() + (this.ab + this.aa) * 2));
        }
      }
      else
      {
        if (this.as == null) {
          this.as = Integer.valueOf(p());
        }
        this.an.getLayoutParams().height = this.ar.intValue();
        localari = this.ad;
        if (this.as != null) {
          break label182;
        }
      }
    }
    label182:
    for (i = p();; i = this.as.intValue())
    {
      localari.b = paramdcd.a;
      localari.c = i;
      localari.a.a();
      this.an.setDisplayedChild(0);
      return;
      i = (this.aj - 1) / 3 + 1;
      break;
      this.an.getLayoutParams().height = -1;
      break label108;
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.ag = blf.z(this.ac);
    this.ad = new ari(this.ac);
    this.af = this.ac.f;
    this.ah = this.m.getString("displayId");
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.ac);
    Object localObject2 = this.ac.getLayoutInflater().inflate(a.gw, null);
    this.ak = ((TextView)((View)localObject2).findViewById(f.cW));
    this.al = ((TextView)((View)localObject2).findViewById(f.da));
    this.an = ((ViewFlipper)((View)localObject2).findViewById(f.cX));
    this.an.setDisplayedChild(1);
    this.aa = e().getDimensionPixelSize(a.dW);
    this.ao = ((RecyclerView)((View)localObject2).findViewById(f.cY));
    this.ap = new xq(this.ac, 3);
    this.ao.a(this.ad);
    this.ao.a(this.ap);
    this.ao.a(new arl(this));
    this.ao.a(new xe());
    this.am = ((ImageView)((View)localObject2).findViewById(f.cV));
    this.am.setOnClickListener(new arm(this));
    this.ak.setText(this.m.getString("albumName"));
    int i = this.m.getInt("numPhotos");
    Object localObject1;
    if (i <= 100)
    {
      localObject1 = this.ac.getResources().getQuantityString(a.he, i, new Object[] { Integer.valueOf(i) });
      this.al.setText((CharSequence)localObject1);
      this.aq = localBuilder.setView((View)localObject2).create();
      this.aq.setCanceledOnTouchOutside(true);
      this.aq.show();
      this.ai = new dca();
      localObject1 = Long.valueOf(this.m.getLong("albumId"));
      localObject2 = this.ai;
      if (((Long)localObject1).longValue() != -1L) {
        break label563;
      }
      localObject1 = null;
      label392:
      ((dca)localObject2).a = ((String)localObject1);
      this.ai.b = this.m.getString("photoContainerId");
      if (i >= 100) {
        break label571;
      }
    }
    for (;;)
    {
      this.aj = i;
      if (paramBundle != null) {}
      try
      {
        if (paramBundle.containsKey("previewHeight")) {
          this.ar = Integer.valueOf(paramBundle.getInt("previewHeight"));
        }
        if (paramBundle.containsKey("previewResponse")) {
          this.ae = dcd.a(paramBundle.getByteArray("previewResponse"));
        }
        if (paramBundle.containsKey("imageHeight")) {
          this.as = Integer.valueOf(paramBundle.getInt("imageHeight"));
        }
      }
      catch (dev paramBundle)
      {
        for (;;)
        {
          this.Z.a("Error parsing preview bundle: %s", new Object[] { paramBundle });
          continue;
          paramBundle = new aul(this.ag, this.af, this.ah, this.ai, null, this.aj, 0, 0, new arn(this), new aro(this));
          atf.a(this.ac).a(paramBundle);
        }
      }
      if ((this.ar == null) || (this.ae == null)) {
        break label600;
      }
      a(this.ae);
      return this.aq;
      localObject1 = this.ac.getString(b.cP, new Object[] { Integer.valueOf(100), Integer.valueOf(i) });
      break;
      label563:
      localObject1 = String.valueOf(localObject1);
      break label392;
      label571:
      i = 100;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    if (this.ae != null) {
      paramBundle.putByteArray("previewResponse", dcd.a(this.ae));
    }
    if (this.ar != null) {
      paramBundle.putInt("previewHeight", this.ar.intValue());
    }
    if (this.as != null) {
      paramBundle.putInt("imageHeight", this.as.intValue());
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ark.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */