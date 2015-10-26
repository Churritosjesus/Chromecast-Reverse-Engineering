.class public final Lbok;
.super Lj;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method public static b(I)Lbok;
    .locals 3

    .prologue
    .line 18
    new-instance v0, Lbok;

    invoke-direct {v0}, Lbok;-><init>()V

    .line 19
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 20
    const-string v2, "layoutResId"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 21
    invoke-virtual {v0, v1}, Lbok;->f(Landroid/os/Bundle;)V

    .line 22
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 28
    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 28
    const-string v1, "layoutResId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
