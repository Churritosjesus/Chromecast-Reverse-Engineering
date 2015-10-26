	static final I a
	static final I b
	static final I c
	static final I d
	static final I e
	static final I f
	static final I g
	static final I h
	private static final java.lang.ThreadLocal i
	private static final I j
	
	    static tb()
	    {
	        tb.i = new ThreadLocal();
	        int[] v0_2 = new int[1];
	        v0_2[0] = -16842910;
	        tb.a = v0_2;
	        int[] v0_3 = new int[1];
	        v0_3[0] = 16842908;
	        tb.b = v0_3;
	        int[] v0_4 = new int[1];
	        v0_4[0] = 16843518;
	        tb.c = v0_4;
	        int[] v0_5 = new int[1];
	        v0_5[0] = 16842919;
	        tb.d = v0_5;
	        int[] v0_6 = new int[1];
	        v0_6[0] = 16842912;
	        tb.e = v0_6;
	        int[] v0_7 = new int[1];
	        v0_7[0] = 16842913;
	        tb.f = v0_7;
	        int[] v0_9 = new int[2];
	        v0_9 = {-16842919, -16842908};
	        tb.g = v0_9;
	        int[] v0_10 = new int[0];
	        tb.h = v0_10;
	        int[] v0_11 = new int[1];
	        tb.j = v0_11;
	        return;
	    }
	
	
	    public static int a(android.content.Context p3, int p4)
	    {
	        tb.j[0] = p4;
	        android.content.res.TypedArray v0_2 = p3.obtainStyledAttributes(0, tb.j);
	        try {
	            Throwable v1_3 = v0_2.getColor(0, 0);
	            v0_2.recycle();
	            return v1_3;
	        } catch (Throwable v1_4) {
	            v0_2.recycle();
	            throw v1_4;
	        }
	    }
	
	
	    static int a(android.content.Context p3, int p4, float p5)
	    {
	        int v0_0 = tb.a(p3, p4);
	        int v1_3 = Math.round((((float) android.graphics.Color.alpha(v0_0)) * p5));
	        if ((v1_3 >= 0) && (v1_3 <= 255)) {
	            return ((v0_0 & 16777215) | (v1_3 << 24));
	        } else {
	            throw new IllegalArgumentException("alpha must be between 0 and 255.");
	        }
	    }
	
	
	    public static android.content.res.ColorStateList a(int p5, int p6)
	    {
	        int[][] v0 = new int[][2];
	        int[] v1_1 = new int[2];
	        v0[0] = tb.a;
	        v1_1[0] = p6;
	        v0[1] = tb.h;
	        v1_1[1] = p5;
	        return new android.content.res.ColorStateList(v0, v1_1);
	    }
	
	
	    public static android.content.res.ColorStateList b(android.content.Context p2, int p3)
	    {
	        tb.j[0] = p3;
	        android.content.res.TypedArray v0_2 = p2.obtainStyledAttributes(0, tb.j);
	        try {
	            Throwable v1_3 = v0_2.getColorStateList(0);
	            v0_2.recycle();
	            return v1_3;
	        } catch (Throwable v1_4) {
	            v0_2.recycle();
	            throw v1_4;
	        }
	    }
	
	
	    public static int c(android.content.Context p4, int p5)
	    {
	        int v0_6;
	        int v0_0 = tb.b(p4, p5);
	        if ((v0_0 == 0) || (!v0_0.isStateful())) {
	            int v0_3 = ((android.util.TypedValue) tb.i.get());
	            if (v0_3 == 0) {
	                v0_3 = new android.util.TypedValue();
	                tb.i.set(v0_3);
	            }
	            p4.getTheme().resolveAttribute(16842803, v0_3, 1);
	            v0_6 = tb.a(p4, p5, v0_3.getFloat());
	        } else {
	            v0_6 = v0_0.getColorForState(tb.a, v0_0.getDefaultColor());
	        }
	        return v0_6;
	    }
	
