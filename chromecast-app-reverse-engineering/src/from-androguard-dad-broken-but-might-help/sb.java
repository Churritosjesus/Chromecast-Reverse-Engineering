	private final  a
	
	    public sb(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        Exception v0_1 = th.a(p5, p6, oq.aT, p7, 0);
	        this.a = v0_1.a(oq.aV, 0);
	        this.setBackgroundDrawable(v0_1.a(oq.aU));
	        v0_1.a.recycle();
	        if (android.os.Build$VERSION.SDK_INT < 14) {
	            try {
	                reflect.Field v1_6 = android.widget.PopupWindow.getDeclaredField("mAnchor");
	                v1_6.setAccessible(1);
	                reflect.Field v2_2 = android.widget.PopupWindow.getDeclaredField("mOnScrollChangedListener");
	                v2_2.setAccessible(1);
	                v2_2.set(this, new sc(v1_6, this, ((android.view.ViewTreeObserver$OnScrollChangedListener) v2_2.get(this))));
	            } catch (Exception v0) {
	            }
	        }
	        return;
	    }
	
	
	    public final void showAsDropDown(android.view.View p3, int p4, int p5)
	    {
	        if ((android.os.Build$VERSION.SDK_INT < 21) && (this.a)) {
	            p5 -= p3.getHeight();
	        }
	        super.showAsDropDown(p3, p4, p5);
	        return;
	    }
	
	
	    public final void showAsDropDown(android.view.View p3, int p4, int p5, int p6)
	    {
	        if ((android.os.Build$VERSION.SDK_INT < 21) && (this.a)) {
	            p5 -= p3.getHeight();
	        }
	        super.showAsDropDown(p3, p4, p5, p6);
	        return;
	    }
	
	
	    public final void update(android.view.View p7, int p8, int p9, int p10, int p11)
	    {
	        if ((android.os.Build$VERSION.SDK_INT >= 21) || (!this.a)) {
	            int v3 = p9;
	        } else {
	            v3 = (p9 - p7.getHeight());
	        }
	        super.update(p7, p8, v3, p10, p11);
	        return;
	    }
	
