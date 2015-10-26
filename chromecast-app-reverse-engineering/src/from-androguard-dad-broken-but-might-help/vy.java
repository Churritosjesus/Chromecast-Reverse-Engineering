	final synthetic vu a
	
	    public vy(vu p4, android.content.Context p5)
	    {
	        this.a = p4;
	        this(p5, 0, a.r);
	        this.setClickable(1);
	        this.setFocusable(1);
	        this.setVisibility(0);
	        this.setEnabled(1);
	        this.setOnTouchListener(new vz(this, this, p4));
	        return;
	    }
	
	
	    public final boolean d()
	    {
	        return 0;
	    }
	
	
	    public final boolean e()
	    {
	        return 0;
	    }
	
	
	    public final boolean performClick()
	    {
	        if (!super.performClick()) {
	            this.playSoundEffect(0);
	            this.a.b();
	        }
	        return 1;
	    }
	
	
	    protected final boolean setFrame(int p9, int p10, int p11, int p12)
	    {
	        boolean v0 = super.setFrame(p9, p10, p11, p12);
	        int v1_0 = this.getDrawable();
	        android.graphics.drawable.Drawable v2 = this.getBackground();
	        if ((v1_0 != 0) && (v2 != null)) {
	            int v1_1 = this.getWidth();
	            int v3_0 = this.getHeight();
	            int v4_1 = (Math.max(v1_1, v3_0) / 2);
	            int v1_3 = ((v1_1 + (this.getPaddingLeft() - this.getPaddingRight())) / 2);
	            int v3_2 = ((v3_0 + (this.getPaddingTop() - this.getPaddingBottom())) / 2);
	            bo.a(v2, (v1_3 - v4_1), (v3_2 - v4_1), (v1_3 + v4_1), (v3_2 + v4_1));
	        }
	        return v0;
	    }
	
