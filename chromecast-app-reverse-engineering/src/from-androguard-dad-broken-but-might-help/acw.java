	private synthetic acb a
	
	    acw(acb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void afterTextChanged(android.text.Editable p6)
	    {
	        acb v1_0 = 0;
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            if (!acb.p(this.a)) {
	                if (acb.d(this.a) != null) {
	                    if (this.a.a(acb.d(this.a))) {
	                        return;
	                    } else {
	                        this.a.setCursorVisible(1);
	                        this.a.setSelection(this.a.getText().length());
	                        this.a.d();
	                    }
	                }
	                if (p6.length() > 1) {
	                    if (!this.a.a(p6)) {
	                        acb v0_17;
	                        if (this.a.getSelectionEnd() != 0) {
	                            v0_17 = (this.a.getSelectionEnd() - 1);
	                        } else {
	                            v0_17 = 0;
	                        }
	                        acb v0_18;
	                        acb v1_3 = (this.a.length() - 1);
	                        if (v0_17 == v1_3) {
	                            v0_18 = p6.charAt(v1_3);
	                        } else {
	                            v0_18 = p6.charAt(v0_17);
	                        }
	                        if ((v0_18 == 32) && (!this.a.f())) {
	                            acb v0_23 = this.a.getText().toString();
	                            acb v1_7 = acb.r(this.a).findTokenStart(v0_23, this.a.getSelectionEnd());
	                            if (acb.b(this.a, v0_23.substring(v1_7, acb.r(this.a).findTokenEnd(v0_23, v1_7)))) {
	                                acb.q(this.a);
	                            }
	                        }
	                    } else {
	                        acb.q(this.a);
	                    }
	                }
	            }
	        } else {
	            int v2_10 = this.a.getText();
	            acb v0_33 = ((ada[]) v2_10.getSpans(0, this.a.getText().length(), ada));
	            int v3_2 = v0_33.length;
	            while (v1_0 < v3_2) {
	                v2_10.removeSpan(v0_33[v1_0]);
	                v1_0++;
	            }
	            if (acb.o(this.a) != null) {
	                v2_10.removeSpan(acb.o(this.a));
	            }
	            this.a.d();
	        }
	        return;
	    }
	
	
	    public final void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
	    {
	        return;
	    }
	
	
	    public final void onTextChanged(CharSequence p6, int p7, int p8, int p9)
	    {
	        if ((p8 - p9) != 1) {
	            if ((p9 > p8) && ((acb.d(this.a) != null) && ((this.a.a(acb.d(this.a))) && (this.a.a(p6))))) {
	                acb.q(this.a);
	            }
	        } else {
	            acb v0_11 = ((ada[]) this.a.getText().getSpans(this.a.getSelectionStart(), this.a.getSelectionStart(), ada));
	            if (v0_11.length > 0) {
	                ada v1_7 = v0_11[0];
	                android.text.Editable v2_1 = this.a.getText();
	                int v3 = v2_1.getSpanStart(v1_7);
	                acb v0_14 = (v2_1.getSpanEnd(v1_7) + 1);
	                if (v0_14 > v2_1.length()) {
	                    v0_14 = v2_1.length();
	                }
	                v2_1.removeSpan(v1_7);
	                v2_1.delete(v3, v0_14);
	            }
	        }
	        return;
	    }
	
