	private android.view.View A
	private  B
	private  C
	private  D
	private Lnw E
	private nw F
	private final java.lang.Runnable G
	private  H
	private android.graphics.Rect I
	private android.graphics.Rect J
	private ot K
	private sd n
	 vr o
	 android.support.v7.internal.widget.ActionBarContextView p
	 android.widget.PopupWindow q
	 java.lang.Runnable r
	 android.view.ViewGroup s
	  t
	  u
	private nt v
	private nx w
	private  x
	private android.view.ViewGroup y
	private android.widget.TextView z
	
	    no(android.content.Context p2, android.view.Window p3, ng p4)
	    {
	        this(p2, p3, p4);
	        this.G = new np(this);
	        return;
	    }
	
	
	    static synthetic void a(no p5, int p6)
	    {
	        nw v0_0 = p5.e(p6);
	        if (v0_0.h != null) {
	            int v1_2 = new android.os.Bundle();
	            v0_0.h.a(v1_2);
	            if (v1_2.size() > 0) {
	                v0_0.q = v1_2;
	            }
	            v0_0.h.d();
	            v0_0.h.clear();
	        }
	        v0_0.p = 1;
	        v0_0.o = 1;
	        if (((p6 == 8) || (p6 == 0)) && (p5.n != null)) {
	            nw v0_3 = p5.e(0);
	            if (v0_3 != null) {
	                v0_3.k = 0;
	                p5.b(v0_3, 0);
	            }
	        }
	        return;
	    }
	
	
	    private void a(nw p11, android.view.KeyEvent p12)
	    {
	        int v1_0 = -1;
	        if ((!p11.m) && (!this.m)) {
	            if (p11.a == 0) {
	                android.view.View v0_7;
	                android.view.View v4_0 = this.a;
	                if ((v4_0.getResources().getConfiguration().screenLayout & 15) != 4) {
	                    v0_7 = 0;
	                } else {
	                    v0_7 = 1;
	                }
	                android.view.View v4_3;
	                if (v4_0.getApplicationInfo().targetSdkVersion < 11) {
	                    v4_3 = 0;
	                } else {
	                    v4_3 = 1;
	                }
	                if ((v0_7 != null) && (v4_3 != null)) {
	                    return;
	                }
	            }
	            android.view.View v0_9 = this.b.getCallback();
	            if ((v0_9 == null) || (v0_9.onMenuOpened(p11.a, p11.h))) {
	                android.view.WindowManager v8_1 = ((android.view.WindowManager) this.a.getSystemService("window"));
	                if ((v8_1 != null) && (this.b(p11, p12))) {
	                    if ((p11.e != null) && (!p11.o)) {
	                        if (p11.g != null) {
	                            android.view.View v0_18 = p11.g.getLayoutParams();
	                            if ((v0_18 != null) && (v0_18.width == -1)) {
	                                p11.l = 0;
	                                android.view.View v0_65 = new android.view.WindowManager$LayoutParams(v1_0, -2, 0, 0, 1002, 8519680, -3);
	                                v0_65.gravity = p11.c;
	                                v0_65.windowAnimations = p11.d;
	                                v8_1.addView(p11.e, v0_65);
	                                p11.m = 1;
	                                return;
	                            }
	                        }
	                        v1_0 = -2;
	                    } else {
	                        if (p11.e != null) {
	                            if ((p11.o) && (p11.e.getChildCount() > 0)) {
	                                p11.e.removeAllViews();
	                            }
	                        } else {
	                            android.view.View v0_25 = this.k();
	                            int v1_2 = new android.util.TypedValue();
	                            android.view.View v4_7 = v0_25.getResources().newTheme();
	                            v4_7.setTo(v0_25.getTheme());
	                            v4_7.resolveAttribute(a.g, v1_2, 1);
	                            if (v1_2.resourceId != 0) {
	                                v4_7.applyStyle(v1_2.resourceId, 1);
	                            }
	                            v4_7.resolveAttribute(a.K, v1_2, 1);
	                            if (v1_2.resourceId == 0) {
	                                v4_7.applyStyle(a.bZ, 1);
	                            } else {
	                                v4_7.applyStyle(v1_2.resourceId, 1);
	                            }
	                            int v1_6 = new pi(v0_25, 0);
	                            v1_6.getTheme().setTo(v4_7);
	                            p11.j = v1_6;
	                            android.view.View v0_28 = v1_6.obtainStyledAttributes(oq.bN);
	                            p11.b = v0_28.getResourceId(oq.bQ, 0);
	                            p11.d = v0_28.getResourceId(oq.bO, 0);
	                            v0_28.recycle();
	                            p11.e = new nv(this, p11.j);
	                            p11.c = 81;
	                            if (p11.e == null) {
	                                return;
	                            }
	                        }
	                        android.view.View v0_44;
	                        if (p11.g == null) {
	                            if (p11.h != null) {
	                                if (this.w == null) {
	                                    this.w = new nx(this);
	                                }
	                                android.view.View v0_41;
	                                android.view.View v0_38 = this.w;
	                                if (p11.h != null) {
	                                    if (p11.i == null) {
	                                        p11.i = new py(p11.j, a.bL);
	                                        p11.i.d = v0_38;
	                                        p11.h.a(p11.i);
	                                    }
	                                    v0_41 = p11.i.a(p11.e);
	                                } else {
	                                    v0_41 = 0;
	                                }
	                                p11.f = ((android.view.View) v0_41);
	                                if (p11.f != null) {
	                                    v0_44 = 1;
	                                    if (v0_44 == null) {
	                                        return;
	                                    } else {
	                                        android.view.View v0_51;
	                                        if (p11.f == null) {
	                                            v0_51 = 0;
	                                        } else {
	                                            if (p11.g == null) {
	                                                if (p11.i.b().getCount() <= 0) {
	                                                } else {
	                                                    v0_51 = 1;
	                                                }
	                                            } else {
	                                                v0_51 = 1;
	                                            }
	                                        }
	                                        if (v0_51 == null) {
	                                            return;
	                                        } else {
	                                            int v1_19;
	                                            android.view.View v0_53 = p11.f.getLayoutParams();
	                                            if (v0_53 != null) {
	                                                v1_19 = v0_53;
	                                            } else {
	                                                v1_19 = new android.view.ViewGroup$LayoutParams(-2, -2);
	                                            }
	                                            p11.e.setBackgroundResource(p11.b);
	                                            android.view.View v0_58 = p11.f.getParent();
	                                            if ((v0_58 != null) && ((v0_58 instanceof android.view.ViewGroup))) {
	                                                ((android.view.ViewGroup) v0_58).removeView(p11.f);
	                                            }
	                                            p11.e.addView(p11.f, v1_19);
	                                            if (!p11.f.hasFocus()) {
	                                                p11.f.requestFocus();
	                                            }
	                                            v1_0 = -2;
	                                        }
	                                    }
	                                }
	                            }
	                            v0_44 = 0;
	                        } else {
	                            p11.f = p11.g;
	                            v0_44 = 1;
	                        }
	                    }
	                }
	            } else {
	                this.a(p11, 1);
	            }
	        }
	        return;
	    }
	
	
	    private boolean a(nw p3, int p4, android.view.KeyEvent p5, int p6)
	    {
	        boolean v0_0 = 0;
	        if (((!p5.isSystem()) && ((p3.k) || (this.b(p3, p5)))) && (p3.h != null)) {
	            v0_0 = p3.h.performShortcut(p4, p5, 1);
	        }
	        return v0_0;
	    }
	
	
	    static synthetic int b(no p8, int p9)
	    {
	        int v0_4;
	        android.support.v7.internal.widget.ActionBarContextView v3_0 = 1;
	        int v2 = 0;
	        if ((p8.p == null) || (!(p8.p.getLayoutParams() instanceof android.view.ViewGroup$MarginLayoutParams))) {
	            v0_4 = 0;
	        } else {
	            int v1_3;
	            int v0_7 = ((android.view.ViewGroup$MarginLayoutParams) p8.p.getLayoutParams());
	            if (!p8.p.isShown()) {
	                if (v0_7.topMargin == 0) {
	                    v3_0 = 0;
	                    v1_3 = 0;
	                } else {
	                    v0_7.topMargin = 0;
	                    v1_3 = 0;
	                }
	            } else {
	                if (p8.I == null) {
	                    p8.I = new android.graphics.Rect();
	                    p8.J = new android.graphics.Rect();
	                }
	                int v1_11;
	                int v1_9 = p8.I;
	                boolean v4_0 = p8.J;
	                v1_9.set(0, p9, 0, 0);
	                tm.a(p8.s, v1_9, v4_0);
	                if (v4_0.top != 0) {
	                    v1_11 = 0;
	                } else {
	                    v1_11 = p9;
	                }
	                int v1_12;
	                if (v0_7.topMargin == v1_11) {
	                    v1_12 = 0;
	                } else {
	                    v0_7.topMargin = p9;
	                    if (p8.A != null) {
	                        int v1_15 = p8.A.getLayoutParams();
	                        if (v1_15.height != p9) {
	                            v1_15.height = p9;
	                            p8.A.setLayoutParams(v1_15);
	                        }
	                        v1_12 = 1;
	                    } else {
	                        p8.A = new android.view.View(p8.a);
	                        p8.A.setBackgroundColor(p8.a.getResources().getColor(a.Y));
	                        p8.s.addView(p8.A, -1, new android.view.ViewGroup$LayoutParams(-1, p9));
	                        v1_12 = 1;
	                    }
	                }
	                if (p8.A == null) {
	                    v3_0 = 0;
	                }
	                if ((!p8.i) && (v3_0 != null)) {
	                    p9 = 0;
	                }
	                v1_3 = v3_0;
	                v3_0 = v1_12;
	            }
	            if (v3_0 != null) {
	                p8.p.setLayoutParams(v0_7);
	            }
	            v0_4 = v1_3;
	        }
	        if (p8.A != null) {
	            if (v0_4 == 0) {
	                v2 = 8;
	            }
	            p8.A.setVisibility(v2);
	        }
	        return p9;
	    }
	
	
	    private boolean b(nw p11, android.view.KeyEvent p12)
	    {
	        int v4 = 0;
	        if (!this.m) {
	            if (!p11.k) {
	                if ((this.F != null) && (this.F != p11)) {
	                    this.a(this.F, 0);
	                }
	                android.view.Window$Callback v7 = this.b.getCallback();
	                if (v7 != null) {
	                    p11.g = v7.onCreatePanelView(p11.a);
	                }
	                if ((p11.a != 0) && (p11.a != 8)) {
	                    int v6 = 0;
	                } else {
	                    v6 = 1;
	                }
	                if ((v6 != 0) && (this.n != null)) {
	                    this.n.g();
	                }
	                if ((p11.g == null) && ((v6 == 0) || (!(this.f instanceof ou)))) {
	                    if ((p11.h == null) || (p11.p)) {
	                        if (p11.h == null) {
	                            pi v0_27;
	                            android.content.res.Resources$Theme v2_0 = this.a;
	                            if (((p11.a != 0) && (p11.a != 8)) || (this.n == null)) {
	                                v0_27 = v2_0;
	                            } else {
	                                pi v0_24;
	                                int v5_2 = new android.util.TypedValue();
	                                android.content.res.Resources$Theme v8 = v2_0.getTheme();
	                                v8.resolveAttribute(a.l, v5_2, 1);
	                                if (v5_2.resourceId == 0) {
	                                    v8.resolveAttribute(a.m, v5_2, 1);
	                                    v0_24 = 0;
	                                } else {
	                                    v0_24 = v2_0.getResources().newTheme();
	                                    v0_24.setTo(v8);
	                                    v0_24.applyStyle(v5_2.resourceId, 1);
	                                    v0_24.resolveAttribute(a.m, v5_2, 1);
	                                }
	                                if (v5_2.resourceId != 0) {
	                                    if (v0_24 == null) {
	                                        v0_24 = v2_0.getResources().newTheme();
	                                        v0_24.setTo(v8);
	                                    }
	                                    v0_24.applyStyle(v5_2.resourceId, 1);
	                                }
	                                int v5_4 = v0_24;
	                                if (v5_4 == 0) {
	                                } else {
	                                    v0_27 = new pi(v2_0, 0);
	                                    v0_27.getTheme().setTo(v5_4);
	                                }
	                            }
	                            android.content.res.Resources$Theme v2_3 = new qa(v0_27);
	                            v2_3.a(this);
	                            p11.a(v2_3);
	                            if (p11.h == null) {
	                                return v4;
	                            }
	                        }
	                        if ((v6 != 0) && (this.n != null)) {
	                            if (this.v == null) {
	                                this.v = new nt(this);
	                            }
	                            this.n.a(p11.h, this.v);
	                        }
	                        p11.h.d();
	                        if (v7.onCreatePanelMenu(p11.a, p11.h)) {
	                            p11.p = 0;
	                        } else {
	                            p11.a(0);
	                            if ((v6 == 0) || (this.n == null)) {
	                                return v4;
	                            } else {
	                                this.n.a(0, this.v);
	                                return v4;
	                            }
	                        }
	                    }
	                    p11.h.d();
	                    if (p11.q != null) {
	                        p11.h.b(p11.q);
	                        p11.q = 0;
	                    }
	                    if (v7.onPreparePanel(0, p11.g, p11.h)) {
	                        pi v0_43;
	                        if (p12 == null) {
	                            v0_43 = -1;
	                        } else {
	                            v0_43 = p12.getDeviceId();
	                        }
	                        pi v0_46;
	                        if (android.view.KeyCharacterMap.load(v0_43).getKeyboardType() == 1) {
	                            v0_46 = 0;
	                        } else {
	                            v0_46 = 1;
	                        }
	                        p11.n = v0_46;
	                        p11.h.setQwertyMode(p11.n);
	                        p11.h.e();
	                    } else {
	                        if ((v6 != 0) && (this.n != null)) {
	                            this.n.a(0, this.v);
	                        }
	                        p11.h.e();
	                        return v4;
	                    }
	                }
	                p11.k = 1;
	                p11.l = 0;
	                this.F = p11;
	                v4 = 1;
	            } else {
	                v4 = 1;
	            }
	        }
	        return v4;
	    }
	
	
	    private void f(int p4)
	    {
	        this.u = (this.u | (1 << p4));
	        if ((!this.t) && (this.y != null)) {
	            gt.a(this.y, this.G);
	            this.t = 1;
	        }
	        return;
	    }
	
	
	    private void l()
	    {
	        if (!this.x) {
	            int v0_2 = android.view.LayoutInflater.from(this.a);
	            if (this.k) {
	                if (!this.i) {
	                    this.s = ((android.view.ViewGroup) v0_2.inflate(a.bO, 0));
	                } else {
	                    this.s = ((android.view.ViewGroup) v0_2.inflate(a.bP, 0));
	                }
	                if (android.os.Build$VERSION.SDK_INT < 21) {
	                    ((sg) this.s).a(new nr(this));
	                } else {
	                    gt.a(this.s, new nq(this));
	                }
	            } else {
	                if (!this.j) {
	                    if (this.g) {
	                        int v0_15;
	                        boolean v1_11 = new android.util.TypedValue();
	                        this.a.getTheme().resolveAttribute(a.l, v1_11, 1);
	                        if (v1_11.resourceId == 0) {
	                            v0_15 = this.a;
	                        } else {
	                            v0_15 = new pi(this.a, v1_11.resourceId);
	                        }
	                        this.s = ((android.view.ViewGroup) android.view.LayoutInflater.from(v0_15).inflate(a.bQ, 0));
	                        this.n = ((sd) this.s.findViewById(a.bd));
	                        this.n.a(this.b.getCallback());
	                        if (this.h) {
	                            this.n.a(9);
	                        }
	                        if (this.B) {
	                            this.n.a(2);
	                        }
	                        if (this.C) {
	                            this.n.a(5);
	                        }
	                    }
	                } else {
	                    this.s = ((android.view.ViewGroup) v0_2.inflate(a.bH, 0));
	                    this.h = 0;
	                    this.g = 0;
	                }
	            }
	            if (this.s != null) {
	                if (this.n == null) {
	                    this.z = ((android.widget.TextView) this.s.findViewById(a.bx));
	                }
	                tm.b(this.s);
	                int v0_40 = ((android.view.ViewGroup) this.b.findViewById(16908290));
	                boolean v1_24 = ((android.support.v7.internal.widget.ContentFrameLayout) this.s.findViewById(a.aQ));
	                while (v0_40.getChildCount() > 0) {
	                    int v2_25 = v0_40.getChildAt(0);
	                    v0_40.removeViewAt(0);
	                    v1_24.addView(v2_25);
	                }
	                this.b.setContentView(this.s);
	                v0_40.setId(-1);
	                v1_24.setId(16908290);
	                if ((v0_40 instanceof android.widget.FrameLayout)) {
	                    ((android.widget.FrameLayout) v0_40).setForeground(0);
	                }
	                int v0_44;
	                if (!(this.c instanceof android.app.Activity)) {
	                    v0_44 = this.l;
	                } else {
	                    v0_44 = ((android.app.Activity) this.c).getTitle();
	                }
	                if (!android.text.TextUtils.isEmpty(v0_44)) {
	                    this.b(v0_44);
	                }
	                v1_24.g.set(this.y.getPaddingLeft(), this.y.getPaddingTop(), this.y.getPaddingRight(), this.y.getPaddingBottom());
	                if (gt.u(v1_24)) {
	                    v1_24.requestLayout();
	                }
	                int v0_51 = this.a.obtainStyledAttributes(oq.bN);
	                if (v1_24.a == null) {
	                    v1_24.a = new android.util.TypedValue();
	                }
	                v0_51.getValue(oq.bY, v1_24.a);
	                if (v1_24.b == null) {
	                    v1_24.b = new android.util.TypedValue();
	                }
	                v0_51.getValue(oq.bZ, v1_24.b);
	                if (v0_51.hasValue(oq.bW)) {
	                    if (v1_24.c == null) {
	                        v1_24.c = new android.util.TypedValue();
	                    }
	                    v0_51.getValue(oq.bW, v1_24.c);
	                }
	                if (v0_51.hasValue(oq.bX)) {
	                    if (v1_24.d == null) {
	                        v1_24.d = new android.util.TypedValue();
	                    }
	                    v0_51.getValue(oq.bX, v1_24.d);
	                }
	                if (v0_51.hasValue(oq.bU)) {
	                    if (v1_24.e == null) {
	                        v1_24.e = new android.util.TypedValue();
	                    }
	                    v0_51.getValue(oq.bU, v1_24.e);
	                }
	                if (v0_51.hasValue(oq.bV)) {
	                    if (v1_24.f == null) {
	                        v1_24.f = new android.util.TypedValue();
	                    }
	                    v0_51.getValue(oq.bV, v1_24.f);
	                }
	                v0_51.recycle();
	                v1_24.requestLayout();
	                this.x = 1;
	                int v0_52 = this.e(0);
	                if ((!this.m) && ((v0_52 == 0) || (v0_52.h == null))) {
	                    this.f(8);
	                }
	            } else {
	                throw new IllegalArgumentException("AppCompat does not support the current theme features");
	            }
	        }
	        return;
	    }
	
	
	    private void m()
	    {
	        if (!this.x) {
	            return;
	        } else {
	            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
	        }
	    }
	
	
	    public final android.view.View a(android.view.View p7, String p8, android.content.Context p9, android.util.AttributeSet p10)
	    {
	        int v2_0 = 0;
	        int v0_0 = this.b(p7, p8, p9, p10);
	        if (v0_0 == 0) {
	            int v0_2;
	            if (android.os.Build$VERSION.SDK_INT >= 21) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            if (this.K == null) {
	                this.K = new ot();
	            }
	            if ((v0_2 == 0) || ((!this.x) || ((p7 == null) || ((p7.getId() == 16908290) || (gt.v(p7)))))) {
	                int v3_7 = 0;
	            } else {
	                v3_7 = 1;
	            }
	            int v3_8;
	            int v4_1 = this.K;
	            if ((v3_7 == 0) || (p7 == null)) {
	                v3_8 = p9;
	            } else {
	                v3_8 = p7.getContext();
	            }
	            int v3_9 = ot.a(v3_8, p10, v0_2, 1);
	            switch (p8.hashCode()) {
	                case -1946472170:
	                    if (!p8.equals("RatingBar")) {
	                        v2_0 = -1;
	                    } else {
	                        v2_0 = 7;
	                    }
	                    break;
	                case -1455429095:
	                    if (!p8.equals("CheckedTextView")) {
	                    } else {
	                        v2_0 = 4;
	                    }
	                    break;
	                case -1346021293:
	                    if (!p8.equals("MultiAutoCompleteTextView")) {
	                    } else {
	                        v2_0 = 6;
	                    }
	                    break;
	                case -938935918:
	                    if (!p8.equals("TextView")) {
	                    } else {
	                        v2_0 = 9;
	                    }
	                    break;
	                case -339785223:
	                    if (!p8.equals("Spinner")) {
	                    } else {
	                        v2_0 = 1;
	                    }
	                    break;
	                case 776382189:
	                    if (!p8.equals("RadioButton")) {
	                    } else {
	                        v2_0 = 3;
	                    }
	                    break;
	                case 1413872058:
	                    if (!p8.equals("AutoCompleteTextView")) {
	                    } else {
	                        v2_0 = 5;
	                    }
	                    break;
	                case 1601505219:
	                    if (!p8.equals("CheckBox")) {
	                    } else {
	                        v2_0 = 2;
	                    }
	                    break;
	                case 1666676343:
	                    if (!p8.equals("EditText")) {
	                    } else {
	                    }
	                    break;
	                case 2001146706:
	                    if (!p8.equals("Button")) {
	                    } else {
	                        v2_0 = 8;
	                    }
	                    break;
	                default:
	            }
	            switch (v2_0) {
	                case 0:
	                    v0_0 = new wo(v3_9, p10);
	                    break;
	                case 1:
	                    v0_0 = new ws(v3_9, p10);
	                    break;
	                case 2:
	                    v0_0 = new wm(v3_9, p10);
	                    break;
	                case 3:
	                    v0_0 = new wq(v3_9, p10);
	                    break;
	                case 4:
	                    v0_0 = new wn(v3_9, p10);
	                    break;
	                case 5:
	                    v0_0 = new wk(v3_9, p10);
	                    break;
	                case 6:
	                    v0_0 = new wp(v3_9, p10);
	                    break;
	                case 7:
	                    v0_0 = new wr(v3_9, p10);
	                    break;
	                case 8:
	                    v0_0 = new wl(v3_9, p10);
	                    break;
	                case 9:
	                    v0_0 = new wt(v3_9, p10);
	                    break;
	                default:
	                    if (p9 == v3_9) {
	                        v0_0 = 0;
	                    } else {
	                        v0_0 = v4_1.a(v3_9, p8, p10);
	                    }
	            }
	        }
	        return v0_0;
	    }
	
	
	    nw a(android.view.Menu p6)
	    {
	        int v0_0;
	        nw[] v3 = this.E;
	        if (v3 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = v3.length;
	        }
	        int v2 = 0;
	        while (v2 < v0_0) {
	            int v1_1 = v3[v2];
	            if ((v1_1 == 0) || (v1_1.h != p6)) {
	                v2++;
	            } else {
	                int v0_1 = v1_1;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public final void a(int p3)
	    {
	        this.l();
	        android.view.Window$Callback v0_2 = ((android.view.ViewGroup) this.s.findViewById(16908290));
	        v0_2.removeAllViews();
	        android.view.LayoutInflater.from(this.a).inflate(p3, v0_2);
	        this.c.onContentChanged();
	        return;
	    }
	
	
	    void a(int p2, nw p3, android.view.Menu p4)
	    {
	        if (p4 == null) {
	            if ((p3 == null) && ((p2 >= 0) && (p2 < this.E.length))) {
	                p3 = this.E[p2];
	            }
	            if (p3 != null) {
	                p4 = p3.h;
	            }
	        }
	        if ((p3 == null) || (p3.m)) {
	            nw[] v0_5 = this.b.getCallback();
	            if (v0_5 != null) {
	                v0_5.onPanelClosed(p2, p4);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.content.res.Configuration p2)
	    {
	        if ((this.g) && (this.x)) {
	            mj v0_2 = this.a();
	            if (v0_2 != null) {
	                v0_2.a(p2);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        super.a(p3);
	        this.y = ((android.view.ViewGroup) this.b.getDecorView());
	        if (((this.c instanceof android.app.Activity)) && (at.b(((android.app.Activity) this.c)) != null)) {
	            mj v0_8 = this.f;
	            if (v0_8 != null) {
	                v0_8.c(1);
	            } else {
	                this.H = 1;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.support.v7.widget.Toolbar p4)
	    {
	        if ((this.c instanceof android.app.Activity)) {
	            if (!(this.a() instanceof pb)) {
	                ou v1_1 = new ou(p4, ((android.app.Activity) this.a).getTitle(), this.d);
	                this.f = v1_1;
	                this.b.setCallback(v1_1.c);
	                v1_1.f();
	            } else {
	                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.view.View p3)
	    {
	        this.l();
	        android.view.Window$Callback v0_2 = ((android.view.ViewGroup) this.s.findViewById(16908290));
	        v0_2.removeAllViews();
	        v0_2.addView(p3);
	        this.c.onContentChanged();
	        return;
	    }
	
	
	    public final void a(android.view.View p3, android.view.ViewGroup$LayoutParams p4)
	    {
	        this.l();
	        android.view.Window$Callback v0_2 = ((android.view.ViewGroup) this.s.findViewById(16908290));
	        v0_2.removeAllViews();
	        v0_2.addView(p3, p4);
	        this.c.onContentChanged();
	        return;
	    }
	
	
	    void a(nw p6, boolean p7)
	    {
	        if ((!p7) || ((p6.a != 0) || ((this.n == null) || (!this.n.c())))) {
	            boolean v1 = p6.m;
	            int v0_6 = ((android.view.WindowManager) this.a.getSystemService("window"));
	            if ((v0_6 != 0) && ((v1) && (p6.e != null))) {
	                v0_6.removeView(p6.e);
	            }
	            p6.k = 0;
	            p6.l = 0;
	            p6.m = 0;
	            if ((v1) && (p7)) {
	                this.a(p6.a, p6, 0);
	            }
	            p6.f = 0;
	            p6.o = 1;
	            if (this.F == p6) {
	                this.F = 0;
	            }
	        } else {
	            this.b(p6.h);
	        }
	        return;
	    }
	
	
	    public final void a(qa p7)
	    {
	        if ((this.n == null) || ((!this.n.b()) || ((hf.b(android.view.ViewConfiguration.get(this.a))) && (!this.n.d())))) {
	            sd v0_8 = this.e(0);
	            v0_8.o = 1;
	            this.a(v0_8, 0);
	            this.a(v0_8, 0);
	        } else {
	            sd v0_10 = this.b.getCallback();
	            if (this.n.c()) {
	                this.n.f();
	                if (!this.m) {
	                    v0_10.onPanelClosed(8, this.e(0).h);
	                }
	            } else {
	                if ((v0_10 != null) && (!this.m)) {
	                    if ((this.t) && ((this.u & 1) != 0)) {
	                        this.y.removeCallbacks(this.G);
	                        this.G.run();
	                    }
	                    qa v1_14 = this.e(0);
	                    if ((v1_14.h != null) && ((!v1_14.p) && (v0_10.onPreparePanel(0, v1_14.g, v1_14.h)))) {
	                        v0_10.onMenuOpened(8, v1_14.h);
	                        this.n.e();
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    final boolean a(int p5, android.view.KeyEvent p6)
	    {
	        nw v0 = 1;
	        nw v2_0 = this.a();
	        if ((v2_0 == null) || (!v2_0.a(p5, p6))) {
	            if ((this.F == null) || (!this.a(this.F, p6.getKeyCode(), p6, 1))) {
	                if (this.F == null) {
	                    nw v2_6 = this.e(0);
	                    this.b(v2_6, p6);
	                    boolean v3_2 = this.a(v2_6, p6.getKeyCode(), p6, 1);
	                    v2_6.k = 0;
	                    if (v3_2) {
	                        return v0;
	                    }
	                }
	                v0 = 0;
	            } else {
	                if (this.F != null) {
	                    this.F.l = 1;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    final boolean a(android.view.KeyEvent p6)
	    {
	        sd v0_1;
	        int v1_0 = 1;
	        int v3_0 = p6.getKeyCode();
	        if (p6.getAction() != 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        sd v0_31;
	        if (v0_1 == null) {
	            switch (v3_0) {
	                case 4:
	                    sd v0_25 = this.e(0);
	                    if ((v0_25 == null) || (!v0_25.m)) {
	                        sd v0_29;
	                        if (this.o == null) {
	                            sd v0_27 = this.a();
	                            if ((v0_27 == null) || (!v0_27.g())) {
	                                v0_29 = 0;
	                            } else {
	                                v0_29 = 1;
	                            }
	                        } else {
	                            this.o.c();
	                            v0_29 = 1;
	                        }
	                        if (v0_29 == null) {
	                        }
	                    } else {
	                        this.a(v0_25, 1);
	                    }
	                    break;
	                case 82:
	                    sd v0_24;
	                    if (this.o == null) {
	                        int v3_1;
	                        String v4_0 = this.e(0);
	                        if ((this.n == null) || ((!this.n.b()) || (hf.b(android.view.ViewConfiguration.get(this.a))))) {
	                            if ((!v4_0.m) && (!v4_0.l)) {
	                                if (!v4_0.k) {
	                                    v3_1 = 0;
	                                } else {
	                                    sd v0_13;
	                                    if (!v4_0.p) {
	                                        v0_13 = 1;
	                                    } else {
	                                        v4_0.k = 0;
	                                        v0_13 = this.b(v4_0, p6);
	                                    }
	                                    if (v0_13 == null) {
	                                    } else {
	                                        this.a(v4_0, p6);
	                                        v3_1 = 1;
	                                    }
	                                }
	                            } else {
	                                v3_1 = v4_0.m;
	                                this.a(v4_0, 1);
	                            }
	                        } else {
	                            if (this.n.c()) {
	                                v3_1 = this.n.f();
	                            } else {
	                                if ((this.m) || (!this.b(v4_0, p6))) {
	                                } else {
	                                    v3_1 = this.n.e();
	                                }
	                            }
	                        }
	                        if (v3_1 != 0) {
	                            sd v0_22 = ((android.media.AudioManager) this.a.getSystemService("audio"));
	                            if (v0_22 == null) {
	                                android.util.Log.w("AppCompatDelegate", "Couldn\'t get audio manager");
	                            } else {
	                                v0_22.playSoundEffect(0);
	                            }
	                        }
	                        v0_24 = v3_1;
	                    } else {
	                        v0_24 = 0;
	                    }
	                    if (v0_24 == null) {
	                    }
	                    break;
	            }
	            v0_31 = 0;
	            v1_0 = v0_31;
	        } else {
	            switch (v3_0) {
	                case 82:
	                    sd v0_34;
	                    if (p6.getRepeatCount() != 0) {
	                        v0_34 = 0;
	                    } else {
	                        sd v0_33 = this.e(0);
	                        if (v0_33.m) {
	                        } else {
	                            v0_34 = this.b(v0_33, p6);
	                        }
	                    }
	                    if (v0_34 == null) {
	                    } else {
	                        v0_31 = 1;
	                    }
	                    break;
	            }
	            if (android.os.Build$VERSION.SDK_INT >= 11) {
	                v1_0 = 0;
	            } else {
	                v0_31 = this.a(v3_0, p6);
	            }
	        }
	        return v1_0;
	    }
	
	
	    public final boolean a(qa p3, android.view.MenuItem p4)
	    {
	        boolean v0_2;
	        boolean v0_1 = this.b.getCallback();
	        if ((!v0_1) || (this.m)) {
	            v0_2 = 0;
	        } else {
	            int v1_2 = this.a(p3.k());
	            if (v1_2 == 0) {
	            } else {
	                v0_2 = v0_1.onMenuItemSelected(v1_2.a, p4);
	            }
	        }
	        return v0_2;
	    }
	
	
	    android.view.View b(android.view.View p2, String p3, android.content.Context p4, android.util.AttributeSet p5)
	    {
	        int v0_4;
	        if (!(this.c instanceof android.view.LayoutInflater$Factory)) {
	            v0_4 = 0;
	        } else {
	            v0_4 = ((android.view.LayoutInflater$Factory) this.c).onCreateView(p3, p4, p5);
	            if (v0_4 == 0) {
	            }
	        }
	        return v0_4;
	    }
	
	
	    public final void b(android.view.View p3, android.view.ViewGroup$LayoutParams p4)
	    {
	        this.l();
	        ((android.view.ViewGroup) this.s.findViewById(16908290)).addView(p3, p4);
	        this.c.onContentChanged();
	        return;
	    }
	
	
	    final void b(CharSequence p2)
	    {
	        if (this.n == null) {
	            if (this.f == null) {
	                if (this.z != null) {
	                    this.z.setText(p2);
	                }
	            } else {
	                this.f.c(p2);
	            }
	        } else {
	            this.n.a(p2);
	        }
	        return;
	    }
	
	
	    void b(qa p3)
	    {
	        if (!this.D) {
	            this.D = 1;
	            this.n.h();
	            int v0_4 = this.b.getCallback();
	            if ((v0_4 != 0) && (!this.m)) {
	                v0_4.onPanelClosed(8, p3);
	            }
	            this.D = 0;
	        }
	        return;
	    }
	
	
	    public final boolean b(int p2)
	    {
	        boolean v0_0 = 1;
	        switch (p2) {
	            case 1:
	                this.m();
	                this.k = 1;
	                break;
	            case 2:
	                this.m();
	                this.B = 1;
	                break;
	            case 3:
	            case 4:
	            case 6:
	            case 7:
	            default:
	                v0_0 = this.b.requestFeature(p2);
	                break;
	            case 5:
	                this.m();
	                this.C = 1;
	                break;
	            case 8:
	                this.m();
	                this.g = 1;
	                break;
	            case 9:
	                this.m();
	                this.h = 1;
	                break;
	            case 10:
	                this.m();
	                this.i = 1;
	                break;
	        }
	        return v0_0;
	    }
	
	
	    public final void c()
	    {
	        this.l();
	        return;
	    }
	
	
	    final boolean c(int p4)
	    {
	        int v0 = 0;
	        if (p4 != 8) {
	            if (p4 == 0) {
	                nw v1_1 = this.e(p4);
	                if (v1_1.m) {
	                    this.a(v1_1, 0);
	                }
	            }
	        } else {
	            nw v1_2 = this.a();
	            if (v1_2 != null) {
	                v1_2.e(0);
	            }
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final void d()
	    {
	        mj v0 = this.a();
	        if (v0 != null) {
	            v0.d(0);
	        }
	        return;
	    }
	
	
	    final boolean d(int p3)
	    {
	        int v0 = 1;
	        if (p3 != 8) {
	            v0 = 0;
	        } else {
	            mj v1_1 = this.a();
	            if (v1_1 != null) {
	                v1_1.e(1);
	            }
	        }
	        return v0;
	    }
	
	
	    nw e(int p5)
	    {
	        nw v0_0 = this.E;
	        if ((v0_0 == null) || (v0_0.length <= p5)) {
	            nw v1_2 = new nw[(p5 + 1)];
	            if (v0_0 != null) {
	                System.arraycopy(v0_0, 0, v1_2, 0, v0_0.length);
	            }
	            this.E = v1_2;
	            v0_0 = v1_2;
	        }
	        nw v0_1;
	        nw v1_3 = v0_0[p5];
	        if (v1_3 != null) {
	            v0_1 = v1_3;
	        } else {
	            nw v1_5 = new nw(p5);
	            v0_0[p5] = v1_5;
	            v0_1 = v1_5;
	        }
	        return v0_1;
	    }
	
	
	    public final void e()
	    {
	        mj v0 = this.a();
	        if (v0 != null) {
	            v0.d(1);
	        }
	        return;
	    }
	
	
	    public final void f()
	    {
	        int v0_0 = this.a();
	        if ((v0_0 == 0) || (!v0_0.f())) {
	            this.f(0);
	        }
	        return;
	    }
	
	
	    public final void i()
	    {
	        android.view.LayoutInflater v0_1 = android.view.LayoutInflater.from(this.a);
	        if (v0_1.getFactory() == null) {
	            fm.a(v0_1, this);
	        }
	        return;
	    }
	
	
	    public final mj j()
	    {
	        this.l();
	        pb v0_0 = 0;
	        if (!(this.c instanceof android.app.Activity)) {
	            if ((this.c instanceof android.app.Dialog)) {
	                v0_0 = new pb(((android.app.Dialog) this.c));
	            }
	        } else {
	            v0_0 = new pb(((android.app.Activity) this.c), this.h);
	        }
	        if (v0_0 != null) {
	            v0_0.c(this.H);
	        }
	        return v0_0;
	    }
	
