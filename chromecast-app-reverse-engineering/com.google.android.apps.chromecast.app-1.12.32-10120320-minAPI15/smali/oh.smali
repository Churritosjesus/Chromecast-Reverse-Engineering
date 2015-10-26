.class public final Loh;
.super Li;
.source "PG"


# instance fields
.field private Z:Ltx;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Li;-><init>()V

    .line 44
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Loh;->b(Z)V

    .line 45
    return-void
.end method

.method private p()V
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Loh;->Z:Ltx;

    if-nez v0, :cond_1

    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 60
    if-eqz v0, :cond_0

    .line 61
    const-string v1, "selector"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Ltx;->a(Landroid/os/Bundle;)Ltx;

    move-result-object v0

    iput-object v0, p0, Loh;->Z:Ltx;

    .line 63
    :cond_0
    iget-object v0, p0, Loh;->Z:Ltx;

    if-nez v0, :cond_1

    .line 64
    sget-object v0, Ltx;->c:Ltx;

    iput-object v0, p0, Loh;->Z:Ltx;

    .line 67
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ltx;)V
    .locals 3

    .prologue
    .line 76
    if-nez p1, :cond_0

    .line 77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_0
    invoke-direct {p0}, Loh;->p()V

    .line 81
    iget-object v0, p0, Loh;->Z:Ltx;

    invoke-virtual {v0, p1}, Ltx;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 82
    iput-object p1, p0, Loh;->Z:Ltx;

    .line 2559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 85
    if-nez v0, :cond_1

    .line 86
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 88
    :cond_1
    const-string v1, "selector"

    .line 3196
    iget-object v2, p1, Ltx;->a:Landroid/os/Bundle;

    .line 88
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 89
    invoke-virtual {p0, v0}, Loh;->f(Landroid/os/Bundle;)V

    .line 3207
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    .line 91
    check-cast v0, Lod;

    .line 92
    if-eqz v0, :cond_2

    .line 93
    invoke-virtual {v0, p1}, Lod;->a(Ltx;)V

    .line 96
    :cond_2
    return-void
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .prologue
    .line 111
    .line 3612
    iget-object v0, p0, Lj;->y:Lm;

    .line 4106
    new-instance v1, Lod;

    invoke-direct {v1, v0}, Lod;-><init>(Landroid/content/Context;)V

    .line 5053
    invoke-direct {p0}, Loh;->p()V

    .line 5054
    iget-object v0, p0, Loh;->Z:Ltx;

    .line 112
    invoke-virtual {v1, v0}, Lod;->a(Ltx;)V

    .line 113
    return-object v1
.end method
