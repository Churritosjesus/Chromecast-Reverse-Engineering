.class public abstract Lnh;
.super Ljava/lang/Object;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/content/Context;Landroid/view/Window;Lng;)Lnh;
    .locals 2

    .prologue
    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 93
    new-instance v0, Lnm;

    invoke-direct {v0, p0, p1, p2}, Lnm;-><init>(Landroid/content/Context;Landroid/view/Window;Lng;)V

    .line 97
    :goto_0
    return-object v0

    .line 94
    :cond_0
    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 95
    new-instance v0, Lnl;

    invoke-direct {v0, p0, p1, p2}, Lnl;-><init>(Landroid/content/Context;Landroid/view/Window;Lng;)V

    goto :goto_0

    .line 97
    :cond_1
    new-instance v0, Lno;

    invoke-direct {v0, p0, p1, p2}, Lno;-><init>(Landroid/content/Context;Landroid/view/Window;Lng;)V

    goto :goto_0
.end method


# virtual methods
.method public abstract a()Lmj;
.end method

.method public abstract a(I)V
.end method

.method public abstract a(Landroid/content/res/Configuration;)V
.end method

.method public abstract a(Landroid/os/Bundle;)V
.end method

.method public abstract a(Landroid/support/v7/widget/Toolbar;)V
.end method

.method public abstract a(Landroid/view/View;)V
.end method

.method public abstract a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract a(Ljava/lang/CharSequence;)V
.end method

.method public abstract b()Landroid/view/MenuInflater;
.end method

.method public abstract b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract b(I)Z
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public abstract h()Lmo;
.end method

.method public abstract i()V
.end method
