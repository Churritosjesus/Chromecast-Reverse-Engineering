	
	    public wu()
	    {
	        return;
	    }
	
	
	    private static float c(wv p1)
	    {
	        return ((zu) p1.getBackground()).a;
	    }
	
	
	    public final float a(wv p3)
	    {
	        return (wu.c(p3) * 1073741824);
	    }
	
	
	    public final void a()
	    {
	        return;
	    }
	
	
	    public final void a(wv p6, android.content.Context p7, int p8, float p9, float p10, float p11)
	    {
	        p6.setBackgroundDrawable(new zu(p8, p9));
	        ((android.view.View) p6).setClipToOutline(1);
	        ((android.view.View) p6).setElevation(p10);
	        int v0_5 = ((zu) p6.getBackground());
	        float v1_1 = p6.a();
	        int v2_0 = p6.b();
	        if ((p11 != v0_5.b) || ((v0_5.c != v1_1) || (v0_5.d != v2_0))) {
	            v0_5.b = p11;
	            v0_5.c = v1_1;
	            v0_5.d = v2_0;
	            v0_5.a(0);
	            v0_5.invalidateSelf();
	        }
	        if (p6.a()) {
	            int v0_9 = ((zu) p6.getBackground()).b;
	            float v1_3 = wu.c(p6);
	            p6.a(((int) Math.ceil(((double) zv.b(v0_9, v1_3, p6.b())))), ((int) Math.ceil(((double) zv.a(v0_9, v1_3, p6.b())))), ((int) Math.ceil(((double) zv.b(v0_9, v1_3, p6.b())))), ((int) Math.ceil(((double) zv.a(v0_9, v1_3, p6.b())))));
	        } else {
	            p6.a(0, 0, 0, 0);
	        }
	        return;
	    }
	
	
	    public final float b(wv p3)
	    {
	        return (wu.c(p3) * 1073741824);
	    }
	
