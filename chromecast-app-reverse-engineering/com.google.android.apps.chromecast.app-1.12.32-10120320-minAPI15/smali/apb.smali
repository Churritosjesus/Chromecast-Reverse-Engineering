.class final Lapb;
.super Landroid/webkit/WebChromeClient;
.source "PG"


# instance fields
.field private synthetic a:Lapa;


# direct methods
.method constructor <init>(Lapa;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lapb;->a:Lapa;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final getVideoLoadingProgressView()Landroid/view/View;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 61
    iget-object v0, p0, Lapb;->a:Lapa;

    invoke-virtual {v0, v2}, Lapa;->b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gB:I

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 62
    sget v1, Lf;->dd:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    return-object v0
.end method

.method public final onHideCustomView()V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lapb;->a:Lapa;

    invoke-static {v0}, Lapa;->a(Lapa;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lapb;->a:Lapa;

    invoke-static {v0}, Lapa;->d(Lapa;)V

    .line 85
    :cond_0
    return-void
.end method

.method public final onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lapb;->a:Lapa;

    .line 2065
    iget-object v0, v0, Lj;->N:Landroid/view/View;

    .line 68
    check-cast v0, Landroid/view/ViewGroup;

    .line 69
    iget-object v1, p0, Lapb;->a:Lapa;

    invoke-static {v1}, Lapa;->a(Lapa;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 70
    iget-object v1, p0, Lapb;->a:Lapa;

    invoke-static {v1}, Lapa;->a(Lapa;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 71
    iget-object v1, p0, Lapb;->a:Lapa;

    invoke-static {v1}, Lapa;->b(Lapa;)Landroid/webkit/WebChromeClient$CustomViewCallback;

    move-result-object v1

    invoke-interface {v1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 73
    :cond_0
    iget-object v1, p0, Lapb;->a:Lapa;

    invoke-static {v1}, Lapa;->c(Lapa;)Landroid/webkit/WebView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 74
    iget-object v1, p0, Lapb;->a:Lapa;

    invoke-static {v1, p1}, Lapa;->a(Lapa;Landroid/view/View;)Landroid/view/View;

    .line 75
    iget-object v1, p0, Lapb;->a:Lapa;

    invoke-static {v1, p2}, Lapa;->a(Lapa;Landroid/webkit/WebChromeClient$CustomViewCallback;)Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 76
    iget-object v1, p0, Lapb;->a:Lapa;

    invoke-static {v1}, Lapa;->a(Lapa;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    iget-object v0, p0, Lapb;->a:Lapa;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    .line 77
    check-cast v0, Lapc;

    invoke-interface {v0}, Lapc;->c_()V

    .line 78
    return-void
.end method
