	public bof a
	private final  b
	private final android.graphics.Paint c
	private final  d
	private final android.graphics.Paint e
	private final  f
	private final android.graphics.Paint g
	private final  h
	private  i
	private  j
	private final boi k
	
	    public boh(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private boh(android.content.Context p8, android.util.AttributeSet p9)
	    {
	        this(p8, 0);
	        this.setWillNotDraw(0);
	        float v0_3 = this.getResources().getDisplayMetrics().density;
	        android.graphics.Paint v1_0 = a.dl;
	        this.f = boh.a(v1_0, 38);
	        this.k = new boi();
	        int v2_4 = this.k;
	        int[] v3_0 = new int[1];
	        v3_0[0] = -13388315;
	        v2_4.a = v3_0;
	        int v2_5 = this.k;
	        int[] v3_1 = new int[1];
	        v3_1[0] = boh.a(v1_0, 32);
	        v2_5.b = v3_1;
	        this.b = ((int) (0 * v0_3));
	        this.c = new android.graphics.Paint();
	        this.c.setColor(this.f);
	        this.d = ((int) (1073741824 * v0_3));
	        this.e = new android.graphics.Paint();
	        this.h = 1056964608;
	        this.g = new android.graphics.Paint();
	        this.g.setStrokeWidth(((float) ((int) (v0_3 * 1065353216))));
	        return;
	    }
	
	
	    private static int a(int p3, byte p4)
	    {
	        return android.graphics.Color.argb(p4, android.graphics.Color.red(p3), android.graphics.Color.green(p3), android.graphics.Color.blue(p3));
	    }
	
	
	    final void a(int p1, float p2)
	    {
	        this.i = p1;
	        this.j = p2;
	        this.invalidate();
	        return;
	    }
	
	
	    protected final void onDraw(android.graphics.Canvas p14)
	    {
	        boi v7;
	        int v6_0 = this.getHeight();
	        int v8 = this.getChildCount();
	        int v9 = ((int) (Math.min(Math.max(0, this.h), 1065353216) * ((float) v6_0)));
	        if (this.a == null) {
	            v7 = this.k;
	        } else {
	            v7 = this.a;
	        }
	        if (v8 > 0) {
	            int v1_4;
	            int v3_3;
	            int v0_8 = this.getChildAt(this.i);
	            int v2_0 = v0_8.getLeft();
	            int v1_3 = v0_8.getRight();
	            int v0_10 = v7.a(this.i);
	            if ((this.j <= 0) || (this.i >= (this.getChildCount() - 1))) {
	                v3_3 = v1_3;
	                v1_4 = v2_0;
	            } else {
	                int v3_6 = v7.a((this.i + 1));
	                if (v0_10 != v3_6) {
	                    float v4_3 = this.j;
	                    float v5_1 = (1065353216 - v4_3);
	                    v0_10 = android.graphics.Color.rgb(((int) ((((float) android.graphics.Color.red(v3_6)) * v4_3) + (((float) android.graphics.Color.red(v0_10)) * v5_1))), ((int) ((((float) android.graphics.Color.green(v3_6)) * v4_3) + (((float) android.graphics.Color.green(v0_10)) * v5_1))), ((int) ((((float) android.graphics.Color.blue(v0_10)) * v5_1) + (((float) android.graphics.Color.blue(v3_6)) * v4_3))));
	                }
	                int v3_13 = this.getChildAt((this.i + 1));
	                v3_3 = ((int) ((((float) v1_3) * (1065353216 - this.j)) + (((float) v3_13.getRight()) * this.j)));
	                v1_4 = ((int) ((((float) v2_0) * (1065353216 - this.j)) + (this.j * ((float) v3_13.getLeft()))));
	            }
	            this.e.setColor(v0_10);
	            p14.drawRect(((float) v1_4), ((float) (v6_0 - this.d)), ((float) v3_3), ((float) v6_0), this.e);
	        }
	        p14.drawRect(0, ((float) (v6_0 - this.b)), ((float) this.getWidth()), ((float) v6_0), this.c);
	        float v10_5 = ((v6_0 - v9) / 2);
	        int v6_1 = 0;
	        while (v6_1 < (v8 - 1)) {
	            int v0_26 = this.getChildAt(v6_1);
	            this.g.setColor(v7.b(v6_1));
	            p14.drawLine(((float) v0_26.getRight()), ((float) v10_5), ((float) v0_26.getRight()), ((float) (v10_5 + v9)), this.g);
	            v6_1++;
	        }
	        return;
	    }
	
