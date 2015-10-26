.class public final Lbbx;
.super Lj;
.source "PG"


# instance fields
.field private Z:Ljava/lang/String;

.field private final a:Lblp;

.field private aa:Ljava/lang/String;

.field private ab:Ljava/lang/String;

.field private ac:Landroid/webkit/WebView;

.field private ad:Lbca;

.field private b:Lr;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 32
    invoke-direct {p0}, Lj;-><init>()V

    .line 33
    new-instance v0, Lblp;

    const-string v1, "OAuthFragment"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbbx;->a:Lblp;

    .line 161
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbbx;
    .locals 3

    .prologue
    .line 61
    new-instance v0, Lbbx;

    invoke-direct {v0}, Lbbx;-><init>()V

    .line 62
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 63
    const-string v2, "appDeviceId"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v2, "oauthUrl"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v2, "webviewInterceptKeyword"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v2, "backdropDisplayId"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-virtual {v0, v1}, Lbbx;->f(Landroid/os/Bundle;)V

    .line 68
    return-object v0
.end method

.method static synthetic a(Lbbx;)Lbca;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lbbx;->ad:Lbca;

    return-object v0
.end method

.method static synthetic a(Lbbx;Ljava/lang/String;)V
    .locals 8

    .prologue
    .line 32
    .line 7134
    new-instance v0, Lbbw;

    iget-object v1, p0, Lbbx;->d:Ljava/lang/String;

    iget-object v2, p0, Lbbx;->c:Ljava/lang/String;

    iget-object v3, p0, Lbbx;->Z:Ljava/lang/String;

    iget-object v5, p0, Lbbx;->ab:Ljava/lang/String;

    new-instance v6, Lbby;

    invoke-direct {v6, p0}, Lbby;-><init>(Lbbx;)V

    new-instance v7, Lbbz;

    invoke-direct {v7, p0}, Lbbz;-><init>(Lbbx;)V

    move-object v4, p1

    invoke-direct/range {v0 .. v7}, Lbbw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laea;Ladz;)V

    .line 7612
    iget-object v1, p0, Lj;->y:Lm;

    .line 7158
    invoke-static {v1}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v1

    invoke-virtual {v1, v0}, Latf;->a(Lads;)V

    .line 32
    return-void
.end method

.method static synthetic b(Lbbx;)Lr;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lbbx;->b:Lr;

    return-object v0
.end method

.method static synthetic c(Lbbx;)Lblp;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lbbx;->a:Lblp;

    return-object v0
.end method

.method static synthetic d(Lbbx;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lbbx;->aa:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lbbx;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 94
    sget v0, La;->go:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 95
    sget v0, Lf;->cu:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    .line 96
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 97
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    new-instance v2, Lbcb;

    .line 6161
    invoke-direct {v2, p0}, Lbcb;-><init>(Lbbx;)V

    .line 97
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 99
    if-eqz p3, :cond_0

    .line 100
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    invoke-virtual {v0, p3}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 105
    :goto_0
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 106
    return-object v1

    .line 102
    :cond_0
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    iget-object v2, p0, Lbbx;->Z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 119
    invoke-super {p0}, Lj;->a()V

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lbbx;->ad:Lbca;

    .line 121
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 73
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 74
    check-cast p1, Lbca;

    iput-object p1, p0, Lbbx;->ad:Lbca;

    .line 1125
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    .line 1126
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 1127
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    :goto_0
    return-void

    .line 1129
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeAllCookie()V

    goto :goto_0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 80
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 82
    invoke-static {v0}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbbx;->d:Ljava/lang/String;

    .line 1669
    iget-object v0, p0, Lj;->x:Lt;

    .line 83
    iput-object v0, p0, Lbbx;->b:Lr;

    .line 2559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 84
    const-string v1, "oauthUrl"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbbx;->Z:Ljava/lang/String;

    .line 3559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 85
    const-string v1, "webviewInterceptKeyword"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbbx;->aa:Ljava/lang/String;

    .line 4559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 86
    const-string v1, "appDeviceId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbbx;->c:Ljava/lang/String;

    .line 5559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 87
    const-string v1, "backdropDisplayId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbbx;->ab:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 111
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 112
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lbbx;->ac:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 115
    :cond_0
    return-void
.end method
