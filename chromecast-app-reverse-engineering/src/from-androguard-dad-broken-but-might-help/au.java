	
	    au()
	    {
	        return;
	    }
	
	
	    public static android.graphics.drawable.Drawable a(android.content.Context p2, int p3)
	    {
	        android.graphics.drawable.Drawable v0_2;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            v0_2 = p2.getResources().getDrawable(p3);
	        } else {
	            v0_2 = p2.getDrawable(p3);
	        }
	        return v0_2;
	    }
	
	
	    public android.content.Intent a(android.app.Activity p6)
	    {
	        android.content.Intent v0 = 0;
	        String v1_0 = at.b(p6);
	        if (v1_0 != null) {
	            String v2_1 = new android.content.ComponentName(p6, v1_0);
	            try {
	                if (at.b(p6, v2_1) != null) {
	                    v0 = new android.content.Intent().setComponent(v2_1);
	                } else {
	                    v0 = be.a(v2_1);
	                }
	            } catch (String v2) {
	                android.util.Log.e("NavUtils", new StringBuilder("getParentActivityIntent: bad parentActivityName \'").append(v1_0).append("\' in manifest").toString());
	            }
	        }
	        return v0;
	    }
	
	
	    public String a(android.content.Context p4, android.content.pm.ActivityInfo p5)
	    {
	        String v0_2;
	        if (p5.metaData != null) {
	            v0_2 = p5.metaData.getString("android.support.PARENT_ACTIVITY");
	            if (v0_2 != null) {
	                if (v0_2.charAt(0) == 46) {
	                    v0_2 = new StringBuilder().append(p4.getPackageName()).append(v0_2).toString();
	                }
	            } else {
	                v0_2 = 0;
	            }
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public boolean a(android.app.Activity p3, android.content.Intent p4)
	    {
	        int v0_3;
	        int v0_1 = p3.getIntent().getAction();
	        if ((v0_1 == 0) || (v0_1.equals("android.intent.action.MAIN"))) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public void b(android.app.Activity p2, android.content.Intent p3)
	    {
	        p3.addFlags(67108864);
	        p2.startActivity(p3);
	        p2.finish();
	        return;
	    }
	
