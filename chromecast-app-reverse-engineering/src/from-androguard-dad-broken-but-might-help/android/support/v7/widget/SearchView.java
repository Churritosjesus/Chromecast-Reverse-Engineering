	public static final  a
	public static final aaj m
	private java.lang.CharSequence A
	private  B
	private  C
	private java.lang.CharSequence D
	private java.lang.CharSequence E
	private  F
	private  G
	private java.lang.Runnable H
	private final java.lang.Runnable I
	private java.lang.Runnable J
	private final android.view.View$OnClickListener K
	private android.view.View$OnKeyListener L
	private final android.widget.TextView$OnEditorActionListener M
	private final android.widget.AdapterView$OnItemClickListener N
	private final android.widget.AdapterView$OnItemSelectedListener O
	private android.text.TextWatcher P
	public final android.support.v7.widget.SearchView$SearchAutoComplete b
	public final  c
	public final  d
	public final android.content.Intent e
	public final android.content.Intent f
	public  i
	public kj j
	public  k
	public android.app.SearchableInfo l
	public final java.util.WeakHashMap n
	private final android.view.View o
	private final android.view.View p
	private final android.view.View q
	private final android.widget.ImageView r
	private final android.widget.ImageView s
	private final android.widget.ImageView t
	private final android.widget.ImageView u
	private final android.view.View v
	private final android.widget.ImageView w
	private final android.graphics.drawable.Drawable x
	private final java.lang.CharSequence y
	private  z
	
	    static SearchView()
	    {
	        aaj v0_1;
	        if (android.os.Build$VERSION.SDK_INT < 8) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        android.support.v7.widget.SearchView.a = v0_1;
	        android.support.v7.widget.SearchView.m = new aaj();
	        return;
	    }
	
	
	    public SearchView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public SearchView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.O);
	        return;
	    }
	
	
	    public SearchView(android.content.Context p9, android.util.AttributeSet p10, int p11)
	    {
	        this(p9, p10, p11);
	        this.H = new zx(this);
	        this.I = new aab(this);
	        this.J = new aac(this);
	        this.n = new java.util.WeakHashMap();
	        this.K = new aag(this);
	        this.L = new aah(this);
	        this.M = new aai(this);
	        this.N = new zy(this);
	        this.O = new zz(this);
	        this.P = new aaa(this);
	        aaf v1_0 = th.a(p9, p10, oq.aW, p11, 0);
	        v1_0.a();
	        android.view.LayoutInflater.from(p9).inflate(v1_0.e(oq.bg, a.bS), this, 1);
	        this.b = ((android.support.v7.widget.SearchView$SearchAutoComplete) this.findViewById(a.br));
	        this.b.a = this;
	        this.o = this.findViewById(a.bn);
	        this.p = this.findViewById(a.bq);
	        this.q = this.findViewById(a.bv);
	        this.r = ((android.widget.ImageView) this.findViewById(a.bl));
	        this.s = ((android.widget.ImageView) this.findViewById(a.bo));
	        this.t = ((android.widget.ImageView) this.findViewById(a.bm));
	        this.u = ((android.widget.ImageView) this.findViewById(a.bs));
	        this.w = ((android.widget.ImageView) this.findViewById(a.bp));
	        this.p.setBackgroundDrawable(v1_0.a(oq.bh));
	        this.q.setBackgroundDrawable(v1_0.a(oq.bl));
	        this.r.setImageDrawable(v1_0.a(oq.bk));
	        this.s.setImageDrawable(v1_0.a(oq.be));
	        this.t.setImageDrawable(v1_0.a(oq.bb));
	        this.u.setImageDrawable(v1_0.a(oq.bn));
	        this.w.setImageDrawable(v1_0.a(oq.bk));
	        this.x = v1_0.a(oq.bj);
	        this.c = v1_0.e(oq.bm, a.bR);
	        this.d = v1_0.e(oq.bc, 0);
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
	        this.a(v1_0.a(oq.bf, 1));
	        android.view.ViewTreeObserver v0_74 = v1_0.c(oq.ba, -1);
	        if (v0_74 != -1) {
	            this.C = v0_74;
	            this.requestLayout();
	        }
	        this.y = v1_0.c(oq.bd);
	        this.A = v1_0.c(oq.bi);
	        android.view.ViewTreeObserver v0_80 = v1_0.a(oq.aY, -1);
	        if (v0_80 != -1) {
	            this.b.setImeOptions(v0_80);
	        }
	        android.view.ViewTreeObserver v0_82 = v1_0.a(oq.aZ, -1);
	        if (v0_82 != -1) {
	            this.b.setInputType(v0_82);
	        }
	        this.setFocusable(v1_0.a(oq.aX, 1));
	        v1_0.a.recycle();
	        this.e = new android.content.Intent("android.speech.action.WEB_SEARCH");
	        this.e.addFlags(268435456);
	        this.e.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
	        this.f = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
	        this.f.addFlags(268435456);
	        this.v = this.findViewById(this.b.getDropDownAnchor());
	        if (this.v != null) {
	            if (android.os.Build$VERSION.SDK_INT < 11) {
	                this.v.getViewTreeObserver().addOnGlobalLayoutListener(new aaf(this));
	            } else {
	                this.v.addOnLayoutChangeListener(new aae(this));
	            }
	        }
	        this.b(this.z);
	        this.c();
	        return;
	    }
	
	
	    private android.content.Intent a(android.database.Cursor p9, int p10, String p11)
	    {
	        try {
	            String v1_0 = aal.a(p9, "suggest_intent_action");
	        } catch (android.content.Intent v0_13) {
	            String v1_1 = v0_13;
	            try {
	                android.content.Intent v0_14 = p9.getPosition();
	            } catch (android.content.Intent v0) {
	                v0_14 = -1;
	            }
	            android.util.Log.w("SearchView", new StringBuilder("Search suggestions cursor at row ").append(v0_14).append(" returned exception.").toString(), v1_1);
	            android.content.Intent v0_12 = 0;
	            return v0_12;
	        }
	        if ((v1_0 == null) && (android.os.Build$VERSION.SDK_INT >= 8)) {
	            v1_0 = this.l.getSuggestIntentAction();
	        }
	        if (v1_0 == null) {
	            v1_0 = "android.intent.action.SEARCH";
	        }
	        android.content.Intent v0_4 = aal.a(p9, "suggest_intent_data");
	        if ((android.support.v7.widget.SearchView.a) && (v0_4 == null)) {
	            v0_4 = this.l.getSuggestIntentData();
	        }
	        if (v0_4 != null) {
	            android.net.Uri v2_3 = aal.a(p9, "suggest_intent_data_id");
	            if (v2_3 != null) {
	                v0_4 = new StringBuilder().append(v0_4).append("/").append(android.net.Uri.encode(v2_3)).toString();
	            }
	        }
	        android.net.Uri v2_5;
	        if (v0_4 != null) {
	            v2_5 = android.net.Uri.parse(v0_4);
	        } else {
	            v2_5 = 0;
	        }
	        v0_12 = this.a(v1_0, v2_5, aal.a(p9, "suggest_intent_extra_data"), aal.a(p9, "suggest_intent_query"), p10, p11);
	        return v0_12;
	    }
	
	
	    private android.content.Intent a(String p4, android.net.Uri p5, String p6, String p7, int p8, String p9)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p4);
	        v0_1.addFlags(268435456);
	        if (p5 != null) {
	            v0_1.setData(p5);
	        }
	        v0_1.putExtra("user_query", this.E);
	        if (p7 != null) {
	            v0_1.putExtra("query", p7);
	        }
	        if (p6 != null) {
	            v0_1.putExtra("intent_extra_data_key", p6);
	        }
	        if (p8 != 0) {
	            v0_1.putExtra("action_key", p8);
	            v0_1.putExtra("action_msg", p9);
	        }
	        if (android.support.v7.widget.SearchView.a) {
	            v0_1.setComponent(this.l.getSearchActivity());
	        }
	        return v0_1;
	    }
	
	
	    private void a(int p8, String p9, String p10)
	    {
	        this.getContext().startActivity(this.a("android.intent.action.SEARCH", 0, 0, p10, p8, p9));
	        return;
	    }
	
	
	    private void a(android.content.Intent p5)
	    {
	        if (p5 != null) {
	            try {
	                this.getContext().startActivity(p5);
	            } catch (RuntimeException v0_1) {
	                android.util.Log.e("SearchView", new StringBuilder("Failed launch activity: ").append(p5).toString(), v0_1);
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.SearchView p2)
	    {
	        int[] v0_2;
	        if (!p2.b.hasFocus()) {
	            v0_2 = android.support.v7.widget.SearchView.EMPTY_STATE_SET;
	        } else {
	            v0_2 = android.support.v7.widget.SearchView.FOCUSED_STATE_SET;
	        }
	        android.graphics.drawable.Drawable v1_1 = p2.p.getBackground();
	        if (v1_1 != null) {
	            v1_1.setState(v0_2);
	        }
	        android.graphics.drawable.Drawable v1_3 = p2.q.getBackground();
	        if (v1_3 != null) {
	            v1_3.setState(v0_2);
	        }
	        p2.invalidate();
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.SearchView p2, int p3, String p4, String p5)
	    {
	        p2.a(0, 0, p5);
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.SearchView p3, CharSequence p4)
	    {
	        String v0_3;
	        int v1 = 1;
	        String v0_1 = p3.b.getText();
	        p3.E = v0_1;
	        if (android.text.TextUtils.isEmpty(v0_1)) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        void v3_1 = p3.c(v0_3);
	        if (v0_3 != null) {
	            v1 = 0;
	        }
	        v3_1.e(v1).h().g().D = p4.toString();
	        return;
	    }
	
	
	    static synthetic void a(android.support.v7.widget.SearchView p1, boolean p2)
	    {
	        p1.d(0);
	        return;
	    }
	
	
	    private boolean a(int p4)
	    {
	        android.content.Intent v0_1 = this.j.c;
	        if ((v0_1 != null) && (v0_1.moveToPosition(p4))) {
	            this.a(this.a(v0_1, 0, 0));
	        }
	        this.d(0);
	        this.b.dismissDropDown();
	        return 1;
	    }
	
	
	    private boolean a(int p5, android.view.KeyEvent p6)
	    {
	        int v1_0 = 0;
	        if ((this.l != null) && ((this.j != null) && ((p6.getAction() == 0) && (fi.a(p6))))) {
	            if ((p5 != 66) && ((p5 != 84) && (p5 != 61))) {
	                if ((p5 != 21) && (p5 != 22)) {
	                    // Both branches of the condition point to the same code.
	                    // if ((p5 == 19) && (this.b.getListSelection() != 0)) {
	                    // }
	                } else {
	                    aaj v0_12;
	                    if (p5 != 21) {
	                        v0_12 = this.b.length();
	                    } else {
	                        v0_12 = 0;
	                    }
	                    this.b.setSelection(v0_12);
	                    this.b.setListSelection(0);
	                    this.b.clearListSelection();
	                    android.support.v7.widget.SearchView.m.a(this.b, 1);
	                    v1_0 = 1;
	                }
	            } else {
	                v1_0 = this.a(this.b.getListSelection());
	            }
	        }
	        return v1_0;
	    }
	
	
	    static boolean a(android.content.Context p2)
	    {
	        int v0_3;
	        if (p2.getResources().getConfiguration().orientation != 2) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public static synthetic boolean a(android.support.v7.widget.SearchView p3, int p4)
	    {
	        int v0_1 = p3.b.getText();
	        CharSequence v1_1 = p3.j.c;
	        if (v1_1 != null) {
	            if (!v1_1.moveToPosition(p4)) {
	                p3.a(v0_1);
	            } else {
	                CharSequence v1_2 = p3.j.b(v1_1);
	                if (v1_2 == null) {
	                    p3.a(v0_1);
	                } else {
	                    p3.a(v1_2);
	                }
	            }
	        }
	        return 1;
	    }
	
	
	    public static synthetic boolean a(android.support.v7.widget.SearchView p1, int p2, int p3, String p4)
	    {
	        return p1.a(p2);
	    }
	
	
	    public static synthetic boolean a(android.support.v7.widget.SearchView p1, android.view.View p2, int p3, android.view.KeyEvent p4)
	    {
	        return p1.a(p3, p4);
	    }
	
	
	    public static synthetic kj b(android.support.v7.widget.SearchView p1)
	    {
	        return p1.j;
	    }
	
	
	    public static synthetic android.view.View$OnFocusChangeListener c(android.support.v7.widget.SearchView p1)
	    {
	        return 0;
	    }
	
	
	    private void c(boolean p3)
	    {
	        this.s.setVisibility(8);
	        return;
	    }
	
	
	    public static synthetic void d(android.support.v7.widget.SearchView p6)
	    {
	        if (p6.v.getWidth() > 1) {
	            int v0_4;
	            int v0_3 = p6.getContext().getResources();
	            int v2 = p6.p.getPaddingLeft();
	            int v3_1 = new android.graphics.Rect();
	            android.support.v7.widget.SearchView$SearchAutoComplete v1_2 = tm.a(p6);
	            if (!p6.z) {
	                v0_4 = 0;
	            } else {
	                v0_4 = (v0_3.getDimensionPixelSize(a.ad) + v0_3.getDimensionPixelSize(a.ac));
	            }
	            android.support.v7.widget.SearchView$SearchAutoComplete v1_5;
	            p6.b.getDropDownBackground().getPadding(v3_1);
	            if (v1_2 == null) {
	                v1_5 = (v2 - (v3_1.left + v0_4));
	            } else {
	                v1_5 = (- v3_1.left);
	            }
	            p6.b.setDropDownHorizontalOffset(v1_5);
	            p6.b.setDropDownWidth(((v0_4 + ((p6.v.getWidth() + v3_1.left) + v3_1.right)) - v2));
	        }
	        return;
	    }
	
	
	    private void d(boolean p4)
	    {
	        if (!p4) {
	            this.removeCallbacks(this.H);
	            android.view.inputmethod.InputMethodManager v0_3 = ((android.view.inputmethod.InputMethodManager) this.getContext().getSystemService("input_method"));
	            if (v0_3 != null) {
	                v0_3.hideSoftInputFromWindow(this.getWindowToken(), 0);
	            }
	        } else {
	            this.post(this.H);
	        }
	        return;
	    }
	
	
	    public static synthetic android.widget.ImageView e(android.support.v7.widget.SearchView p1)
	    {
	        return p1.r;
	    }
	
	
	    private void e(boolean p4)
	    {
	        if ((!this.k) || ((this.i) || (!p4))) {
	            int v0_2 = 8;
	        } else {
	            v0_2 = 0;
	            this.s.setVisibility(8);
	        }
	        this.u.setVisibility(v0_2);
	        return;
	    }
	
	
	    private int f()
	    {
	        return this.getContext().getResources().getDimensionPixelSize(a.ae);
	    }
	
	
	    public static synthetic void f(android.support.v7.widget.SearchView p0)
	    {
	        p0.j();
	        return;
	    }
	
	
	    public static synthetic android.widget.ImageView g(android.support.v7.widget.SearchView p1)
	    {
	        return p1.t;
	    }
	
	
	    private void g()
	    {
	        int v2_2;
	        android.view.View v0 = 8;
	        if ((!this.k) || (this.i)) {
	            v2_2 = 0;
	        } else {
	            v2_2 = 1;
	        }
	        if ((v2_2 != 0) && ((this.s.getVisibility() == 0) || (this.u.getVisibility() == 0))) {
	            v0 = 0;
	        }
	        this.q.setVisibility(v0);
	        return;
	    }
	
	
	    private void h()
	    {
	        int v2_3;
	        int[] v0_0 = 1;
	        int v1_0 = 0;
	        if (android.text.TextUtils.isEmpty(this.b.getText())) {
	            v2_3 = 0;
	        } else {
	            v2_3 = 1;
	        }
	        if ((v2_3 == 0) && ((!this.z) || (this.F))) {
	            v0_0 = 0;
	        }
	        if (v0_0 == null) {
	            v1_0 = 8;
	        }
	        this.t.setVisibility(v1_0);
	        int v1_1 = this.t.getDrawable();
	        if (v1_1 != 0) {
	            int[] v0_2;
	            if (v2_3 == 0) {
	                v0_2 = android.support.v7.widget.SearchView.EMPTY_STATE_SET;
	            } else {
	                v0_2 = android.support.v7.widget.SearchView.ENABLED_STATE_SET;
	            }
	            v1_1.setState(v0_2);
	        }
	        return;
	    }
	
	
	    public static synthetic void h(android.support.v7.widget.SearchView p3)
	    {
	        if (!android.text.TextUtils.isEmpty(p3.b.getText())) {
	            p3.b.setText("");
	            p3.b.requestFocus();
	            p3.d(1);
	        } else {
	            if (p3.z) {
	                p3.clearFocus();
	                p3.b(1);
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic android.widget.ImageView i(android.support.v7.widget.SearchView p1)
	    {
	        return p1.s;
	    }
	
	
	    private void i()
	    {
	        this.post(this.I);
	        return;
	    }
	
	
	    private void j()
	    {
	        this.b(0);
	        this.b.requestFocus();
	        this.d(1);
	        return;
	    }
	
	
	    public static synthetic void j(android.support.v7.widget.SearchView p3)
	    {
	        android.support.v7.widget.SearchView$SearchAutoComplete v0_1 = p3.b.getText();
	        if ((v0_1 != null) && (android.text.TextUtils.getTrimmedLength(v0_1) > 0)) {
	            if (p3.l != null) {
	                p3 = p3.a(0, 0, v0_1.toString());
	            }
	            p3.d(0).b.dismissDropDown();
	        }
	        return;
	    }
	
	
	    public static synthetic android.widget.ImageView k(android.support.v7.widget.SearchView p1)
	    {
	        return p1.u;
	    }
	
	
	    private void k()
	    {
	        Exception v0_0 = android.support.v7.widget.SearchView.m;
	        if (v0_0.a != null) {
	            try {
	                Object[] v2_2 = new Object[0];
	                v0_0.a.invoke(this.b, v2_2);
	            } catch (Exception v0) {
	            }
	        }
	        Exception v0_2 = android.support.v7.widget.SearchView.m;
	        if (v0_2.b != null) {
	            try {
	                Object[] v2_5 = new Object[0];
	                v0_2.b.invoke(this.b, v2_5);
	            } catch (Exception v0) {
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic void l(android.support.v7.widget.SearchView p11)
	    {
	        String v0_0 = 0;
	        try {
	            if (p11.l != null) {
	                String v5_0 = p11.l;
	                if (!v5_0.getVoiceSearchLaunchWebSearch()) {
	                    if (v5_0.getVoiceSearchLaunchRecognizer()) {
	                        String v3_3;
	                        String v4_2;
	                        String v2_3;
	                        int v1_3 = p11.f;
	                        android.content.ComponentName v6 = v5_0.getSearchActivity();
	                        String v2_1 = new android.content.Intent("android.intent.action.SEARCH");
	                        v2_1.setComponent(v6);
	                        android.app.PendingIntent v7_1 = android.app.PendingIntent.getActivity(p11.getContext(), 0, v2_1, 1073741824);
	                        android.os.Bundle v8_1 = new android.os.Bundle();
	                        android.content.Intent v9_1 = new android.content.Intent(v1_3);
	                        int v1_4 = 1;
	                        if (android.os.Build$VERSION.SDK_INT < 8) {
	                            v3_3 = 0;
	                            v4_2 = "free_form";
	                            v2_3 = 0;
	                        } else {
	                            int v10_0 = p11.getResources();
	                            if (v5_0.getVoiceLanguageModeId() == 0) {
	                                v4_2 = "free_form";
	                            } else {
	                                v4_2 = v10_0.getString(v5_0.getVoiceLanguageModeId());
	                            }
	                            if (v5_0.getVoicePromptTextId() == 0) {
	                                v3_3 = 0;
	                            } else {
	                                v3_3 = v10_0.getString(v5_0.getVoicePromptTextId());
	                            }
	                            if (v5_0.getVoiceLanguageId() == 0) {
	                                v2_3 = 0;
	                            } else {
	                                v2_3 = v10_0.getString(v5_0.getVoiceLanguageId());
	                            }
	                            if (v5_0.getVoiceMaxResults() != 0) {
	                                v1_4 = v5_0.getVoiceMaxResults();
	                            }
	                        }
	                        v9_1.putExtra("android.speech.extra.LANGUAGE_MODEL", v4_2);
	                        v9_1.putExtra("android.speech.extra.PROMPT", v3_3);
	                        v9_1.putExtra("android.speech.extra.LANGUAGE", v2_3);
	                        v9_1.putExtra("android.speech.extra.MAX_RESULTS", v1_4);
	                        if (v6 != null) {
	                            v0_0 = v6.flattenToShortString();
	                        }
	                        v9_1.putExtra("calling_package", v0_0);
	                        v9_1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", v7_1);
	                        v9_1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", v8_1);
	                        p11.getContext().startActivity(v9_1);
	                    }
	                } else {
	                    String v2_11 = new android.content.Intent(p11.e);
	                    int v1_7 = v5_0.getSearchActivity();
	                    if (v1_7 != 0) {
	                        v0_0 = v1_7.flattenToShortString();
	                    }
	                    v2_11.putExtra("calling_package", v0_0);
	                    p11.getContext().startActivity(v2_11);
	                }
	            }
	        } catch (String v0) {
	            android.util.Log.w("SearchView", "Could not find voice search activity");
	        }
	        return;
	    }
	
	
	    public static synthetic android.support.v7.widget.SearchView$SearchAutoComplete m(android.support.v7.widget.SearchView p1)
	    {
	        return p1.b;
	    }
	
	
	    public static synthetic void n(android.support.v7.widget.SearchView p0)
	    {
	        p0.k();
	        return;
	    }
	
	
	    public static synthetic android.app.SearchableInfo o(android.support.v7.widget.SearchView p1)
	    {
	        return p1.l;
	    }
	
	
	    public final void a()
	    {
	        if (!this.F) {
	            this.F = 1;
	            this.G = this.b.getImeOptions();
	            this.b.setImeOptions((this.G | 33554432));
	            this.b.setText("");
	            this.j();
	        }
	        return;
	    }
	
	
	    public void a(CharSequence p3)
	    {
	        int v0_2;
	        this.b.setText(p3);
	        android.support.v7.widget.SearchView$SearchAutoComplete v1 = this.b;
	        if (!android.text.TextUtils.isEmpty(p3)) {
	            v0_2 = p3.length();
	        } else {
	            v0_2 = 0;
	        }
	        v1.setSelection(v0_2);
	        return;
	    }
	
	
	    public final void a(CharSequence p3, boolean p4)
	    {
	        this.b.setText(p3);
	        if (p3 != null) {
	            this.b.setSelection(this.b.length());
	            this.E = p3;
	        }
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        if (this.z != p2) {
	            this.z = p2;
	            this.b(p2);
	            this.c();
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.a("", 0);
	        this.clearFocus();
	        this.b(1);
	        this.b.setImeOptions(this.G);
	        this.F = 0;
	        return;
	    }
	
	
	    public void b(boolean p7)
	    {
	        android.widget.ImageView v0_0;
	        int v4 = 1;
	        int v2 = 8;
	        this.i = p7;
	        if (!p7) {
	            v0_0 = 8;
	        } else {
	            v0_0 = 0;
	        }
	        int v3_3;
	        if (android.text.TextUtils.isEmpty(this.b.getText())) {
	            v3_3 = 0;
	        } else {
	            v3_3 = 1;
	        }
	        android.widget.ImageView v0_1;
	        this.r.setVisibility(v0_0);
	        this.c(v3_3);
	        if (!p7) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 8;
	        }
	        this.o.setVisibility(v0_1);
	        if (!this.z) {
	            v2 = 0;
	        }
	        this.w.setVisibility(v2);
	        this.h();
	        if (v3_3 != 0) {
	            v4 = 0;
	        }
	        this.e(v4);
	        this.g();
	        return;
	    }
	
	
	    public void c()
	    {
	        android.text.SpannableStringBuilder v0_5;
	        if (this.A == null) {
	            if ((!android.support.v7.widget.SearchView.a) || ((this.l == null) || (this.l.getHintId() == 0))) {
	                v0_5 = this.y;
	            } else {
	                v0_5 = this.getContext().getText(this.l.getHintId());
	            }
	        } else {
	            v0_5 = this.A;
	        }
	        android.support.v7.widget.SearchView$SearchAutoComplete v2 = this.b;
	        if (v0_5 == null) {
	            v0_5 = "";
	        }
	        if ((this.z) && (this.x != null)) {
	            this.x.setBounds(0, 0, ((int) (((double) this.b.getTextSize()) * 1.25)), ((int) (((double) this.b.getTextSize()) * 1.25)));
	            android.text.SpannableStringBuilder v1_8 = new android.text.SpannableStringBuilder("   ");
	            v1_8.setSpan(new android.text.style.ImageSpan(this.x), 1, 2, 33);
	            v1_8.append(v0_5);
	            v0_5 = v1_8;
	        }
	        v2.setHint(v0_5);
	        return;
	    }
	
	
	    public void clearFocus()
	    {
	        this.B = 1;
	        this.d(0);
	        super.clearFocus();
	        this.b.clearFocus();
	        this.B = 0;
	        return;
	    }
	
	
	    final void e()
	    {
	        this.b(this.i);
	        this.i();
	        if (this.b.hasFocus()) {
	            this.k();
	        }
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        this.removeCallbacks(this.I);
	        this.post(this.J);
	        super.onDetachedFromWindow();
	        return;
	    }
	
	
	    protected void onMeasure(int p3, int p4)
	    {
	        if (!this.i) {
	            int v1_0 = android.view.View$MeasureSpec.getMode(p3);
	            int v0_1 = android.view.View$MeasureSpec.getSize(p3);
	            switch (v1_0) {
	                case -2147483648:
	                    if (this.C <= 0) {
	                        v0_1 = Math.min(this.f(), v0_1);
	                    } else {
	                        v0_1 = Math.min(this.C, v0_1);
	                    }
	                    break;
	                case 0:
	                    if (this.C <= 0) {
	                        v0_1 = this.f();
	                    } else {
	                        v0_1 = this.C;
	                    }
	                    break;
	                case 1073741824:
	                    if (this.C <= 0) {
	                    } else {
	                        v0_1 = Math.min(this.C, v0_1);
	                    }
	                    break;
	            }
	            super.onMeasure(android.view.View$MeasureSpec.makeMeasureSpec(v0_1, 1073741824), p4);
	        } else {
	            super.onMeasure(p3, p4);
	        }
	        return;
	    }
	
	
	    public void onWindowFocusChanged(boolean p1)
	    {
	        super.onWindowFocusChanged(p1);
	        this.i();
	        return;
	    }
	
	
	    public boolean requestFocus(int p3, android.graphics.Rect p4)
	    {
	        boolean v0 = 0;
	        if ((!this.B) && (this.isFocusable())) {
	            if (this.i) {
	                v0 = super.requestFocus(p3, p4);
	            } else {
	                boolean v1_4 = this.b.requestFocus(p3, p4);
	                if (v1_4) {
	                    this.b(0);
	                }
	                v0 = v1_4;
	            }
	        }
	        return v0;
	    }
	
