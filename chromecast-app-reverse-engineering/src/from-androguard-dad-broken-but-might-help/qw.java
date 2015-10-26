	private static final android.view.animation.Interpolator g
	public final android.content.Context a
	public android.support.v7.widget.ActionMenuView b
	public vu c
	public android.view.ViewGroup d
	public  e
	public ih f
	private qx h
	
	    static qw()
	    {
	        qw.g = new android.view.animation.DecelerateInterpolator();
	        return;
	    }
	
	
	    qw(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    qw(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public qw(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        this.h = new qx(this);
	        int v0_3 = new android.util.TypedValue();
	        if ((!p5.getTheme().resolveAttribute(a.g, v0_3, 1)) || (v0_3.resourceId == 0)) {
	            this.a = p5;
	        } else {
	            this.a = new android.view.ContextThemeWrapper(p5, v0_3.resourceId);
	        }
	        return;
	    }
	
	
	    public static int a(int p1, int p2, boolean p3)
	    {
	        int v0;
	        if (!p3) {
	            v0 = (p1 + p2);
	        } else {
	            v0 = (p1 - p2);
	        }
	        return v0;
	    }
	
	
	    public static int a(android.view.View p2, int p3, int p4, int p5)
	    {
	        p2.measure(android.view.View$MeasureSpec.makeMeasureSpec(p3, -2147483648), p4);
	        return Math.max(0, (p3 - p2.getMeasuredWidth()));
	    }
	
	
	    public static int a(android.view.View p4, int p5, int p6, int p7, boolean p8)
	    {
	        int v0 = p4.getMeasuredWidth();
	        int v1_0 = p4.getMeasuredHeight();
	        int v2_2 = (((p7 - v1_0) / 2) + p6);
	        if (!p8) {
	            p4.layout(p5, v2_2, (p5 + v0), (v1_0 + v2_2));
	        } else {
	            p4.layout((p5 - v0), v2_2, p5, (v1_0 + v2_2));
	        }
	        if (p8) {
	            v0 = (- v0);
	        }
	        return v0;
	    }
	
	
	    public void a(int p1)
	    {
	        this.e = p1;
	        this.requestLayout();
	        return;
	    }
	
	
	    public boolean a()
	    {
	        int v0_1;
	        if (this.c == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.c.b();
	        }
	        return v0_1;
	    }
	
	
	    public void b(int p5)
	    {
	        if (this.f != null) {
	            this.f.a();
	        }
	        if (p5 != 0) {
	            ih v0_3 = gt.o(this).a(0);
	            v0_3.a(200);
	            v0_3.a(qw.g);
	            v0_3.a(this.h.a(v0_3, p5));
	            v0_3.b();
	        } else {
	            if (this.getVisibility() != 0) {
	                gt.c(this, 0);
	            }
	            ih v0_6 = gt.o(this).a(1065353216);
	            v0_6.a(200);
	            v0_6.a(qw.g);
	            v0_6.a(this.h.a(v0_6, p5));
	            v0_6.b();
	        }
	        return;
	    }
	
	
	    protected void onConfigurationChanged(android.content.res.Configuration p6)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 8) {
	            super.onConfigurationChanged(p6);
	        }
	        qa v0_2 = this.getContext().obtainStyledAttributes(0, oq.a, a.i, 0);
	        this.a(v0_2.getLayoutDimension(oq.j, 0));
	        v0_2.recycle();
	        if (this.c != null) {
	            qa v0_4 = this.c;
	            if (!v0_4.h) {
	                v0_4.g = v0_4.b.getResources().getInteger(a.bA);
	            }
	            if (v0_4.c != null) {
	                v0_4.c.b(1);
	            }
	        }
	        return;
	    }
	
