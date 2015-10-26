.class public Lcom/google/android/apps/chromecast/app/settings/OpenSourceLicenseActivity;
.super Lbgn;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lbgn;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 12
    invoke-super {p0, p1}, Lbgn;->onCreate(Landroid/os/Bundle;)V

    .line 13
    const-string v1, "file:///android_asset/html/licenses.html"

    .line 1041
    sget v0, Lf;->ai:I

    invoke-virtual {p0, v0}, Lbgn;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 1042
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 14
    return-void
.end method
