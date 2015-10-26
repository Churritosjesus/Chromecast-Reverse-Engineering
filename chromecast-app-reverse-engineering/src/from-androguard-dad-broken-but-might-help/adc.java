	private static android.graphics.Paint c
	public android.graphics.drawable.Drawable a
	public  b
	
	    static adc()
	    {
	        adc.c = new android.graphics.Paint();
	        return;
	    }
	
	
	    public adc(android.graphics.drawable.Drawable p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public void draw(android.graphics.Canvas p2, CharSequence p3, int p4, int p5, float p6, int p7, int p8, int p9, android.graphics.Paint p10)
	    {
	        p2.save();
	        p2.translate(p6, ((float) (((p9 - this.a.getBounds().bottom) + p7) / 2)));
	        this.a.draw(p2);
	        p2.restore();
	        return;
	    }
	
	
	    public int getSize(android.graphics.Paint p7, CharSequence p8, int p9, int p10, android.graphics.Paint$FontMetricsInt p11)
	    {
	        adc.c.set(p7);
	        if (p11 != null) {
	            adc.c.getFontMetricsInt(p11);
	            int v0_2 = this.i();
	            int v1_1 = (p11.descent - p11.ascent);
	            int v2_3 = (((int) this.b) / 2);
	            p11.ascent = (Math.min(p11.top, (p11.top + ((v1_1 - v0_2.bottom) / 2))) - v2_3);
	            p11.descent = (Math.max(p11.bottom, (((v0_2.bottom - v1_1) / 2) + p11.bottom)) + v2_3);
	            p11.top = p11.ascent;
	            p11.bottom = p11.descent;
	        }
	        return this.i().right;
	    }
	
	
	    protected android.graphics.Rect i()
	    {
	        return this.a.getBounds();
	    }
	
