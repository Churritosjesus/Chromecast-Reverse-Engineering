	private bry a
	
	    public brx(brb p1, bry p2)
	    {
	        this(p1);
	        this.a = p2;
	        return;
	    }
	
	
	    private bb a(android.content.res.XmlResourceParser p5)
	    {
	        try {
	            p5.next();
	            NumberFormatException v0_0 = p5.getEventType();
	        } catch (NumberFormatException v0_16) {
	            this.e("Error parsing tracker configuration file", v0_16);
	            return this.a.a();
	        } catch (NumberFormatException v0_17) {
	            this.e("Error parsing tracker configuration file", v0_17);
	            return this.a.a();
	        }
	        while (v0_0 != 1) {
	            if (p5.getEventType() == 2) {
	                NumberFormatException v0_3 = p5.getName().toLowerCase();
	                if (!v0_3.equals("screenname")) {
	                    if (!v0_3.equals("string")) {
	                        if (!v0_3.equals("bool")) {
	                            if (v0_3.equals("integer")) {
	                                NumberFormatException v0_6 = p5.getAttributeValue(0, "name");
	                                String v1_11 = p5.nextText().trim();
	                                if ((!android.text.TextUtils.isEmpty(v0_6)) && (!android.text.TextUtils.isEmpty(v1_11))) {
	                                    try {
	                                        this.a.a(v0_6, Integer.parseInt(v1_11));
	                                    } catch (NumberFormatException v0_7) {
	                                        this.c("Error parsing int configuration value", v1_11, v0_7);
	                                    }
	                                }
	                            }
	                        } else {
	                            NumberFormatException v0_9 = p5.getAttributeValue(0, "name");
	                            String v1_14 = p5.nextText().trim();
	                            if ((!android.text.TextUtils.isEmpty(v0_9)) && (!android.text.TextUtils.isEmpty(v1_14))) {
	                                try {
	                                    this.a.a(v0_9, Boolean.parseBoolean(v1_14));
	                                } catch (NumberFormatException v0_10) {
	                                    this.c("Error parsing bool configuration value", v1_14, v0_10);
	                                }
	                            }
	                        }
	                    } else {
	                        NumberFormatException v0_12 = p5.getAttributeValue(0, "name");
	                        String v1_17 = p5.nextText().trim();
	                        if ((!android.text.TextUtils.isEmpty(v0_12)) && (v1_17 != null)) {
	                            this.a.a(v0_12, v1_17);
	                        }
	                    }
	                } else {
	                    NumberFormatException v0_14 = p5.getAttributeValue(0, "name");
	                    String v1_20 = p5.nextText().trim();
	                    if (!android.text.TextUtils.isEmpty(v0_14)) {
	                        android.text.TextUtils.isEmpty(v1_20);
	                    }
	                }
	            }
	            v0_0 = p5.next();
	        }
	        return this.a.a();
	    }
	
	
	    public final bb a(int p3)
	    {
	        try {
	            int v0_4 = this.a(this.d.b.getResources().getXml(p3));
	        } catch (int v0_5) {
	            this.d("inflate() called with unknown resourceId", v0_5);
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
