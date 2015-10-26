	private static final I a
	private te b
	private tf c
	
	    static ws()
	    {
	        int[] v0_1 = new int[2];
	        v0_1 = {16842964, 16843126};
	        ws.a = v0_1;
	        return;
	    }
	
	
	    public ws(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.P);
	        return;
	    }
	
	
	    private ws(android.content.Context p6, android.util.AttributeSet p7, int p8)
	    {
	        this(p6, p7, p8);
	        if (tf.a) {
	            th v1_1 = th.a(this.getContext(), p7, ws.a, p8, 0);
	            if (v1_1.d(0)) {
	                android.widget.ListPopupWindow v0_4 = v1_1.a().a(v1_1.e(0, -1));
	                if (v0_4 != null) {
	                    this.a(v0_4);
	                }
	            }
	            if (v1_1.d(1)) {
	                android.graphics.drawable.Drawable v2_2 = v1_1.a(1);
	                if (android.os.Build$VERSION.SDK_INT < 16) {
	                    if (android.os.Build$VERSION.SDK_INT >= 11) {
	                        try {
	                            android.widget.ListPopupWindow v0_9 = android.widget.Spinner.getDeclaredField("mPopup");
	                            v0_9.setAccessible(1);
	                            android.widget.ListPopupWindow v0_10 = v0_9.get(this);
	                        } catch (android.widget.ListPopupWindow v0_11) {
	                            v0_11.printStackTrace();
	                        } catch (android.widget.ListPopupWindow v0_12) {
	                            v0_12.printStackTrace();
	                        }
	                        if ((v0_10 instanceof android.widget.ListPopupWindow)) {
	                            ((android.widget.ListPopupWindow) v0_10).setBackgroundDrawable(v2_2);
	                        }
	                    }
	                } else {
	                    this.setPopupBackgroundDrawable(v2_2);
	                }
	            }
	            this.c = v1_1.a();
	            v1_1.a.recycle();
	        }
	        return;
	    }
	
	
	    private void a()
	    {
	        if ((this.getBackground() != null) && (this.b != null)) {
	            tf.a(this, this.b);
	        }
	        return;
	    }
	
	
	    private void a(android.content.res.ColorStateList p3)
	    {
	        if (p3 == null) {
	            this.b = 0;
	        } else {
	            if (this.b == null) {
	                this.b = new te();
	            }
	            this.b.a = p3;
	            this.b.b = 1;
	        }
	        this.a();
	        return;
	    }
	
	
	    protected final void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        this.a();
	        return;
	    }
	
	
	    public final void setBackgroundDrawable(android.graphics.drawable.Drawable p2)
	    {
	        super.setBackgroundDrawable(p2);
	        this.a(0);
	        return;
	    }
	
	
	    public final void setBackgroundResource(int p2)
	    {
	        int v0_1;
	        super.setBackgroundResource(p2);
	        if (this.c == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.c.a(p2);
	        }
	        this.a(v0_1);
	        return;
	    }
	
