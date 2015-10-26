	public static final jh a
	public final java.lang.Object b
	
	    static jd()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 22) {
	            if (android.os.Build$VERSION.SDK_INT < 21) {
	                if (android.os.Build$VERSION.SDK_INT < 19) {
	                    if (android.os.Build$VERSION.SDK_INT < 18) {
	                        if (android.os.Build$VERSION.SDK_INT < 16) {
	                            if (android.os.Build$VERSION.SDK_INT < 14) {
	                                jd.a = new jh();
	                            } else {
	                                jd.a = new jg();
	                            }
	                        } else {
	                            jd.a = new ji();
	                        }
	                    } else {
	                        jd.a = new jj();
	                    }
	                } else {
	                    jd.a = new jk();
	                }
	            } else {
	                jd.a = new je();
	            }
	        } else {
	            jd.a = new jf();
	        }
	        return;
	    }
	
	
	    public jd(Object p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public static jd a(jd p2)
	    {
	        int v0_1;
	        Object v1_1 = jd.a.a(p2.b);
	        if (v1_1 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new jd(v1_1);
	        }
	        return v0_1;
	    }
	
	
	    public static synthetic jh k()
	    {
	        return jd.a;
	    }
	
	
	    public final int a()
	    {
	        return jd.a.b(this.b);
	    }
	
	
	    public final void a(int p3)
	    {
	        jd.a.a(this.b, p3);
	        return;
	    }
	
	
	    public final void a(android.graphics.Rect p3)
	    {
	        jd.a.a(this.b, p3);
	        return;
	    }
	
	
	    public final void a(android.view.View p3)
	    {
	        jd.a.b(this.b, p3);
	        return;
	    }
	
	
	    public final void a(CharSequence p3)
	    {
	        jd.a.a(this.b, p3);
	        return;
	    }
	
	
	    public final void a(Object p4)
	    {
	        jd.a.b(this.b, ((jm) p4).a);
	        return;
	    }
	
	
	    public final void a(boolean p3)
	    {
	        jd.a.c(this.b, p3);
	        return;
	    }
	
	
	    public final void b(android.graphics.Rect p3)
	    {
	        jd.a.b(this.b, p3);
	        return;
	    }
	
	
	    public final void b(boolean p3)
	    {
	        jd.a.d(this.b, p3);
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return jd.a.k(this.b);
	    }
	
	
	    public final void c(boolean p3)
	    {
	        jd.a.f(this.b, p3);
	        return;
	    }
	
	
	    public final boolean c()
	    {
	        return jd.a.l(this.b);
	    }
	
	
	    public final boolean d()
	    {
	        return jd.a.p(this.b);
	    }
	
	
	    public final boolean e()
	    {
	        return jd.a.i(this.b);
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if (p5 != null) {
	                if (this.getClass() == p5.getClass()) {
	                    if (this.b != null) {
	                        if (!this.b.equals(((jd) p5).b)) {
	                            v0 = 0;
	                        }
	                    } else {
	                        if (((jd) p5).b != null) {
	                            v0 = 0;
	                        }
	                    }
	                } else {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final boolean f()
	    {
	        return jd.a.m(this.b);
	    }
	
	
	    public final boolean g()
	    {
	        return jd.a.j(this.b);
	    }
	
	
	    public final CharSequence h()
	    {
	        return jd.a.e(this.b);
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2;
	        if (this.b != null) {
	            v0_2 = this.b.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final CharSequence i()
	    {
	        return jd.a.c(this.b);
	    }
	
	
	    public final CharSequence j()
	    {
	        return jd.a.d(this.b);
	    }
	
	
	    public final String toString()
	    {
	        StringBuilder v2_1 = new StringBuilder();
	        v2_1.append(super.toString());
	        int v0_2 = new android.graphics.Rect();
	        this.a(v0_2);
	        v2_1.append(new StringBuilder("; boundsInParent: ").append(v0_2).toString());
	        this.b(v0_2);
	        v2_1.append(new StringBuilder("; boundsInScreen: ").append(v0_2).toString());
	        v2_1.append("; packageName: ").append(this.h());
	        v2_1.append("; className: ").append(this.i());
	        v2_1.append("; text: ").append(jd.a.f(this.b));
	        v2_1.append("; contentDescription: ").append(this.j());
	        v2_1.append("; viewId: ").append(jd.a.t(this.b));
	        v2_1.append("; checkable: ").append(jd.a.g(this.b));
	        v2_1.append("; checked: ").append(jd.a.h(this.b));
	        v2_1.append("; focusable: ").append(this.b());
	        v2_1.append("; focused: ").append(this.c());
	        v2_1.append("; selected: ").append(this.d());
	        v2_1.append("; clickable: ").append(this.e());
	        v2_1.append("; longClickable: ").append(this.f());
	        v2_1.append("; enabled: ").append(this.g());
	        v2_1.append("; password: ").append(jd.a.n(this.b));
	        v2_1.append(new StringBuilder("; scrollable: ").append(jd.a.o(this.b)).toString());
	        v2_1.append("; [");
	        int v0_38 = this.a();
	        while (v0_38 != 0) {
	            int v0_41;
	            int v3_9 = (1 << Integer.numberOfTrailingZeros(v0_38));
	            int v1_30 = ((v3_9 ^ -1) & v0_38);
	            switch (v3_9) {
	                case 1:
	                    v0_41 = "ACTION_FOCUS";
	                    break;
	                case 2:
	                    v0_41 = "ACTION_CLEAR_FOCUS";
	                    break;
	                case 4:
	                    v0_41 = "ACTION_SELECT";
	                    break;
	                case 8:
	                    v0_41 = "ACTION_CLEAR_SELECTION";
	                    break;
	                case 16:
	                    v0_41 = "ACTION_CLICK";
	                    break;
	                case 32:
	                    v0_41 = "ACTION_LONG_CLICK";
	                    break;
	                case 64:
	                    v0_41 = "ACTION_ACCESSIBILITY_FOCUS";
	                    break;
	                case 128:
	                    v0_41 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
	                    break;
	                case 256:
	                    v0_41 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
	                    break;
	                case 512:
	                    v0_41 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
	                    break;
	                case 1024:
	                    v0_41 = "ACTION_NEXT_HTML_ELEMENT";
	                    break;
	                case 2048:
	                    v0_41 = "ACTION_PREVIOUS_HTML_ELEMENT";
	                    break;
	                case 4096:
	                    v0_41 = "ACTION_SCROLL_FORWARD";
	                    break;
	                case 8192:
	                    v0_41 = "ACTION_SCROLL_BACKWARD";
	                    break;
	                case 16384:
	                    v0_41 = "ACTION_COPY";
	                    break;
	                case 32768:
	                    v0_41 = "ACTION_PASTE";
	                    break;
	                case 65536:
	                    v0_41 = "ACTION_CUT";
	                    break;
	                case 131072:
	                    v0_41 = "ACTION_SET_SELECTION";
	                    break;
	                default:
	                    v0_41 = "ACTION_UNKNOWN";
	            }
	            v2_1.append(v0_41);
	            if (v1_30 != 0) {
	                v2_1.append(", ");
	            }
	            v0_38 = v1_30;
	        }
	        v2_1.append("]");
	        return v2_1.toString();
	    }
	
