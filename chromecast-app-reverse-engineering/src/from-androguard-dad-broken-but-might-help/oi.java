	public  a
	public  b
	private final tz c
	private final on d
	private final uh e
	private  f
	private android.view.View g
	private android.widget.Button h
	private android.widget.Button i
	private android.widget.ImageButton j
	private android.widget.ImageButton k
	private android.widget.ImageView l
	private android.widget.TextView m
	private android.widget.TextView n
	private android.widget.TextView o
	private android.view.View p
	private android.widget.LinearLayout q
	private android.widget.SeekBar r
	private  s
	private ct t
	private om u
	private dq v
	private cf w
	
	    public oi(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private oi(android.content.Context p3, int p4)
	    {
	        this(a.a(p3), 0);
	        this.b = 1;
	        dm v0_2 = this.getContext();
	        this.u = new om(this);
	        this.c = tz.a(v0_2);
	        this.d = new on(this);
	        this.e = tz.d();
	        this.a(tz.e());
	        return;
	    }
	
	
	    static synthetic cf a(oi p0, cf p1)
	    {
	        p0.w = p1;
	        return p1;
	    }
	
	
	    static synthetic ct a(oi p1, ct p2)
	    {
	        p1.t = 0;
	        return 0;
	    }
	
	
	    static synthetic dq a(oi p0, dq p1)
	    {
	        p0.v = p1;
	        return p1;
	    }
	
	
	    private void a(dm p5)
	    {
	        dq v1_0 = 0;
	        if (this.t != null) {
	            this.t.a(this.u);
	            this.t = 0;
	        }
	        if ((p5 != null) && (this.f)) {
	            try {
	                this.t = new ct(this.getContext(), p5);
	            } catch (cy v0_5) {
	                android.util.Log.e("MediaRouteControllerDialog", "Error creating media controller in setMediaSession.", v0_5);
	            }
	            if (this.t != null) {
	                om v2_3 = this.u;
	                if (v2_3 != null) {
	                    this.t.a.a(v2_3, new android.os.Handler());
	                } else {
	                    throw new IllegalArgumentException("callback cannot be null");
	                }
	            }
	            cy v0_12;
	            if (this.t != null) {
	                v0_12 = this.t.a.c();
	            } else {
	                v0_12 = 0;
	            }
	            cy v0_13;
	            if (v0_12 != null) {
	                v0_13 = v0_12.a();
	            } else {
	                v0_13 = 0;
	            }
	            this.w = v0_13;
	            if (this.t != null) {
	                v1_0 = this.t.a.b();
	            }
	            this.v = v1_0;
	            this.b();
	        }
	        return;
	    }
	
	
	    static synthetic boolean a(oi p1)
	    {
	        return p1.s;
	    }
	
	
	    static synthetic boolean a(oi p0, boolean p1)
	    {
	        p0.s = p1;
	        return p1;
	    }
	
	
	    static synthetic void b(oi p0)
	    {
	        p0.a();
	        return;
	    }
	
	
	    private boolean b()
	    {
	        CharSequence v2_0 = 0;
	        if ((this.e.a()) && (!this.e.b())) {
	            if (this.a) {
	                this.a();
	                this.o.setText(this.e.c);
	                if (!this.e.g) {
	                    this.h.setVisibility(8);
	                } else {
	                    this.h.setVisibility(0);
	                }
	                if (this.e.n == null) {
	                    this.k.setVisibility(8);
	                } else {
	                    this.k.setVisibility(0);
	                }
	                if (this.g == null) {
	                    if (this.w == null) {
	                        this.l.setVisibility(8);
	                        this.p.setVisibility(8);
	                    } else {
	                        if (this.w.c == null) {
	                            if (this.w.d == null) {
	                                this.l.setImageDrawable(0);
	                                this.l.setVisibility(8);
	                            } else {
	                                this.l.setImageURI(this.w.d);
	                                this.l.setVisibility(0);
	                            }
	                        } else {
	                            this.l.setImageBitmap(this.w.c);
	                            this.l.setVisibility(0);
	                        }
	                        android.widget.ImageButton v0_32;
	                        android.widget.ImageButton v0_29 = this.w.a;
	                        if (android.text.TextUtils.isEmpty(v0_29)) {
	                            this.m.setText(0);
	                            this.m.setVisibility(8);
	                            v0_32 = 0;
	                        } else {
	                            this.m.setText(v0_29);
	                            v0_32 = 1;
	                        }
	                        if (android.text.TextUtils.isEmpty(this.w.b)) {
	                            this.n.setText(0);
	                            this.n.setVisibility(8);
	                        } else {
	                            this.n.setText(this.w.b);
	                            v0_32 = 1;
	                        }
	                        if (v0_32 != null) {
	                            this.p.setVisibility(0);
	                        } else {
	                            this.p.setVisibility(8);
	                        }
	                    }
	                    if (this.v == null) {
	                        this.j.setVisibility(8);
	                    } else {
	                        if ((this.v.a != 6) && (this.v.a != 3)) {
	                            android.widget.ImageButton v0_42 = 0;
	                        } else {
	                            v0_42 = 1;
	                        }
	                        int v3_19;
	                        if ((this.v.b & 516) == 0) {
	                            v3_19 = 0;
	                        } else {
	                            v3_19 = 1;
	                        }
	                        int v4_7;
	                        if ((this.v.b & 514) == 0) {
	                            v4_7 = 0;
	                        } else {
	                            v4_7 = 1;
	                        }
	                        if ((v0_42 == null) || (v4_7 == 0)) {
	                            if ((v0_42 != null) || (v3_19 == 0)) {
	                                this.j.setVisibility(8);
	                            } else {
	                                this.j.setVisibility(0);
	                                this.j.setImageResource(a.a(this.getContext(), a.cj));
	                                this.j.setContentDescription(this.getContext().getResources().getText(a.cp));
	                            }
	                        } else {
	                            this.j.setVisibility(0);
	                            this.j.setImageResource(a.a(this.getContext(), a.ci));
	                            this.j.setContentDescription(this.getContext().getResources().getText(a.co));
	                        }
	                    }
	                }
	                v2_0 = 1;
	            }
	        } else {
	            this.dismiss();
	        }
	        return v2_0;
	    }
	
	
	    static synthetic android.widget.SeekBar c(oi p1)
	    {
	        return p1.r;
	    }
	
	
	    static synthetic uh d(oi p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic boolean e(oi p1)
	    {
	        return p1.b();
	    }
	
	
	    static synthetic ct f(oi p1)
	    {
	        return p1.t;
	    }
	
	
	    static synthetic om g(oi p1)
	    {
	        return p1.u;
	    }
	
	
	    static synthetic tz h(oi p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic dq i(oi p1)
	    {
	        return p1.v;
	    }
	
	
	    public void a()
	    {
	        android.widget.LinearLayout v0_0 = 1;
	        if (!this.s) {
	            if ((!this.b) || (this.e.j != 1)) {
	                v0_0 = 0;
	            }
	            if (v0_0 == null) {
	                this.q.setVisibility(8);
	            } else {
	                this.q.setVisibility(0);
	                this.r.setMax(this.e.l);
	                this.r.setProgress(this.e.k);
	            }
	        }
	        return;
	    }
	
	
	    public final void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        this.f = 1;
	        this.c.a(tx.c, this.d, 2);
	        this.a(tz.e());
	        return;
	    }
	
	
	    protected final void onCreate(android.os.Bundle p4)
	    {
	        super.onCreate(p4);
	        this.getWindow().requestFeature(1);
	        this.setContentView(a.cl);
	        android.view.View v1_1 = new ol(this);
	        this.h = ((android.widget.Button) this.findViewById(b.n));
	        this.h.setOnClickListener(v1_1);
	        this.i = ((android.widget.Button) this.findViewById(b.v));
	        this.i.setOnClickListener(v1_1);
	        this.k = ((android.widget.ImageButton) this.findViewById(b.u));
	        this.k.setOnClickListener(v1_1);
	        this.l = ((android.widget.ImageView) this.findViewById(b.l));
	        this.m = ((android.widget.TextView) this.findViewById(b.y));
	        this.n = ((android.widget.TextView) this.findViewById(b.w));
	        this.p = this.findViewById(b.x);
	        this.j = ((android.widget.ImageButton) this.findViewById(b.s));
	        this.j.setOnClickListener(v1_1);
	        this.o = ((android.widget.TextView) this.findViewById(b.t));
	        this.q = ((android.widget.LinearLayout) this.findViewById(b.q));
	        this.r = ((android.widget.SeekBar) this.findViewById(b.r));
	        this.r.setOnSeekBarChangeListener(new oj(this));
	        this.a = 1;
	        if (this.b()) {
	            this.g = 0;
	            android.widget.FrameLayout v0_43 = ((android.widget.FrameLayout) this.findViewById(b.o));
	            if (this.g != null) {
	                v0_43.findViewById(b.m).setVisibility(8);
	                v0_43.addView(this.g);
	            }
	        }
	        return;
	    }
	
	
	    public final void onDetachedFromWindow()
	    {
	        this.c.a(this.d);
	        this.a(0);
	        this.f = 0;
	        super.onDetachedFromWindow();
	        return;
	    }
	
	
	    public final boolean onKeyDown(int p5, android.view.KeyEvent p6)
	    {
	        boolean v1 = 1;
	        if ((p5 != 25) && (p5 != 24)) {
	            v1 = super.onKeyDown(p5, p6);
	        } else {
	            boolean v0_1;
	            if (p5 != 25) {
	                v0_1 = 1;
	            } else {
	                v0_1 = -1;
	            }
	            this.e.b(v0_1);
	        }
	        return v1;
	    }
	
	
	    public final boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        if ((p2 != 25) && (p2 != 24)) {
	            boolean v0_2 = super.onKeyUp(p2, p3);
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
