	private static final  d
	  a
	  b
	private final android.graphics.Paint c
	private final  e
	private final  f
	private final  g
	private final  h
	private final  i
	private final  j
	private final android.graphics.Path k
	private final  l
	private  m
	private  n
	
	    static nz()
	    {
	        nz.d = ((float) Math.toRadians(45.0));
	        return;
	    }
	
	
	    nz(android.content.Context p10)
	    {
	        this.c = new android.graphics.Paint();
	        this.k = new android.graphics.Path();
	        this.a = 0;
	        float v0_5 = p10.getTheme().obtainStyledAttributes(0, oq.R, a.F, a.bY);
	        this.c.setAntiAlias(1);
	        this.c.setColor(v0_5.getColor(oq.T, 0));
	        this.l = v0_5.getDimensionPixelSize(oq.U, 0);
	        this.g = ((float) Math.round(v0_5.getDimension(oq.S, 0)));
	        this.f = ((float) Math.round(v0_5.getDimension(oq.Z, 0)));
	        this.e = v0_5.getDimension(oq.Y, 0);
	        this.i = ((float) Math.round(v0_5.getDimension(oq.V, 0)));
	        this.j = v0_5.getBoolean(oq.X, 1);
	        this.h = v0_5.getDimension(oq.W, 0);
	        this.n = ((float) ((((int) ((((float) this.l) - (this.e * 1077936128)) - (this.i * 1073741824))) / 4) << 1));
	        this.n = ((float) (((double) this.n) + ((((double) this.e) * 1.5) + ((double) this.i))));
	        v0_5.recycle();
	        this.c.setStyle(android.graphics.Paint$Style.STROKE);
	        this.c.setStrokeJoin(android.graphics.Paint$Join.MITER);
	        this.c.setStrokeCap(android.graphics.Paint$Cap.BUTT);
	        this.c.setStrokeWidth(this.e);
	        this.m = ((float) (((double) (this.e / 1073741824)) * Math.cos(((double) nz.d))));
	        return;
	    }
	
	
	    public void draw(android.graphics.Canvas p13)
	    {
	        android.graphics.Paint v1_12;
	        float v2_0 = this.getBounds();
	        boolean v3 = this.a();
	        float v0_0 = this.g;
	        float v4_1 = (v0_0 + ((this.f - v0_0) * this.b));
	        float v0_1 = this.g;
	        android.graphics.Path v5_1 = (v0_1 + ((this.h - v0_1) * this.b));
	        float v6_1 = ((float) Math.round((0 + ((this.m - 0) * this.b))));
	        float v7_1 = (0 + ((nz.d - 0) * this.b));
	        if (!v3) {
	            v1_12 = -1020002304;
	        } else {
	            v1_12 = 0;
	        }
	        float v0_8;
	        if (!v3) {
	            v0_8 = 0;
	        } else {
	            v0_8 = 1127481344;
	        }
	        android.graphics.Paint v1_13 = (v1_12 + ((v0_8 - v1_12) * this.b));
	        float v0_11 = ((float) Math.round((((double) v4_1) * Math.cos(((double) v7_1)))));
	        float v4_2 = ((float) Math.round((((double) v4_1) * Math.sin(((double) v7_1)))));
	        this.k.rewind();
	        float v7_4 = (this.i + this.e);
	        float v7_5 = (v7_4 + (((- this.m) - v7_4) * this.b));
	        float v8_13 = ((- v5_1) / 1073741824);
	        this.k.moveTo((v8_13 + v6_1), 0);
	        this.k.rLineTo((v5_1 - (v6_1 * 1073741824)), 0);
	        this.k.moveTo(v8_13, v7_5);
	        this.k.rLineTo(v0_11, v4_2);
	        this.k.moveTo(v8_13, (- v7_5));
	        this.k.rLineTo(v0_11, (- v4_2));
	        this.k.close();
	        p13.save();
	        p13.translate(((float) v2_0.centerX()), this.n);
	        if (!this.j) {
	            if (v3) {
	                p13.rotate(1127481344);
	            }
	        } else {
	            float v0_19;
	            if ((this.a ^ v3) == 0) {
	                v0_19 = 1;
	            } else {
	                v0_19 = -1;
	            }
	            p13.rotate((((float) v0_19) * v1_13));
	        }
	        p13.drawPath(this.k, this.c);
	        p13.restore();
	        return;
	    }
	
	
	    public int getIntrinsicHeight()
	    {
	        return this.l;
	    }
	
	
	    public int getIntrinsicWidth()
	    {
	        return this.l;
	    }
	
	
	    public int getOpacity()
	    {
	        return -3;
	    }
	
	
	    public boolean isAutoMirrored()
	    {
	        return 1;
	    }
	
	
	    public void setAlpha(int p2)
	    {
	        this.c.setAlpha(p2);
	        return;
	    }
	
	
	    public void setColorFilter(android.graphics.ColorFilter p2)
	    {
	        this.c.setColorFilter(p2);
	        return;
	    }
	
