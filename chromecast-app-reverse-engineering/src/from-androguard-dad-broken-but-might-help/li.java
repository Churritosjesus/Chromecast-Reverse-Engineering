	private static final android.view.animation.Interpolator c
	private static final android.view.animation.Interpolator d
	public final lm a
	  b
	private final I e
	private final java.util.ArrayList f
	private  g
	private android.content.res.Resources h
	private android.view.View i
	private android.view.animation.Animation j
	private  k
	private  l
	private  m
	private final android.graphics.drawable.Drawable$Callback n
	
	    static li()
	    {
	        li.c = new android.view.animation.LinearInterpolator();
	        li.d = new kc();
	        return;
	    }
	
	
	    public li(android.content.Context p17, android.view.View p18)
	    {
	        lm v2_29;
	        li v16_1 = ;
	lm v2_1 = new int[1];
	        v2_1[0] = -16777216;
	        v16_1.e = v2_1;
	        v16_1.f = new java.util.ArrayList();
	        v16_1.n = new ll(v16_1);
	        v16_1.i = p18;
	        v16_1.h = p17.getResources();
	        v16_1.a = new lm(v16_1.n);
	        v16_1.a.a(v16_1.e);
	        lm v12 = v16_1.a;
	        float v13_2 = v16_1.h.getDisplayMetrics().density;
	        v16_1.l = (40.0 * ((double) v13_2));
	        v16_1.m = (((double) v13_2) * 40.0);
	        lm v2_15 = (((float) 2.5) * v13_2);
	        v12.g = v2_15;
	        v12.b.setStrokeWidth(v2_15);
	        v12.d();
	        v12.q = (((double) v13_2) * 8.75);
	        v12.a(0);
	        lj v3_4 = (1084227584 * v13_2);
	        v12.r = ((int) (1092616192 * v13_2));
	        v12.s = ((int) v3_4);
	        lm v2_25 = ((float) Math.min(((int) v16_1.l), ((int) v16_1.m)));
	        if ((v12.q > 0) && (v2_25 >= 0)) {
	            v2_29 = ((float) (((double) (v2_25 / 1073741824)) - v12.q));
	        } else {
	            v2_29 = ((float) Math.ceil(((double) (v12.g / 1073741824))));
	        }
	        v12.h = v2_29;
	        lm v2_34 = v16_1.a;
	        lj v3_12 = new lj(v16_1, v2_34);
	        v3_12.setRepeatCount(-1);
	        v3_12.setRepeatMode(1);
	        v3_12.setInterpolator(li.c);
	        v3_12.setAnimationListener(new lk(v16_1, v2_34));
	        v16_1.j = v3_12;
	        return;
	    }
	
	
	    static synthetic float a(li p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic float a(li p0, float p1)
	    {
	        p0.k = p1;
	        return p1;
	    }
	
	
	    static synthetic float a(li p1, lm p2)
	    {
	        return li.a(p2);
	    }
	
	
	    private static float a(lm p6)
	    {
	        return ((float) Math.toRadians((((double) p6.g) / (6.283185307179586 * p6.q))));
	    }
	
	
	    static synthetic android.view.animation.Interpolator a()
	    {
	        return li.d;
	    }
	
	
	    private void a(float p10, lm p11)
	    {
	        if (p10 > 1061158912) {
	            int v0_2 = ((p10 - 1061158912) / 1048576000);
	            float v2_2 = p11.i[p11.a()];
	            int v1_5 = Integer.valueOf(p11.i[p11.j]).intValue();
	            int v3_1 = (v1_5 >> 24);
	            int v4_1 = ((v1_5 >> 16) & 255);
	            int v5_1 = ((v1_5 >> 8) & 255);
	            int v1_6 = (v1_5 & 255);
	            float v2_4 = Integer.valueOf(v2_2).intValue();
	            p11.w = ((((int) (v0_2 * ((float) ((v2_4 & 255) - v1_6)))) + v1_6) | ((((v3_1 + ((int) (((float) ((v2_4 >> 24) - v3_1)) * v0_2))) << 24) | ((v4_1 + ((int) (((float) (((v2_4 >> 16) & 255) - v4_1)) * v0_2))) << 16)) | ((((int) (((float) (((v2_4 >> 8) & 255) - v5_1)) * v0_2)) + v5_1) << 8)));
	        }
	        return;
	    }
	
	
	    static synthetic void a(li p4, float p5, lm p6)
	    {
	        p4.a(p5, p6);
	        float v0_5 = ((float) (Math.floor(((double) (p6.m / 1061997773))) + 1.0));
	        p6.a(((((p6.l - li.a(p6)) - p6.k) * p5) + p6.k));
	        p6.b(p6.l);
	        p6.c((((v0_5 - p6.m) * p5) + p6.m));
	        return;
	    }
	
	
	    static synthetic void b(li p0, float p1, lm p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    public final void a(float p3)
	    {
	        lm v0 = this.a;
	        if (p3 != v0.p) {
	            v0.p = p3;
	            v0.d();
	        }
	        return;
	    }
	
	
	    public final void a(float p3, float p4)
	    {
	        this.a.a(0);
	        this.a.b(p4);
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        this.a.a(p2);
	        return;
	    }
	
	
	    final void b(float p1)
	    {
	        this.g = p1;
	        this.invalidateSelf();
	        return;
	    }
	
	
	    public final void draw(android.graphics.Canvas p13)
	    {
	        android.graphics.Rect v6 = this.getBounds();
	        int v7 = p13.save();
	        p13.rotate(this.g, v6.exactCenterX(), v6.exactCenterY());
	        lm v8 = this.a;
	        android.graphics.Paint v1_1 = v8.a;
	        v1_1.set(v6);
	        v1_1.inset(v8.h, v8.h);
	        float v2_4 = (1135869952 * (v8.d + v8.f));
	        android.graphics.Paint v3_2 = (((v8.e + v8.f) * 1135869952) - v2_4);
	        v8.b.setColor(v8.w);
	        p13.drawArc(v1_1, v2_4, v3_2, 0, v8.b);
	        if (v8.n) {
	            if (v8.o != null) {
	                v8.o.reset();
	            } else {
	                v8.o = new android.graphics.Path();
	                v8.o.setFillType(android.graphics.Path$FillType.EVEN_ODD);
	            }
	            android.graphics.Path v0_19 = (((float) (((int) v8.h) / 2)) * v8.p);
	            android.graphics.Paint v1_5 = ((float) ((v8.q * Math.cos(0)) + ((double) v6.exactCenterX())));
	            float v4_8 = ((float) ((v8.q * Math.sin(0)) + ((double) v6.exactCenterY())));
	            v8.o.moveTo(0, 0);
	            v8.o.lineTo((((float) v8.r) * v8.p), 0);
	            v8.o.lineTo(((((float) v8.r) * v8.p) / 1073741824), (((float) v8.s) * v8.p));
	            v8.o.offset((v1_5 - v0_19), v4_8);
	            v8.o.close();
	            v8.c.setColor(v8.w);
	            p13.rotate(((v2_4 + v3_2) - 1084227584), v6.exactCenterX(), v6.exactCenterY());
	            p13.drawPath(v8.o, v8.c);
	        }
	        if (v8.t < 255) {
	            v8.u.setColor(v8.v);
	            v8.u.setAlpha((255 - v8.t));
	            p13.drawCircle(v6.exactCenterX(), v6.exactCenterY(), ((float) (v6.width() / 2)), v8.u);
	        }
	        p13.restoreToCount(v7);
	        return;
	    }
	
	
	    public final int getAlpha()
	    {
	        return this.a.t;
	    }
	
	
	    public final int getIntrinsicHeight()
	    {
	        return ((int) this.m);
	    }
	
	
	    public final int getIntrinsicWidth()
	    {
	        return ((int) this.l);
	    }
	
	
	    public final int getOpacity()
	    {
	        return -3;
	    }
	
	
	    public final boolean isRunning()
	    {
	        java.util.ArrayList v3 = this.f;
	        int v4 = v3.size();
	        int v2 = 0;
	        while (v2 < v4) {
	            int v0_2 = ((android.view.animation.Animation) v3.get(v2));
	            if ((!v0_2.hasStarted()) || (v0_2.hasEnded())) {
	                v2++;
	            } else {
	                int v0_0 = 1;
	            }
	            return v0_0;
	        }
	        v0_0 = 0;
	        return v0_0;
	    }
	
	
	    public final void setAlpha(int p2)
	    {
	        this.a.t = p2;
	        return;
	    }
	
	
	    public final void setColorFilter(android.graphics.ColorFilter p3)
	    {
	        lm v0 = this.a;
	        v0.b.setColorFilter(p3);
	        v0.d();
	        return;
	    }
	
	
	    public final void start()
	    {
	        this.j.reset();
	        this.a.b();
	        if (this.a.e == this.a.d) {
	            this.a.a(0);
	            this.a.c();
	            this.j.setDuration(1332);
	            this.i.startAnimation(this.j);
	        } else {
	            this.b = 1;
	            this.j.setDuration(666);
	            this.i.startAnimation(this.j);
	        }
	        return;
	    }
	
	
	    public final void stop()
	    {
	        this.i.clearAnimation();
	        this.b(0);
	        this.a.a(0);
	        this.a.a(0);
	        this.a.c();
	        return;
	    }
	
