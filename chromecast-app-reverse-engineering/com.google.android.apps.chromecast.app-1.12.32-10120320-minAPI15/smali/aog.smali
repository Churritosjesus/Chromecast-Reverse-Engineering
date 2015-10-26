.class final Laog;
.super Landroid/webkit/WebViewClient;
.source "PG"


# instance fields
.field private synthetic a:Landroid/webkit/WebView;

.field private synthetic b:Land;


# direct methods
.method constructor <init>(Land;Landroid/webkit/WebView;)V
    .locals 0

    .prologue
    .line 1765
    iput-object p1, p0, Laog;->b:Land;

    iput-object p2, p0, Laog;->a:Landroid/webkit/WebView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1768
    iget-object v0, p0, Laog;->b:Land;

    invoke-virtual {v0}, Land;->w()V

    .line 1769
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Laog;->b:Land;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lb;->ci:I

    .line 1770
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Laog;->a:Landroid/webkit/WebView;

    .line 1771
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    const/4 v2, 0x0

    .line 1772
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1773
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1774
    return-void
.end method
