	
	    public bbj()
	    {
	        return;
	    }
	
	
	    public static bbj a(String p3, String p4, String p5)
	    {
	        bbj v0_1 = new bbj();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("message", p3);
	        v1_1.putString("pattern", p4);
	        v1_1.putString("link", p5);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p8)
	    {
	        android.app.AlertDialog v0_1 = new android.app.AlertDialog$Builder(this.y);
	        int v1_1 = this.y;
	        int v2_1 = this.m.getString("message");
	        String[] v3_2 = new String[2];
	        v3_2[0] = this.m.getString("pattern");
	        v3_2[1] = this.m.getString("link");
	        return v0_1.setView(blx.a(v1_1, v2_1, v3_2)).setPositiveButton(b.I, 0).create();
	    }
	
