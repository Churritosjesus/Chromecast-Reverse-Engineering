	
	    public ApplicationSettingsActivityV11()
	    {
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p4)
	    {
	        super.onCreate(p4);
	        blx.g(this);
	        this.setContentView(a.fs);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        this.d().a().b(1);
	        this.getFragmentManager().beginTransaction().replace(f.bk, new bgm()).commit();
	        return;
	    }
	
	
	    public boolean onKeyDown(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2)) {
	            v0_1 = super.onKeyDown(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2, this)) {
	            v0_1 = super.onKeyUp(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p2)
	    {
	        int v0_1;
	        switch (p2.getItemId()) {
	            case 16908332:
	                this.finish();
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onOptionsItemSelected(p2);
	        }
	        return v0_1;
	    }
	
