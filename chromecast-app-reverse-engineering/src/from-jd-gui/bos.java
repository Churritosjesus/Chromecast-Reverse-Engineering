import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bos
{
  private static final bfu[] d = { bfu.b, bfu.c, bfu.f, bfu.h };
  public boz a;
  public EditText b;
  public final CheckBox c;
  private final Context e;
  private final Spinner f;
  private final bfs g;
  private final boq h;
  private final View i;
  private final View j;
  private final EditText k;
  private final Spinner l;
  private final View m;
  private String n;
  private int o = -1;
  private final TextWatcher p = new bot(this);
  
  public bos(ViewGroup paramViewGroup)
  {
    this.e = paramViewGroup.getContext();
    this.i = paramViewGroup.findViewById(f.eD);
    this.j = paramViewGroup.findViewById(f.eI);
    this.l = ((Spinner)paramViewGroup.findViewById(f.eH));
    this.k = ((EditText)paramViewGroup.findViewById(f.eC));
    this.i.setVisibility(8);
    this.j.setVisibility(8);
    this.k.addTextChangedListener(this.p);
    ArrayAdapter localArrayAdapter = ArrayAdapter.createFromResource(this.e, a.di, a.gJ);
    localArrayAdapter.setDropDownViewResource(a.gL);
    this.l.setAdapter(localArrayAdapter);
    this.m = paramViewGroup.findViewById(f.eG);
    this.b = ((EditText)paramViewGroup.findViewById(f.eE));
    this.b.addTextChangedListener(this.p);
    this.c = ((CheckBox)paramViewGroup.findViewById(f.eF));
    a(this.c.isChecked());
    this.g = b(this.e.getString(b.ek));
    this.m.setVisibility(8);
    this.b.addTextChangedListener(this.p);
    this.c.setOnCheckedChangeListener(new boy(this));
    this.l.setOnItemSelectedListener(new bou(this));
    this.j.setOnClickListener(new bov(this));
    paramViewGroup.findViewById(f.ci).setOnClickListener(new bow(this));
    this.f = ((Spinner)paramViewGroup.findViewById(f.ch));
    this.h = new boq(this.e);
    this.h.setDropDownViewResource(a.gL);
    this.f.setAdapter(this.h);
    this.f.setOnItemSelectedListener(new box(this));
  }
  
  private void a(boolean paramBoolean)
  {
    int i3 = this.b.getSelectionStart();
    int i2 = this.b.getSelectionEnd();
    EditText localEditText = this.b;
    Object localObject;
    if (paramBoolean)
    {
      localObject = SingleLineTransformationMethod.getInstance();
      localEditText.setTransformationMethod((TransformationMethod)localObject);
      localObject = this.b;
      if (!paramBoolean) {
        break label83;
      }
    }
    label83:
    for (int i1 = 145;; i1 = 129)
    {
      ((EditText)localObject).setInputType(i1);
      this.b.setSelection(i3, i2);
      this.b.setHint(null);
      return;
      localObject = PasswordTransformationMethod.getInstance();
      break;
    }
  }
  
  private static bfs b(String paramString)
  {
    bfs localbfs = new bfs();
    localbfs.a = paramString;
    localbfs.b = bfu.a;
    localbfs.g = true;
    return localbfs;
  }
  
  private void b()
  {
    int i2 = 1;
    int i4 = 0;
    Object localObject = (bfs)this.f.getSelectedItem();
    int i1;
    if (localObject == this.g)
    {
      if (!d[this.l.getSelectedItemPosition()].k) {
        break label142;
      }
      i1 = 1;
    }
    for (;;)
    {
      localObject = this.i;
      int i3;
      if (i2 != 0)
      {
        i3 = 0;
        label55:
        ((View)localObject).setVisibility(i3);
        localObject = this.j;
        if (i2 == 0) {
          break label123;
        }
        i2 = 0;
        label72:
        ((View)localObject).setVisibility(i2);
        localObject = this.m;
        if (i1 == 0) {
          break label129;
        }
      }
      label123:
      label129:
      for (i1 = i4;; i1 = 8)
      {
        ((View)localObject).setVisibility(i1);
        return;
        if ((localObject == null) || (!((bfs)localObject).b.k)) {
          break label135;
        }
        i1 = 1;
        i2 = 0;
        break;
        i3 = 8;
        break label55;
        i2 = 8;
        break label72;
      }
      label135:
      i1 = 0;
      i2 = 0;
      continue;
      label142:
      i1 = 0;
    }
  }
  
  public final bfs a()
  {
    bfs localbfs1 = (bfs)this.f.getSelectedItem();
    bfs localbfs2;
    if (localbfs1 == null)
    {
      localbfs2 = null;
      return localbfs2;
    }
    if (localbfs1 == this.g) {
      localbfs1 = b(this.k.getText().toString().trim());
    }
    for (;;)
    {
      if (localbfs1.b == bfu.a) {
        localbfs1.b = d[this.l.getSelectedItemPosition()];
      }
      localbfs2 = localbfs1;
      if (!localbfs1.b.k) {
        break;
      }
      localbfs1.e = this.b.getText().toString();
      localbfs2 = localbfs1;
      break;
      localbfs1 = new bfs(localbfs1);
      localbfs1.i = null;
    }
  }
  
  public final void a(String paramString)
  {
    this.n = paramString;
    this.b.setHint(paramString);
  }
  
  public final void a(List paramList, String paramString, bfu parambfu, boolean paramBoolean)
  {
    int i3 = 0;
    Object localObject1 = (bfs)this.f.getSelectedItem();
    if (localObject1 != null) {
      paramString = ((bfs)localObject1).a;
    }
    this.h.clear();
    Object localObject2 = blr.a(this.e, this.e.getResources().getStringArray(a.dh));
    bfs localbfs1;
    int i1;
    int i2;
    if (paramList != null)
    {
      localObject1 = paramList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localbfs1 = (bfs)((Iterator)localObject1).next();
        Object localObject3 = localbfs1.a;
        if ((((Set)localObject2).contains(localObject3)) || (TextUtils.equals(paramString, (CharSequence)localObject3)))
        {
          localObject3 = this.h;
          for (i1 = 0; i1 < ((boq)localObject3).getCount(); i1++)
          {
            bfs localbfs2 = (bfs)((boq)localObject3).getItem(i1);
            i2 = WifiManager.compareSignalLevel(localbfs2.h, localbfs1.h);
            if ((i2 < 0) || ((i2 == 0) && (localbfs2.a.compareToIgnoreCase(localbfs1.a) > 0))) {
              break;
            }
          }
          ((boq)localObject3).insert(localbfs1, i1);
        }
      }
    }
    this.h.add(this.g);
    this.o = -1;
    int i4;
    if (!TextUtils.isEmpty(paramString))
    {
      this.o = this.h.a(paramString);
      if (this.o == -1)
      {
        localObject1 = paramList.iterator();
        paramList = null;
        i1 = 0;
        if (((Iterator)localObject1).hasNext())
        {
          localbfs1 = (bfs)((Iterator)localObject1).next();
          localObject2 = localbfs1.a;
          i4 = Math.min(paramString.length(), ((String)localObject2).length());
          i2 = 0;
          label309:
          if (i2 < i4) {
            if (paramString.charAt(i2) != ((String)localObject2).charAt(i2))
            {
              label332:
              if (i2 <= i1) {
                break label483;
              }
              paramList = localbfs1.a;
              i1 = i2;
            }
          }
        }
      }
    }
    label401:
    label450:
    label456:
    label483:
    for (;;)
    {
      break;
      i2++;
      break label309;
      i2 = i4;
      break label332;
      if (i1 >= 5)
      {
        if (!paramBoolean) {
          break label456;
        }
        this.o = (this.h.getCount() - 1);
        this.k.setText(paramString);
        i1 = i3;
        if (i1 < d.length)
        {
          if (d[i1] != parambfu) {
            break label450;
          }
          this.l.setSelection(i1);
        }
      }
      for (;;)
      {
        this.f.setSelection(this.o);
        b();
        return;
        paramList = null;
        break;
        i1++;
        break label401;
        if (paramList != null) {
          this.o = this.h.a(paramList);
        } else {
          this.o = 0;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */