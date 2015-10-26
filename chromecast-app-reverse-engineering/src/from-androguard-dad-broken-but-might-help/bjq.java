	public  c
	
	    public bjq()
	    {
	        this.c = -1;
	        return;
	    }
	
	
	    public final void a(android.view.View p2, android.os.Bundle p3)
	    {
	        super.a(p2, p3);
	        if (p3 != null) {
	            this.b(p3.getInt("currentPercent"));
	        }
	        return;
	    }
	
	
	    public void b(int p7)
	    {
	        this.c = p7;
	        android.widget.TextView v0 = this.p();
	        if ((v0 != null) && (p7 != -1)) {
	            String v1_1 = this.e();
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = Integer.valueOf(this.c);
	            v0.setText(v1_1.getString(b.cG, v3_1));
	        }
	        return;
	    }
	
	
	    public void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putInt("currentPercent", this.c);
	        return;
	    }
	
