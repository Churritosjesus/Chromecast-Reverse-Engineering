	static zw b
	private static  f
	final  a
	  c
	  d
	  e
	private android.graphics.Paint g
	private android.graphics.Paint h
	private android.graphics.Paint i
	private android.graphics.RectF j
	private android.graphics.Path k
	private  l
	private  m
	private  n
	private final  o
	private final  p
	private  q
	
	    static zv()
	    {
	        zv.f = Math.cos(Math.toRadians(45.0));
	        return;
	    }
	
	
	    zv(android.content.res.Resources p7, int p8, float p9, float p10, float p11)
	    {
	        this.n = 1;
	        this.e = 1;
	        this.q = 0;
	        this.o = p7.getColor(a.cc);
	        this.p = p7.getColor(a.cb);
	        this.a = p7.getDimensionPixelSize(a.cd);
	        this.g = new android.graphics.Paint(5);
	        this.g.setColor(p8);
	        this.h = new android.graphics.Paint(5);
	        this.h.setStyle(android.graphics.Paint$Style.FILL);
	        this.c = ((float) ((int) (p9 + 1056964608)));
	        this.j = new android.graphics.RectF();
	        this.i = new android.graphics.Paint(this.h);
	        this.i.setAntiAlias(0);
	        if ((p10 >= 0) && (p11 >= 0)) {
	            float v0_23 = ((float) zv.a(p10));
	            float v1_4 = ((float) zv.a(p11));
	            if (v0_23 > v1_4) {
	                if (!this.q) {
	                    this.q = 1;
	                }
	                v0_23 = v1_4;
	            }
	            if ((this.m != v0_23) || (this.d != v1_4)) {
	                this.m = v0_23;
	                this.d = v1_4;
	                this.l = ((float) ((int) (((v0_23 * 1069547520) + ((float) this.a)) + 1056964608)));
	                this.n = 1;
	                this.invalidateSelf();
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("invalid shadow size");
	        }
	    }
	
	
	    static float a(float p6, float p7, boolean p8)
	    {
	        float v0_1;
	        if (!p8) {
	            v0_1 = (1069547520 * p6);
	        } else {
	            v0_1 = ((float) (((double) (1069547520 * p6)) + ((1.0 - zv.f) * ((double) p7))));
	        }
	        return v0_1;
	    }
	
	
	    private static int a(float p3)
	    {
	        int v0_2 = ((int) (1056964608 + p3));
	        if ((v0_2 % 2) == 1) {
	            v0_2--;
	        }
	        return v0_2;
	    }
	
	
	    static float b(float p6, float p7, boolean p8)
	    {
	        if (p8) {
	            p6 = ((float) (((double) p6) + ((1.0 - zv.f) * ((double) p7))));
	        }
	        return p6;
	    }
	
	
	    public final void draw(android.graphics.Canvas p14)
	    {
	        int v8 = 1;
	        if (this.n) {
	            zw v0_1 = this.getBounds();
	            float v2_1 = (this.d * 1069547520);
	            this.j.set((((float) v0_1.left) + this.d), (((float) v0_1.top) + v2_1), (((float) v0_1.right) - this.d), (((float) v0_1.bottom) - v2_1));
	            zw v0_6 = new android.graphics.RectF((- this.c), (- this.c), this.c, this.c);
	            float v2_5 = new android.graphics.RectF(v0_6);
	            v2_5.inset((- this.l), (- this.l));
	            if (this.k != null) {
	                this.k.reset();
	            } else {
	                this.k = new android.graphics.Path();
	            }
	            this.k.setFillType(android.graphics.Path$FillType.EVEN_ODD);
	            this.k.moveTo((- this.c), 0);
	            this.k.rLineTo((- this.l), 0);
	            this.k.arcTo(v2_5, 1127481344, 1119092736, 0);
	            this.k.arcTo(v0_6, 1132920832, -1028390912, 0);
	            this.k.close();
	            float v2_9 = (this.c / (this.c + this.l));
	            android.graphics.Shader$TileMode v7_1 = this.h;
	            android.graphics.Paint v3_17 = (this.c + this.l);
	            float v4_14 = new int[3];
	            v4_14[0] = this.o;
	            v4_14[1] = this.o;
	            v4_14[2] = this.p;
	            android.graphics.Paint v5_9 = new float[3];
	            v5_9[0] = 0;
	            v5_9[1] = v2_9;
	            v5_9[2] = 1065353216;
	            v7_1.setShader(new android.graphics.RadialGradient(0, 0, v3_17, v4_14, v5_9, android.graphics.Shader$TileMode.CLAMP));
	            android.graphics.Paint v10 = this.i;
	            float v2_14 = ((- this.c) + this.l);
	            float v4_16 = ((- this.c) - this.l);
	            android.graphics.Paint v5_10 = new int[3];
	            v5_10[0] = this.o;
	            v5_10[1] = this.o;
	            v5_10[2] = this.p;
	            int v6_7 = new float[3];
	            v6_7 = {0, 1056964608, 1065353216};
	            v10.setShader(new android.graphics.LinearGradient(0, v2_14, 0, v4_16, v5_10, v6_7, android.graphics.Shader$TileMode.CLAMP));
	            this.i.setAntiAlias(0);
	            this.n = 0;
	        }
	        int v6_8;
	        p14.translate(0, (this.m / 1073741824));
	        float v2_16 = ((- this.c) - this.l);
	        android.graphics.Shader$TileMode v7_3 = ((this.c + ((float) this.a)) + (this.m / 1073741824));
	        if ((this.j.width() - (v7_3 * 1073741824)) <= 0) {
	            v6_8 = 0;
	        } else {
	            v6_8 = 1;
	        }
	        if ((this.j.height() - (v7_3 * 1073741824)) <= 0) {
	            v8 = 0;
	        }
	        int v9_1 = p14.save();
	        p14.translate((this.j.left + v7_3), (this.j.top + v7_3));
	        p14.drawPath(this.k, this.h);
	        if (v6_8 != 0) {
	            p14.drawRect(0, v2_16, (this.j.width() - (v7_3 * 1073741824)), (- this.c), this.i);
	        }
	        p14.restoreToCount(v9_1);
	        int v9_2 = p14.save();
	        p14.translate((this.j.right - v7_3), (this.j.bottom - v7_3));
	        p14.rotate(1127481344);
	        p14.drawPath(this.k, this.h);
	        if (v6_8 != 0) {
	            p14.drawRect(0, v2_16, (this.j.width() - (v7_3 * 1073741824)), (this.l + (- this.c)), this.i);
	        }
	        p14.restoreToCount(v9_2);
	        int v6_9 = p14.save();
	        p14.translate((this.j.left + v7_3), (this.j.bottom - v7_3));
	        p14.rotate(1132920832);
	        p14.drawPath(this.k, this.h);
	        if (v8 != 0) {
	            p14.drawRect(0, v2_16, (this.j.height() - (v7_3 * 1073741824)), (- this.c), this.i);
	        }
	        p14.restoreToCount(v6_9);
	        int v6_10 = p14.save();
	        p14.translate((this.j.right - v7_3), (this.j.top + v7_3));
	        p14.rotate(1119092736);
	        p14.drawPath(this.k, this.h);
	        if (v8 != 0) {
	            p14.drawRect(0, v2_16, (this.j.height() - (v7_3 * 1073741824)), (- this.c), this.i);
	        }
	        p14.restoreToCount(v6_10);
	        p14.translate(0, ((- this.m) / 1073741824));
	        zv.b.a(p14, this.j, this.c, this.g);
	        return;
	    }
	
	
	    public final int getOpacity()
	    {
	        return -3;
	    }
	
	
	    public final boolean getPadding(android.graphics.Rect p5)
	    {
	        p5.set(((int) Math.ceil(((double) zv.b(this.d, this.c, this.e)))), ((int) Math.ceil(((double) zv.a(this.d, this.c, this.e)))), ((int) Math.ceil(((double) zv.b(this.d, this.c, this.e)))), ((int) Math.ceil(((double) zv.a(this.d, this.c, this.e)))));
	        return 1;
	    }
	
	
	    protected final void onBoundsChange(android.graphics.Rect p2)
	    {
	        super.onBoundsChange(p2);
	        this.n = 1;
	        return;
	    }
	
	
	    public final void setAlpha(int p2)
	    {
	        this.g.setAlpha(p2);
	        this.h.setAlpha(p2);
	        this.i.setAlpha(p2);
	        return;
	    }
	
	
	    public final void setColorFilter(android.graphics.ColorFilter p2)
	    {
	        this.g.setColorFilter(p2);
	        this.h.setColorFilter(p2);
	        this.i.setColorFilter(p2);
	        return;
	    }
	
