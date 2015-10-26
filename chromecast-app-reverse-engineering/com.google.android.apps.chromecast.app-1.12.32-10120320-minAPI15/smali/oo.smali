.class public Loo;
.super Li;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Li;-><init>()V

    .line 39
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Loo;->b(Z)V

    .line 40
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Bundle;)Loi;
    .locals 1

    .prologue
    .line 50
    new-instance v0, Loi;

    invoke-direct {v0, p1}, Loi;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 55
    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 55
    invoke-virtual {p0, v0, p1}, Loo;->a(Landroid/content/Context;Landroid/os/Bundle;)Loi;

    move-result-object v0

    return-object v0
.end method
