	final android.graphics.RectF a
	
	    public ww()
	    {
	        this.a = new android.graphics.RectF();
	        return;
	    }
	
	
	    private static zv c(wv p1)
	    {
	        return ((zv) p1.getBackground());
	    }
	
	
	    public final float a(wv p6)
	    {
	        float v0_0 = ww.c(p6);
	        return (((((float) v0_0.a) + v0_0.d) * 1073741824) + (Math.max(v0_0.d, ((v0_0.c + ((float) v0_0.a)) + (v0_0.d / 1073741824))) * 1073741824));
	    }
	
	
	    public void a()
	    {
	        zv.b = new wx(this);
	        return;
	    }
	
	
	    public final void a(wv p7, android.content.Context p8, int p9, float p10, float p11, float p12)
	    {
	        int v0_1 = new zv(p8.getResources(), p9, p10, p11, p12);
	        v0_1.e = p7.b();
	        v0_1.invalidateSelf();
	        p7.setBackgroundDrawable(v0_1);
	        int v1_3 = new android.graphics.Rect();
	        ww.c(p7).getPadding(v1_3);
	        ((android.view.View) p7).setMinimumHeight(((int) Math.ceil(((double) this.b(p7)))));
	        ((android.view.View) p7).setMinimumWidth(((int) Math.ceil(((double) this.a(p7)))));
	        p7.a(v1_3.left, v1_3.top, v1_3.right, v1_3.bottom);
	        return;
	    }
	
	
	    public final float b(wv p7)
	    {
	        float v0_0 = ww.c(p7);
	        return (((((float) v0_0.a) + (v0_0.d * 1069547520)) * 1073741824) + (Math.max(v0_0.d, ((v0_0.c + ((float) v0_0.a)) + ((v0_0.d * 1069547520) / 1073741824))) * 1073741824));
	    }
	
