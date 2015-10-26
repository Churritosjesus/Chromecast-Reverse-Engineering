	  a
	public ed b
	public ed c
	public ed d
	public final java.util.List e
	public  f
	public  g
	public  h
	public  i
	public  j
	public  k
	public  l
	
	    public zp()
	    {
	        this.a = -1;
	        this.b = new ed();
	        this.c = new ed();
	        this.d = new ed();
	        this.e = new java.util.ArrayList();
	        this.f = 0;
	        this.g = 0;
	        this.h = 0;
	        this.i = 0;
	        this.j = 0;
	        this.k = 0;
	        this.l = 0;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0_1;
	        if (!this.j) {
	            v0_1 = this.f;
	        } else {
	            v0_1 = (this.g - this.h);
	        }
	        return v0_1;
	    }
	
	
	    final void a(android.view.View p2)
	    {
	        this.e.remove(p2);
	        return;
	    }
	
	
	    final void a(zr p4)
	    {
	        this.b.remove(p4);
	        this.c.remove(p4);
	        if (this.d != null) {
	            android.view.View v1_0 = this.d;
	            int v0_4 = (v1_0.size() - 1);
	            while (v0_4 >= 0) {
	                if (p4 != v1_0.c(v0_4)) {
	                    v0_4--;
	                } else {
	                    v1_0.d(v0_4);
	                    break;
	                }
	            }
	        }
	        this.e.remove(p4.a);
	        return;
	    }
	
	
	    final void b(android.view.View p2)
	    {
	        if (!this.e.contains(p2)) {
	            this.e.add(p2);
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("State{mTargetPosition=").append(this.a).append(", mPreLayoutHolderMap=").append(this.b).append(", mPostLayoutHolderMap=").append(this.c).append(", mData=").append(0).append(", mItemCount=").append(this.f).append(", mPreviousLayoutItemCount=").append(this.g).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(this.h).append(", mStructureChanged=").append(this.i).append(", mInPreLayout=").append(this.j).append(", mRunSimpleAnimations=").append(this.k).append(", mRunPredictiveAnimations=").append(this.l).append(125).toString();
	    }
	
