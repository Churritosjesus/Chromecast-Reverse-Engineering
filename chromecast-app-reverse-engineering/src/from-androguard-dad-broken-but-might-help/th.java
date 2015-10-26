	public final android.content.res.TypedArray a
	private final android.content.Context b
	private tf c
	
	    private th(android.content.Context p1, android.content.res.TypedArray p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public static th a(android.content.Context p2, android.util.AttributeSet p3, int[] p4)
	    {
	        return new th(p2, p2.obtainStyledAttributes(p3, p4));
	    }
	
	
	    public static th a(android.content.Context p2, android.util.AttributeSet p3, int[] p4, int p5, int p6)
	    {
	        return new th(p2, p2.obtainStyledAttributes(p3, p4, p5, 0));
	    }
	
	
	    public final int a(int p2, int p3)
	    {
	        return this.a.getInt(p2, p3);
	    }
	
	
	    public final android.graphics.drawable.Drawable a(int p4)
	    {
	        android.graphics.drawable.Drawable v0_5;
	        if (!this.a.hasValue(p4)) {
	            v0_5 = this.a.getDrawable(p4);
	        } else {
	            android.graphics.drawable.Drawable v0_3 = this.a.getResourceId(p4, 0);
	            if (v0_3 == null) {
	            } else {
	                v0_5 = this.a().a(v0_3, 0);
	            }
	        }
	        return v0_5;
	    }
	
	
	    public final tf a()
	    {
	        if (this.c == null) {
	            this.c = tf.a(this.b);
	        }
	        return this.c;
	    }
	
	
	    public final boolean a(int p2, boolean p3)
	    {
	        return this.a.getBoolean(p2, p3);
	    }
	
	
	    public final int b(int p2, int p3)
	    {
	        return this.a.getDimensionPixelOffset(p2, p3);
	    }
	
	
	    public final android.graphics.drawable.Drawable b(int p4)
	    {
	        android.graphics.drawable.Drawable v0_4;
	        if (!this.a.hasValue(p4)) {
	            v0_4 = 0;
	        } else {
	            android.graphics.drawable.Drawable v0_3 = this.a.getResourceId(p4, 0);
	            if (v0_3 == null) {
	            } else {
	                v0_4 = this.a().a(v0_3, 1);
	            }
	        }
	        return v0_4;
	    }
	
	
	    public final int c(int p2, int p3)
	    {
	        return this.a.getDimensionPixelSize(p2, p3);
	    }
	
	
	    public final CharSequence c(int p2)
	    {
	        return this.a.getText(p2);
	    }
	
	
	    public final int d(int p2, int p3)
	    {
	        return this.a.getLayoutDimension(p2, p3);
	    }
	
	
	    public final boolean d(int p2)
	    {
	        return this.a.hasValue(p2);
	    }
	
	
	    public final int e(int p2, int p3)
	    {
	        return this.a.getResourceId(p2, p3);
	    }
	
