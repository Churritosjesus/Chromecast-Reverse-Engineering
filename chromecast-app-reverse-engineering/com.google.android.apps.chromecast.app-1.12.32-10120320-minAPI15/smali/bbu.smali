.class public final Lbbu;
.super Loo;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Loo;-><init>()V

    .line 20
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/os/Bundle;)Loi;
    .locals 2

    .prologue
    .line 25
    invoke-super {p0, p1, p2}, Loo;->a(Landroid/content/Context;Landroid/os/Bundle;)Loi;

    move-result-object v0

    .line 1147
    iget-boolean v1, v0, Loi;->b:Z

    if-eqz v1, :cond_0

    .line 1148
    const/4 v1, 0x0

    iput-boolean v1, v0, Loi;->b:Z

    .line 1149
    iget-boolean v1, v0, Loi;->a:Z

    if-eqz v1, :cond_0

    .line 1150
    invoke-virtual {v0}, Loi;->a()V

    .line 30
    :cond_0
    return-object v0
.end method
