	private static final java.lang.String d
	private static final java.util.regex.Pattern e
	private static final  f
	private abj A
	private android.view.View B
	private android.widget.ListPopupWindow C
	private android.widget.ListPopupWindow D
	private android.widget.AdapterView$OnItemClickListener E
	private ada F
	private android.graphics.Bitmap G
	private adc H
	private android.widget.TextView I
	private  J
	private java.util.ArrayList K
	private  L
	private  M
	private  N
	private  O
	private java.util.ArrayList P
	private java.util.ArrayList Q
	private android.view.GestureDetector R
	private  S
	private  T
	private  U
	private final java.lang.Runnable V
	private acp W
	final I a
	private java.lang.Runnable aa
	private java.lang.Runnable ab
	  b
	 android.widget.ScrollView c
	private  g
	private  h
	private final android.graphics.Rect i
	private android.graphics.drawable.Drawable j
	private android.graphics.drawable.Drawable k
	private android.graphics.drawable.Drawable l
	private  m
	private  n
	private  o
	private  p
	private  q
	private final  r
	private  s
	private  t
	private  u
	private android.graphics.Paint v
	private android.widget.MultiAutoCompleteTextView$Tokenizer w
	private android.widget.AutoCompleteTextView$Validator x
	private android.os.Handler y
	private android.text.TextWatcher z
	
	    static acb()
	    {
	        int v0_4;
	        String v1 = String.valueOf(",");
	        int v0_2 = String.valueOf(" ");
	        if (v0_2.length() == 0) {
	            v0_4 = new String(v1);
	        } else {
	            v0_4 = v1.concat(v0_2);
	        }
	        acb.d = v0_4;
	        acb.e = java.util.regex.Pattern.compile("(\\+[0-9]+[\\- \\.]*)?(1?[ ]*\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.][0-9\\- \\.]+[0-9])");
	        acb.f = "dismiss".hashCode();
	        return;
	    }
	
	
	    public acb(android.content.Context p10, android.util.AttributeSet p11)
	    {
	        this(p10, p11);
	        this.i = new android.graphics.Rect();
	        abj v0_3 = new int[2];
	        this.a = v0_3;
	        this.j = 0;
	        this.k = 0;
	        this.v = new android.graphics.Paint();
	        this.B = this;
	        this.K = new java.util.ArrayList();
	        this.L = 0;
	        this.N = 0;
	        this.b = 1;
	        this.O = 0;
	        this.T = 0;
	        this.V = new acc(this);
	        this.aa = new acf(this);
	        this.ab = new acg(this);
	        android.view.LayoutInflater v1_0 = p10.obtainStyledAttributes(p11, abx.a, 0, 0);
	        android.graphics.Rect v2_0 = this.getContext().getResources();
	        this.j = v1_0.getDrawable(abx.c);
	        this.l = v1_0.getDrawable(abx.i);
	        this.k = v1_0.getDrawable(abx.d);
	        if (this.k == null) {
	            this.k = v2_0.getDrawable(a.cE);
	        }
	        abj v0_26 = v1_0.getDimensionPixelSize(abx.g, -1);
	        this.q = v0_26;
	        this.p = v0_26;
	        if (this.p == -1) {
	            abj v0_30 = ((int) v2_0.getDimension(a.cy));
	            this.q = v0_30;
	            this.p = v0_30;
	        }
	        abj v0_33 = ((int) v2_0.getDimension(a.cA));
	        if (v0_33 >= null) {
	            this.p = v0_33;
	        }
	        abj v0_36 = ((int) v2_0.getDimension(a.cz));
	        if (v0_36 >= null) {
	            this.q = v0_36;
	        }
	        this.G = android.graphics.BitmapFactory.decodeResource(v2_0, a.cF);
	        this.I = ((android.widget.TextView) android.view.LayoutInflater.from(this.getContext()).inflate(a.cP, 0));
	        this.m = ((float) v1_0.getDimensionPixelSize(abx.f, -1));
	        if (this.m == -1082130432) {
	            this.m = v2_0.getDimension(a.cx);
	        }
	        this.n = ((float) v1_0.getDimensionPixelSize(abx.e, -1));
	        if (this.n == -1082130432) {
	            this.n = v2_0.getDimension(a.cB);
	        }
	        this.u = v1_0.getInt(abx.b, 1);
	        this.s = v1_0.getBoolean(abx.h, 0);
	        this.t = v2_0.getInteger(a.cM);
	        this.o = ((float) v2_0.getDimensionPixelOffset(a.cD));
	        this.g = v1_0.getColor(abx.k, v2_0.getColor(17170444));
	        this.h = v1_0.getColor(abx.j, v2_0.getColor(a.cu));
	        v1_0.recycle();
	        abj v0_70 = this.getPaint();
	        this.i.setEmpty();
	        v0_70.getTextBounds("a", 0, 1, this.i);
	        this.i.left = 0;
	        this.i.right = 0;
	        this.r = this.i.height();
	        this.C = new android.widget.ListPopupWindow(p10);
	        this.a(this.C);
	        this.D = new android.widget.ListPopupWindow(p10);
	        this.a(this.D);
	        this.E = new ach(this);
	        this.setInputType((this.getInputType() | 524288));
	        this.setOnItemClickListener(this);
	        this.setCustomSelectionActionModeCallback(this);
	        this.y = new aci(this);
	        this.z = new acw(this);
	        this.addTextChangedListener(this.z);
	        this.R = new android.view.GestureDetector(p10, this);
	        this.setOnEditorActionListener(this);
	        this.A = new abj(android.view.LayoutInflater.from(p10), p10);
	        this.A.a = this;
	        this.A.b = this;
	        return;
	    }
	
	
	    private int a(float p8, float p9)
	    {
	        int v0_10;
	        if (android.os.Build$VERSION.SDK_INT < 14) {
	            if (this.getLayout() != null) {
	                v0_10 = this.getLayout().getOffsetForHorizontal(this.getLayout().getLineForVertical(((int) (Math.min(((float) ((this.getHeight() - this.getTotalPaddingBottom()) - 1)), Math.max(0, (p9 - ((float) this.getTotalPaddingLeft())))) + ((float) this.getScrollY())))), (Math.min(((float) ((this.getWidth() - this.getTotalPaddingRight()) - 1)), Math.max(0, (p8 - ((float) this.getTotalPaddingLeft())))) + ((float) this.getScrollX())));
	            } else {
	                v0_10 = -1;
	            }
	        } else {
	            v0_10 = this.getOffsetForPosition(p8, p9);
	        }
	        int v4_2 = this.getText();
	        android.text.Editable v3_8 = v4_2.length();
	        ada v2_14 = (v3_8 - 1);
	        while ((v2_14 >= null) && (v4_2.charAt(v2_14) == 32)) {
	            v3_8--;
	            v2_14--;
	        }
	        if (v0_10 < v3_8) {
	            android.text.Editable v3_9 = this.getText();
	            while (v0_10 >= 0) {
	                ada v2_16;
	                if (v3_9.charAt(v0_10) == 32) {
	                    v2_16 = -1;
	                } else {
	                    v2_16 = v0_10;
	                }
	                if ((v2_16 != -1) || (this.c(v0_10) != null)) {
	                    break;
	                }
	                v0_10--;
	            }
	        }
	        return v0_10;
	    }
	
	
	    static synthetic int a(acb p0, int p1)
	    {
	        p0.J = p1;
	        return p1;
	    }
	
	
	    static synthetic ada a(acb p1, acx p2)
	    {
	        return p1.c(p2);
	    }
	
	
	    static synthetic android.text.TextWatcher a(acb p1)
	    {
	        return p1.z;
	    }
	
	
	    static synthetic android.text.TextWatcher a(acb p0, android.text.TextWatcher p1)
	    {
	        p0.z = p1;
	        return p1;
	    }
	
	
	    static synthetic android.widget.ListAdapter a(acb p13, ada p14)
	    {
	        android.content.Context v1 = p13.getContext();
	        long v2 = p14.c();
	        Long v4 = p14.d();
	        String v5 = p14.e();
	        long v6 = p14.f();
	        abj v10 = p13.A;
	        android.graphics.drawable.StateListDrawable v11 = p13.p();
	        super.getAdapter();
	        return new aby(v1, v2, v4, v5, v6, ((aav) super.getAdapter()).b, p13, v10, v11, 0);
	    }
	
	
	    static synthetic String a(String p2)
	    {
	        android.text.util.Rfc822Token v0_0 = android.text.util.Rfc822Tokenizer.tokenize(p2);
	        if ((v0_0 != null) && (v0_0.length > 0)) {
	            p2 = v0_0[0].getAddress();
	        }
	        return p2;
	    }
	
	
	    static synthetic void a(acb p0, aco p1, android.graphics.Bitmap p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    static synthetic void a(acb p3, String p4)
	    {
	        if ((((android.view.accessibility.AccessibilityManager) p3.getContext().getSystemService("accessibility")).isEnabled()) && (android.os.Build$VERSION.SDK_INT >= 16)) {
	            android.view.ViewParent v0_5 = p3.getParent();
	            if (v0_5 != null) {
	                android.view.accessibility.AccessibilityEvent v1_3 = android.view.accessibility.AccessibilityEvent.obtain(16384);
	                p3.onInitializeAccessibilityEvent(v1_3);
	                v1_3.getText().add(p4);
	                v1_3.setContentDescription(0);
	                v0_5.requestSendAccessibilityEvent(p3, v1_3);
	            }
	        }
	        return;
	    }
	
	
	    private void a(aco p10, android.graphics.Bitmap p11)
	    {
	        android.graphics.Paint v0_1 = new android.graphics.Canvas(p10.a);
	        float v1_2 = new android.graphics.RectF(0, 0, ((float) p11.getWidth()), ((float) p11.getHeight()));
	        float v2_3 = new android.graphics.RectF(p10.c, p10.d, p10.e, p10.f);
	        float v3_4 = new android.graphics.Matrix();
	        android.graphics.Paint v4_3 = new android.graphics.BitmapShader(p11, android.graphics.Shader$TileMode.CLAMP, android.graphics.Shader$TileMode.CLAMP);
	        v3_4.reset();
	        v3_4.setRectToRect(v1_2, v2_3, android.graphics.Matrix$ScaleToFit.FILL);
	        v4_3.setLocalMatrix(v3_4);
	        this.v.reset();
	        this.v.setShader(v4_3);
	        this.v.setAntiAlias(1);
	        this.v.setFilterBitmap(1);
	        this.v.setDither(1);
	        v0_1.drawCircle(v2_3.centerX(), v2_3.centerY(), (v2_3.width() / 1073741824), this.v);
	        this.v.reset();
	        this.v.setColor(0);
	        this.v.setStyle(android.graphics.Paint$Style.STROKE);
	        this.v.setStrokeWidth(1065353216);
	        this.v.setAntiAlias(1);
	        v0_1.drawCircle(v2_3.centerX(), v2_3.centerY(), ((v2_3.width() / 1073741824) - 1056964608), this.v);
	        this.v.reset();
	        return;
	    }
	
	
	    private void a(android.content.ClipData p13)
	    {
	        if (p13 != null) {
	            int v0_2;
	            int v0_0 = p13.getDescription();
	            if ((!v0_0.hasMimeType("text/plain")) && (!v0_0.hasMimeType("text/html"))) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            if (v0_2 != 0) {
	                this.removeTextChangedListener(this.z);
	                android.content.ClipDescription v7 = p13.getDescription();
	                int v0_4 = 0;
	                while (v0_4 < p13.getItemCount()) {
	                    int v2_6;
	                    int v2_4 = v7.getMimeType(v0_4);
	                    if ((!"text/plain".equals(v2_4)) && (!"text/html".equals(v2_4))) {
	                        v2_6 = 0;
	                    } else {
	                        v2_6 = 1;
	                    }
	                    if (v2_6 != 0) {
	                        int v2_8 = p13.getItemAt(v0_4).getText();
	                        if (!android.text.TextUtils.isEmpty(v2_8)) {
	                            ada v3_4 = this.getText();
	                            android.text.Editable v4_0 = this.getSelectionStart();
	                            int v5_0 = this.getSelectionEnd();
	                            if ((v4_0 >= null) && (v5_0 > 0)) {
	                                if (v4_0 != v5_0) {
	                                    v3_4.append(v2_8, v4_0, v5_0);
	                                } else {
	                                    v3_4.insert(v4_0, v2_8);
	                                }
	                            } else {
	                                v3_4.append(v2_8);
	                            }
	                            String v8 = this.getText().toString();
	                            int v5_1 = this.w.findTokenStart(v8, this.getSelectionEnd());
	                            String v9 = v8.substring(v5_1);
	                            int v2_11 = 0;
	                            java.util.ArrayList v10_1 = new java.util.ArrayList();
	                            if (v5_1 != 0) {
	                                android.text.Editable v4_1 = 0;
	                                ada v3_6 = v5_1;
	                                while ((v3_6 != null) && ((v2_11 == 0) && (v3_6 != v4_1))) {
	                                    android.text.Editable v4_3 = this.w.findTokenStart(v8, v3_6);
	                                    v2_11 = this.c(v4_3);
	                                    if ((v4_3 != v5_1) || (v2_11 != 0)) {
	                                        int v11_1 = v3_6;
	                                        v3_6 = v4_3;
	                                        v4_1 = v11_1;
	                                    } else {
	                                        int v2_12 = v3_6;
	                                        v3_6 = v4_3;
	                                        android.text.Editable v4_2 = v2_11;
	                                    }
	                                    if (v3_6 != v5_1) {
	                                        if (v4_2 == null) {
	                                            v2_12 = v3_6;
	                                        }
	                                        while (v2_12 < v5_1) {
	                                            this.a(v2_12, this.f(this.w.findTokenEnd(this.getText().toString(), v2_12)), this.getText());
	                                            ada v3_10 = this.c(v2_12);
	                                            if (v3_10 == null) {
	                                                break;
	                                            }
	                                            v2_12 = (this.getText().getSpanEnd(v3_10) + 1);
	                                            v10_1.add(v3_10);
	                                        }
	                                    }
	                                }
	                                v2_12 = v4_1;
	                                v4_2 = v2_11;
	                            }
	                            if (this.b(v9)) {
	                                int v2_15 = this.getText();
	                                ada v3_12 = v2_15.toString().indexOf(v9, v5_1);
	                                this.a(v3_12, v2_15.length(), v2_15);
	                                v10_1.add(this.c(v3_12));
	                            }
	                            if (v10_1.size() > 0) {
	                                int v2_19 = new acp(this);
	                                ada v3_13 = new java.util.ArrayList[1];
	                                v3_13[0] = v10_1;
	                                v2_19.execute(v3_13);
	                            }
	                        }
	                    }
	                    v0_4++;
	                }
	                this.y.post(this.V);
	            }
	        }
	        return;
	    }
	
	
	    private void a(android.widget.ListPopupWindow p2)
	    {
	        p2.setOnDismissListener(new acj(this));
	        return;
	    }
	
	
	    private boolean a(int p2, int p3)
	    {
	        if ((this.N) || ((!this.hasFocus()) || ((!this.enoughToFilter()) || (this.b(p2, p3))))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    private boolean a(int p6, int p7, android.text.Editable p8)
	    {
	        int v0_10;
	        int v0_1 = ((aav) super.getAdapter());
	        if ((v0_1 == 0) || ((v0_1.getCount() <= 0) || ((!this.enoughToFilter()) || ((p7 != this.getSelectionEnd()) || (this.f()))))) {
	            int v0_7 = this.w.findTokenEnd(p8, p6);
	            if (p8.length() > (v0_7 + 1)) {
	                int v3_2 = p8.charAt((v0_7 + 1));
	                if ((v3_2 == 44) || (v3_2 == 59)) {
	                    v0_7++;
	                }
	            }
	            int v0_9 = p8.toString().substring(p6, v0_7).trim();
	            this.clearComposingText();
	            if ((v0_9.length() <= 0) || (v0_9.equals(" "))) {
	                v0_10 = 0;
	            } else {
	                int v0_11 = this.c(v0_9);
	                if (v0_11 != 0) {
	                    android.text.method.QwertyKeyListener.markAsReplaced(p8, p6, p7, "");
	                    int v0_12 = this.d(v0_11);
	                    if ((v0_12 != 0) && ((p6 >= 0) && (p7 >= 0))) {
	                        p8.replace(p6, p7, v0_12);
	                    }
	                }
	                if (p7 == this.getSelectionEnd()) {
	                    this.dismissDropDown();
	                }
	                this.o();
	                v0_10 = 1;
	            }
	        } else {
	            if (!this.e(p8.toString().substring(p6, p7).trim())) {
	                int v0_18 = this.getListSelection();
	                if (v0_18 != -1) {
	                    this.d(v0_18);
	                } else {
	                    this.d(0);
	                }
	            }
	            this.dismissDropDown();
	            v0_10 = 1;
	        }
	        return v0_10;
	    }
	
	
	    private int b(int p4)
	    {
	        return (- ((int) (((this.m + (1073741824 * this.o)) * ((float) Math.abs((this.getLineCount() - p4)))) + ((float) this.getPaddingBottom()))));
	    }
	
	
	    static synthetic int b(acb p1, int p2)
	    {
	        return p1.b(p2);
	    }
	
	
	    static synthetic int b(acb p1, ada p2)
	    {
	        return p1.b(p2);
	    }
	
	
	    private int b(ada p2)
	    {
	        return this.getText().getSpanStart(p2);
	    }
	
	
	    static synthetic acx b(acb p1, acx p2)
	    {
	        return p1.e(p2);
	    }
	
	
	    static synthetic void b(acb p0)
	    {
	        p0.j();
	        return;
	    }
	
	
	    private boolean b(int p4, int p5)
	    {
	        int v0_5;
	        if (!this.N) {
	            int v0_3 = ((ada[]) this.getText().getSpans(p4, p5, ada));
	            if ((v0_3 == 0) || (v0_3.length <= 0)) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    static synthetic boolean b(acb p1, String p2)
	    {
	        return p1.e(p2);
	    }
	
	
	    private boolean b(CharSequence p5)
	    {
	        int v0 = 0;
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            char v1_1 = p5.length();
	            char v1_3 = p5.toString().substring(this.w.findTokenStart(p5, v1_1), v1_1).trim();
	            if (!android.text.TextUtils.isEmpty(v1_3)) {
	                char v1_4 = v1_3.charAt((v1_3.length() - 1));
	                if ((v1_4 == 44) || (v1_4 == 59)) {
	                    v0 = 1;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    private static boolean b(String p1)
	    {
	        boolean v0_3;
	        if (!android.text.TextUtils.isEmpty(p1)) {
	            v0_3 = acb.e.matcher(p1).matches();
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    static synthetic int c(acb p1, int p2)
	    {
	        p1.M = -1;
	        return -1;
	    }
	
	
	    private int c(ada p2)
	    {
	        return this.getText().getSpanEnd(p2);
	    }
	
	
	    private acx c(String p8)
	    {
	        int v1_0 = 1;
	        android.text.util.Rfc822Token[] v3_0 = 0;
	        if (!android.text.TextUtils.isEmpty(p8)) {
	            if ((!this.f()) || (!acb.b(p8))) {
	                String v0_3 = android.text.util.Rfc822Tokenizer.tokenize(p8);
	                int v2 = this.d(p8);
	                if ((v2 != 0) && ((v0_3 != null) && (v0_3.length > 0))) {
	                    int v5_2 = v0_3[0].getName();
	                    if (android.text.TextUtils.isEmpty(v5_2)) {
	                        String v0_5 = v0_3[0].getAddress();
	                        if (!android.text.TextUtils.isEmpty(v0_5)) {
	                            v3_0 = acx.a(v0_5, v2);
	                            return v3_0;
	                        }
	                    } else {
	                        v3_0 = acx.a(v5_2, v0_3[0].getAddress(), v2);
	                        return v3_0;
	                    }
	                }
	                if ((this.x == null) || (v2 != 0)) {
	                    String v0_7 = 0;
	                } else {
	                    v0_7 = this.x.fixText(p8).toString();
	                    if (!android.text.TextUtils.isEmpty(v0_7)) {
	                        if (!v0_7.contains(p8)) {
	                            v0_7 = 0;
	                            v2 = 0;
	                        } else {
	                            android.text.util.Rfc822Token[] v3_1 = android.text.util.Rfc822Tokenizer.tokenize(v0_7);
	                            if (v3_1.length <= 0) {
	                                v1_0 = v2;
	                            } else {
	                                v0_7 = v3_1[0].getAddress();
	                            }
	                            v2 = v1_0;
	                        }
	                    }
	                }
	                if (android.text.TextUtils.isEmpty(v0_7)) {
	                    v0_7 = p8;
	                }
	                v3_0 = acx.a(v0_7, v2);
	            } else {
	                v3_0 = acx.b(p8, 1);
	            }
	        }
	        return v3_0;
	    }
	
	
	    private ada c(int p7)
	    {
	        int v0_0 = this.getText();
	        int v0_2 = ((ada[]) v0_0.getSpans(0, v0_0.length(), ada));
	        int v3_1 = v0_2.length;
	        int v2_1 = 0;
	        while (v2_1 < v3_1) {
	            int v1_1 = v0_2[v2_1];
	            int v4 = this.b(v1_1);
	            int v5 = this.c(v1_1);
	            if ((p7 < v4) || (p7 > v5)) {
	                v2_1++;
	            } else {
	                int v0_3 = v1_1;
	            }
	            return v0_3;
	        }
	        v0_3 = 0;
	        return v0_3;
	    }
	
	
	    private ada c(acx p24)
	    {
	        android.graphics.Bitmap v4_2;
	        android.text.TextPaint v10 = this.getPaint();
	        float v12 = v10.getTextSize();
	        int v13 = v10.getColor();
	        if (!p24.k) {
	            v4_2 = this.getResources().getColor(17170444);
	        } else {
	            v4_2 = this.g;
	        }
	        int v6_0;
	        v10.setColor(v4_2);
	        if (!p24.k) {
	            v6_0 = this.l;
	        } else {
	            v6_0 = this.j;
	        }
	        int v7_0;
	        if (!p24.k) {
	            v7_0 = this.getResources().getColor(a.cv);
	        } else {
	            v7_0 = this.h;
	        }
	        aco v14_1 = new aco();
	        android.graphics.Rect v16_1 = new android.graphics.Rect();
	        if (v6_0 != 0) {
	            v6_0.getPadding(v16_1);
	        }
	        int v11;
	        int v17 = ((int) this.m);
	        if (!p24.k) {
	            v11 = 0;
	        } else {
	            v11 = ((v17 - v16_1.top) - v16_1.bottom);
	        }
	        float v9_0 = new float[1];
	        v10.getTextWidths(" ", v9_0);
	        android.graphics.Bitmap v4_18 = p24.c;
	        int v5_3 = p24.d;
	        if ((android.text.TextUtils.isEmpty(v4_18)) || (android.text.TextUtils.equals(v4_18, v5_3))) {
	            v4_18 = 0;
	        }
	        if (android.text.TextUtils.isEmpty(v4_18)) {
	            if (android.text.TextUtils.isEmpty(v5_3)) {
	                int v18_4 = new android.text.util.Rfc822Token;
	                v18_4(v4_18, v5_3, 0);
	                v4_18 = v18_4.toString();
	            } else {
	                v4_18 = v5_3;
	            }
	        }
	        int v5_14 = (((((((float) ((((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - this.p) - this.q)) - ((float) v11)) - v9_0[0]) - ((float) v16_1.left)) - ((float) v16_1.right)) - ((float) 0));
	        v10.setTextSize(this.n);
	        if ((v5_14 <= 0) && (android.util.Log.isLoggable("RecipientEditTextView", 3))) {
	            new StringBuilder(38).append("Max width is negative: ").append(v5_14);
	        }
	        android.graphics.Bitmap v4_22;
	        int v5_15 = android.text.TextUtils.ellipsize(v4_18, v10, v5_14, android.text.TextUtils$TruncateAt.END);
	        float v9_17 = ((int) v10.measureText(v5_15, 0, v5_15.length()));
	        if (!p24.k) {
	            v4_22 = this.q;
	        } else {
	            v4_22 = this.p;
	        }
	        int v18_15 = Math.max((v11 << 1), ((((((v4_22 + v9_17) + this.q) + v11) + v16_1.left) + v16_1.right) + 0));
	        v14_1.a = android.graphics.Bitmap.createBitmap(v18_15, v17, android.graphics.Bitmap$Config.ARGB_8888);
	        android.graphics.Bitmap v4_32 = new android.graphics.Canvas(v14_1.a);
	        if (v6_0 == 0) {
	            this.v.reset();
	            this.v.setColor(v7_0);
	            this.v.setAntiAlias(1);
	            v4_32.drawRoundRect(new android.graphics.RectF(0, 0, ((float) v18_15), ((float) v17)), ((float) (v17 / 2)), ((float) (v17 / 2)), this.v);
	        } else {
	            v6_0.setBounds(0, 0, v18_15, v17);
	            v6_0.draw(v4_32);
	        }
	        int v8_1;
	        if (!this.k()) {
	            v8_1 = ((((v18_15 - v16_1.right) - this.q) - v9_17) - 0);
	        } else {
	            v8_1 = ((this.q + v16_1.left) + 0);
	        }
	        v4_32.drawText(v5_15, 0, v5_15.length(), ((float) v8_1), ((float) (v17 - ((v17 - this.r) / 2))), v10);
	        if (0 != 0) {
	            int v5_20;
	            if (!this.k()) {
	                v5_20 = (((v18_15 - v16_1.right) - 0.getBounds().width()) - this.q);
	            } else {
	                v5_20 = (v16_1.left + this.q);
	            }
	            0.getBounds().offsetTo(v5_20, ((v17 / 2) - (0.getBounds().height() / 2)));
	            0.draw(v4_32);
	        }
	        android.graphics.Bitmap v4_34;
	        if (!this.k()) {
	            v4_34 = v16_1.left;
	        } else {
	            v4_34 = ((v18_15 - v16_1.right) - v11);
	        }
	        v14_1.c = ((float) v4_34);
	        v14_1.d = ((float) v16_1.top);
	        v14_1.e = ((float) (v4_34 + v11));
	        v14_1.f = ((float) (v17 - v16_1.bottom));
	        if (v14_1.b) {
	            android.graphics.Bitmap v4_45;
	            android.graphics.Bitmap v4_43 = p24.g;
	            if (!this.f()) {
	                if ((v4_43 == -1) || (v4_43 == -2)) {
	                    v4_45 = 0;
	                } else {
	                    v4_45 = 1;
	                }
	            } else {
	                if (v4_43 == -1) {
	                    v4_45 = 0;
	                } else {
	                    v4_45 = 1;
	                }
	            }
	            if (v4_45 != null) {
	                android.graphics.Bitmap v4_47 = p24.a();
	                if (v4_47 != null) {
	                    this.a(v14_1, android.graphics.BitmapFactory.decodeByteArray(v4_47, 0, v4_47.length));
	                } else {
	                    ((aav) super.getAdapter()).k.a(p24, new acl(this, p24, v14_1));
	                }
	            }
	        }
	        android.graphics.Bitmap v4_52 = v14_1.a;
	        int v5_29 = new android.graphics.drawable.BitmapDrawable(this.getResources(), v4_52);
	        v5_29.setBounds(0, 0, v4_52.getWidth(), v4_52.getHeight());
	        android.graphics.Bitmap v4_55 = new ade(v5_29, p24);
	        v4_55.b = this.o;
	        v10.setTextSize(v12);
	        v10.setColor(v13);
	        return v4_55;
	    }
	
	
	    static synthetic android.widget.ListPopupWindow c(acb p1)
	    {
	        return p1.C;
	    }
	
	
	    private void c(int p4, int p5)
	    {
	        if ((p4 != -1) && (p5 != -1)) {
	            android.text.Editable v0_1 = this.getText();
	            this.setSelection(p5);
	            CharSequence v1_2 = this.getText().toString().substring(p4, p5);
	            if (!android.text.TextUtils.isEmpty(v1_2)) {
	                CharSequence v1_3 = acx.a(v1_2, this.d(v1_2));
	                android.text.method.QwertyKeyListener.markAsReplaced(v0_1, p4, p5, "");
	                CharSequence v1_4 = this.d(v1_3);
	                int v2_3 = this.getSelectionEnd();
	                if ((v1_4 != null) && ((p4 >= 0) && (v2_3 >= 0))) {
	                    v0_1.replace(p4, v2_3, v1_4);
	                }
	            }
	            this.dismissDropDown();
	        } else {
	            this.dismissDropDown();
	        }
	        return;
	    }
	
	
	    static synthetic void c(acb p0, ada p1)
	    {
	        p0.f(p1);
	        return;
	    }
	
	
	    private int d(int p6)
	    {
	        int v0_5;
	        int v0_3 = this.e(((aav) super.getAdapter()).a(p6));
	        if (v0_3 != 0) {
	            this.clearComposingText();
	            int v1 = this.getSelectionEnd();
	            int v2_1 = this.w.findTokenStart(this.getText(), v1);
	            android.text.Editable v3_1 = this.getText();
	            android.text.method.QwertyKeyListener.markAsReplaced(v3_1, v2_1, v1, "");
	            int v0_4 = this.d(v0_3);
	            if ((v0_4 != 0) && ((v2_1 >= 0) && (v1 >= 0))) {
	                v3_1.replace(v2_1, v1, v0_4);
	            }
	            this.o();
	            v0_5 = (v1 - v2_1);
	        } else {
	            v0_5 = -1;
	        }
	        return v0_5;
	    }
	
	
	    static synthetic ada d(acb p1)
	    {
	        return p1.F;
	    }
	
	
	    private CharSequence d(acx p7)
	    {
	        android.text.SpannableString v0 = 0;
	        String v2_0 = this.a(p7);
	        if (!android.text.TextUtils.isEmpty(v2_0)) {
	            String v3_0 = (v2_0.length() - 1);
	            NullPointerException v1_3 = new android.text.SpannableString(v2_0);
	            if (!this.N) {
	                try {
	                    String v2_2 = this.c(p7);
	                    v1_3.setSpan(v2_2, 0, v3_0, 33);
	                    v2_2.a(v1_3.toString());
	                } catch (NullPointerException v1_4) {
	                    android.util.Log.e("RecipientEditTextView", v1_4.getMessage(), v1_4);
	                    return v0;
	                }
	            }
	            v0 = v1_3;
	        }
	        return v0;
	    }
	
	
	    private void d(ada p9)
	    {
	        if (!this.e(p9)) {
	            android.widget.ListView v0_2;
	            if (p9.c() == -2) {
	                v0_2 = 1;
	            } else {
	                super.getAdapter();
	                v0_2 = 0;
	            }
	            if ((v0_2 == null) || (!this.N)) {
	                this.F = p9;
	                this.setSelection(this.getText().getSpanEnd(this.F));
	                this.setCursorVisible(0);
	                if (v0_2 == null) {
	                    new acn(this, p9, this.C).execute(0);
	                } else {
	                    android.widget.ListView v0_6 = this.D;
	                    if (this.U) {
	                        ace v3_6 = this.b(this.getLayout().getLineForOffset(this.b(p9)));
	                        v0_6.setAnchorView(this);
	                        v0_6.setVerticalOffset(v3_6);
	                        v0_6.setAdapter(new acy(this.getContext(), p9.g(), this.A, this.p()));
	                        v0_6.setOnItemClickListener(new ace(this, p9));
	                        v0_6.show();
	                        android.widget.ListView v0_7 = v0_6.getListView();
	                        v0_7.setChoiceMode(1);
	                        v0_7.setItemChecked(0, 1);
	                    }
	                }
	            }
	        } else {
	            acn v1_3 = p9.b();
	            ace v3_11 = this.getText();
	            android.content.Context v4_4 = this.getText();
	            acx v5_1 = v4_4.getSpanStart(p9);
	            android.widget.ListView v0_8 = v4_4.getSpanEnd(p9);
	            v4_4.removeSpan(p9);
	            if ((v0_8 - v5_1) == (v3_11.length() - 1)) {
	                v0_8++;
	            }
	            v3_11.delete(v5_1, v0_8);
	            this.setCursorVisible(1);
	            this.setSelection(v3_11.length());
	            v3_11.append(v1_3);
	            this.F = this.c(acx.a(((String) v1_3), this.d(v1_3.toString())));
	        }
	        return;
	    }
	
	
	    private boolean d(String p2)
	    {
	        boolean v0_2;
	        if (this.x != null) {
	            v0_2 = this.x.isValid(p2);
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private acs e(int p11)
	    {
	        float v5_0;
	        android.graphics.drawable.BitmapDrawable v0_2 = this.I.getText().toString();
	        acs v1_1 = new Object[1];
	        v1_1[0] = Integer.valueOf(p11);
	        acs v1_2 = String.format(v0_2, v1_1);
	        this.v.set(this.getPaint());
	        this.v.setTextSize(this.I.getTextSize());
	        this.v.setColor(this.I.getCurrentTextColor());
	        int v8 = ((((int) this.v.measureText(v1_2)) + this.I.getPaddingLeft()) + this.I.getPaddingRight());
	        int v7 = ((int) this.m);
	        android.graphics.Bitmap v9 = android.graphics.Bitmap.createBitmap(v8, v7, android.graphics.Bitmap$Config.ARGB_8888);
	        android.graphics.drawable.BitmapDrawable v0_13 = new android.graphics.Canvas(v9);
	        int v3_10 = this.getLayout();
	        if (v3_10 == 0) {
	            v5_0 = v7;
	        } else {
	            v5_0 = (v7 - v3_10.getLineDescent(0));
	        }
	        v0_13.drawText(v1_2, 0, v1_2.length(), 0, ((float) v5_0), this.v);
	        android.graphics.drawable.BitmapDrawable v0_15 = new android.graphics.drawable.BitmapDrawable(this.getResources(), v9);
	        v0_15.setBounds(0, 0, v8, v7);
	        return new acs(this, v0_15);
	    }
	
	
	    private acx e(acx p7)
	    {
	        if (p7 != null) {
	            String v0 = p7.d;
	            if ((this.f()) || (p7.g != -2)) {
	                if ((acx.a(p7.g)) && ((android.text.TextUtils.isEmpty(p7.c)) || ((android.text.TextUtils.equals(p7.c, v0)) || ((this.x != null) && (!this.x.isValid(v0)))))) {
	                    p7 = acx.a(v0, p7.k);
	                }
	            } else {
	                p7 = acx.a(p7.c, v0, p7.k);
	            }
	        } else {
	            p7 = 0;
	        }
	        return p7;
	    }
	
	
	    static synthetic android.os.Handler e(acb p1)
	    {
	        return p1.y;
	    }
	
	
	    private boolean e(ada p5)
	    {
	        int v0_2;
	        int v0_0 = p5.c();
	        if ((v0_0 != -1) && ((this.f()) || (v0_0 != -2))) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private boolean e(String p2)
	    {
	        if ((android.text.TextUtils.isEmpty(p2)) || ((this.x == null) || (!this.x.isValid(p2)))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    private int f(int p3)
	    {
	        if (p3 < this.length()) {
	            char v0_3 = this.getText().toString().charAt(p3);
	            if ((v0_3 == 44) || (v0_3 == 59)) {
	                p3++;
	            }
	            if ((p3 < this.length()) && (this.getText().toString().charAt(p3) == 32)) {
	                p3++;
	            }
	        }
	        return p3;
	    }
	
	
	    static synthetic int f(acb p1)
	    {
	        return p1.J;
	    }
	
	
	    private void f(ada p6)
	    {
	        NullPointerException v0_0 = this.b(p6);
	        String v1_0 = this.c(p6);
	        android.text.Editable v2 = this.getText();
	        this.F = 0;
	        if ((v0_0 != -1) && (v1_0 != -1)) {
	            this.getText().removeSpan(p6);
	            android.text.method.QwertyKeyListener.markAsReplaced(v2, v0_0, v1_0, "");
	            v2.removeSpan(p6);
	            try {
	                if (!this.N) {
	                    v2.setSpan(this.c(p6.g()), v0_0, v1_0, 33);
	                }
	            } catch (NullPointerException v0_1) {
	                android.util.Log.e("RecipientEditTextView", v0_1.getMessage(), v0_1);
	            }
	        } else {
	            android.util.Log.w("RecipientEditTextView", "The chip doesn\'t exist or may be a chip a user was editing");
	            this.setSelection(v2.length());
	            this.n();
	        }
	        this.setCursorVisible(1);
	        this.setSelection(v2.length());
	        this.r();
	        return;
	    }
	
	
	    private void g(ada p8)
	    {
	        int v1_1;
	        android.text.Editable v2 = this.getText();
	        int v3 = v2.getSpanStart(p8);
	        int v0 = v2.getSpanEnd(p8);
	        android.text.Editable v4 = this.getText();
	        if (p8 != this.F) {
	            v1_1 = 0;
	        } else {
	            v1_1 = 1;
	        }
	        if (v1_1 != 0) {
	            this.F = 0;
	        }
	        while ((v0 >= 0) && ((v0 < v4.length()) && (v4.charAt(v0) == 32))) {
	            v0++;
	        }
	        v2.removeSpan(p8);
	        if ((v3 >= 0) && (v0 > 0)) {
	            v4.delete(v3, v0);
	        }
	        if (v1_1 != 0) {
	            this.d();
	        }
	        return;
	    }
	
	
	    static synthetic int[] g(acb p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic int h()
	    {
	        return acb.f;
	    }
	
	
	    static synthetic android.view.View h(acb p1)
	    {
	        return p1.B;
	    }
	
	
	    private ada i()
	    {
	        ada v0_0 = 0;
	        ada[] v1 = this.e();
	        if ((v1 != null) && (v1.length > 0)) {
	            v0_0 = v1[(v1.length - 1)];
	        }
	        return v0_0;
	    }
	
	
	    static synthetic android.graphics.Rect i(acb p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic android.graphics.Bitmap j(acb p1)
	    {
	        return p1.G;
	    }
	
	
	    private void j()
	    {
	        if (this.w != null) {
	            int v0_2;
	            if (this.F == null) {
	                v0_2 = -1;
	            } else {
	                v0_2 = this.F.g().g;
	            }
	            if ((this.F == null) || ((v0_2 == -1) || ((this.f()) || (v0_2 == -2)))) {
	                if (this.getWidth() > 0) {
	                    if (this.L <= 0) {
	                        Runnable v1_0 = this.getText();
	                        int v2_4 = this.getSelectionEnd();
	                        int v3 = this.w.findTokenStart(v1_0, v2_4);
	                        int v0_11 = ((ada[]) this.getText().getSpans(v3, v2_4, ada));
	                        if ((v0_11 == 0) || (v0_11.length == 0)) {
	                            int v4_2 = this.getText();
	                            int v0_14 = this.w.findTokenEnd(v4_2, v3);
	                            if ((v0_14 < v4_2.length()) && (v4_2.charAt(v0_14) == 44)) {
	                                v0_14 = this.f(v0_14);
	                            }
	                            if (v0_14 == this.getSelectionEnd()) {
	                                this.a(v3, v2_4, v1_0);
	                            } else {
	                                this.c(v3, v0_14);
	                            }
	                        }
	                    } else {
	                        this.l();
	                    }
	                    this.y.post(this.V);
	                } else {
	                    this.y.removeCallbacks(this.ab);
	                    if (this.getVisibility() != 8) {
	                        this.y.post(this.ab);
	                        return;
	                    } else {
	                        this.O = 1;
	                        return;
	                    }
	                }
	            } else {
	                this.d();
	            }
	            this.q();
	        }
	        return;
	    }
	
	
	    private boolean k()
	    {
	        int v0_2;
	        int v1 = 1;
	        if ((android.os.Build$VERSION.SDK_INT < 17) || (this.getLayoutDirection() != 1)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        int v3_2;
	        if (this.u != 0) {
	            v3_2 = 0;
	        } else {
	            v3_2 = 1;
	        }
	        if (v0_2 == 0) {
	            v1 = v3_2;
	        } else {
	            if (v3_2 != 0) {
	                v1 = 0;
	            }
	        }
	        return v1;
	    }
	
	
	    static synthetic boolean k(acb p1)
	    {
	        return p1.U;
	    }
	
	
	    static synthetic android.view.View l(acb p1)
	    {
	        return 0;
	    }
	
	
	    private void l()
	    {
	        this.y.removeCallbacks(this.aa);
	        this.y.post(this.aa);
	        return;
	    }
	
	
	    static synthetic android.widget.AdapterView$OnItemClickListener m(acb p1)
	    {
	        return p1.E;
	    }
	
	
	    private boolean m()
	    {
	        int v0_2;
	        int v0_1 = this.focusSearch(130);
	        if (v0_1 == 0) {
	            v0_2 = 0;
	        } else {
	            v0_1.requestFocus();
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    static synthetic int n(acb p1)
	    {
	        return p1.M;
	    }
	
	
	    private boolean n()
	    {
	        boolean v0_0 = 0;
	        if (this.w != null) {
	            android.text.Editable v1_1 = this.getText();
	            int v2 = this.getSelectionEnd();
	            int v3_1 = this.w.findTokenStart(v1_1, v2);
	            if (this.a(v3_1, v2)) {
	                boolean v0_3 = this.f(this.w.findTokenEnd(this.getText(), v3_1));
	                if (v0_3 == this.getSelectionEnd()) {
	                    v0_0 = this.a(v3_1, v2, v1_1);
	                } else {
	                    this.c(v3_1, v0_3);
	                    v0_0 = 1;
	                }
	            }
	        }
	        return v0_0;
	    }
	
	
	    static synthetic adc o(acb p1)
	    {
	        return p1.H;
	    }
	
	
	    private void o()
	    {
	        if (this.L <= 0) {
	            android.text.Editable v1_0 = this.e();
	            if ((v1_0 != null) && (v1_0.length > 0)) {
	                int v0_4 = 0;
	                if (v1_0.length > 1) {
	                    v0_4 = v1_0[(v1_0.length - 2)];
	                }
	                int v0_7;
	                int v2_1 = this.getText().getSpanStart(v1_0[(v1_0.length - 1)]);
	                if (v0_4 == 0) {
	                    v0_7 = 0;
	                } else {
	                    v0_7 = this.getText().getSpanEnd(v0_4);
	                    android.text.Editable v1_3 = this.getText();
	                    if ((v0_7 == -1) || (v0_7 > (v1_3.length() - 1))) {
	                        return;
	                    } else {
	                        if (v1_3.charAt(v0_7) == 32) {
	                            v0_7++;
	                        }
	                    }
	                }
	                if ((v0_7 >= 0) && ((v2_1 >= 0) && (v0_7 < v2_1))) {
	                    this.getText().delete(v0_7, v2_1);
	                }
	            }
	        }
	        return;
	    }
	
	
	    private android.graphics.drawable.StateListDrawable p()
	    {
	        android.graphics.drawable.StateListDrawable v0_1 = new android.graphics.drawable.StateListDrawable();
	        if (!this.s) {
	            int[] v1_2 = new int[1];
	            v1_2[0] = 16843518;
	            v0_1.addState(v1_2, this.k);
	        }
	        int[] v1_3 = new int[0];
	        v0_1.addState(v1_3, 0);
	        return v0_1;
	    }
	
	
	    static synthetic boolean p(acb p1)
	    {
	        if ((p1.L <= 0) && ((p1.Q == null) || (p1.Q.size() <= 0))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    private void q()
	    {
	        if (!this.N) {
	            if (this.b) {
	                int v0_4 = ((adc[]) this.getText().getSpans(0, this.getText().length(), acs));
	                if (v0_4.length > 0) {
	                    this.getText().removeSpan(v0_4[0]);
	                }
	                int v4_0 = this.e();
	                if ((v4_0 != 0) && (v4_0.length > 2)) {
	                    android.text.Editable v5_1 = this.getText();
	                    int v6 = v4_0.length;
	                    int v7 = (v6 - 2);
	                    acs v8 = this.e(v7);
	                    this.Q = new java.util.ArrayList();
	                    android.text.Editable v9 = this.getText();
	                    int v0_9 = (v6 - v7);
	                    int v2_4 = 0;
	                    android.text.SpannableString v3_1 = 0;
	                    while (v0_9 < v4_0.length) {
	                        this.Q.add(v4_0[v0_9]);
	                        if (v0_9 == (v6 - v7)) {
	                            v3_1 = v5_1.getSpanStart(v4_0[v0_9]);
	                        }
	                        if (v0_9 == (v4_0.length - 1)) {
	                            v2_4 = v5_1.getSpanEnd(v4_0[v0_9]);
	                        }
	                        if ((this.P == null) || (!this.P.contains(v4_0[v0_9]))) {
	                            v4_0[v0_9].a(v9.toString().substring(v5_1.getSpanStart(v4_0[v0_9]), v5_1.getSpanEnd(v4_0[v0_9])));
	                        }
	                        v5_1.removeSpan(v4_0[v0_9]);
	                        v0_9++;
	                    }
	                    if (v2_4 < v9.length()) {
	                        v2_4 = v9.length();
	                    }
	                    int v0_11 = Math.max(v3_1, v2_4);
	                    int v2_5 = Math.min(v3_1, v2_4);
	                    android.text.SpannableString v3_3 = new android.text.SpannableString(v9.subSequence(v2_5, v0_11));
	                    v3_3.setSpan(v8, 0, v3_3.length(), 33);
	                    v9.replace(v2_5, v0_11, v3_3);
	                    this.H = v8;
	                    if ((!this.f()) && (this.getLineCount() > this.t)) {
	                        this.setMaxLines(this.getLineCount());
	                    }
	                } else {
	                    this.H = 0;
	                }
	            }
	        } else {
	            int v4_3 = this.getText();
	            int v0_16 = 0;
	            android.text.SpannableString v3_5 = 0;
	            int v2_7 = 0;
	            while (v0_16 < 2) {
	                v2_7 = this.f(this.w.findTokenEnd(v4_3, v2_7));
	                v0_16++;
	                v3_5 = v2_7;
	            }
	            int v0_17 = 0;
	            int v2_8 = 0;
	            while (v0_17 < v4_3.length()) {
	                v0_17 = this.f(this.w.findTokenEnd(v4_3, v0_17));
	                v2_8++;
	                if (v0_17 >= v4_3.length()) {
	                    break;
	                }
	            }
	            int v0_20 = this.e((v2_8 - 2));
	            int v2_10 = new android.text.SpannableString(v4_3.subSequence(v3_5, v4_3.length()));
	            v2_10.setSpan(v0_20, 0, v2_10.length(), 33);
	            v4_3.replace(v3_5, v4_3.length(), v2_10);
	            this.H = v0_20;
	        }
	        return;
	    }
	
	
	    static synthetic void q(acb p4)
	    {
	        if (p4.w != null) {
	            int v0_1 = p4.getText();
	            int v1 = p4.getSelectionEnd();
	            int v2_1 = p4.w.findTokenStart(v0_1, v1);
	            if (p4.a(v2_1, v1)) {
	                p4.a(v2_1, v1, v0_1);
	            }
	            p4.setSelection(p4.getText().length());
	        }
	        return;
	    }
	
	
	    static synthetic android.widget.MultiAutoCompleteTextView$Tokenizer r(acb p1)
	    {
	        return p1.w;
	    }
	
	
	    private void r()
	    {
	        if ((this.C != null) && (this.C.isShowing())) {
	            this.C.dismiss();
	        }
	        if ((this.D != null) && (this.D.isShowing())) {
	            this.D.dismiss();
	        }
	        this.setSelection(this.getText().length());
	        return;
	    }
	
	
	    static synthetic boolean s(acb p1)
	    {
	        return p1.N;
	    }
	
	
	    static synthetic java.util.ArrayList t(acb p1)
	    {
	        return p1.Q;
	    }
	
	
	    static synthetic acp u(acb p1)
	    {
	        return p1.W;
	    }
	
	
	    static synthetic float v(acb p1)
	    {
	        return p1.o;
	    }
	
	
	    final String a(acx p6)
	    {
	        String v0_0 = p6.c;
	        int v2_0 = p6.d;
	        if ((android.text.TextUtils.isEmpty(v0_0)) || (android.text.TextUtils.equals(v0_0, v2_0))) {
	            v0_0 = 0;
	        }
	        if ((!this.f()) || (!acb.b(v2_0))) {
	            if (v2_0 != 0) {
	                android.text.util.Rfc822Token v3_4 = android.text.util.Rfc822Tokenizer.tokenize(v2_0);
	                if ((v3_4 != null) && (v3_4.length > 0)) {
	                    v2_0 = v3_4[0].getAddress();
	                }
	            }
	            String v0_2 = new android.text.util.Rfc822Token(v0_0, v2_0, 0).toString().trim();
	        } else {
	            v0_2 = v2_0.trim();
	        }
	        android.widget.MultiAutoCompleteTextView$Tokenizer v1_2 = v0_2.indexOf(",");
	        if ((this.w != null) && ((!android.text.TextUtils.isEmpty(v0_2)) && (v1_2 < (v0_2.length() - 1)))) {
	            v0_2 = ((String) this.w.terminateToken(v0_2));
	        }
	        return v0_2;
	    }
	
	
	    public final void a()
	    {
	        if (this.F != null) {
	            this.g(this.F);
	        }
	        this.r();
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        android.widget.ListView v0_1 = this.C.getListView();
	        if ((v0_1 != null) && (v0_1.getCheckedItemCount() == 0)) {
	            v0_1.setItemChecked(p3, 1);
	        }
	        this.M = p3;
	        return;
	    }
	
	
	    final void a(ada p9, acx p10)
	    {
	        int v1;
	        if (p9 != this.F) {
	            v1 = 0;
	        } else {
	            v1 = 1;
	        }
	        if (v1 != 0) {
	            this.F = 0;
	        }
	        String v4_0 = this.b(p9);
	        int v0_2 = this.c(p9);
	        this.getText().removeSpan(p9);
	        android.text.Editable v5_1 = this.getText();
	        CharSequence v6 = this.d(p10);
	        if (v6 != null) {
	            if ((v4_0 != -1) && (v0_2 != -1)) {
	                if (android.text.TextUtils.isEmpty(v6)) {
	                    this.setCursorVisible(1);
	                    if (v1 != 0) {
	                        this.d();
	                    }
	                    return;
	                }
	                while ((v0_2 >= 0) && ((v0_2 < v5_1.length()) && (v5_1.charAt(v0_2) == 32))) {
	                    v0_2++;
	                }
	                v5_1.replace(v4_0, v0_2, v6);
	            } else {
	                android.util.Log.e("RecipientEditTextView", "The chip to replace does not exist but should.");
	                v5_1.insert(0, v6);
	            }
	        }
	    }
	
	
	    public final boolean a(ada p5)
	    {
	        int v0_2;
	        int v0_0 = p5.c();
	        if ((v0_0 != -1) && ((this.f()) || (v0_0 != -2))) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean a(CharSequence p4)
	    {
	        char v0_2;
	        int v1 = 0;
	        if (this.getSelectionEnd() != 0) {
	            v0_2 = (this.getSelectionEnd() - 1);
	        } else {
	            v0_2 = 0;
	        }
	        char v0_3;
	        int v2_1 = (this.length() - 1);
	        if (v0_2 == v2_1) {
	            v0_3 = p4.charAt(v2_1);
	        } else {
	            v0_3 = p4.charAt(v0_2);
	        }
	        if ((v0_3 == 44) || (v0_3 == 59)) {
	            v1 = 1;
	        }
	        return v1;
	    }
	
	
	    public void append(CharSequence p5, int p6, int p7)
	    {
	        if (this.z != null) {
	            this.removeTextChangedListener(this.z);
	        }
	        super.append(p5, p6, p7);
	        if ((!android.text.TextUtils.isEmpty(p5)) && (android.text.TextUtils.getTrimmedLength(p5) > 0)) {
	            String v0_4 = p5.toString();
	            if (!v0_4.trim().endsWith(",")) {
	                super.append(acb.d, 0, acb.d.length());
	                java.util.ArrayList v1_3 = String.valueOf(v0_4);
	                String v0_6 = String.valueOf(acb.d);
	                if (v0_6.length() == 0) {
	                    v0_4 = new String(v1_3);
	                } else {
	                    v0_4 = v1_3.concat(v0_6);
	                }
	            }
	            if ((!android.text.TextUtils.isEmpty(v0_4)) && (android.text.TextUtils.getTrimmedLength(v0_4) > 0)) {
	                this.L = (this.L + 1);
	                this.K.add(v0_4);
	            }
	        }
	        if (this.L > 0) {
	            this.l();
	        }
	        this.y.post(this.V);
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.dismissDropDown();
	        return;
	    }
	
	
	    public final void b(acx p11)
	    {
	        ada[] v0_2 = ((ada[]) this.getText().getSpans(0, this.getText().length(), ada));
	        int v4 = v0_2.length;
	        int v3_1 = 0;
	        while (v3_1 < v4) {
	            ada v5 = v0_2[v3_1];
	            int v1_2 = v5.g();
	            if ((v1_2 != 0) && (v1_2.k)) {
	                if ((p11 == null) || (v1_2.g != p11.g)) {
	                    int v1_4 = 0;
	                } else {
	                    v1_4 = 1;
	                }
	                if (v1_4 != 0) {
	                    this.g(v5);
	                }
	            }
	            v3_1++;
	        }
	        return;
	    }
	
	
	    final void c()
	    {
	        android.text.Editable v1_0 = 0;
	        if ((this.getWidth() > 0) && (this.L > 0)) {
	            try {
	                android.text.Editable v9 = this.getText();
	            } catch (adb v0_56) {
	                throw v0_56;
	            }
	            if (this.L > 50) {
	                this.N = 1;
	            } else {
	                int v7 = 0;
	                while (v7 < this.K.size()) {
	                    adb v0_41 = ((String) this.K.get(v7));
	                    int v10 = v9.toString().indexOf(v0_41);
	                    adb v0_44 = ((v0_41.length() + v10) - 1);
	                    if (v10 >= 0) {
	                        if ((v0_44 >= (v9.length() - 2)) || (v9.charAt(v0_44) != 44)) {
	                            int v6_1 = v0_44;
	                        } else {
	                            v6_1 = (v0_44 + 1);
	                        }
	                        if ((v7 >= 2) && (this.b)) {
	                            java.util.ArrayList v3_9 = 0;
	                        } else {
	                            v3_9 = 1;
	                        }
	                        if (!this.b(v10, v6_1)) {
	                            java.util.ArrayList v2_10;
	                            adb v0_49 = v9.toString().substring(v10, v6_1);
	                            java.util.ArrayList v2_9 = v0_49.trim();
	                            String v11_1 = v2_9.lastIndexOf(44);
	                            if ((v11_1 == -1) || (v11_1 != (v2_9.length() - 1))) {
	                                v2_10 = v0_49;
	                            } else {
	                                v2_10 = v2_9.substring(0, (v2_9.length() - 1));
	                            }
	                            String v11_4 = this.c(v2_10);
	                            if (v11_4 != null) {
	                                try {
	                                    adb v0_54;
	                                    if (this.N) {
	                                        v0_54 = 0;
	                                    } else {
	                                        if (v3_9 == null) {
	                                            v0_54 = new adb(v11_4);
	                                        } else {
	                                            v0_54 = this.c(v11_4);
	                                        }
	                                    }
	                                    v9.setSpan(v0_54, v10, v6_1, 33);
	                                    if (v0_54 != null) {
	                                        if (this.P == null) {
	                                            this.P = new java.util.ArrayList();
	                                        }
	                                        v0_54.a(v2_10);
	                                        this.P.add(v0_54);
	                                    }
	                                } catch (adb v0_55) {
	                                    android.util.Log.e("RecipientEditTextView", v0_55.getMessage(), v0_55);
	                                }
	                            }
	                        }
	                    }
	                    this.L = (this.L - 1);
	                    v7++;
	                }
	                if (this.L <= 0) {
	                    adb v0_7 = this.e();
	                    java.util.ArrayList v2_1 = this.getText();
	                    if ((v0_7 != null) && (v0_7.length > 0)) {
	                        adb v0_11 = ((acs[]) this.getText().getSpans(0, this.getText().length(), acs));
	                        if ((v0_11 != null) && (v0_11.length > 0)) {
	                            v1_0 = v0_11[0];
	                        }
	                        adb v0_14;
	                        this.H = v1_0;
	                        if (this.H == null) {
	                            v0_14 = this.getText().getSpanEnd(this.i());
	                        } else {
	                            v0_14 = v2_1.getSpanEnd(this.H);
	                        }
	                        android.text.Editable v1_3 = this.getText();
	                        java.util.ArrayList v2_2 = v1_3.length();
	                        if (v2_2 > v0_14) {
	                            if (android.util.Log.isLoggable("RecipientEditTextView", 3)) {
	                                java.util.ArrayList v3_4 = String.valueOf(v1_3);
	                                new StringBuilder((String.valueOf(v3_4).length() + 61)).append("There were extra characters after the last tokenizable entry.").append(v3_4);
	                            }
	                            v1_3.delete((v0_14 + 1), v2_2);
	                        }
	                    }
	                }
	            }
	            if ((this.P == null) || ((this.P.size() <= 0) || (this.P.size() > 50))) {
	                this.P = 0;
	                this.q();
	            } else {
	                if ((!this.hasFocus()) && (this.P.size() >= 2)) {
	                    this.W = new acp(this);
	                    adb v0_28 = this.W;
	                    android.text.Editable v1_6 = new java.util.ArrayList[1];
	                    v1_6[0] = new java.util.ArrayList(this.P.subList(0, 2));
	                    v0_28.execute(v1_6);
	                    if (this.P.size() <= 2) {
	                        this.P = 0;
	                    } else {
	                        this.P = new java.util.ArrayList(this.P.subList(2, this.P.size()));
	                    }
	                    this.q();
	                } else {
	                    android.text.Editable v1_10 = new Void[0];
	                    new act(this).execute(v1_10);
	                    this.P = 0;
	                }
	            }
	            this.L = 0;
	            this.K.clear();
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        if (this.F != null) {
	            this.f(this.F);
	            this.F = 0;
	        }
	        this.setCursorVisible(1);
	        this.setSelection(this.getText().length());
	        return;
	    }
	
	
	    final ada[] e()
	    {
	        java.util.ArrayList v1_2 = new java.util.ArrayList(java.util.Arrays.asList(((ada[]) this.getText().getSpans(0, this.getText().length(), ada))));
	        java.util.Collections.sort(v1_2, new acd(this, this.getText()));
	        ada[] v0_6 = new ada[v1_2.size()];
	        return ((ada[]) v1_2.toArray(v0_6));
	    }
	
	
	    protected final boolean f()
	    {
	        if ((((aav) super.getAdapter()) == null) || (((aav) super.getAdapter()).b != 1)) {
	            int v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public final aav g()
	    {
	        return ((aav) super.getAdapter());
	    }
	
	
	    public synthetic android.widget.ListAdapter getAdapter()
	    {
	        return ((aav) super.getAdapter());
	    }
	
	
	    public boolean onActionItemClicked(android.view.ActionMode p2, android.view.MenuItem p3)
	    {
	        return 0;
	    }
	
	
	    protected void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        this.U = 1;
	        android.view.View v0_1 = this.getDropDownAnchor();
	        if (v0_1 != -1) {
	            this.B = this.getRootView().findViewById(v0_1);
	        }
	        return;
	    }
	
	
	    public boolean onCreateActionMode(android.view.ActionMode p2, android.view.Menu p3)
	    {
	        return 0;
	    }
	
	
	    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p4)
	    {
	        android.view.inputmethod.InputConnection v1 = super.onCreateInputConnection(p4);
	        String v0_1 = (p4.imeOptions & 255);
	        if ((v0_1 & 6) != 0) {
	            p4.imeOptions = (v0_1 ^ p4.imeOptions);
	            p4.imeOptions = (p4.imeOptions | 6);
	        }
	        if ((p4.imeOptions & 1073741824) != 0) {
	            p4.imeOptions = (p4.imeOptions & -1073741825);
	        }
	        String v0_12;
	        p4.actionId = 6;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            v0_12 = this.getContext().getString(a.cR);
	        } else {
	            v0_12 = 0;
	        }
	        p4.actionLabel = v0_12;
	        return v1;
	    }
	
	
	    public void onDestroyActionMode(android.view.ActionMode p1)
	    {
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        this.U = 0;
	        this.r();
	        return;
	    }
	
	
	    public boolean onDown(android.view.MotionEvent p2)
	    {
	        return 0;
	    }
	
	
	    public boolean onDragEvent(android.view.DragEvent p3)
	    {
	        boolean v0_0 = 1;
	        switch (p3.getAction()) {
	            case 1:
	                v0_0 = p3.getClipDescription().hasMimeType("text/plain");
	                break;
	            case 2:
	            case 4:
	            default:
	                v0_0 = 0;
	                break;
	            case 3:
	                this.a(p3.getClipData());
	                break;
	            case 5:
	                this.requestFocus();
	                break;
	        }
	        return v0_0;
	    }
	
	
	    public boolean onEditorAction(android.widget.TextView p3, int p4, android.view.KeyEvent p5)
	    {
	        int v0 = 1;
	        if (p4 != 6) {
	            v0 = 0;
	        } else {
	            if (!this.n()) {
	                if (this.F == null) {
	                    if (!this.m()) {
	                    }
	                } else {
	                    this.d();
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public boolean onFling(android.view.MotionEvent p2, android.view.MotionEvent p3, float p4, float p5)
	    {
	        return 0;
	    }
	
	
	    public void onFocusChanged(boolean p9, int p10, android.graphics.Rect p11)
	    {
	        super.onFocusChanged(p9, p10, p11);
	        if (p9) {
	            if (this.b) {
	                this.setMaxLines(2147483647);
	            }
	            if (this.H != null) {
	                java.util.ArrayList v0_3 = this.getText();
	                v0_3.removeSpan(this.H);
	                this.H = 0;
	                if ((this.Q != null) && (this.Q.size() > 0)) {
	                    int v1_4 = this.e();
	                    if ((v1_4 != 0) && (v1_4.length != 0)) {
	                        java.util.ArrayList v0_4 = v0_3.getSpanEnd(v1_4[(v1_4.length - 1)]);
	                        android.text.Editable v4 = this.getText();
	                        java.util.Iterator v5 = this.Q.iterator();
	                        int v2_3 = v0_4;
	                        while (v5.hasNext()) {
	                            java.util.ArrayList v0_8 = ((ada) v5.next());
	                            int v1_8 = ((String) v0_8.h());
	                            int v2_4 = v4.toString().indexOf(v1_8, v2_3);
	                            int v1_11 = Math.min(v4.length(), (v1_8.length() + v2_4));
	                            if (v2_4 != -1) {
	                                v4.setSpan(v0_8, v2_4, v1_11, 33);
	                            }
	                            v2_3 = v1_11;
	                        }
	                        this.Q.clear();
	                    }
	                }
	            }
	            java.util.ArrayList v0_11;
	            this.setCursorVisible(1);
	            java.util.ArrayList v0_10 = this.getText();
	            if ((v0_10 == null) || (v0_10.length() <= 0)) {
	                v0_11 = 0;
	            } else {
	                v0_11 = v0_10.length();
	            }
	            this.setSelection(v0_11);
	            if ((this.P != null) && (this.P.size() > 0)) {
	                int v1_13 = new Void[0];
	                new act(this).execute(v1_13);
	                this.P = 0;
	            }
	        } else {
	            this.j();
	        }
	        return;
	    }
	
	
	    public void onItemClick(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        if ((p5 >= 0) && (((aav) super.getAdapter()).a(p5).a != 1)) {
	            this.d(p5);
	        }
	        return;
	    }
	
	
	    public boolean onKeyDown(int p3, android.view.KeyEvent p4)
	    {
	        boolean v0 = 1;
	        if ((this.F != null) && (p3 == 67)) {
	            if ((this.C != null) && (this.C.isShowing())) {
	                this.C.dismiss();
	            }
	            this.g(this.F);
	        }
	        switch (p3) {
	            case 23:
	            case 66:
	                if (!p4.hasNoModifiers()) {
	                    v0 = super.onKeyDown(p3, p4);
	                } else {
	                    if (this.n()) {
	                    } else {
	                        if (this.F == null) {
	                            if (!this.m()) {
	                            } else {
	                            }
	                        } else {
	                            this.d();
	                        }
	                    }
	                }
	                break;
	            default:
	        }
	        return v0;
	    }
	
	
	    public boolean onKeyPreIme(int p2, android.view.KeyEvent p3)
	    {
	        if ((p2 != 4) || (this.F == null)) {
	            int v0_2 = super.onKeyPreIme(p2, p3);
	        } else {
	            this.d();
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        switch (p2) {
	            case 61:
	                if (!p3.hasNoModifiers()) {
	                } else {
	                    if (this.F == null) {
	                        this.n();
	                    } else {
	                        this.d();
	                    }
	                }
	                break;
	        }
	        return super.onKeyUp(p2, p3);
	    }
	
	
	    public void onLongPress(android.view.MotionEvent p4)
	    {
	        if (this.F == null) {
	            android.app.FragmentManager v0_3 = this.c(this.a(p4.getX(), p4.getY()));
	            if (v0_3 != null) {
	                abf v1_1 = v0_3.g().d;
	                android.app.FragmentManager v0_5 = this.getContext();
	                if ((this.U) && ((v0_5 != null) && ((v0_5 instanceof android.app.Activity)))) {
	                    abf.a(v1_1).show(((android.app.Activity) v0_5).getFragmentManager(), "chips-copy-dialog");
	                }
	            }
	        }
	        return;
	    }
	
	
	    public boolean onPrepareActionMode(android.view.ActionMode p2, android.view.Menu p3)
	    {
	        return 0;
	    }
	
	
	    public void onRestoreInstanceState(android.os.Parcelable p2)
	    {
	        if (android.text.TextUtils.isEmpty(this.getText())) {
	            super.onRestoreInstanceState(p2);
	        } else {
	            super.onRestoreInstanceState(0);
	        }
	        return;
	    }
	
	
	    public android.os.Parcelable onSaveInstanceState()
	    {
	        this.d();
	        return super.onSaveInstanceState();
	    }
	
	
	    public boolean onScroll(android.view.MotionEvent p2, android.view.MotionEvent p3, float p4, float p5)
	    {
	        return 0;
	    }
	
	
	    public void onSelectionChanged(int p3, int p4)
	    {
	        int v0_0 = this.i();
	        if ((this.F == null) && ((v0_0 != 0) && (p3 < this.getText().getSpanEnd(v0_0)))) {
	            this.setSelection(Math.min((this.getText().getSpanEnd(v0_0) + 1), this.getText().length()));
	        }
	        super.onSelectionChanged(p3, p4);
	        return;
	    }
	
	
	    public void onShowPress(android.view.MotionEvent p1)
	    {
	        return;
	    }
	
	
	    public boolean onSingleTapUp(android.view.MotionEvent p2)
	    {
	        return 0;
	    }
	
	
	    public void onSizeChanged(int p8, int p9, int p10, int p11)
	    {
	        super.onSizeChanged(p8, p9, p10, p11);
	        if ((p8 != 0) && (p9 != 0)) {
	            if (this.L <= 0) {
	                boolean v1_0 = this.e();
	                if (v1_0) {
	                    int v2 = v1_0.length;
	                    int v0_1 = 0;
	                    while (v0_1 < v2) {
	                        boolean v3 = v1_0[v0_1];
	                        acx v4_0 = v3.i();
	                        if ((this.getWidth() > 0) && ((v4_0.right - v4_0.left) > ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()))) {
	                            this.a(v3, v3.g());
	                        }
	                        v0_1++;
	                    }
	                }
	            } else {
	                this.l();
	            }
	        }
	        if ((this.c == null) && (!this.S)) {
	            int v0_4 = this.getParent();
	            while ((v0_4 != 0) && (!(v0_4 instanceof android.widget.ScrollView))) {
	                v0_4 = v0_4.getParent();
	            }
	            if (v0_4 != 0) {
	                this.c = ((android.widget.ScrollView) v0_4);
	            }
	            this.S = 1;
	        }
	        return;
	    }
	
	
	    public boolean onTextContextMenuItem(int p3)
	    {
	        boolean v0_1;
	        if (p3 != 16908322) {
	            v0_1 = super.onTextContextMenuItem(p3);
	        } else {
	            this.a(((android.content.ClipboardManager) this.getContext().getSystemService("clipboard")).getPrimaryClip());
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p8)
	    {
	        int v0_2;
	        if (this.isFocused()) {
	            int v1_0 = super.onTouchEvent(p8);
	            int v3 = p8.getAction();
	            if (this.F == null) {
	                this.R.onTouchEvent(p8);
	            }
	            int v1_1;
	            if (v3 != 1) {
	                v0_2 = v1_0;
	                v1_1 = 0;
	            } else {
	                boolean v4_4 = this.c(this.a(p8.getX(), p8.getY()));
	                if (!v4_4) {
	                    if ((this.F == null) || (!this.e(this.F))) {
	                    } else {
	                        v0_2 = v1_0;
	                        v1_1 = 1;
	                    }
	                } else {
	                    if ((this.F == null) || (this.F == v4_4)) {
	                        if (this.F != null) {
	                            if (this.F.a()) {
	                                this.d();
	                            }
	                        } else {
	                            this.n();
	                            this.d(v4_4);
	                        }
	                    } else {
	                        this.d();
	                        this.d(v4_4);
	                    }
	                    v1_1 = 1;
	                    v0_2 = 1;
	                }
	            }
	            if ((v3 == 1) && (v1_1 == 0)) {
	                this.d();
	            }
	        } else {
	            v0_2 = super.onTouchEvent(p8);
	        }
	        return v0_2;
	    }
	
	
	    public void performFiltering(CharSequence p5, int p6)
	    {
	        int v0_0 = this.b(p5);
	        if ((!this.enoughToFilter()) || (v0_0 != 0)) {
	            if (v0_0 == 0) {
	                super.performFiltering(p5, p6);
	            } else {
	                this.dismissDropDown();
	            }
	        } else {
	            int v0_1 = this.getSelectionEnd();
	            int v0_3 = ((ada[]) this.getText().getSpans(this.w.findTokenStart(p5, v0_1), v0_1, ada));
	            if ((v0_3 == 0) || (v0_3.length <= 0)) {
	            } else {
	                this.dismissDropDown();
	            }
	        }
	        return;
	    }
	
	
	    public void performValidation()
	    {
	        return;
	    }
	
	
	    public void removeTextChangedListener(android.text.TextWatcher p2)
	    {
	        this.z = 0;
	        super.removeTextChangedListener(p2);
	        return;
	    }
	
	
	    protected void replaceText(CharSequence p1)
	    {
	        return;
	    }
	
	
	    public void setAdapter(android.widget.ListAdapter p3)
	    {
	        super.setAdapter(p3);
	        ((aav) p3).m = new ack(this);
	        ((aav) p3).d = this.A;
	        ((aav) p3).d.c = ((aav) p3).a;
	        return;
	    }
	
	
	    public void setDropDownAnchor(int p2)
	    {
	        super.setDropDownAnchor(p2);
	        if (p2 != -1) {
	            this.B = this.getRootView().findViewById(p2);
	        }
	        return;
	    }
	
	
	    public void setTokenizer(android.widget.MultiAutoCompleteTextView$Tokenizer p2)
	    {
	        this.w = p2;
	        super.setTokenizer(this.w);
	        return;
	    }
	
	
	    public void setValidator(android.widget.AutoCompleteTextView$Validator p1)
	    {
	        this.x = p1;
	        super.setValidator(p1);
	        return;
	    }
	
	
	    public void setVisibility(int p3)
	    {
	        super.setVisibility(p3);
	        if ((p3 != 8) && (this.O)) {
	            this.O = 0;
	            this.y.post(this.ab);
	        }
	        return;
	    }
	
