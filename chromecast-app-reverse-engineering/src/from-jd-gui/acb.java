import android.app.Activity;
import android.app.DialogFragment;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.text.method.QwertyKeyListener;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView.Validator;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView.Tokenizer;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class acb
  extends MultiAutoCompleteTextView
  implements abo, abp, abz, ActionMode.Callback, GestureDetector.OnGestureListener, AdapterView.OnItemClickListener, TextView.OnEditorActionListener
{
  private static final String d;
  private static final Pattern e;
  private static final int f;
  private abj A;
  private View B = this;
  private ListPopupWindow C;
  private ListPopupWindow D;
  private AdapterView.OnItemClickListener E;
  private ada F;
  private Bitmap G;
  private adc H;
  private TextView I;
  private int J;
  private ArrayList K = new ArrayList();
  private int L = 0;
  private int M;
  private boolean N = false;
  private boolean O = false;
  private ArrayList P;
  private ArrayList Q;
  private GestureDetector R;
  private boolean S;
  private boolean T = false;
  private boolean U;
  private final Runnable V = new acc(this);
  private acp W;
  final int[] a = new int[2];
  private Runnable aa = new acf(this);
  private Runnable ab = new acg(this);
  boolean b = true;
  ScrollView c;
  private int g;
  private int h;
  private final Rect i = new Rect();
  private Drawable j = null;
  private Drawable k = null;
  private Drawable l;
  private float m;
  private float n;
  private float o;
  private int p;
  private int q;
  private final int r;
  private boolean s;
  private int t;
  private int u;
  private Paint v = new Paint();
  private MultiAutoCompleteTextView.Tokenizer w;
  private AutoCompleteTextView.Validator x;
  private Handler y;
  private TextWatcher z;
  
  static
  {
    String str2 = String.valueOf(",");
    String str1 = String.valueOf(" ");
    if (str1.length() != 0) {}
    for (str1 = str2.concat(str1);; str1 = new String(str2))
    {
      d = str1;
      e = Pattern.compile("(\\+[0-9]+[\\- \\.]*)?(1?[ ]*\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.][0-9\\- \\.]+[0-9])");
      f = "dismiss".hashCode();
      return;
    }
  }
  
  public acb(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, abx.a, 0, 0);
    paramAttributeSet = getContext().getResources();
    this.j = localTypedArray.getDrawable(abx.c);
    this.l = localTypedArray.getDrawable(abx.i);
    this.k = localTypedArray.getDrawable(abx.d);
    if (this.k == null) {
      this.k = paramAttributeSet.getDrawable(a.cE);
    }
    int i1 = localTypedArray.getDimensionPixelSize(abx.g, -1);
    this.q = i1;
    this.p = i1;
    if (this.p == -1)
    {
      i1 = (int)paramAttributeSet.getDimension(a.cy);
      this.q = i1;
      this.p = i1;
    }
    i1 = (int)paramAttributeSet.getDimension(a.cA);
    if (i1 >= 0) {
      this.p = i1;
    }
    i1 = (int)paramAttributeSet.getDimension(a.cz);
    if (i1 >= 0) {
      this.q = i1;
    }
    this.G = BitmapFactory.decodeResource(paramAttributeSet, a.cF);
    this.I = ((TextView)LayoutInflater.from(getContext()).inflate(a.cP, null));
    this.m = localTypedArray.getDimensionPixelSize(abx.f, -1);
    if (this.m == -1.0F) {
      this.m = paramAttributeSet.getDimension(a.cx);
    }
    this.n = localTypedArray.getDimensionPixelSize(abx.e, -1);
    if (this.n == -1.0F) {
      this.n = paramAttributeSet.getDimension(a.cB);
    }
    this.u = localTypedArray.getInt(abx.b, 1);
    this.s = localTypedArray.getBoolean(abx.h, false);
    this.t = paramAttributeSet.getInteger(a.cM);
    this.o = paramAttributeSet.getDimensionPixelOffset(a.cD);
    this.g = localTypedArray.getColor(abx.k, paramAttributeSet.getColor(17170444));
    this.h = localTypedArray.getColor(abx.j, paramAttributeSet.getColor(a.cu));
    localTypedArray.recycle();
    paramAttributeSet = getPaint();
    this.i.setEmpty();
    paramAttributeSet.getTextBounds("a", 0, 1, this.i);
    this.i.left = 0;
    this.i.right = 0;
    this.r = this.i.height();
    this.C = new ListPopupWindow(paramContext);
    a(this.C);
    this.D = new ListPopupWindow(paramContext);
    a(this.D);
    this.E = new ach(this);
    setInputType(getInputType() | 0x80000);
    setOnItemClickListener(this);
    setCustomSelectionActionModeCallback(this);
    this.y = new aci(this);
    this.z = new acw(this);
    addTextChangedListener(this.z);
    this.R = new GestureDetector(paramContext, this);
    setOnEditorActionListener(this);
    this.A = new abj(LayoutInflater.from(paramContext), paramContext);
    this.A.a = this;
    this.A.b = this;
  }
  
  private int a(float paramFloat1, float paramFloat2)
  {
    int i1;
    if (Build.VERSION.SDK_INT >= 14) {
      i1 = getOffsetForPosition(paramFloat1, paramFloat2);
    }
    Editable localEditable;
    int i2;
    for (;;)
    {
      localEditable = getText();
      i2 = localEditable.length();
      for (i3 = i2 - 1; (i3 >= 0) && (localEditable.charAt(i3) == ' '); i3--) {
        i2--;
      }
      if (getLayout() == null)
      {
        i1 = -1;
      }
      else
      {
        paramFloat2 = Math.max(0.0F, paramFloat2 - getTotalPaddingLeft());
        float f1 = Math.min(getHeight() - getTotalPaddingBottom() - 1, paramFloat2);
        paramFloat2 = getScrollY();
        i1 = getLayout().getLineForVertical((int)(f1 + paramFloat2));
        paramFloat1 = Math.max(0.0F, paramFloat1 - getTotalPaddingLeft());
        paramFloat2 = Math.min(getWidth() - getTotalPaddingRight() - 1, paramFloat1);
        paramFloat1 = getScrollX();
        i1 = getLayout().getOffsetForHorizontal(i1, paramFloat2 + paramFloat1);
      }
    }
    int i3 = i1;
    if (i1 < i2)
    {
      localEditable = getText();
      i3 = i1;
      if (i1 >= 0)
      {
        if (localEditable.charAt(i1) != ' ') {}
        for (i2 = i1;; i2 = -1)
        {
          i3 = i1;
          if (i2 != -1) {
            break label257;
          }
          i3 = i1;
          if (c(i1) != null) {
            break label257;
          }
          i1--;
          break;
        }
      }
    }
    label257:
    return i3;
  }
  
  private void a(aco paramaco, Bitmap paramBitmap)
  {
    Canvas localCanvas = new Canvas(paramaco.a);
    RectF localRectF1 = new RectF(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF localRectF2 = new RectF(paramaco.c, paramaco.d, paramaco.e, paramaco.f);
    paramaco = new Matrix();
    paramBitmap = new BitmapShader(paramBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    paramaco.reset();
    paramaco.setRectToRect(localRectF1, localRectF2, Matrix.ScaleToFit.FILL);
    paramBitmap.setLocalMatrix(paramaco);
    this.v.reset();
    this.v.setShader(paramBitmap);
    this.v.setAntiAlias(true);
    this.v.setFilterBitmap(true);
    this.v.setDither(true);
    localCanvas.drawCircle(localRectF2.centerX(), localRectF2.centerY(), localRectF2.width() / 2.0F, this.v);
    this.v.reset();
    this.v.setColor(0);
    this.v.setStyle(Paint.Style.STROKE);
    this.v.setStrokeWidth(1.0F);
    this.v.setAntiAlias(true);
    localCanvas.drawCircle(localRectF2.centerX(), localRectF2.centerY(), localRectF2.width() / 2.0F - 0.5F, this.v);
    this.v.reset();
  }
  
  private void a(ClipData paramClipData)
  {
    if (paramClipData == null) {
      return;
    }
    Object localObject1 = paramClipData.getDescription();
    int i1;
    label33:
    int i3;
    label54:
    label93:
    Object localObject2;
    int i2;
    label152:
    int i5;
    String str1;
    label210:
    int i4;
    if ((((ClipDescription)localObject1).hasMimeType("text/plain")) || (((ClipDescription)localObject1).hasMimeType("text/html")))
    {
      i1 = 1;
      if (i1 == 0) {
        break label357;
      }
      removeTextChangedListener(this.z);
      ClipDescription localClipDescription = paramClipData.getDescription();
      i3 = 0;
      if (i3 >= paramClipData.getItemCount()) {
        break label490;
      }
      localObject1 = localClipDescription.getMimeType(i3);
      if ((!"text/plain".equals(localObject1)) && (!"text/html".equals(localObject1))) {
        break label359;
      }
      i1 = 1;
      if (i1 == 0) {
        break label484;
      }
      localObject1 = paramClipData.getItemAt(i3).getText();
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label484;
      }
      localObject2 = getText();
      i2 = getSelectionStart();
      i1 = getSelectionEnd();
      if ((i2 >= 0) && (i1 > 0)) {
        break label365;
      }
      ((Editable)localObject2).append((CharSequence)localObject1);
      String str2 = getText().toString();
      i5 = this.w.findTokenStart(str2, getSelectionEnd());
      str1 = str2.substring(i5);
      localObject1 = null;
      localObject2 = new ArrayList();
      if (i5 == 0) {
        break label402;
      }
      i2 = 0;
      i1 = i5;
      if ((i1 == 0) || (localObject1 != null) || (i1 == i2)) {
        break label523;
      }
      i4 = this.w.findTokenStart(str2, i1);
      localObject1 = c(i4);
      if ((i4 != i5) || (localObject1 != null)) {
        break label512;
      }
      i2 = i1;
      i1 = i4;
    }
    label357:
    label359:
    label365:
    label402:
    label484:
    label490:
    label505:
    label512:
    label523:
    for (;;)
    {
      if (i1 != i5) {
        if (localObject1 == null) {
          break label505;
        }
      }
      for (;;)
      {
        if (i2 < i5)
        {
          a(i2, f(this.w.findTokenEnd(getText().toString(), i2)), getText());
          localObject1 = c(i2);
          if (localObject1 != null)
          {
            i2 = getText().getSpanEnd(localObject1) + 1;
            ((ArrayList)localObject2).add(localObject1);
            continue;
            i1 = 0;
            break label33;
            break;
            i1 = 0;
            break label93;
            if (i2 == i1)
            {
              ((Editable)localObject2).insert(i2, (CharSequence)localObject1);
              break label152;
            }
            ((Editable)localObject2).append((CharSequence)localObject1, i2, i1);
            break label152;
          }
        }
        if (b(str1))
        {
          localObject1 = getText();
          i1 = localObject1.toString().indexOf(str1, i5);
          a(i1, ((Editable)localObject1).length(), (Editable)localObject1);
          ((ArrayList)localObject2).add(c(i1));
        }
        if (((ArrayList)localObject2).size() > 0) {
          new acp(this).execute(new ArrayList[] { localObject2 });
        }
        i3++;
        break label54;
        this.y.post(this.V);
        break;
        i2 = i1;
      }
      i2 = i1;
      i1 = i4;
      break label210;
    }
  }
  
  private void a(ListPopupWindow paramListPopupWindow)
  {
    paramListPopupWindow.setOnDismissListener(new acj(this));
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    if ((!this.N) && (hasFocus()) && (enoughToFilter()) && (!b(paramInt1, paramInt2))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, Editable paramEditable)
  {
    Object localObject = (aav)super.getAdapter();
    boolean bool;
    if ((localObject != null) && (((ListAdapter)localObject).getCount() > 0) && (enoughToFilter()) && (paramInt2 == getSelectionEnd()) && (!f())) {
      if (!e(paramEditable.toString().substring(paramInt1, paramInt2).trim()))
      {
        paramInt1 = getListSelection();
        if (paramInt1 == -1) {
          d(0);
        }
      }
      else
      {
        dismissDropDown();
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      d(paramInt1);
      break;
      int i2 = this.w.findTokenEnd(paramEditable, paramInt1);
      int i1 = i2;
      if (paramEditable.length() > i2 + 1)
      {
        int i3 = paramEditable.charAt(i2 + 1);
        if (i3 != 44)
        {
          i1 = i2;
          if (i3 != 59) {}
        }
        else
        {
          i1 = i2 + 1;
        }
      }
      localObject = paramEditable.toString().substring(paramInt1, i1).trim();
      clearComposingText();
      if ((((String)localObject).length() > 0) && (!((String)localObject).equals(" ")))
      {
        localObject = c((String)localObject);
        if (localObject != null)
        {
          QwertyKeyListener.markAsReplaced(paramEditable, paramInt1, paramInt2, "");
          localObject = d((acx)localObject);
          if ((localObject != null) && (paramInt1 >= 0) && (paramInt2 >= 0)) {
            paramEditable.replace(paramInt1, paramInt2, (CharSequence)localObject);
          }
        }
        if (paramInt2 == getSelectionEnd()) {
          dismissDropDown();
        }
        o();
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }
  
  private int b(int paramInt)
  {
    return -(int)((this.m + 2.0F * this.o) * Math.abs(getLineCount() - paramInt) + getPaddingBottom());
  }
  
  private int b(ada paramada)
  {
    return getText().getSpanStart(paramada);
  }
  
  private boolean b(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (this.N) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      ada[] arrayOfada = (ada[])getText().getSpans(paramInt1, paramInt2, ada.class);
      if ((arrayOfada != null) && (arrayOfada.length > 0)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private boolean b(CharSequence paramCharSequence)
  {
    boolean bool2 = false;
    boolean bool1;
    if (TextUtils.isEmpty(paramCharSequence)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      int i2 = paramCharSequence.length();
      int i1 = this.w.findTokenStart(paramCharSequence, i2);
      paramCharSequence = paramCharSequence.toString().substring(i1, i2).trim();
      bool1 = bool2;
      if (!TextUtils.isEmpty(paramCharSequence))
      {
        i1 = paramCharSequence.charAt(paramCharSequence.length() - 1);
        if (i1 != 44)
        {
          bool1 = bool2;
          if (i1 != 59) {}
        }
        else
        {
          bool1 = true;
        }
      }
    }
  }
  
  private static boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (boolean bool = false;; bool = e.matcher(paramString).matches()) {
      return bool;
    }
  }
  
  private int c(ada paramada)
  {
    return getText().getSpanEnd(paramada);
  }
  
  private acx c(String paramString)
  {
    boolean bool3 = true;
    Object localObject1 = null;
    if (TextUtils.isEmpty(paramString)) {
      paramString = (String)localObject1;
    }
    Object localObject2;
    boolean bool2;
    for (;;)
    {
      return paramString;
      if ((f()) && (b(paramString)))
      {
        paramString = acx.b(paramString, true);
      }
      else
      {
        localObject2 = Rfc822Tokenizer.tokenize(paramString);
        bool2 = d(paramString);
        if ((!bool2) || (localObject2 == null) || (localObject2.length <= 0)) {
          break;
        }
        localObject1 = localObject2[0].getName();
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          paramString = acx.a((String)localObject1, localObject2[0].getAddress(), bool2);
        }
        else
        {
          localObject1 = localObject2[0].getAddress();
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break;
          }
          paramString = acx.a((String)localObject1, bool2);
        }
      }
    }
    boolean bool1;
    if ((this.x != null) && (!bool2))
    {
      localObject2 = this.x.fixText(paramString).toString();
      localObject1 = localObject2;
      bool1 = bool2;
      if (!TextUtils.isEmpty((CharSequence)localObject2))
      {
        if (!((String)localObject2).contains(paramString)) {
          break label208;
        }
        localObject1 = Rfc822Tokenizer.tokenize((CharSequence)localObject2);
        if (localObject1.length <= 0) {
          break label219;
        }
        localObject1 = localObject1[0].getAddress();
        bool1 = bool3;
      }
    }
    for (;;)
    {
      label189:
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramString = (String)localObject1;
      }
      for (;;)
      {
        paramString = acx.a(paramString, bool1);
        break;
        label208:
        localObject1 = null;
        bool1 = false;
        break label189;
      }
      label219:
      bool1 = bool2;
      localObject1 = localObject2;
      continue;
      localObject1 = null;
      bool1 = bool2;
    }
  }
  
  private ada c(int paramInt)
  {
    Editable localEditable = getText();
    ada[] arrayOfada = (ada[])localEditable.getSpans(0, localEditable.length(), ada.class);
    int i2 = arrayOfada.length;
    int i1 = 0;
    if (i1 < i2)
    {
      localEditable = arrayOfada[i1];
      int i4 = b(localEditable);
      int i3 = c(localEditable);
      if ((paramInt < i4) || (paramInt > i3)) {}
    }
    for (;;)
    {
      return localEditable;
      i1++;
      break;
      localEditable = null;
    }
  }
  
  private ada c(acx paramacx)
  {
    TextPaint localTextPaint = getPaint();
    float f1 = localTextPaint.getTextSize();
    int i4 = localTextPaint.getColor();
    int i1;
    Object localObject2;
    label52:
    int i2;
    label65:
    aco localaco;
    Rect localRect;
    int i5;
    label126:
    Object localObject3;
    Object localObject1;
    label186:
    float f2;
    int i6;
    int i3;
    label327:
    label415:
    label436:
    label527:
    long l1;
    if (paramacx.k)
    {
      i1 = this.g;
      localTextPaint.setColor(i1);
      if (!paramacx.k) {
        break label743;
      }
      localObject2 = this.j;
      if (!paramacx.k) {
        break label752;
      }
      i2 = this.h;
      localaco = new aco();
      localRect = new Rect();
      if (localObject2 != null) {
        ((Drawable)localObject2).getPadding(localRect);
      }
      i5 = (int)this.m;
      if (!paramacx.k) {
        break label767;
      }
      i1 = i5 - localRect.top - localRect.bottom;
      float[] arrayOfFloat = new float[1];
      localTextPaint.getTextWidths(" ", arrayOfFloat);
      String str = paramacx.c;
      localObject3 = paramacx.d;
      if (!TextUtils.isEmpty(str))
      {
        localObject1 = str;
        if (!TextUtils.equals(str, (CharSequence)localObject3)) {}
      }
      else
      {
        localObject1 = null;
      }
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label773;
      }
      f2 = getWidth() - getPaddingLeft() - getPaddingRight() - this.p - this.q - i1 - arrayOfFloat[0] - localRect.left - localRect.right - 0;
      localTextPaint.setTextSize(this.n);
      if ((f2 <= 0.0F) && (Log.isLoggable("RecipientEditTextView", 3))) {
        new StringBuilder(38).append("Max width is negative: ").append(f2);
      }
      localObject3 = TextUtils.ellipsize((CharSequence)localObject1, localTextPaint, f2, TextUtils.TruncateAt.END);
      i6 = (int)localTextPaint.measureText((CharSequence)localObject3, 0, ((CharSequence)localObject3).length());
      if (!paramacx.k) {
        break label808;
      }
      i3 = this.p;
      i3 = Math.max(i1 << 1, i3 + i6 + this.q + i1 + localRect.left + localRect.right + 0);
      localaco.a = Bitmap.createBitmap(i3, i5, Bitmap.Config.ARGB_8888);
      localObject1 = new Canvas(localaco.a);
      if (localObject2 == null) {
        break label817;
      }
      ((Drawable)localObject2).setBounds(0, 0, i3, i5);
      ((Drawable)localObject2).draw((Canvas)localObject1);
      if (!k()) {
        break label876;
      }
      i2 = this.q + localRect.left + 0;
      ((Canvas)localObject1).drawText((CharSequence)localObject3, 0, ((CharSequence)localObject3).length(), i2, i5 - (i5 - this.r) / 2, localTextPaint);
      if (0 != 0)
      {
        if (!k()) {
          break label899;
        }
        i1 = localRect.left;
        i1 = this.q;
        i1 = i5 / 2;
        throw new NullPointerException();
      }
      if (!k()) {
        break label914;
      }
      i2 = i3 - localRect.right - i1;
      localaco.c = i2;
      localaco.d = localRect.top;
      localaco.e = (i2 + i1);
      localaco.f = (i5 - localRect.bottom);
      if (localaco.b)
      {
        l1 = paramacx.g;
        if (!f()) {
          break label930;
        }
        if (l1 == -1L) {
          break label924;
        }
        i1 = 1;
        label604:
        if (i1 != 0)
        {
          localObject1 = paramacx.a();
          if (localObject1 != null) {
            break label960;
          }
          localObject2 = (aav)super.getAdapter();
          localObject1 = new acl(this, paramacx, localaco);
          ((aav)localObject2).k.a(paramacx, (abs)localObject1);
        }
      }
    }
    for (;;)
    {
      localObject1 = localaco.a;
      localObject2 = new BitmapDrawable(getResources(), (Bitmap)localObject1);
      ((Drawable)localObject2).setBounds(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      paramacx = new ade((Drawable)localObject2, paramacx);
      paramacx.b = this.o;
      localTextPaint.setTextSize(f1);
      localTextPaint.setColor(i4);
      return paramacx;
      i1 = getResources().getColor(17170444);
      break;
      label743:
      localObject2 = this.l;
      break label52;
      label752:
      i2 = getResources().getColor(a.cv);
      break label65;
      label767:
      i1 = 0;
      break label126;
      label773:
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        localObject1 = localObject3;
        break label186;
      }
      localObject1 = new Rfc822Token((String)localObject1, (String)localObject3, null).toString();
      break label186;
      label808:
      i3 = this.q;
      break label327;
      label817:
      this.v.reset();
      this.v.setColor(i2);
      this.v.setAntiAlias(true);
      f2 = i5 / 2;
      ((Canvas)localObject1).drawRoundRect(new RectF(0.0F, 0.0F, i3, i5), f2, f2, this.v);
      break label415;
      label876:
      i2 = i3 - localRect.right - this.q - i6 - 0;
      break label436;
      label899:
      i1 = localRect.right;
      throw new NullPointerException();
      label914:
      i2 = localRect.left;
      break label527;
      label924:
      i1 = 0;
      break label604;
      label930:
      if ((l1 != -1L) && (l1 != -2L))
      {
        i1 = 1;
        break label604;
      }
      i1 = 0;
      break label604;
      label960:
      a(localaco, BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length));
    }
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == -1) || (paramInt2 == -1)) {
      dismissDropDown();
    }
    for (;;)
    {
      return;
      Editable localEditable = getText();
      setSelection(paramInt2);
      Object localObject = getText().toString().substring(paramInt1, paramInt2);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = acx.a((String)localObject, d((String)localObject));
        QwertyKeyListener.markAsReplaced(localEditable, paramInt1, paramInt2, "");
        localObject = d((acx)localObject);
        paramInt2 = getSelectionEnd();
        if ((localObject != null) && (paramInt1 >= 0) && (paramInt2 >= 0)) {
          localEditable.replace(paramInt1, paramInt2, (CharSequence)localObject);
        }
      }
      dismissDropDown();
    }
  }
  
  private int d(int paramInt)
  {
    Object localObject = e(((aav)super.getAdapter()).a(paramInt));
    if (localObject == null) {
      paramInt = -1;
    }
    for (;;)
    {
      return paramInt;
      clearComposingText();
      paramInt = getSelectionEnd();
      int i1 = this.w.findTokenStart(getText(), paramInt);
      Editable localEditable = getText();
      QwertyKeyListener.markAsReplaced(localEditable, i1, paramInt, "");
      localObject = d((acx)localObject);
      if ((localObject != null) && (i1 >= 0) && (paramInt >= 0)) {
        localEditable.replace(i1, paramInt, (CharSequence)localObject);
      }
      o();
      paramInt -= i1;
    }
  }
  
  private CharSequence d(acx paramacx)
  {
    Object localObject1 = null;
    Object localObject2 = a(paramacx);
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      paramacx = (acx)localObject1;
    }
    for (;;)
    {
      return paramacx;
      int i1 = ((String)localObject2).length();
      localObject2 = new SpannableString((CharSequence)localObject2);
      if (!this.N) {}
      try
      {
        paramacx = c(paramacx);
        ((SpannableString)localObject2).setSpan(paramacx, 0, i1 - 1, 33);
        paramacx.a(((SpannableString)localObject2).toString());
        paramacx = (acx)localObject2;
      }
      catch (NullPointerException paramacx)
      {
        Log.e("RecipientEditTextView", paramacx.getMessage(), paramacx);
        paramacx = (acx)localObject1;
      }
    }
  }
  
  private void d(ada paramada)
  {
    Object localObject;
    int i1;
    if (e(paramada))
    {
      CharSequence localCharSequence = paramada.b();
      Editable localEditable = getText();
      localObject = getText();
      int i3 = ((Spannable)localObject).getSpanStart(paramada);
      int i2 = ((Spannable)localObject).getSpanEnd(paramada);
      ((Spannable)localObject).removeSpan(paramada);
      i1 = i2;
      if (i2 - i3 == localEditable.length() - 1) {
        i1 = i2 + 1;
      }
      localEditable.delete(i3, i1);
      setCursorVisible(true);
      setSelection(localEditable.length());
      localEditable.append(localCharSequence);
      this.F = c(acx.a((String)localCharSequence, d(localCharSequence.toString())));
    }
    for (;;)
    {
      return;
      if (paramada.c() != -2L) {
        localObject = (aav)super.getAdapter();
      }
      for (i1 = 0;; i1 = 1)
      {
        if ((i1 != 0) && (this.N)) {
          break label318;
        }
        this.F = paramada;
        setSelection(getText().getSpanEnd(this.F));
        setCursorVisible(false);
        if (i1 == 0) {
          break label320;
        }
        localObject = this.D;
        if (!this.U) {
          break;
        }
        i1 = b(getLayout().getLineForOffset(b(paramada)));
        ((ListPopupWindow)localObject).setAnchorView(this);
        ((ListPopupWindow)localObject).setVerticalOffset(i1);
        ((ListPopupWindow)localObject).setAdapter(new acy(getContext(), paramada.g(), this.A, p()));
        ((ListPopupWindow)localObject).setOnItemClickListener(new ace(this, paramada));
        ((ListPopupWindow)localObject).show();
        paramada = ((ListPopupWindow)localObject).getListView();
        paramada.setChoiceMode(1);
        paramada.setItemChecked(0, true);
        break;
      }
      label318:
      continue;
      label320:
      new acn(this, paramada, this.C).execute(null);
    }
  }
  
  private boolean d(String paramString)
  {
    if (this.x == null) {}
    for (boolean bool = true;; bool = this.x.isValid(paramString)) {
      return bool;
    }
  }
  
  private acs e(int paramInt)
  {
    String str = String.format(this.I.getText().toString(), new Object[] { Integer.valueOf(paramInt) });
    this.v.set(getPaint());
    this.v.setTextSize(this.I.getTextSize());
    this.v.setColor(this.I.getCurrentTextColor());
    int i2 = (int)this.v.measureText(str) + this.I.getPaddingLeft() + this.I.getPaddingRight();
    int i1 = (int)this.m;
    Bitmap localBitmap = Bitmap.createBitmap(i2, i1, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Object localObject = getLayout();
    if (localObject != null) {}
    for (paramInt = i1 - ((Layout)localObject).getLineDescent(0);; paramInt = i1)
    {
      localCanvas.drawText(str, 0, str.length(), 0.0F, paramInt, this.v);
      localObject = new BitmapDrawable(getResources(), localBitmap);
      ((Drawable)localObject).setBounds(0, 0, i2, i1);
      return new acs(this, (Drawable)localObject);
    }
  }
  
  private acx e(acx paramacx)
  {
    acx localacx;
    if (paramacx == null) {
      localacx = null;
    }
    for (;;)
    {
      return localacx;
      String str = paramacx.d;
      if ((!f()) && (paramacx.g == -2L))
      {
        localacx = acx.a(paramacx.c, str, paramacx.k);
      }
      else
      {
        localacx = paramacx;
        if (acx.a(paramacx.g)) {
          if ((!TextUtils.isEmpty(paramacx.c)) && (!TextUtils.equals(paramacx.c, str)))
          {
            localacx = paramacx;
            if (this.x != null)
            {
              localacx = paramacx;
              if (this.x.isValid(str)) {}
            }
          }
          else
          {
            localacx = acx.a(str, paramacx.k);
          }
        }
      }
    }
  }
  
  private boolean e(ada paramada)
  {
    long l1 = paramada.c();
    if ((l1 == -1L) || ((!f()) && (l1 == -2L))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean e(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (this.x != null) && (this.x.isValid(paramString))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private int f(int paramInt)
  {
    if (paramInt >= length()) {}
    for (;;)
    {
      return paramInt;
      int i2 = getText().toString().charAt(paramInt);
      int i1;
      if (i2 != 44)
      {
        i1 = paramInt;
        if (i2 != 59) {}
      }
      else
      {
        i1 = paramInt + 1;
      }
      paramInt = i1;
      if (i1 < length())
      {
        paramInt = i1;
        if (getText().toString().charAt(i1) == ' ') {
          paramInt = i1 + 1;
        }
      }
    }
  }
  
  private void f(ada paramada)
  {
    int i2 = b(paramada);
    int i1 = c(paramada);
    Editable localEditable = getText();
    this.F = null;
    if ((i2 == -1) || (i1 == -1))
    {
      Log.w("RecipientEditTextView", "The chip doesn't exist or may be a chip a user was editing");
      setSelection(localEditable.length());
      n();
    }
    for (;;)
    {
      setCursorVisible(true);
      setSelection(localEditable.length());
      r();
      return;
      getText().removeSpan(paramada);
      QwertyKeyListener.markAsReplaced(localEditable, i2, i1, "");
      localEditable.removeSpan(paramada);
      try
      {
        if (!this.N) {
          localEditable.setSpan(c(paramada.g()), i2, i1, 33);
        }
      }
      catch (NullPointerException paramada)
      {
        Log.e("RecipientEditTextView", paramada.getMessage(), paramada);
      }
    }
  }
  
  private void g(ada paramada)
  {
    Editable localEditable2 = getText();
    int i4 = localEditable2.getSpanStart(paramada);
    int i3 = localEditable2.getSpanEnd(paramada);
    Editable localEditable1 = getText();
    if (paramada == this.F) {}
    int i2;
    for (int i1 = 1;; i1 = 0)
    {
      i2 = i3;
      if (i1 != 0) {
        this.F = null;
      }
      for (i2 = i3; (i2 >= 0) && (i2 < localEditable1.length()) && (localEditable1.charAt(i2) == ' '); i2++) {}
    }
    localEditable2.removeSpan(paramada);
    if ((i4 >= 0) && (i2 > 0)) {
      localEditable1.delete(i4, i2);
    }
    if (i1 != 0) {
      d();
    }
  }
  
  private ada i()
  {
    Object localObject2 = null;
    ada[] arrayOfada = e();
    Object localObject1 = localObject2;
    if (arrayOfada != null)
    {
      localObject1 = localObject2;
      if (arrayOfada.length > 0) {
        localObject1 = arrayOfada[(arrayOfada.length - 1)];
      }
    }
    return (ada)localObject1;
  }
  
  private void j()
  {
    if (this.w == null) {}
    for (;;)
    {
      return;
      if (this.F != null) {}
      for (long l1 = this.F.g().g;; l1 = -1L)
      {
        if ((this.F == null) || (l1 == -1L) || (f()) || (l1 == -2L)) {
          break label80;
        }
        d();
        q();
        break;
      }
      label80:
      if (getWidth() > 0) {
        break;
      }
      this.y.removeCallbacks(this.ab);
      if (getVisibility() == 8) {
        this.O = true;
      } else {
        this.y.post(this.ab);
      }
    }
    if (this.L > 0) {
      l();
    }
    for (;;)
    {
      this.y.post(this.V);
      break;
      Editable localEditable = getText();
      int i3 = getSelectionEnd();
      int i4 = this.w.findTokenStart(localEditable, i3);
      Object localObject = (ada[])getText().getSpans(i4, i3, ada.class);
      if ((localObject == null) || (localObject.length == 0))
      {
        localObject = getText();
        int i2 = this.w.findTokenEnd((CharSequence)localObject, i4);
        int i1 = i2;
        if (i2 < ((Editable)localObject).length())
        {
          i1 = i2;
          if (((Editable)localObject).charAt(i2) == ',') {
            i1 = f(i2);
          }
        }
        if (i1 != getSelectionEnd()) {
          c(i4, i1);
        } else {
          a(i4, i3, localEditable);
        }
      }
    }
  }
  
  private boolean k()
  {
    boolean bool2 = true;
    int i1;
    boolean bool1;
    if ((Build.VERSION.SDK_INT >= 17) && (getLayoutDirection() == 1))
    {
      i1 = 1;
      if (this.u != 0) {
        break label46;
      }
      bool1 = true;
      label29:
      if (i1 == 0) {
        break label56;
      }
      if (bool1) {
        break label51;
      }
      bool1 = bool2;
    }
    label46:
    label51:
    label56:
    for (;;)
    {
      return bool1;
      i1 = 0;
      break;
      bool1 = false;
      break label29;
      bool1 = false;
    }
  }
  
  private void l()
  {
    this.y.removeCallbacks(this.aa);
    this.y.post(this.aa);
  }
  
  private boolean m()
  {
    View localView = focusSearch(130);
    if (localView != null) {
      localView.requestFocus();
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean n()
  {
    boolean bool = false;
    if (this.w == null) {}
    for (;;)
    {
      return bool;
      Editable localEditable = getText();
      int i1 = getSelectionEnd();
      int i3 = this.w.findTokenStart(localEditable, i1);
      if (a(i3, i1))
      {
        int i2 = f(this.w.findTokenEnd(getText(), i3));
        if (i2 != getSelectionEnd())
        {
          c(i3, i2);
          bool = true;
        }
        else
        {
          bool = a(i3, i1, localEditable);
        }
      }
    }
  }
  
  private void o()
  {
    if (this.L > 0) {}
    label157:
    for (;;)
    {
      return;
      ada[] arrayOfada = e();
      if ((arrayOfada != null) && (arrayOfada.length > 0))
      {
        ada localada = arrayOfada[(arrayOfada.length - 1)];
        Object localObject = null;
        if (arrayOfada.length > 1) {
          localObject = arrayOfada[(arrayOfada.length - 2)];
        }
        int i3 = getText().getSpanStart(localada);
        int i2;
        if (localObject != null)
        {
          i2 = getText().getSpanEnd(localObject);
          localObject = getText();
          if ((i2 == -1) || (i2 > ((Editable)localObject).length() - 1)) {
            continue;
          }
          i1 = i2;
          if (((Editable)localObject).charAt(i2) != ' ') {}
        }
        for (int i1 = i2 + 1;; i1 = 0)
        {
          if ((i1 < 0) || (i3 < 0) || (i1 >= i3)) {
            break label157;
          }
          getText().delete(i1, i3);
          break;
        }
      }
    }
  }
  
  private StateListDrawable p()
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    if (!this.s)
    {
      Drawable localDrawable = this.k;
      localStateListDrawable.addState(new int[] { 16843518 }, localDrawable);
    }
    localStateListDrawable.addState(new int[0], null);
    return localStateListDrawable;
  }
  
  private void q()
  {
    Editable localEditable1;
    int i3;
    int i2;
    int i1;
    int i4;
    int i5;
    Object localObject1;
    Object localObject2;
    if (this.N)
    {
      localEditable1 = getText();
      i3 = 0;
      i2 = 0;
      i1 = 0;
      while (i3 < 2)
      {
        i1 = f(this.w.findTokenEnd(localEditable1, i1));
        i3++;
        i2 = i1;
      }
      i3 = 0;
      i1 = 0;
      do
      {
        i4 = i1;
        if (i3 >= localEditable1.length()) {
          break;
        }
        i5 = f(this.w.findTokenEnd(localEditable1, i3));
        i4 = i1 + 1;
        i3 = i5;
        i1 = i4;
      } while (i5 < localEditable1.length());
      localObject1 = e(i4 - 2);
      localObject2 = new SpannableString(localEditable1.subSequence(i2, localEditable1.length()));
      ((SpannableString)localObject2).setSpan(localObject1, 0, ((SpannableString)localObject2).length(), 33);
      localEditable1.replace(i2, localEditable1.length(), (CharSequence)localObject2);
      this.H = ((adc)localObject1);
    }
    for (;;)
    {
      return;
      if (this.b)
      {
        localObject1 = (adc[])getText().getSpans(0, getText().length(), acs.class);
        if (localObject1.length > 0) {
          getText().removeSpan(localObject1[0]);
        }
        localObject2 = e();
        if ((localObject2 == null) || (localObject2.length <= 2))
        {
          this.H = null;
        }
        else
        {
          Editable localEditable2 = getText();
          i4 = localObject2.length;
          i5 = i4 - 2;
          localObject1 = e(i5);
          this.Q = new ArrayList();
          localEditable1 = getText();
          i2 = i4 - i5;
          i1 = 0;
          i3 = 0;
          while (i2 < localObject2.length)
          {
            this.Q.add(localObject2[i2]);
            if (i2 == i4 - i5) {
              i3 = localEditable2.getSpanStart(localObject2[i2]);
            }
            if (i2 == localObject2.length - 1) {
              i1 = localEditable2.getSpanEnd(localObject2[i2]);
            }
            if ((this.P == null) || (!this.P.contains(localObject2[i2])))
            {
              int i7 = localEditable2.getSpanStart(localObject2[i2]);
              int i6 = localEditable2.getSpanEnd(localObject2[i2]);
              localObject2[i2].a(localEditable1.toString().substring(i7, i6));
            }
            localEditable2.removeSpan(localObject2[i2]);
            i2++;
          }
          i2 = i1;
          if (i1 < localEditable1.length()) {
            i2 = localEditable1.length();
          }
          i1 = Math.max(i3, i2);
          i2 = Math.min(i3, i2);
          localObject2 = new SpannableString(localEditable1.subSequence(i2, i1));
          ((SpannableString)localObject2).setSpan(localObject1, 0, ((SpannableString)localObject2).length(), 33);
          localEditable1.replace(i2, i1, (CharSequence)localObject2);
          this.H = ((adc)localObject1);
          if ((!f()) && (getLineCount() > this.t)) {
            setMaxLines(getLineCount());
          }
        }
      }
    }
  }
  
  private void r()
  {
    if ((this.C != null) && (this.C.isShowing())) {
      this.C.dismiss();
    }
    if ((this.D != null) && (this.D.isShowing())) {
      this.D.dismiss();
    }
    setSelection(getText().length());
  }
  
  final String a(acx paramacx)
  {
    Object localObject = paramacx.c;
    String str = paramacx.d;
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      paramacx = (acx)localObject;
      if (!TextUtils.equals((CharSequence)localObject, str)) {}
    }
    else
    {
      paramacx = null;
    }
    if ((f()) && (b(str))) {}
    for (paramacx = str.trim();; paramacx = new Rfc822Token(paramacx, (String)localObject, null).toString().trim())
    {
      int i1 = paramacx.indexOf(",");
      localObject = paramacx;
      if (this.w != null)
      {
        localObject = paramacx;
        if (!TextUtils.isEmpty(paramacx))
        {
          localObject = paramacx;
          if (i1 < paramacx.length() - 1) {
            localObject = (String)this.w.terminateToken(paramacx);
          }
        }
      }
      return (String)localObject;
      localObject = str;
      if (str != null)
      {
        Rfc822Token[] arrayOfRfc822Token = Rfc822Tokenizer.tokenize(str);
        localObject = str;
        if (arrayOfRfc822Token != null)
        {
          localObject = str;
          if (arrayOfRfc822Token.length > 0) {
            localObject = arrayOfRfc822Token[0].getAddress();
          }
        }
      }
    }
  }
  
  public final void a()
  {
    if (this.F != null) {
      g(this.F);
    }
    r();
  }
  
  public final void a(int paramInt)
  {
    ListView localListView = this.C.getListView();
    if ((localListView != null) && (localListView.getCheckedItemCount() == 0)) {
      localListView.setItemChecked(paramInt, true);
    }
    this.M = paramInt;
  }
  
  final void a(ada paramada, acx paramacx)
  {
    int i1;
    int i3;
    int i2;
    if (paramada == this.F)
    {
      i1 = 1;
      if (i1 != 0) {
        this.F = null;
      }
      i3 = b(paramada);
      i2 = c(paramada);
      getText().removeSpan(paramada);
      paramada = getText();
      paramacx = d(paramacx);
      if (paramacx != null)
      {
        if ((i3 != -1) && (i2 != -1)) {
          break label108;
        }
        Log.e("RecipientEditTextView", "The chip to replace does not exist but should.");
        paramada.insert(0, paramacx);
      }
    }
    for (;;)
    {
      setCursorVisible(true);
      if (i1 != 0) {
        d();
      }
      return;
      i1 = 0;
      break;
      label108:
      if (!TextUtils.isEmpty(paramacx))
      {
        while ((i2 >= 0) && (i2 < paramada.length()) && (paramada.charAt(i2) == ' ')) {
          i2++;
        }
        paramada.replace(i3, i2, paramacx);
      }
    }
  }
  
  public final boolean a(ada paramada)
  {
    long l1 = paramada.c();
    if ((l1 == -1L) || ((!f()) && (l1 == -2L))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a(CharSequence paramCharSequence)
  {
    boolean bool = false;
    int i2;
    if (getSelectionEnd() == 0)
    {
      i1 = 0;
      i2 = length() - 1;
      if (i1 == i2) {
        break label60;
      }
    }
    label60:
    for (int i1 = paramCharSequence.charAt(i1);; i1 = paramCharSequence.charAt(i2))
    {
      if ((i1 == 44) || (i1 == 59)) {
        bool = true;
      }
      return bool;
      i1 = getSelectionEnd() - 1;
      break;
    }
  }
  
  public void append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (this.z != null) {
      removeTextChangedListener(this.z);
    }
    super.append(paramCharSequence, paramInt1, paramInt2);
    String str;
    if ((!TextUtils.isEmpty(paramCharSequence)) && (TextUtils.getTrimmedLength(paramCharSequence) > 0))
    {
      str = paramCharSequence.toString();
      paramCharSequence = str;
      if (!str.trim().endsWith(","))
      {
        super.append(d, 0, d.length());
        str = String.valueOf(str);
        paramCharSequence = String.valueOf(d);
        if (paramCharSequence.length() == 0) {
          break label159;
        }
      }
    }
    label159:
    for (paramCharSequence = str.concat(paramCharSequence);; paramCharSequence = new String(str))
    {
      if ((!TextUtils.isEmpty(paramCharSequence)) && (TextUtils.getTrimmedLength(paramCharSequence) > 0))
      {
        this.L += 1;
        this.K.add(paramCharSequence);
      }
      if (this.L > 0) {
        l();
      }
      this.y.post(this.V);
      return;
    }
  }
  
  public final void b()
  {
    dismissDropDown();
  }
  
  public final void b(acx paramacx)
  {
    ada[] arrayOfada = (ada[])getText().getSpans(0, getText().length(), ada.class);
    int i3 = arrayOfada.length;
    int i1 = 0;
    if (i1 < i3)
    {
      ada localada = arrayOfada[i1];
      acx localacx = localada.g();
      if ((localacx != null) && (localacx.k)) {
        if ((paramacx == null) || (localacx.g != paramacx.g)) {
          break label101;
        }
      }
      label101:
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 != 0) {
          g(localada);
        }
        i1++;
        break;
      }
    }
  }
  
  final void c()
  {
    Editable localEditable = null;
    if (getWidth() <= 0) {}
    while (this.L <= 0) {
      return;
    }
    label615:
    label633:
    label641:
    label744:
    label756:
    label759:
    for (;;)
    {
      synchronized (this.K)
      {
        Object localObject6 = getText();
        if (this.L > 50) {
          break label633;
        }
        i1 = 0;
        int i2;
        if (i1 < this.K.size())
        {
          Object localObject1 = (String)this.K.get(i1);
          int i4 = localObject6.toString().indexOf((String)localObject1);
          i2 = ((String)localObject1).length() + i4 - 1;
          if (i4 >= 0)
          {
            if ((i2 >= ((Editable)localObject6).length() - 2) || (((Editable)localObject6).charAt(i2) != ',')) {
              break label759;
            }
            i2++;
            if ((i1 >= 2) && (this.b)) {
              continue;
            }
            i3 = 1;
            if (!b(i4, i2))
            {
              localObject5 = localObject6.toString().substring(i4, i2);
              localObject1 = ((String)localObject5).trim();
              int i5 = ((String)localObject1).lastIndexOf(',');
              if ((i5 == -1) || (i5 != ((String)localObject1).length() - 1)) {
                break label756;
              }
              localObject5 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
              localObject1 = c((String)localObject5);
              if (localObject1 == null) {}
            }
          }
          try
          {
            if (this.N) {
              continue;
            }
            if (i3 == 0) {
              continue;
            }
            localObject1 = c((acx)localObject1);
          }
          catch (NullPointerException localNullPointerException)
          {
            ArrayList localArrayList2;
            Log.e("RecipientEditTextView", localNullPointerException.getMessage(), localNullPointerException);
            localObject2 = null;
            continue;
          }
          ((Editable)localObject6).setSpan(localObject1, i4, i2, 33);
          if (localObject1 != null)
          {
            if (this.P == null)
            {
              localArrayList2 = new java/util/ArrayList;
              localArrayList2.<init>();
              this.P = localArrayList2;
            }
            ((ada)localObject1).a((String)localObject5);
            this.P.add(localObject1);
          }
          this.L -= 1;
          i1++;
          continue;
          int i3 = 0;
          continue;
          localObject1 = new adb((acx)localObject1);
          continue;
        }
        if (this.L <= 0)
        {
          localObject2 = e();
          localObject5 = getText();
          if ((localObject2 != null) && (localObject2.length > 0))
          {
            localObject6 = (acs[])getText().getSpans(0, getText().length(), acs.class);
            localObject2 = localEditable;
            if (localObject6 != null)
            {
              localObject2 = localEditable;
              if (localObject6.length > 0) {
                localObject2 = localObject6[0];
              }
            }
            this.H = ((adc)localObject2);
            if (this.H == null) {
              break label615;
            }
            i1 = ((Spannable)localObject5).getSpanEnd(this.H);
            localEditable = getText();
            i2 = localEditable.length();
            if (i2 > i1)
            {
              if (Log.isLoggable("RecipientEditTextView", 3))
              {
                localObject2 = String.valueOf(localEditable);
                localObject5 = new java/lang/StringBuilder;
                ((StringBuilder)localObject5).<init>(String.valueOf(localObject2).length() + 61);
                ((StringBuilder)localObject5).append("There were extra characters after the last tokenizable entry.").append((String)localObject2);
              }
              localEditable.delete(i1 + 1, i2);
            }
          }
        }
        if ((this.P == null) || (this.P.size() <= 0) || (this.P.size() > 50)) {
          break label744;
        }
        if ((!hasFocus()) && (this.P.size() >= 2)) {
          break label641;
        }
        Object localObject2 = new act;
        ((act)localObject2).<init>(this);
        ((act)localObject2).execute(new Void[0]);
        this.P = null;
        this.L = 0;
        this.K.clear();
      }
      int i1 = getText().getSpanEnd(i());
      continue;
      this.N = true;
      continue;
      Object localObject4 = new acp;
      ((acp)localObject4).<init>(this);
      this.W = ((acp)localObject4);
      Object localObject5 = this.W;
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>(this.P.subList(0, 2));
      ((acp)localObject5).execute(new ArrayList[] { localObject4 });
      if (this.P.size() > 2)
      {
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>(this.P.subList(2, this.P.size()));
      }
      for (this.P = ((ArrayList)localObject4);; this.P = null)
      {
        q();
        break;
      }
      this.P = null;
      q();
      continue;
    }
  }
  
  public final void d()
  {
    if (this.F != null)
    {
      f(this.F);
      this.F = null;
    }
    setCursorVisible(true);
    setSelection(getText().length());
  }
  
  final ada[] e()
  {
    ArrayList localArrayList = new ArrayList(Arrays.asList((ada[])getText().getSpans(0, getText().length(), ada.class)));
    Collections.sort(localArrayList, new acd(this, getText()));
    return (ada[])localArrayList.toArray(new ada[localArrayList.size()]);
  }
  
  protected final boolean f()
  {
    if (((aav)super.getAdapter() != null) && (((aav)super.getAdapter()).b == 1)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final aav g()
  {
    return (aav)super.getAdapter();
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return false;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.U = true;
    int i1 = getDropDownAnchor();
    if (i1 != -1) {
      this.B = getRootView().findViewById(i1);
    }
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return false;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    int i1 = paramEditorInfo.imeOptions & 0xFF;
    if ((i1 & 0x6) != 0)
    {
      paramEditorInfo.imeOptions = (i1 ^ paramEditorInfo.imeOptions);
      paramEditorInfo.imeOptions |= 0x6;
    }
    if ((paramEditorInfo.imeOptions & 0x40000000) != 0) {
      paramEditorInfo.imeOptions &= 0xBFFFFFFF;
    }
    paramEditorInfo.actionId = 6;
    if (Build.VERSION.SDK_INT >= 21) {}
    for (String str = null;; str = getContext().getString(a.cR))
    {
      paramEditorInfo.actionLabel = str;
      return localInputConnection;
    }
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode) {}
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.U = false;
    r();
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onDragEvent(DragEvent paramDragEvent)
  {
    boolean bool = true;
    switch (paramDragEvent.getAction())
    {
    case 2: 
    case 4: 
    default: 
      bool = false;
    }
    for (;;)
    {
      return bool;
      bool = paramDragEvent.getClipDescription().hasMimeType("text/plain");
      continue;
      requestFocus();
      continue;
      a(paramDragEvent.getClipData());
    }
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt == 6) {
      if (!n()) {}
    }
    for (;;)
    {
      return bool;
      if (this.F != null) {
        d();
      } else if (!m()) {
        bool = false;
      }
    }
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (!paramBoolean)
    {
      j();
      return;
    }
    if (this.b) {
      setMaxLines(Integer.MAX_VALUE);
    }
    Object localObject;
    if (this.H != null)
    {
      localObject = getText();
      ((Spannable)localObject).removeSpan(this.H);
      this.H = null;
      if ((this.Q != null) && (this.Q.size() > 0))
      {
        paramRect = e();
        if ((paramRect != null) && (paramRect.length != 0)) {
          break label166;
        }
      }
    }
    label90:
    setCursorVisible(true);
    paramRect = getText();
    if ((paramRect != null) && (paramRect.length() > 0)) {}
    for (paramInt = paramRect.length();; paramInt = 0)
    {
      setSelection(paramInt);
      if ((this.P == null) || (this.P.size() <= 0)) {
        break;
      }
      new act(this).execute(new Void[0]);
      this.P = null;
      break;
      label166:
      paramInt = ((Spannable)localObject).getSpanEnd(paramRect[(paramRect.length - 1)]);
      Editable localEditable = getText();
      Iterator localIterator = this.Q.iterator();
      while (localIterator.hasNext())
      {
        paramRect = (ada)localIterator.next();
        localObject = (String)paramRect.h();
        int i1 = localEditable.toString().indexOf((String)localObject, paramInt);
        paramInt = Math.min(localEditable.length(), ((String)localObject).length() + i1);
        if (i1 != -1) {
          localEditable.setSpan(paramRect, i1, paramInt, 33);
        }
      }
      this.Q.clear();
      break label90;
    }
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      if (((aav)super.getAdapter()).a(paramInt).a != 1) {
        d(paramInt);
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = true;
    if ((this.F != null) && (paramInt == 67))
    {
      if ((this.C != null) && (this.C.isShowing())) {
        this.C.dismiss();
      }
      g(this.F);
    }
    boolean bool1;
    switch (paramInt)
    {
    default: 
      bool1 = super.onKeyDown(paramInt, paramKeyEvent);
    }
    for (;;)
    {
      return bool1;
      if (!paramKeyEvent.hasNoModifiers()) {
        break;
      }
      bool1 = bool2;
      if (!n()) {
        if (this.F != null)
        {
          d();
          bool1 = bool2;
        }
        else
        {
          if (!m()) {
            break;
          }
          bool1 = bool2;
        }
      }
    }
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.F != null)) {
      d();
    }
    for (boolean bool = true;; bool = super.onKeyPreIme(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return super.onKeyUp(paramInt, paramKeyEvent);
      if (paramKeyEvent.hasNoModifiers()) {
        if (this.F != null) {
          d();
        } else {
          n();
        }
      }
    }
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    if (this.F != null) {}
    for (;;)
    {
      return;
      paramMotionEvent = c(a(paramMotionEvent.getX(), paramMotionEvent.getY()));
      if (paramMotionEvent != null)
      {
        paramMotionEvent = paramMotionEvent.g().d;
        Context localContext = getContext();
        if ((this.U) && (localContext != null) && ((localContext instanceof Activity))) {
          abf.a(paramMotionEvent).show(((Activity)localContext).getFragmentManager(), "chips-copy-dialog");
        }
      }
    }
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!TextUtils.isEmpty(getText())) {
      super.onRestoreInstanceState(null);
    }
    for (;;)
    {
      return;
      super.onRestoreInstanceState(paramParcelable);
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    d();
    return super.onSaveInstanceState();
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onSelectionChanged(int paramInt1, int paramInt2)
  {
    ada localada = i();
    if ((this.F == null) && (localada != null) && (paramInt1 < getText().getSpanEnd(localada))) {
      setSelection(Math.min(getText().getSpanEnd(localada) + 1, getText().length()));
    }
    super.onSelectionChanged(paramInt1, paramInt2);
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      if (this.L <= 0) {
        break label73;
      }
      l();
    }
    while ((this.c == null) && (!this.S))
    {
      Object localObject = getParent();
      for (;;)
      {
        if ((localObject != null) && (!(localObject instanceof ScrollView)))
        {
          localObject = ((ViewParent)localObject).getParent();
          continue;
          label73:
          ada[] arrayOfada = e();
          if (arrayOfada == null) {
            break;
          }
          paramInt2 = arrayOfada.length;
          for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
          {
            ada localada = arrayOfada[paramInt1];
            localObject = localada.i();
            if ((getWidth() > 0) && (((Rect)localObject).right - ((Rect)localObject).left > getWidth() - getPaddingLeft() - getPaddingRight())) {
              a(localada, localada.g());
            }
          }
          break;
        }
      }
      if (localObject != null) {
        this.c = ((ScrollView)localObject);
      }
      this.S = true;
    }
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    if (paramInt == 16908322) {
      a(((ClipboardManager)getContext().getSystemService("clipboard")).getPrimaryClip());
    }
    for (boolean bool = true;; bool = super.onTextContextMenuItem(paramInt)) {
      return bool;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2;
    if (!isFocused())
    {
      bool2 = super.onTouchEvent(paramMotionEvent);
      return bool2;
    }
    boolean bool1 = super.onTouchEvent(paramMotionEvent);
    int i2 = paramMotionEvent.getAction();
    if (this.F == null) {
      this.R.onTouchEvent(paramMotionEvent);
    }
    label95:
    int i1;
    if (i2 == 1)
    {
      paramMotionEvent = c(a(paramMotionEvent.getX(), paramMotionEvent.getY()));
      if (paramMotionEvent != null) {
        if ((this.F != null) && (this.F != paramMotionEvent))
        {
          d();
          d(paramMotionEvent);
          i1 = 1;
          bool1 = true;
        }
      }
    }
    for (;;)
    {
      bool2 = bool1;
      if (i2 != 1) {
        break;
      }
      bool2 = bool1;
      if (i1 != 0) {
        break;
      }
      d();
      bool2 = bool1;
      break;
      if (this.F == null)
      {
        n();
        d(paramMotionEvent);
        break label95;
      }
      if (!this.F.a()) {
        break label95;
      }
      d();
      break label95;
      if ((this.F != null) && (e(this.F))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
    }
  }
  
  public void performFiltering(CharSequence paramCharSequence, int paramInt)
  {
    boolean bool = b(paramCharSequence);
    if ((enoughToFilter()) && (!bool))
    {
      int i1 = getSelectionEnd();
      int i2 = this.w.findTokenStart(paramCharSequence, i1);
      ada[] arrayOfada = (ada[])getText().getSpans(i2, i1, ada.class);
      if ((arrayOfada == null) || (arrayOfada.length <= 0)) {
        break label85;
      }
      dismissDropDown();
    }
    for (;;)
    {
      return;
      if (bool) {
        dismissDropDown();
      } else {
        label85:
        super.performFiltering(paramCharSequence, paramInt);
      }
    }
  }
  
  public void performValidation() {}
  
  public void removeTextChangedListener(TextWatcher paramTextWatcher)
  {
    this.z = null;
    super.removeTextChangedListener(paramTextWatcher);
  }
  
  protected void replaceText(CharSequence paramCharSequence) {}
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    paramListAdapter = (aav)paramListAdapter;
    paramListAdapter.m = new ack(this);
    paramListAdapter.d = this.A;
    paramListAdapter.d.c = paramListAdapter.a;
  }
  
  public void setDropDownAnchor(int paramInt)
  {
    super.setDropDownAnchor(paramInt);
    if (paramInt != -1) {
      this.B = getRootView().findViewById(paramInt);
    }
  }
  
  public void setTokenizer(MultiAutoCompleteTextView.Tokenizer paramTokenizer)
  {
    this.w = paramTokenizer;
    super.setTokenizer(this.w);
  }
  
  public void setValidator(AutoCompleteTextView.Validator paramValidator)
  {
    this.x = paramValidator;
    super.setValidator(paramValidator);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if ((paramInt != 8) && (this.O))
    {
      this.O = false;
      this.y.post(this.ab);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */