.class public final Lapa;
.super Lj;
.source "PG"


# instance fields
.field private a:Landroid/webkit/WebView;

.field private b:Landroid/view/View;

.field private c:Landroid/webkit/WebChromeClient$CustomViewCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lj;-><init>()V

    .line 163
    return-void
.end method

.method static synthetic a(Lapa;)Landroid/view/View;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lapa;->b:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lapa;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lapa;->b:Landroid/view/View;

    return-object p1
.end method

.method static synthetic a(Lapa;Landroid/webkit/WebChromeClient$CustomViewCallback;)Landroid/webkit/WebChromeClient$CustomViewCallback;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lapa;->c:Landroid/webkit/WebChromeClient$CustomViewCallback;

    return-object p1
.end method

.method public static a(Ljava/lang/String;)Lapa;
    .locals 3

    .prologue
    .line 39
    new-instance v0, Lapa;

    invoke-direct {v0}, Lapa;-><init>()V

    .line 40
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 41
    const-string v2, "url"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-virtual {v0, v1}, Lapa;->f(Landroid/os/Bundle;)V

    .line 43
    return-object v0
.end method

.method static synthetic b(Lapa;)Landroid/webkit/WebChromeClient$CustomViewCallback;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lapa;->c:Landroid/webkit/WebChromeClient$CustomViewCallback;

    return-object v0
.end method

.method static synthetic c(Lapa;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic d(Lapa;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lapa;->r()V

    return-void
.end method

.method private r()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 99
    .line 3065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 99
    check-cast v0, Landroid/view/ViewGroup;

    .line 100
    iget-object v1, p0, Lapa;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 101
    iput-object v2, p0, Lapa;->b:Landroid/view/View;

    .line 102
    iget-object v0, p0, Lapa;->c:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 103
    iput-object v2, p0, Lapa;->c:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 104
    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 3612
    iget-object v0, p0, Lj;->y:Lm;

    .line 105
    check-cast v0, Lapc;

    invoke-interface {v0}, Lapc;->f()V

    .line 106
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    .line 56
    new-instance v0, Landroid/webkit/WebView;

    .line 1612
    iget-object v1, p0, Lj;->y:Lm;

    .line 56
    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    .line 57
    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    new-instance v1, Lapb;

    invoke-direct {v1, p0}, Lapb;-><init>(Lapa;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 87
    if-nez p3, :cond_0

    .line 2559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 88
    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 89
    :goto_0
    iget-object v1, p0, Lapa;->a:Landroid/webkit/WebView;

    new-instance v2, Landroid/webkit/WebViewClient;

    invoke-direct {v2}, Landroid/webkit/WebViewClient;-><init>()V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 90
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 91
    const-string v2, "Accept-language"

    invoke-static {}, Lblj;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    iget-object v2, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 93
    iget-object v2, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v2, v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 95
    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    return-object v0

    .line 88
    :cond_0
    const-string v0, "url"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 48
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 49
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lapa;->d(Z)V

    .line 50
    return-void
.end method

.method public final a(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    .line 110
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lf;->bP:I

    if-ne v0, v1, :cond_0

    .line 4119
    sget v0, Lb;->M:I

    invoke-virtual {p0, v0}, Lapa;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4612
    iget-object v0, p0, Lj;->y:Lm;

    .line 4121
    const-string v2, "print"

    invoke-virtual {v0, v2}, Lm;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/print/PrintManager;

    .line 4122
    iget-object v2, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->createPrintDocumentAdapter()Landroid/print/PrintDocumentAdapter;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;

    .line 112
    const/4 v0, 0x1

    .line 114
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lj;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 143
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 144
    const-string v0, "url"

    iget-object v1, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 127
    invoke-super {p0}, Lj;->j()V

    .line 128
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 129
    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    .line 131
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    .line 135
    invoke-super {p0}, Lj;->k()V

    .line 136
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 137
    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    .line 139
    :cond_0
    return-void
.end method

.method public final p()Z
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lapa;->b:Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lapa;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 153
    invoke-direct {p0}, Lapa;->r()V

    .line 157
    :goto_0
    return-void

    .line 156
    :cond_0
    iget-object v0, p0, Lapa;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0
.end method
