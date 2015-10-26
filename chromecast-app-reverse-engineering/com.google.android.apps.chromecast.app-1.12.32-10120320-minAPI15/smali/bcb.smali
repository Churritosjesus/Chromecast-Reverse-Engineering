.class final Lbcb;
.super Landroid/webkit/WebViewClient;
.source "PG"


# instance fields
.field private synthetic a:Lbbx;


# direct methods
.method constructor <init>(Lbbx;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lbcb;->a:Lbbx;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 164
    iget-object v0, p0, Lbcb;->a:Lbbx;

    invoke-static {v0}, Lbbx;->d(Lbbx;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbcb;->a:Lbbx;

    .line 165
    invoke-static {v0}, Lbbx;->d(Lbbx;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lbcb;->a:Lbbx;

    invoke-static {v0}, Lbbx;->e(Lbbx;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 167
    iget-object v0, p0, Lbcb;->a:Lbbx;

    invoke-static {v0}, Lbbx;->e(Lbbx;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Lbcb;->a:Lbbx;

    invoke-static {v0, p2}, Lbbx;->a(Lbbx;Ljava/lang/String;)V

    .line 169
    const/4 v0, 0x1

    .line 172
    :goto_0
    return v0

    .line 171
    :cond_0
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 172
    const/4 v0, 0x0

    goto :goto_0
.end method
