	public android.view.LayoutInflater a
	private  b
	private  c
	private java.lang.ref.WeakReference d
	
	    public ViewStubCompat(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public ViewStubCompat(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        this.b = 0;
	        int v0_1 = p5.obtainStyledAttributes(p6, oq.cz, p7, 0);
	        this.c = v0_1.getResourceId(oq.cB, -1);
	        this.b = v0_1.getResourceId(oq.cC, 0);
	        this.setId(v0_1.getResourceId(oq.cA, -1));
	        v0_1.recycle();
	        this.setVisibility(8);
	        this.setWillNotDraw(1);
	        return;
	    }
	
	
	    public final android.view.View a()
	    {
	        ref.WeakReference v0_0 = this.getParent();
	        if ((v0_0 == null) || (!(v0_0 instanceof android.view.ViewGroup))) {
	            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
	        } else {
	            if (this.b == 0) {
	                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
	            } else {
	                android.view.View v1_6;
	                ref.WeakReference v0_5 = ((android.view.ViewGroup) v0_0);
	                if (this.a == null) {
	                    v1_6 = android.view.LayoutInflater.from(this.getContext());
	                } else {
	                    v1_6 = this.a;
	                }
	                android.view.View v1_7 = v1_6.inflate(this.b, v0_5, 0);
	                if (this.c != -1) {
	                    v1_7.setId(this.c);
	                }
	                int v2_3 = v0_5.indexOfChild(this);
	                v0_5.removeViewInLayout(this);
	                android.view.ViewGroup$LayoutParams v3_2 = this.getLayoutParams();
	                if (v3_2 == null) {
	                    v0_5.addView(v1_7, v2_3);
	                } else {
	                    v0_5.addView(v1_7, v2_3, v3_2);
	                }
	                this.d = new ref.WeakReference(v1_7);
	                return v1_7;
	            }
	        }
	    }
	
	
	    protected final void dispatchDraw(android.graphics.Canvas p1)
	    {
	        return;
	    }
	
	
	    public final void draw(android.graphics.Canvas p1)
	    {
	        return;
	    }
	
	
	    protected final void onMeasure(int p2, int p3)
	    {
	        this.setMeasuredDimension(0, 0);
	        return;
	    }
	
	
	    public final void setVisibility(int p3)
	    {
	        if (this.d == null) {
	            super.setVisibility(p3);
	            if ((p3 == 0) || (p3 == 4)) {
	                this.a();
	            }
	        } else {
	            int v0_4 = ((android.view.View) this.d.get());
	            if (v0_4 == 0) {
	                throw new IllegalStateException("setVisibility called on un-referenced view");
	            } else {
	                v0_4.setVisibility(p3);
	            }
	        }
	        return;
	    }
	
