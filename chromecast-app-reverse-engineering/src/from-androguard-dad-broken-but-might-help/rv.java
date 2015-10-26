	public rl a
	  b
	public final synthetic android.support.v7.internal.widget.ActivityChooserView c
	private  d
	private  e
	private  f
	
	    public rv(android.support.v7.internal.widget.ActivityChooserView p2)
	    {
	        this.c = p2;
	        this.d = 4;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0 = 0;
	        int v4 = this.d;
	        this.d = 2147483647;
	        int v5 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	        int v6 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	        int v7 = this.getCount();
	        android.view.View v1_1 = 0;
	        int v3 = 0;
	        while (v0 < v7) {
	            v1_1 = this.getView(v0, v1_1, 0);
	            v1_1.measure(v5, v6);
	            v3 = Math.max(v3, v1_1.getMeasuredWidth());
	            v0++;
	        }
	        this.d = v4;
	        return v3;
	    }
	
	
	    public final void a(int p2)
	    {
	        if (this.d != p2) {
	            this.d = p2;
	            this.notifyDataSetChanged();
	        }
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        if (this.f != p2) {
	            this.f = p2;
	            this.notifyDataSetChanged();
	        }
	        return;
	    }
	
	
	    public final void a(boolean p2, boolean p3)
	    {
	        if ((this.b != p2) || (this.e != p3)) {
	            this.b = p2;
	            this.e = p3;
	            this.notifyDataSetChanged();
	        }
	        return;
	    }
	
	
	    public final int getCount()
	    {
	        int v0_1 = this.a.a();
	        if ((!this.b) && (this.a.b() != null)) {
	            v0_1--;
	        }
	        int v0_2 = Math.min(v0_1, this.d);
	        if (this.f) {
	            v0_2++;
	        }
	        return v0_2;
	    }
	
	
	    public final Object getItem(int p2)
	    {
	        android.content.pm.ResolveInfo v0_1;
	        switch (this.getItemViewType(p2)) {
	            case 0:
	                if ((!this.b) && (this.a.b() != null)) {
	                    p2++;
	                }
	                v0_1 = this.a.a(p2);
	                break;
	            case 1:
	                v0_1 = 0;
	                break;
	            default:
	                throw new IllegalArgumentException();
	        }
	        return v0_1;
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        return ((long) p3);
	    }
	
	
	    public final int getItemViewType(int p2)
	    {
	        if ((!this.f) || (p2 != (this.getCount() - 1))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final android.view.View getView(int p7, android.view.View p8, android.view.ViewGroup p9)
	    {
	        switch (this.getItemViewType(p7)) {
	            case 0:
	                if ((p8 == null) || (p8.getId() != a.bj)) {
	                    p8 = android.view.LayoutInflater.from(this.c.getContext()).inflate(a.bG, p9, 0);
	                }
	                android.content.pm.PackageManager v2_1 = this.c.getContext().getPackageManager();
	                CharSequence v1_7 = ((android.content.pm.ResolveInfo) this.getItem(p7));
	                ((android.widget.ImageView) p8.findViewById(a.bh)).setImageDrawable(v1_7.loadIcon(v2_1));
	                ((android.widget.TextView) p8.findViewById(a.bx)).setText(v1_7.loadLabel(v2_1));
	                if ((!this.b) || ((p7 != 0) || (!this.e))) {
	                    gt.b(p8, 0);
	                } else {
	                    gt.b(p8, 1);
	                }
	                break;
	            case 1:
	                if ((p8 != null) && (p8.getId() == 1)) {
	                } else {
	                    p8 = android.view.LayoutInflater.from(this.c.getContext()).inflate(a.bG, p9, 0);
	                    p8.setId(1);
	                    ((android.widget.TextView) p8.findViewById(a.bx)).setText(this.c.getContext().getString(a.bU));
	                }
	                break;
	            default:
	                throw new IllegalArgumentException();
	        }
	        return p8;
	    }
	
	
	    public final int getViewTypeCount()
	    {
	        return 3;
	    }
	
