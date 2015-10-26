	private java.lang.String a
	
	    public abf()
	    {
	        return;
	    }
	
	
	    public static abf a(String p3)
	    {
	        abf v0_1 = new abf();
	        android.os.Bundle v1_1 = new android.os.Bundle(1);
	        v1_1.putString("text", p3);
	        v0_1.setArguments(v1_1);
	        return v0_1;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p4, int p5)
	    {
	        if (p5 == -1) {
	            ((android.content.ClipboardManager) this.getActivity().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText(0, this.a));
	        }
	        return;
	    }
	
	
	    public final android.app.Dialog onCreateDialog(android.os.Bundle p4)
	    {
	        this.a = this.getArguments().getString("text");
	        return new android.app.AlertDialog$Builder(this.getActivity()).setMessage(this.a).setPositiveButton(a.cT, this).setNegativeButton(a.cS, 0).create();
	    }
	
