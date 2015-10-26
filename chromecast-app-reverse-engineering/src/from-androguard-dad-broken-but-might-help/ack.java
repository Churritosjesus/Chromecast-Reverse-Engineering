	private synthetic acb a
	
	    ack(acb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(java.util.List p9)
	    {
	        int v1;
	        if (p9 != null) {
	            v1 = p9.size();
	        } else {
	            v1 = 0;
	        }
	        if ((p9 != null) && (p9.size() > 0)) {
	            android.widget.ScrollView v2_1 = this.a;
	            if ((v2_1.c != null) && (v2_1.b)) {
	                v2_1.getLocationInWindow(v2_1.a);
	                int v3_3 = v2_1.getHeight();
	                int v4_2 = (v2_1.a[1] + v3_3);
	                v2_1.c.getLocationInWindow(v2_1.a);
	                int v3_5 = ((v3_3 / v2_1.getLineCount()) + v2_1.a[1]);
	                if (v4_2 > v3_5) {
	                    v2_1.c.scrollBy(0, (v4_2 - v3_5));
	                }
	            }
	            if (acb.f(this.a) == 0) {
	                acb.a(this.a, this.a.getResources().getString(a.cQ));
	            }
	        }
	        if ((p9 == null) || ((p9.size() != 1) || (((acx) p9.get(0)).a != 1))) {
	            acb.h(this.a).getLocationInWindow(acb.g(this.a));
	            this.a.getWindowVisibleDisplayFrame(acb.i(this.a));
	            this.a.setDropDownHeight((((acb.i(this.a).bottom - acb.g(this.a)[1]) - acb.h(this.a).getHeight()) - this.a.getDropDownVerticalOffset()));
	        }
	        acb.a(this.a, v1);
	        return;
	    }
	
