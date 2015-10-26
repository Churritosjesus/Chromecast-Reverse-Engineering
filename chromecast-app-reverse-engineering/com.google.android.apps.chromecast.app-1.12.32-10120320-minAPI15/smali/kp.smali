.class public final Lkp;
.super Ler;
.source "PG"


# direct methods
.method public constructor <init>(Landroid/support/v4/widget/DrawerLayout;)V
    .locals 0

    .prologue
    .line 1944
    invoke-direct {p0}, Ler;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljd;)V
    .locals 1

    .prologue
    .line 1948
    invoke-super {p0, p1, p2}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 1950
    invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->i(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1954
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljd;->a(Landroid/view/View;)V

    .line 1956
    :cond_0
    return-void
.end method
