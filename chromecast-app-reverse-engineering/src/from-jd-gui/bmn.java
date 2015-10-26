import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.ArrayList;

public final class bmn
  extends i
  implements als, alu
{
  private aow Z;
  private SeekBar aa;
  private TextView ab;
  private TextView ac;
  private ImageButton ad;
  private blp ae = new blp("RemoteControlDialogFragment", false);
  
  public static bmn a(String paramString)
  {
    bmn localbmn = new bmn();
    Bundle localBundle = new Bundle();
    localBundle.putString("deviceKey", paramString);
    localbmn.f(localBundle);
    return localbmn;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.Z == null) {
      paramLayoutInflater = null;
    }
    for (;;)
    {
      return paramLayoutInflater;
      paramLayoutInflater = paramLayoutInflater.inflate(a.fS, paramViewGroup);
      ((TextView)paramLayoutInflater.findViewById(f.aF)).setText(this.Z.g());
      this.ab = ((TextView)paramLayoutInflater.findViewById(f.em));
      this.ac = ((TextView)paramLayoutInflater.findViewById(f.t));
      paramLayoutInflater.findViewById(f.Z).setOnClickListener(new bmo(this));
      paramLayoutInflater.findViewById(f.eb).setOnClickListener(new bmp(this));
      this.ad = ((ImageButton)paramLayoutInflater.findViewById(f.cQ));
      this.ad.setOnClickListener(new bmq(this));
      this.aa = ((SeekBar)paramLayoutInflater.findViewById(f.W));
      this.aa.setMax(100);
      this.aa.setOnSeekBarChangeListener(new bmr(this));
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = SetupApplication.a().b().c(this.m.getString("deviceKey"));
    if (this.Z == null) {
      a(false);
    }
    this.a = 1;
    if ((this.a == 2) || (this.a == 3)) {
      this.b = 16973913;
    }
  }
  
  public final void a(aow paramaow)
  {
    if ((TextUtils.isEmpty(paramaow.o)) || (paramaow.d()) || (paramaow.e()))
    {
      a(false);
      return;
    }
    paramaow = paramaow.o();
    Object localObject = paramaow.f;
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      this.ab.setText(b.bX);
    }
    for (;;)
    {
      blx.a(this.ac, paramaow.g);
      paramaow = paramaow.d;
      if (paramaow == null) {
        break;
      }
      if (paramaow.a()) {
        break label136;
      }
      this.ad.setVisibility(8);
      i = (int)(paramaow.b * 100.0D);
      if (i == this.aa.getProgress()) {
        break;
      }
      this.aa.setProgress(i);
      break;
      this.ab.setText((CharSequence)localObject);
    }
    label136:
    this.ad.setVisibility(0);
    localObject = this.ad;
    if (paramaow.b()) {}
    for (int i = a.eK;; i = a.eI)
    {
      ((ImageButton)localObject).setImageResource(i);
      break;
    }
  }
  
  public final void b(aow paramaow)
  {
    paramaow = paramaow.o().d;
    if (paramaow != null)
    {
      int i = (int)(paramaow.b * 100.0D);
      if (i != this.aa.getProgress()) {
        this.aa.setProgress(i);
      }
    }
  }
  
  public final void j()
  {
    super.j();
    if (this.Z != null)
    {
      a(this.Z);
      this.Z.a(this);
      this.Z.i.add(this);
    }
  }
  
  public final void k()
  {
    super.k();
    if (this.Z != null)
    {
      this.Z.h.remove(this);
      this.Z.i.remove(this);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */